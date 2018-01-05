package com.example.ekapop.testrestaurant.Database;

import io.realm.RealmObject;

/**
 * Created by ekapop on 1/5/2018.
 */

public class Restaurant extends RealmObject{
    String ResId="";
    String ResCode="";
    String ResName="";
    String Active="";
    String Remark="";

    String DefaultRes="";
    String PrintReceiptH1="", PrintReceiptH2="", PrintReceiptH3="", PrintReceiptF1="", PrintReceiptF2="", PrintReceiptF3="";
    String PrintOrderH1="",PrintOrderH2="",PrintOrderH3="",PrintOrderF1="",PrintOrderF2="",PrintOrderF3="";

    String DateCreate="", DateModi="", DateCancel="";
    String UserCreate="", UserModi="", UserCancel="";
    String sort1="";
    String HostId="", BranchId="",DeviceId="";

    public String getId() {
        return ResId;
    }
    public void setId(String id) {
        ResId = id;
    }

    public String getResCode() {
        return ResCode;
    }
    public void setResCode(String resCode) {
        ResCode = resCode;
    }

    public String getResName() {
        return ResName;
    }
    public void setResName(String resName) {
        ResName = resName;
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

    public String getDefaultRes() {
        return DefaultRes;
    }
    public void setDefaultRes(String defaultRes) {
        DefaultRes = defaultRes;
    }

    public String getPrintReceiptH1() {
        return PrintReceiptH1;
    }
    public void setPrintReceiptH1(String printReceiptH1) {
        PrintReceiptH1 = printReceiptH1;
    }

    public String getPrintReceiptH2() {
        return PrintReceiptH2;
    }
    public void setPrintReceiptH2(String printReceiptH2) {
        PrintReceiptH2 = printReceiptH2;
    }

    public String getPrintReceiptH3() {
        return PrintReceiptH3;
    }
    public void setPrintReceiptH3(String printReceiptH3) {
        PrintReceiptH3 = printReceiptH3;
    }

    public String getPrintReceiptF1() {
        return PrintReceiptF1;
    }
    public void setPrintReceiptF1(String printReceiptF1) {
        PrintReceiptF1 = printReceiptF1;
    }

    public String getPrintReceiptF2() {
        return PrintReceiptF2;
    }
    public void setPrintReceiptF2(String printReceiptF2) {
        PrintReceiptF2 = printReceiptF2;
    }

    public String getPrintReceiptF3() {
        return PrintReceiptF3;
    }
    public void setPrintReceiptF3(String printReceiptF3) {
        PrintReceiptF3 = printReceiptF3;
    }

    public String getPrintOrderH1() {
        return PrintOrderH1;
    }
    public void setPrintOrderH1(String printOrderH1) {
        PrintOrderH1 = printOrderH1;
    }

    public String getPrintOrderH2() {
        return PrintOrderH2;
    }
    public void setPrintOrderH2(String printOrderH2) {
        PrintOrderH2 = printOrderH2;
    }

    public String getPrintOrderH3() {
        return PrintOrderH3;
    }
    public void setPrintOrderH3(String printOrderH3) {
        PrintOrderH3 = printOrderH3;
    }

    public String getPrintOrderF1() {
        return PrintOrderF1;
    }
    public void setPrintOrderF1(String printOrderF1) {
        PrintOrderF1 = printOrderF1;
    }

    public String getPrintOrderF2() {
        return PrintOrderF2;
    }
    public void setPrintOrderF2(String printOrderF2) {
        PrintOrderF2 = printOrderF2;
    }

    public String getPrintOrderF3() {
        return PrintOrderF3;
    }
    public void setPrintOrderF3(String printOrderF3) {
        PrintOrderF3 = printOrderF3;
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
