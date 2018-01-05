package com.example.ekapop.testrestaurant;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by ekapop on 1/1/2018.
 */

public class DatabaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().name("testRestaurant.realm").build();
        Realm.setDefaultConfiguration(config);
    }

}
