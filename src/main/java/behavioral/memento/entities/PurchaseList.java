package behavioral.memento.entities;

import java.util.ArrayList;
import java.util.List;

public class PurchaseList implements Cloneable {

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

    @Override
    public PurchaseList clone(){
        var purchaseList = new PurchaseList();
        var purchases = new ArrayList<Purchase>(this.purchases);
        purchases.forEach(purchase -> purchaseList.add(purchase));
        return purchaseList;

    }
}
