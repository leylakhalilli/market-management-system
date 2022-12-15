import model.Print;
import repo.MarketRepo;
import repo.impl.MarketRepoImpl;
import repo.SalesRepo;
import repo.impl.SalesRepoImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        MarketRepo iMarketable = new MarketRepoImpl();
        SalesRepo iSalesService = new SalesRepoImpl();
        Print print = new Print();
        print.forMenu();

    }
}
