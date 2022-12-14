package service.sales;

import model.Product;
import model.Sales;
import model.SalesItem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SalesService implements ISalesService {
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    List<Sales> salesList = new ArrayList<>();
    List<SalesItem> salesItemList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();


    @Override
    public void create() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yeni satish:");

        System.out.print("satish mehsul id: ");
        int id = scanner.nextInt();

        System.out.print("satish qiymeti: ");
        int price = scanner.nextInt();

        System.out.println("Satish detallari: ");
        System.out.print("\tSoldProductId: ");
        int soldId = scanner.nextInt();

        System.out.print("\tSoldProductCount: ");
        int soldCount = scanner.nextInt();
        updateProductCount(soldId, soldCount);

        SalesItem salesItem = new SalesItem(soldId, soldCount);
        salesItemList.add(salesItem);

        System.out.print("satish tarixi: ");
        Date date = formatter.parse(scanner.next());
        Sales sales = new Sales(id, price, salesItemList, date);
        salesList.add(sales);

    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < salesList.size(); i++) {
            Sales sales = salesList.get(i);
            if (sales.getSaleId() == id) {
                salesList.remove(i);
                System.out.println("deleted");
            }
        }
    }

    @Override
    public void getSalesByMaxAndMinPrice(int min, int max) throws Exception {

        for (int i = 0; i < salesList.size(); i++) {
            Sales sale = salesList.get(i);
            if (sale.getSalePrice() > min && sale.getSalePrice() < max) {

                System.out.println(salesList.get(i));
            } else throw new Exception("daxil olunan araliqdan satish olmayib");
        }
    }


    @Override
    public void getSalesById(int id) throws Exception {
        for (Sales sales : salesList) {
            if (sales.getSaleId() == id) {
                System.out.println(salesList);
            } else throw new Exception("id e uygun mehsul tapilmadi");
        }
    }

    @Override
    public void getAllSales() {
        System.out.println(salesList);
    }

    @Override
    public void getSalesByDate(Date date) throws Exception {
        for (int i = 0; i < salesList.size(); i++) {
            Sales sales = salesList.get(i);
            if (sales.getSaleDate().compareTo(date) == 0) {
                System.out.println(salesList.get(i));
            } else throw new Exception("bu tarixde satish olunmayib");
        }
    }

    @Override
    public void getSalesByTwoDate(Date startDate, Date endDate) throws Exception {


    }


    public int updateProductCount(int id, int soldCount) {
        for (Product product : productList) {
            if (product.getId() == id && product.getProductCount() > 0) {
                product.setProductCount(product.getProductPrice() - soldCount);
                return soldCount;

            }
        }
        return 0;
    }

}
