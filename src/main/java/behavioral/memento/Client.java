package behavioral.memento;


import behavioral.memento.entities.Purchase;

public class Client {

    private static PurchaseListMemento purchaseListMemento;

    public static void main(String[] args) {
        purchaseListMemento = new PurchaseListMemento();
        purchaseListMemento.add(new Purchase("Bread", 1, 3.99));
        purchaseListMemento.add(new Purchase("Chicken", 1, 10.99));
        purchaseListMemento.add(new Purchase("Cookie", 1, 3.0));

        System.out.println(purchaseListMemento.getPurchases());

        purchaseListMemento.undo();

        System.out.println(purchaseListMemento.getPurchases());

        purchaseListMemento.undo();

        System.out.println(purchaseListMemento.getPurchases());

        purchaseListMemento.undo();

        System.out.println(purchaseListMemento.getPurchases());

        purchaseListMemento.undo();

        System.out.println(purchaseListMemento.getPurchases());

        purchaseListMemento.undo();

    }
}
