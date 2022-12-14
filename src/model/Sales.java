package model;

import java.util.Date;
import java.util.List;

public class Sales {
    private int saleId;
    private int salePrice;
    private List<SalesItem> salesItemList;
    private Date saleDate;
    //    private List<Product> productList;
    Product product;

    public Sales(int saleId, int salePrice, List<SalesItem> salesItemList, Date saleDate) {
        this.saleId = saleId;
        this.salePrice = salePrice;
        this.salesItemList = salesItemList;
        this.saleDate = saleDate;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public List<SalesItem> getSalesItemList() {
        return salesItemList;
    }

    public void setSalesItemList(List<SalesItem> salesItemList) {
        this.salesItemList = salesItemList;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

//    public List<Product> getProductList() {
//        return productList;
//    }
//
//    public void setProductList(List<Product> productList) {
//        this.productList = productList;
//    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "saleId=" + saleId + '\n' +
                "salePrice=" + salePrice + '\n' +
                "salesItemList=" + salesItemList + '\n' +
                "saleDate=" + saleDate + '\n' +
                "Product count=" + product.getProductCount() + '\n';
    }
}
