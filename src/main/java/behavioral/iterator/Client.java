package behavioral.iterator;

import behavioral.iterator.entities.Purchase;
import behavioral.iterator.entities.PurchaseList;

public class Client {


    private static PurchaseList purchaseList;

    public static void main(String[] args) {
      configure();
      var purchaseIterator = new PurchaseIterator(purchaseList);

      while(purchaseIterator.hasNext()){
         var purchase = purchaseIterator.getNext();
          System.out.println(purchase);
      }

      purchaseIterator.goBackToBeginning();

      while(purchaseIterator.hasNext()){
            var purchase = purchaseIterator.getNext();
            System.out.println(purchase);
        }

    }

    private static void configure(){
        purchaseList = new PurchaseList();
        purchaseList.add(new Purchase("Bread", 1, 3.99));
        purchaseList.add(new Purchase("Chicken", 1, 10.99));
        purchaseList.add(new Purchase(" Apple", 5, 6.00));
    }
}
