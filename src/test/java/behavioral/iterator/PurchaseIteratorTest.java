package behavioral.iterator;

import behavioral.iterator.entities.Purchase;
import behavioral.iterator.entities.PurchaseList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("PurchaseIterator")
public class PurchaseIteratorTest {

    private PurchaseList purchaseList;
    private PurchaseIterator purchaseIterator;

    @BeforeEach
    public void setUp(){
        purchaseList = new PurchaseList();
        purchaseList.add(new Purchase("Bread", 1, 3.99));
        purchaseList.add(new Purchase("Chicken", 1, 10.99));
        purchaseIterator = new PurchaseIterator(purchaseList);

    }

    @DisplayName("should return first element")
    @Test
    public void shouldReturnFirstElement(){
        assertEquals(purchaseIterator.hasNext(),true);
        assertEquals( purchaseIterator.getNext(), purchaseList.getPurchases().get(0));
    }

    @DisplayName("should return second element")
    @Test
    public void shouldReturnSecondElement(){
        purchaseIterator.getNext();
        assertEquals(purchaseIterator.hasNext(),true);
        assertEquals( purchaseIterator.getNext(), purchaseList.getPurchases().get(1));
    }


    @DisplayName("should tell it has no next value")
    @Test
    public void shouldTellItHasNoNextValue(){
        purchaseIterator.getNext();
        purchaseIterator.getNext();
        assertEquals(purchaseIterator.hasNext(),false);
        assertNull( purchaseIterator.getNext());
    }

    @DisplayName("should go back to beginning")
    @Test
    public void shouldGoBackToBeginning(){
        purchaseIterator.getNext();
        purchaseIterator.getNext();
        purchaseIterator.goBackToBeginning();

        assertEquals(purchaseIterator.hasNext(),true);
        assertEquals( purchaseIterator.getNext(), purchaseList.getPurchases().get(0));
    }

}
