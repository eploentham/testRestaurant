package com.example.ekapop.testrestaurant.Database;

import io.realm.RealmObject;

/**
 * Created by ekapop on 1/5/2018.
 */

public class Bill extends RealmObject {
    String BillId="", BillCode="", BillDate="", LotID="", Active="", Remark="", StatusVoid="", VoidDate="", TableId="", ResId="", AreaId="", Amt="", Discount="", SC="";
    String Vat="", Total="", NetTotal="", Cnt="", CashReceive="", CashTon="", VoidUser="", BillUser="", ClosedayId="";

    String DateCreate="", DateModi="", DateCancel="";
    String UserCreate="", UserModi="", UserCancel="";
    String sort1="";
    String HostId="", BranchId="",DeviceId="";

    public String getId() {
        return BillId;
    }
    public void setId(String id) {
        BillId = id;
    }

    public String getBillCode() {
        return BillCode;
    }
    public void setBillCode(String billCode) {
        BillCode = billCode;
    }

    public String getBillDate() {
        return BillDate;
    }
    public void setBillDate(String billDate) {
        BillDate = billDate;
    }

    public String getLotID() {
        return LotID;
    }
    public void setLotID(String lotID) {
        LotID = lotID;
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

    public String getStatusVoid() {
        return StatusVoid;
    }
    public void setStatusVoid(String statusVoid) {
        StatusVoid = statusVoid;
    }

    public String getVoidDate() {
        return VoidDate;
    }
    public void setVoidDate(String voidDate) {
        VoidDate = voidDate;
    }

    public String getTableId() {
        return TableId;
    }
    public void setTableId(String tableId) {
        TableId = tableId;
    }

    public String getResId() {
        return ResId;
    }
    public void setResId(String resId) {
        ResId = resId;
    }

    public String getAreaId() {
        return AreaId;
    }
    public void setAreaId(String areaId) {
        AreaId = areaId;
    }

    public String getAmt() {
        return Amt;
    }
    public void setAmt(String amt) {
        Amt = amt;
    }

    public String getDiscount() {
        return Discount;
    }
    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getSC() {
        return SC;
    }
    public void setSC(String SC) {
        this.SC = SC;
    }

    public String getVat() {
        return Vat;
    }
    public void setVat(String vat) {
        Vat = vat;
    }

    public String getTotal() {
        return Total;
    }
    public void setTotal(String total) {
        Total = total;
    }

    public String getNetTotal() {
        return NetTotal;
    }
    public void setNetTotal(String netTotal) {
        NetTotal = netTotal;
    }

    public String getCnt() {
        return Cnt;
    }
    public void setCnt(String cnt) {
        Cnt = cnt;
    }

    public String getCashReceive() {
        return CashReceive;
    }
    public void setCashReceive(String cashReceive) {
        CashReceive = cashReceive;
    }

    public String getCashTon() {
        return CashTon;
    }
    public void setCashTon(String cashTon) {
        CashTon = cashTon;
    }

    public String getVoidUser() {
        return VoidUser;
    }
    public void setVoidUser(String voidUser) {
        VoidUser = voidUser;
    }

    public String getBillUser() {
        return BillUser;
    }
    public void setBillUser(String billUser) {
        BillUser = billUser;
    }

    public String getClosedayId() {
        return ClosedayId;
    }
    public void setClosedayId(String closedayId) {
        ClosedayId = closedayId;
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
