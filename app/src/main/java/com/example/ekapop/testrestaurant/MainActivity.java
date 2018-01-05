package com.example.ekapop.testrestaurant;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ekapop.testrestaurant.Database.Foods;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {

    private Realm realm;

    Button btnOk;
    TextView textview;
    EditText txtCode,txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOk = findViewById(R.id.BtnOk);
        textview = findViewById(R.id.textView);
        txtCode = findViewById(R.id.txtCode1);
        txtName = findViewById(R.id.txtName1);

        realm = Realm.getDefaultInstance();



        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                textview.setText("Hello");
//                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
//                builder1.setMessage("Password ไม่ได้ป้อน");
//                builder1.setCancelable(true);
//                builder1.setPositiveButton("ok", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
////                        txtBaUserPassword.setSelection(0,txtBaUserPassword.getText().length());
////                        txtBaUserPassword.setFocusable(true);
//                    }
//                }).create().show();
                saveFoods(txtCode.getText().toString().trim(), txtName.getText().toString().trim());
                refreshFoods(txtCode.getText().toString().trim());
            }
        });
    }

    private void refreshFoods(final String code){
        RealmResults<Foods> result = realm.where(Foods.class)
                .equalTo("FoodsCode", code).findAll();
        Foods foods = result.first();
//        txtCode.setText(foods.getFoodsCode());
//        txtName.setText(foods.getFoodsName());
        textview.setText(foods.getFoodsCode() +" "+foods.getFoodsName());
    }
    private void saveFoods(final String code,final String name){
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm bgRealm) {
                Foods foods = bgRealm.createObject(Foods.class);
                foods.setFoodsCode(code);
                foods.setFoodsName(name);
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {

                // Transaction was a success.
                Log.v("database", "insert success");
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                // Transaction failed and was automatically canceled.
                Log.e("database", error.getMessage());
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }
}
