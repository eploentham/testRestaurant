package com.example.ekapop.testrestaurant.Database;

import io.realm.RealmObject;

/**
 * Created by ekapop on 1/5/2018.
 */

public class CloseDay extends RealmObject {
    String Id="", CloseDayDate="", Active="", Remark="", StatusVoid="", VoidDate="", ResId="", Amt="", Discount="", SC="";
    String Vat="", Total="", NetTotal="", Cnt="", VoidUser="", CntBill="", CntOrder="", AmtOrder="", CloseDayUser="", CashR1="", CashR2="", CashR3="", CashR1Remark ="", CashR2Remark="";
    String CashR3Remark="", CashD1="", CashD2="", CashD3="", CashD1Remark="", CashD2Remark="", CashD3Remark="",Weather="", VoidRemark="";

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

    public String getCloseDayDate() {
        return CloseDayDate;
    }
    public void setCloseDayDate(String closeDayDate) {
        CloseDayDate = closeDayDate;
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

    public String getResId() {
        return ResId;
    }
    public void setResId(String resId) {
        ResId = resId;
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

    public String getVoidUser() {
        return VoidUser;
    }
    public void setVoidUser(String voidUser) {
        VoidUser = voidUser;
    }

    public String getCntBill() {
        return CntBill;
    }
    public void setCntBill(String cntBill) {
        CntBill = cntBill;
    }

    public String getCntOrder() {
        return CntOrder;
    }
    public void setCntOrder(String cntOrder) {
        CntOrder = cntOrder;
    }

    public String getAmtOrder() {
        return AmtOrder;
    }
    public void setAmtOrder(String amtOrder) {
        AmtOrder = amtOrder;
    }

    public String getCloseDayUser() {
        return CloseDayUser;
    }
    public void setCloseDayUser(String closeDayUser) {
        CloseDayUser = closeDayUser;
    }

    public String getCashR1() {
        return CashR1;
    }
    public void setCashR1(String cashR1) {
        CashR1 = cashR1;
    }

    public String getCashR2() {
        return CashR2;
    }
    public void setCashR2(String cashR2) {
        CashR2 = cashR2;
    }

    public String getCashR3() {
        return CashR3;
    }
    public void setCashR3(String cashR3) {
        CashR3 = cashR3;
    }

    public String getCashR1Remark() {
        return CashR1Remark;
    }
    public void setCashR1Remark(String cashR1Remark) {
        CashR1Remark = cashR1Remark;
    }

    public String getCashR2Remark() {
        return CashR2Remark;
    }
    public void setCashR2Remark(String cashR2Remark) {
        CashR2Remark = cashR2Remark;
    }

    public String getCashR3Remark() {
        return CashR3Remark;
    }
    public void setCashR3Remark(String cashR3Remark) {
        CashR3Remark = cashR3Remark;
    }

    public String getCashD1() {
        return CashD1;
    }
    public void setCashD1(String cashD1) {
        CashD1 = cashD1;
    }

    public String getCashD2() {
        return CashD2;
    }
    public void setCashD2(String cashD2) {
        CashD2 = cashD2;
    }

    public String getCashD3() {
        return CashD3;
    }
    public void setCashD3(String cashD3) {
        CashD3 = cashD3;
    }

    public String getCashD1Remark() {
        return CashD1Remark;
    }
    public void setCashD1Remark(String cashD1Remark) {
        CashD1Remark = cashD1Remark;
    }

    public String getCashD2Remark() {
        return CashD2Remark;
    }
    public void setCashD2Remark(String cashD2Remark) {
        CashD2Remark = cashD2Remark;
    }

    public String getCashD3Remark() {
        return CashD3Remark;
    }
    public void setCashD3Remark(String cashD3Remark) {
        CashD3Remark = cashD3Remark;
    }

    public String getWeather() {
        return Weather;
    }
    public void setWeather(String weather) {
        Weather = weather;
    }

    public String getVoidRemark() {
        return VoidRemark;
    }
    public void setVoidRemark(String voidRemark) {
        VoidRemark = voidRemark;
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
