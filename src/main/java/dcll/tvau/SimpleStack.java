package dcll.tvau;

import java.util.EmptyStackException;

/**
 * Created by Théo Vaucher on 01/03/2015.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     * @return true if this stack is empty
     */
    boolean isEmpty();
    /**
     * Returns the number of items in this stack.
     * @return the number of items in this stack
     */
    int getSize();
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item the item to add in the stack
     */
    void push(Item item);
    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     * @return the item at the top of the stack
     * @throws java.util.EmptyStackException if the stack is empty
     */
    Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     * @return the item removed
     * @throws EmptyStackException if this stack is empty
     */
    Item pop() throws EmptyStackException;
}
