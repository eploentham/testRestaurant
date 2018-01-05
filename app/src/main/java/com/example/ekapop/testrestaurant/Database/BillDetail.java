package com.example.ekapop.testrestaurant.Database;

import io.realm.RealmObject;

/**
 * Created by ekapop on 1/5/2018.
 */

public class BillDetail extends RealmObject {
    String BillDetailId="", BillId="", ORderId="", StatusVoid="", Row1="", FoodsId="", FoodsCode="", Price="", Qty="", Amt="",Active="", LotID="",Remark="", BillCode="",TableId="", FoodsName="";

    String DateCreate="", DateModi="", DateCancel="";
    String UserCreate="", UserModi="", UserCancel="";
    String sort1="";
    String HostId="", BranchId="",DeviceId="";

    public String getId() {
        return BillDetailId;
    }

    public void setId(String id) {
        BillDetailId = id;
    }

    public String getBillId() {
        return BillId;
    }

    public void setBillId(String billId) {
        BillId = billId;
    }

    public String getORderId() {
        return ORderId;
    }

    public void setORderId(String ORderId) {
        this.ORderId = ORderId;
    }

    public String getStatusVoid() {
        return StatusVoid;
    }

    public void setStatusVoid(String statusVoid) {
        StatusVoid = statusVoid;
    }

    public String getRow1() {
        return Row1;
    }

    public void setRow1(String row1) {
        Row1 = row1;
    }

    public String getFoodsId() {
        return FoodsId;
    }

    public void setFoodsId(String foodsId) {
        FoodsId = foodsId;
    }

    public String getFoodsCode() {
        return FoodsCode;
    }

    public void setFoodsCode(String foodsCode) {
        FoodsCode = foodsCode;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

    public String getAmt() {
        return Amt;
    }

    public void setAmt(String amt) {
        Amt = amt;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public String getLotID() {
        return LotID;
    }

    public void setLotID(String lotID) {
        LotID = lotID;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getBillCode() {
        return BillCode;
    }

    public void setBillCode(String billCode) {
        BillCode = billCode;
    }

    public String getTableId() {
        return TableId;
    }

    public void setTableId(String tableId) {
        TableId = tableId;
    }

    public String getFoodsName() {
        return FoodsName;
    }

    public void setFoodsName(String foodsName) {
        FoodsName = foodsName;
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
