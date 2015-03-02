package dcll.tvau;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Théo Vaucher on 01/03/2015.
 */
public class SimpleStackImpl implements SimpleStack {
    /**
     * The stack.
     */
    private List<Item> stack;

    /**
     * Create a simple stack.
     */
    SimpleStackImpl() {
        stack = new LinkedList<Item>();
    }

    @Override
    public final boolean isEmpty() {
        return this.stack.isEmpty();
    }

    @Override
    public final int getSize() {
        return this.stack.size();
    }

    @Override
    public final void push(final Item item) {
        this.stack.add(item);
    }

    @Override
    public final Item peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.stack.get(getSize() - 1);
    }

    @Override
    public final Item pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return this.stack.remove(getSize() - 1);
    }
}
