package lesson07.dataBase;

public class Sales {
    // будет подключаться к базе данных, где будут храниться информация об продуктах и поставщиках
    private String provider;
    private String product;

    private Integer number;

    public Sales(String customer, String product, Integer number) {
        this.provider = customer;
        this.product = product;
        this.number = number;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
