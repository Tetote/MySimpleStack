package dcll.tvau;

/**
 * Awesome stack with Java.
 * Very good stack.
 *
 * @author Théo Vaucher
 *
 */
public final class App {

    /**
     *
     */
    private App() {
    }

    /**
     * @param args arguments
     *
     */
    public static void main(final String[] args) {
        SimpleStack stack = new SimpleStackImpl();

        String lawl = "lawl";

        System.out.println("I store string '" + lawl + "' in stack");
        stack.push(new Item(lawl));

        System.out.println("When I peek from stack, "
                + "it give '" + stack.peek().getObject() + "'");


        String answer = "the answer to life, the universe and everything";

        System.out.println("\nAnd I store string '" + answer + "' in stack");
        stack.push(new Item(answer));

        System.out.println("When I peek from stack, "
                + "it give '42'");
    }
}
