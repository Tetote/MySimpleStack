package dcll.tvau;

/**
 * Created by Théo Vaucher on 01/03/2015.
 */
public class Item {
    /**
     * The stored object.
     */
    private Object object;

    /**
     *
     * @param theObject the object to store
     */
    public Item(final Object theObject) {
        this.object = theObject;
    }

    /**
     *
     * @return the object stored
     */
    public final Object getObject() {
        return object;
    }

    /**
     *
     * @param theObject the object to be stored
     */
    public final void setObject(final Object theObject) {
        this.object = theObject;
    }
}
