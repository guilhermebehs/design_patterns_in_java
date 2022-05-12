package behavioral.memento;

import behavioral.memento.entities.Purchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("PurchaseListMemento")
public class PurchaseListMementoTest {


    private PurchaseListMemento purchaseListMemento;
    private Purchase bread;
    private Purchase chicken;

    @BeforeEach
    public void setUp(){
        purchaseListMemento = new PurchaseListMemento();
        bread = new Purchase("Bread", 1, 3.99);
        chicken = new Purchase("Chicken", 1, 10.99);
        purchaseListMemento.add(bread);
        purchaseListMemento.add(chicken);
    }


    @DisplayName("Should go back to second state")
    @Test
    public void shouldGoBackToSecondState() {
        purchaseListMemento.undo();
        var purchases = purchaseListMemento.getPurchases();

        assertEquals(purchases.size(), 1);
        assertTrue(purchases.contains(bread));
        assertFalse(purchases.contains(chicken));
    }

    @DisplayName("Should go back to first state")
    @Test
    public void shouldGoBackToFirstState() {
        purchaseListMemento.undo();
        purchaseListMemento.undo();
        var purchases = purchaseListMemento.getPurchases();

        assertEquals(purchases.size(), 0);
        assertFalse(purchases.contains(bread));
        assertFalse(purchases.contains(chicken));
    }
}
