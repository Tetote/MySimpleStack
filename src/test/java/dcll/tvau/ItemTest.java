package dcll.tvau;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Théo Vaucher on 01/03/2015.
 */
public class ItemTest {

    /**
     *
     */
    @Test
    public void testItem() {
        Object objectInt42 = 42;
        Object objectStringLawl = "lawl";

        Item item = new Item(objectInt42);
        assertEquals(item.getObject(), objectInt42);

        item.setObject(objectStringLawl);
        assertEquals(item.getObject(), objectStringLawl);
    }
}
