package lesson07.dataBase;

import java.util.ArrayList;
import java.util.List;

public class DataSales implements ISales {
public List<Sales>  salesList;

    @Override
    public List<Sales> createReport(String provider) {
        List<Sales> selectedSales = new ArrayList<>();
        for (Sales sales : salesList) {
            if (sales.getProvider() == provider) {
                selectedSales.add(sales);
            }
        }
        return selectedSales;
    }

    @Override
    public void infoSales(List<Sales> salesList) {
        for (Sales sales: salesList) {
            System.out.println(sales.getProvider());
            System.out.println(sales.getProduct());
            System.out.println(sales.getNumber() + "\n");
        }
    }
}
