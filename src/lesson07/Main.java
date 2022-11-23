package lesson07;


import lesson07.dataBase.DataSales;
import lesson07.dataBase.Sales;
import lesson07.logika.Report;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

// создадим по данным из базы данных 3 продажи
        Sales salesOne = new Sales("Bosh", "drill", 10);
        Sales salesTwo = new Sales("Bosh", "screwdriver", 5);
        Sales salesThree = new Sales("Makita", "cleaner", 7);
// создадим экземпляр DataSales
        DataSales dataSales = new DataSales();
// создадим коллекцию из продаж
        dataSales.salesList = new ArrayList<>();
        dataSales.salesList.add(salesOne);
        dataSales.salesList.add(salesTwo);
        dataSales.salesList.add(salesThree);
// выберем нужную нам продажу. Для этого потребуется создать Report
// в Report создадим временный объект Reader, в который придёт запрос от сайта,
// что нужно сформировать отчет по производителю Bosch
        Report report = new Report("Bosh", dataSales);
// выбираем из DataSales все продажи, связанные с Bosh
        List<Sales> selectedSales = dataSales.createReport("Bosh");
// проверка выбранных продаж
        dataSales.infoSales(selectedSales);
    }
}
