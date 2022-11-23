package lesson07.logika;

import lesson07.dataBase.DataSales;

public class Report implements ISender {
    Reader reader;
    Sender sender;
    DataSales dataSales;
    String product;
    public Report(String product, DataSales dataSales) {
        this.reader = new Reader(product);
        this.sender = new Sender();
        this.dataSales = dataSales;
    }

    @Override
    public void sendReport() {
        dataSales.createReport(product);
    }

    @Override
    public void convertJson() {
    dataSales.infoSales(dataSales.createReport(product));
    }
}
