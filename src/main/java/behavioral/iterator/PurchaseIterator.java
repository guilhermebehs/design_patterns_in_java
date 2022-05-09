package behavioral.iterator;

import behavioral.iterator.entities.Purchase;
import behavioral.iterator.entities.PurchaseList;

import java.util.ArrayList;
import java.util.List;

public class PurchaseIterator {

    private List<Purchase> purchases;
    private int index = -1;

    public PurchaseIterator(PurchaseList purchaseList){
        this.purchases = new ArrayList<Purchase>(purchaseList.getPurchases()) ;
    }


   public boolean hasNext(){
        return ((index+1) <= purchases.size()-1);
   }

   public Purchase getNext(){
        if(hasNext()){
            index++;
            return purchases.get(index);
        }
        return null;
   }

   public void goBackToBeginning(){
        index = -1;
   }

}
