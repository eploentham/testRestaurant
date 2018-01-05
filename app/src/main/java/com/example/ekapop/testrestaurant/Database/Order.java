package com.example.ekapop.testrestaurant.Database;

import io.realm.RealmObject;

/**
 * Created by ekapop on 1/5/2018.
 */

public class Order extends RealmObject {
    String Id="", LotId="", FoodsId="", FoodsCode="", FoodsName="", OrderDate="", Price="", Qty="", Remark="",ResCode="", AreaCode="", StatusFoods1="", StatusFoods2="";
    String StatusFoods3="", StatusBill="", BillCheckDate="", StatusCook="", CookReceiveDate="", CookFinishDate="", Active="", VoidDate="", StatusVoid="", row1="", PrinterName="";
    String StatusToGo="", FlagVoid ="", ClosedayId="", StatusCloseday="", OrderUser="", TableCode="", TableId="";
    String Amt="", CntCust="",BillId="", StatusTableChange="", StatusTableMerge="", TableChangeOld="";

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

    public String getLotId() {
        return LotId;
    }
    public void setLotId(String lotId) {
        LotId = lotId;
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

    public String getFoodsName() {
        return FoodsName;
    }
    public void setFoodsName(String foodsName) {
        FoodsName = foodsName;
    }

    public String getOrderDate() {
        return OrderDate;
    }
    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
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

    public String getRemark() {
        return Remark;
    }
    public void setRemark(String remark) {
        Remark = remark;
    }

    public String getResCode() {
        return ResCode;
    }
    public void setResCode(String resCode) {
        ResCode = resCode;
    }

    public String getDeviceId() {
        return DeviceId;
    }
    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }

    public String getAreaCode() {
        return AreaCode;
    }
    public void setAreaCode(String areaCode) {
        AreaCode = areaCode;
    }

    public String getStatusFoods1() {
        return StatusFoods1;
    }
    public void setStatusFoods1(String statusFoods1) {
        StatusFoods1 = statusFoods1;
    }

    public String getStatusFoods2() {
        return StatusFoods2;
    }
    public void setStatusFoods2(String statusFoods2) {
        StatusFoods2 = statusFoods2;
    }

    public String getStatusFoods3() {
        return StatusFoods3;
    }
    public void setStatusFoods3(String statusFoods3) {
        StatusFoods3 = statusFoods3;
    }

    public String getStatusBill() {
        return StatusBill;
    }
    public void setStatusBill(String statusBill) {
        StatusBill = statusBill;
    }

    public String getBillCheckDate() {
        return BillCheckDate;
    }
    public void setBillCheckDate(String billCheckDate) {
        BillCheckDate = billCheckDate;
    }

    public String getStatusCook() {
        return StatusCook;
    }
    public void setStatusCook(String statusCook) {
        StatusCook = statusCook;
    }

    public String getCookReceiveDate() {
        return CookReceiveDate;
    }
    public void setCookReceiveDate(String cookReceiveDate) {
        CookReceiveDate = cookReceiveDate;
    }

    public String getCookFinishDate() {
        return CookFinishDate;
    }
    public void setCookFinishDate(String cookFinishDate) {
        CookFinishDate = cookFinishDate;
    }

    public String getActive() {
        return Active;
    }
    public void setActive(String active) {
        Active = active;
    }

    public String getVoidDate() {
        return VoidDate;
    }
    public void setVoidDate(String voidDate) {
        VoidDate = voidDate;
    }

    public String getStatusVoid() {
        return StatusVoid;
    }
    public void setStatusVoid(String statusVoid) {
        StatusVoid = statusVoid;
    }

    public String getRow1() {
        return row1;
    }
    public void setRow1(String row1) {
        this.row1 = row1;
    }

    public String getPrinterName() {
        return PrinterName;
    }
    public void setPrinterName(String printerName) {
        PrinterName = printerName;
    }

    public String getStatusToGo() {
        return StatusToGo;
    }
    public void setStatusToGo(String statusToGo) {
        StatusToGo = statusToGo;
    }

    public String getFlagVoid() {
        return FlagVoid;
    }
    public void setFlagVoid(String flagVoid) {
        FlagVoid = flagVoid;
    }

    public String getClosedayId() {
        return ClosedayId;
    }
    public void setClosedayId(String closedayId) {
        ClosedayId = closedayId;
    }

    public String getStatusCloseday() {
        return StatusCloseday;
    }
    public void setStatusCloseday(String statusCloseday) {
        StatusCloseday = statusCloseday;
    }

    public String getOrderUser() {
        return OrderUser;
    }
    public void setOrderUser(String orderUser) {
        OrderUser = orderUser;
    }

    public String getTableCode() {
        return TableCode;
    }
    public void setTableCode(String tableCode) {
        TableCode = tableCode;
    }

    public String getTableId() {
        return TableId;
    }
    public void setTableId(String tableId) {
        TableId = tableId;
    }

    public String getAmt() {
        return Amt;
    }
    public void setAmt(String amt) {
        Amt = amt;
    }

    public String getCntCust() {
        return CntCust;
    }
    public void setCntCust(String cntCust) {
        CntCust = cntCust;
    }

    public String getBillId() {
        return BillId;
    }
    public void setBillId(String billId) {
        BillId = billId;
    }

    public String getStatusTableChange() {
        return StatusTableChange;
    }
    public void setStatusTableChange(String statusTableChange) {
        StatusTableChange = statusTableChange;
    }

    public String getStatusTableMerge() {
        return StatusTableMerge;
    }
    public void setStatusTableMerge(String statusTableMerge) {
        StatusTableMerge = statusTableMerge;
    }

    public String getTableChangeOld() {
        return TableChangeOld;
    }
    public void setTableChangeOld(String tableChangeOld) {
        TableChangeOld = tableChangeOld;
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
}
