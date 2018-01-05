package com.example.ekapop.testrestaurant.Database;

import io.realm.RealmObject;

/**
 * Created by ekapop on 1/5/2018.
 */

public class FoodsType extends RealmObject {
    String FoodsTypeId="";
    String FoodsTypeCode="";
    String FoodsTypeName="";
    String Active="";
    String Remark="";

    String DateCreate="", DateModi="", DateCancel="";
    String UserCreate="", UserModi="", UserCancel="";
    String sort1="";
    String HostId="", BranchId="",DeviceId="";

    public String getId() {
        return FoodsTypeId;
    }
    public void setId(String id) {
        FoodsTypeId = id;
    }

    public String getFoodsTypeCode() {
        return FoodsTypeCode;
    }
    public void setFoodsTypeCode(String foodsTypeCode) {
        FoodsTypeCode = foodsTypeCode;
    }

    public String getFoodsTypeName() {
        return FoodsTypeName;
    }
    public void setFoodsTypeName(String foodsTypeName) {
        FoodsTypeName = foodsTypeName;
    }

    public String getActive() {
        return Active;
    }
    public void setActive(String active) {
        Active = active;
    }

    public String getRemark() {
        return Remark;
    }
    public void setRemark(String remark) {
        Remark = remark;
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
}
