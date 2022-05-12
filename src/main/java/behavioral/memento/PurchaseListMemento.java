package behavioral.memento;

import behavioral.memento.entities.Purchase;
import behavioral.memento.entities.PurchaseList;

import java.util.ArrayList;
import java.util.List;

public class PurchaseListMemento {

    private PurchaseList purchaseList;
    private int pointer = 0;
    private List<PurchaseList> history;

    public PurchaseListMemento(){
        purchaseList = new PurchaseList();
        history = new ArrayList<PurchaseList>();
    }

    public void add(Purchase purchase){
        history.add(purchaseList.clone());
        purchaseList.add(purchase);
    }

    public void undo(){
        if(!history.isEmpty()) {
            var purchaseList = history.remove(history.size() - 1);
            this.purchaseList = purchaseList;
        }
    }

    public List<Purchase> getPurchases(){
        return purchaseList.getPurchases();
    }
}
