package com.example.ekapop.testrestaurant.Database;

import io.realm.RealmObject;

/**
 * Created by ekapop on 1/1/2018.
 */

public class Foods extends RealmObject {

    String FoodsId="";
    String FoodsName="";
    String remark="";
    String FoodsCode="";
    String Active="";
    String FoodsPrice="";
    String FoodsTypeId="";
    String FoodsCatId="";
    String ResId="", ResCode="";
    String StatusFoods="";      //0=default,1=foods,2=drink

    String PrintIP="";

    String DateCreate="", DateModi="", DateCancel="";
    String UserCreate="", UserModi="", UserCancel="";
    String sort1="";
    String HostId="", BranchId="",DeviceId="";

    public String getFoodsName() {
        return FoodsName;
    }
    public void setFoodsName(String foodsName) {
        FoodsName = foodsName;
    }

    public String getId() {
        return FoodsId;
    }
    public void setId(String id) {
        this.FoodsId = id;
    }

    public String getFoodsCode() {
        return FoodsCode;
    }
    public void setFoodsCode(String foodsCode) {
        FoodsCode = foodsCode;
    }

    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getActive() {
        return Active;
    }
    public void setActive(String active) {
        Active = active;
    }

    public String getFoodsPrice() {
        return FoodsPrice;
    }
    public void setFoodsPrice(String foodsPrice) {
        FoodsPrice = foodsPrice;
    }

    public String getFoodsTypeId() {
        return FoodsTypeId;
    }
    public void setFoodsTypeId(String foodsTypeId) {
        FoodsTypeId = foodsTypeId;
    }

    public String getFoodsCatId() {
        return FoodsCatId;
    }
    public void setFoodsCatId(String foodsCatId) {
        FoodsCatId = foodsCatId;
    }

    public String getResId() {
        return ResId;
    }
    public void setResId(String resId) {
        ResId = resId;
    }

    public String getResCode() {
        return ResCode;
    }
    public void setResCode(String resCode) {
        ResCode = resCode;
    }

    public String getStatusFoods() {
        return StatusFoods;
    }
    public void setStatusFoods(String statusFoods) {
        StatusFoods = statusFoods;
    }

    public String getPrintIP() {
        return PrintIP;
    }
    public void setPrintIP(String printIP) {
        PrintIP = printIP;
    }

    public String getDateCreate() {
        return DateCreate;
    }
    public void setDateCreate(String dateCreate) {
        DateCreate = dateCreate;
    }

    public String getDateModi() {
        return DateModi;
    }
    public void setDateModi(String dateModi) {
        DateModi = dateModi;
    }

    public String getDateCancel() {
        return DateCancel;
    }
    public void setDateCancel(String dateCancel) {
        DateCancel = dateCancel;
    }

    public String getUserCreate() {
        return UserCreate;
    }
    public void setUserCreate(String userCreate) {
        UserCreate = userCreate;
    }

    public String getUserModi() {
        return UserModi;
    }
    public void setUserModi(String userModi) {
        UserModi = userModi;
    }

    public String getUserCancel() {
        return UserCancel;
    }
    public void setUserCancel(String userCancel) {
        UserCancel = userCancel;
    }

    public String getSort1() {
        return sort1;
    }
    public void setSort1(String sort1) {
        this.sort1 = sort1;
    }

    public String getHostId() {
        return HostId;
    }
    public void setHostId(String hostId) {
        HostId = hostId;
    }

    public String getBranchId() {
        return BranchId;
    }
    public void setBranchId(String branchId) {
        BranchId = branchId;
    }

    public String getDeviceId() {
        return DeviceId;
    }
    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    @Override
    public String toString() {
        return "Foods{" +
                ", FoodsCode='" + FoodsCode + '\'' +
                ", FoodsName='" + FoodsName + '\'' +
                '}';
    }

}
