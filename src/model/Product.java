package model;

import model.ProductType;

public class Product {
    private int id;
    private String productName;
    private int productPrice;
    private int productCount;
    private ProductType productType;

    public Product(int id, String productName, int productPrice, int productCount, ProductType productType) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCount = productCount;
        this.productType = productType;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "id=" + id + ' ' + "productName= " + productName + ' ' + "productPrice= " + productPrice + ' ' +
                "productCount= " + productCount + ' ' + "productType= " + productType + '\n';
    }
}
