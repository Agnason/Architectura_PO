package lesson07.dataBase;

import lesson07.dataBase.Sales;

import java.util.List;

public interface ISales {

    public List<Sales> createReport(String provider);

    public void infoSales (List<Sales> salesList);
}
