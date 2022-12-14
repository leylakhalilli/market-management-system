package service.product;

import model.Product;
import model.ProductType;

import java.sql.SQLOutput;
import java.util.*;

public class Marketable implements IMarketable {
    List<Product> productList = new ArrayList<>();

    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yeni mehsul:");
        System.out.print("id: ");
        int id = scanner.nextInt();

        System.out.print("ad: ");
        String productName = scanner.next();

        System.out.print("qiymet: ");
        int productPrice = scanner.nextInt();

        System.out.print("mehsul sayi: ");
        int productCount = scanner.nextInt();

        System.out.print("Mehsul tipi: ");
        ProductType productType = ProductType.valueOf(scanner.next().toUpperCase(Locale.ROOT));

        Product product = new Product(id, productName, productPrice, productCount, productType);
        productList.add(product);
    }

    @Override
    public void update(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Yeni mehsul:");
                System.out.print("yeni id: ");
                int updateId = scanner.nextInt();

                System.out.print("yeni ad: ");
                String updateProductName = scanner.next();

                System.out.print("yeni qiymet: ");
                int updateProductPrice = scanner.nextInt();

                System.out.print("yeni mehsul sayi: ");
                int updateProductCount = scanner.nextInt();

                System.out.print("yeni mehsul tipi: ");
                ProductType updateProductType = ProductType.valueOf(scanner.next().toUpperCase(Locale.ROOT));

                product.setId(updateId);
                product.setProductName(updateProductName);
                product.setProductPrice(updateProductPrice);
                product.setProductCount(updateProductCount);
                product.setProductType(updateProductType);

            }
        }
    }

    @Override
    public void delete(int id) throws Exception {

        for (int i = 0; i < productList.size(); i++) {
            Product product1 = productList.get(i);
            if (product1.getId() == id) {
                productList.remove(i);
                System.out.println("Deleted");
            }
        }
    }


    @Override
    public void getAllProduct() {
        System.out.println(productList + "\n-----------\n");
    }

    @Override
    public void getProductByType(ProductType productType) throws Exception {
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getProductType() == productType) {
                System.out.println(productList.get(i));
            } else throw new Exception("bazada bu tip mehsul yoxdur");
        }
    }

    @Override
    public void getProductByMaxAndMinPrice(int max, int min) throws Exception {

        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getProductPrice() > min && product.getProductPrice() < max) {
                System.out.println(productList.get(i));
            }
        }
    }

    @Override
    public void getProductByName(String name) throws Exception {
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            if (product.getProductName().equals(name)) {
                System.out.println(productList.get(i));
            }
        }
    }
}
