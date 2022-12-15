package repo;

import model.ProductType;

public interface MarketRepo {
    void create();

    void update(int id);

    void delete(int id) throws Exception;

    void getAllProduct();

    void getProductByType(ProductType productType) throws Exception;

    void getProductByMaxAndMinPrice(int max, int min) throws Exception;

    void getProductByName(String name) throws Exception;
}
