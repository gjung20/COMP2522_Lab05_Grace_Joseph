import java.util.HashMap;
import java.util.Iterator;

/**
 * Represents a Bookshop object.
 * @author grace
 * @author joseph
 * @version 1.0
 */
public class Bookshop
{
    HashMap<String, Novel> novels = new HashMap();

    /**
     * Constructs a Bookshop object.
     * Constructs a map of all the novels. The key is the title and the map is the novel.
     */
    void Bookshop()
    {
    }

    public void addBook(Novel novel) {
        novels.put(novel.getTitle(), novel);
    }

    public void printAllBooks() {
        novels.values().forEach(System.out::println);
    }

    public void removeBooksContaining(String word) {
        novels.entrySet().removeIf(
                entry -> entry.getKey().toLowerCase().contains(word.toLowerCase()));
    }

    public void printBooksSorted() {
        novels.keySet().stream().sorted().forEach(System.out::println);
    }

    public static void main(final String[] args)
    {
        Bookshop shop = new Bookshop();
        shop.addBook(new Novel("The Hobbit", "J.R.R. Tolkien", 1937));
        shop.addBook(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        shop.addBook(new Novel("Brave New World", "Aldous Huxley", 1932));

        System.out.println("\nBooks in the shop:");
        shop.printAllBooks();

        System.out.println("\nRemoving books with 'the':");
        shop.removeBooksContaining("the");
        shop.printBooksSorted();
    }
}
