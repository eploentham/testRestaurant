package com.example.ekapop.testrestaurant.Database;

import io.realm.RealmObject;

/**
 * Created by ekapop on 1/5/2018.
 */

public class User extends RealmObject {
    String Id="";
    String UserCode="", UserName="", UserLogin="", UserPassword="", UserPrivilege="";   //1=all privilege,2=order,3=order bill,4=order bill closeday
    String Active="", Remark="";
    String PermissionVoidBill="", PermissionVoidCloseday="";

    String DateCreate="", DateModi="", DateCancel="";
    String UserCreate="", UserModi="", UserCancel="";
    String sort1="";
    String HostId="", BranchId="",DeviceId="";

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }

    public String getUserCode() {
        return UserCode;
    }
    public void setUserCode(String userCode) {
        UserCode = userCode;
    }

    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserLogin() {
        return UserLogin;
    }
    public void setUserLogin(String userLogin) {
        UserLogin = userLogin;
    }

    public String getUserPassword() {
        return UserPassword;
    }
    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserPrivilege() {
        return UserPrivilege;
    }
    public void setUserPrivilege(String userPrivilege) {
        UserPrivilege = userPrivilege;
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

    public String getPermissionVoidBill() {
        return PermissionVoidBill;
    }
    public void setPermissionVoidBill(String permissionVoidBill) {
        PermissionVoidBill = permissionVoidBill;
    }

    public String getPermissionVoidCloseday() {
        return PermissionVoidCloseday;
    }
    public void setPermissionVoidCloseday(String permissionVoidCloseday) {
        PermissionVoidCloseday = permissionVoidCloseday;
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
