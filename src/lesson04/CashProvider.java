package lesson04;

import java.util.ArrayList;

public class CashProvider {
    public long card;
    boolean isAutorization;

 // проверка на контракт
    public void buy(int price) {
        if(card>=price || card>0){
            card = card - price;
        }else {
            throw new RuntimeException("Money is not enough");
        }

    }


    public void autorization(Customer customer) {
        if (customer.id == 1 || customer.id == 2 || customer.id == 3) {
            isAutorization = true;
            card = 2000;
        }
    }
}
