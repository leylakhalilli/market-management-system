package model;

import service.product.Marketable;
import service.sales.SalesService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Print {
    Marketable marketable = new Marketable();
    SalesService salesService = new SalesService();
    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");


    public void forMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Emeliyyat secin:\n 1 Mehsullar uzerinde emeliyyat aparmaq\n" +
                "2 Satislar uzerinde emeliyyat aparmaq\n" +
                "3 Sistemden cixmaq");
        System.out.print("menyu:");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.print("1.Yeni mehsul elave et: \n2.Mehsul uzerinde duzelis et\n" +
                        "3.Mehsulu sil - mehsulu kodu daxil edilmelidir\n" +
                        "4.Butun mehsullari goster\n5.Categoriyasina gore mehsullari goster\n" +
                        "6.Qiymet araligina gore mehsullari goster\n" +
                        "7.Mehsullar arasinda ada gore axtaris et\n");
                forOperation();
                break;

            case 2:
                System.out.print("1.Yeni satis elave etmek: \n2.Satisdaki hansisa mehsulun geri qaytarilmasi\n" +
                        "3 Satisin silinmesi - satisin nomresine esasen silinmesi\n" +
                        "4 Butun satislarin ekrana cixarilmasi \n5 Verilen tarix araligina gore satislarin gosterilmesi\n" +
                        "6 Verilen mebleg araligina gore satislarin gosterilmesi\n" +
                        "7 Verilmis bir tarixde olan satislarin gosterilmesi \n" +
                        "8 Verilmis nomreye esasen hemin nomreli satisin melumatlarinin gosterilmesi");
                forSales();
                break;
            case 3:
                System.out.println("PROSES DAYANDI");
                break;
            default:
                System.out.println("uygun menyu secin");
        }
    }


    public void forOperation() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 10) {
            System.out.print("Emeliyyat:");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    marketable.create();
                    break;
                case 2:
                    System.out.print("id daxil edin:");
                    marketable.update(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("id daxil edin:");
                    marketable.delete(scanner.nextInt());
                    break;
                case 4:
                    marketable.getAllProduct();
                    break;
                case 5:
                    System.out.print("mehsul tipi daxil edin:");
                    marketable.getProductByType(ProductType.valueOf(scanner.next().toUpperCase(Locale.ROOT)));
                    break;
                case 6:
                    System.out.print("araliq daxil edin:");
                    marketable.getProductByMaxAndMinPrice(scanner.nextInt(), scanner.nextInt());
                    break;
                case 7:
                    marketable.getProductByName(scanner.next());
                    break;
                case 0:
                    forMenu();
                    break;
                default:
                    System.out.println("Uygun emeliyyati secin");
            }
        }
        i++;
    }

    public void forSales() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 10) {
            System.out.print("Satish emeliyyatlari:");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    salesService.create();
                    break;
                case 2:
                    System.out.print("id daxil edin:");
                    break;
                case 3:
                    System.out.print("id daxil edin:");
                    salesService.delete(scanner.nextInt());
                    break;
                case 4:
                    System.out.println("Butun satishlar:");
                    salesService.getAllSales();
                    break;
                case 5:
                    System.out.print("tarix daxil edin:");
                    salesService.getSalesByTwoDate(formatter.parse(scanner.next()), formatter.parse(scanner.next()));
                    break;
                case 6:
                    System.out.print("araliq daxil edin:");
                    salesService.getSalesByMaxAndMinPrice(scanner.nextInt(), scanner.nextInt());
                    break;
                case 7:
                    System.out.println("tarix daxil edin:");
                    salesService.getSalesByDate(formatter.parse(scanner.next()));
                    break;
                case 8:
                    System.out.println("id daxil edin:");
                    salesService.getSalesById(scanner.nextInt());
                    break;
                case 0:
                    forMenu();
                    break;
                default:
                    System.out.println("Uygun emeliyyati secin");
            }
            i++;
        }
    }
}
