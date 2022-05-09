package behavioral.iterator.entities;

import java.util.ArrayList;
import java.util.List;

public class PurchaseList {

    private List<Purchase> purchases;

    public PurchaseList(){
        purchases = new ArrayList<Purchase>();
    }

    public void add(Purchase purchase){
         purchases.add(purchase);
    }


    public List<Purchase> getPurchases() {
        return new ArrayList<Purchase>(purchases);
    }
}
