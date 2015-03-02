package dcll.tvau;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;


/**
 * Created by Tetote on 01/03/2015.
 */
public class SimpleStackImplTest {

    /**
     *
     */
    @Test
    public void testSimpleStackImpl() {
        SimpleStack stack = new SimpleStackImpl();
        Item item = new Item("lawl");

        assertTrue(stack.isEmpty());
        assertEquals(stack.getSize(), 0);

        stack.push(item);

        assertFalse(stack.isEmpty());
        assertEquals(stack.getSize(), 1);
        assertEquals(stack.peek(), item);

        Item itemPop = stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(stack.getSize(), 0);
        assertEquals(itemPop, item);
    }

    @Test(expected = EmptyStackException.class)
    public void testSimpleStackImplPeekWhenEmptyStack() {
        SimpleStack stack = new SimpleStackImpl();
        stack.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void testSimpleStackImplPopWhenEmptyStack() {
        SimpleStack stack = new SimpleStackImpl();
        stack.pop();
    }
}
