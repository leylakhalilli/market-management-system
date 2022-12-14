package model;

public class SalesItem {
    private int SoldProductId;
    //    private String SoldProductName;
    private int SoldProductCount;

    public SalesItem(int soldProductId, int soldProductCount) {
        SoldProductId = soldProductId;
        SoldProductCount = soldProductCount;
    }

    public SalesItem() {
    }


    public int getSoldProductId() {
        return SoldProductId;
    }

    public void setSoldProductId(int soldProductId) {
        SoldProductId = soldProductId;
    }

//    public String getSoldProductName() {
//        return SoldProductName;
//    }
//
//    public void setSoldProductName(String soldProductName) {
//        SoldProductName = soldProductName;
//    }

    public int getSoldProductCount() {
        return SoldProductCount;
    }

    public void setSoldProductCount(int soldProductCount) {
        SoldProductCount = soldProductCount;
    }

    @Override
    public String toString() {
        return "SoldProductId=" + SoldProductId + ' ' + ' ' +
                "SoldProductCount=" + SoldProductCount + ' ';
    }
}
