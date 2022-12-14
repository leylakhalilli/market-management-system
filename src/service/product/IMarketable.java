package service.product;

import model.Product;
import model.ProductType;

public interface IMarketable {
    void create();

    void update(int id);

    void delete(int id) throws Exception;

//    Product getProductById(int id);

    void getAllProduct();

    void getProductByType(ProductType productType) throws Exception;

    void getProductByMaxAndMinPrice(int max, int min) throws Exception;

    void getProductByName(String name) throws Exception;
}
