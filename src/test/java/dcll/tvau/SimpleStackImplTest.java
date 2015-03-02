package dcll.tvau;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;


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

    @Test
    public void testSimpleStackWithMock() {
        SimpleStack stack = new SimpleStackImpl();

        // mock creation
        Item mockedItem = mock(Item.class);

        assertTrue(stack.isEmpty());
        assertEquals(stack.getSize(), 0);

        stack.push(mockedItem);

        assertFalse(stack.isEmpty());
        assertEquals(stack.getSize(), 1);
        assertEquals(stack.peek(), mockedItem);

        Item itemPop = stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(stack.getSize(), 0);
        assertEquals(itemPop, mockedItem);

    }
}
