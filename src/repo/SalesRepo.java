package repo;

import java.text.ParseException;
import java.util.Date;

public interface SalesRepo {
    void create() throws ParseException;

    void delete(int id);

    void getSalesByMaxAndMinPrice(int min, int max) throws Exception;

    void getSalesById(int id) throws Exception;

    void getAllSales();

    void getSalesByDate(Date date) throws Exception;

    void getSalesByTwoDate(Date startDate, Date endDate) throws Exception;
}
