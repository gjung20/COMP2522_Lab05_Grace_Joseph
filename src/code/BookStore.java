//TODO:
// check if util.List is the proper list import
// see if we need to make listOfNovels final
// populate data
// see if we need to make a special comparator class
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Represents a BookStore object.
 *  * @author Grace Jung
 *  * @author Joseph Louwerse
 *  * @version 1.0
 */
public class BookStore
{

    private final String name;
    private ArrayList<Novel> listOfNovels = new ArrayList<>();

    /**
     * Constructs a BookStore object.
     */
    public BookStore(final String name)
    {
        this.name = name;
        listOfNovels.add(new Novel("The Adventures of Augie", "March Saul Bellow",1953));
    }

    /**
     * Print all titles in UPPERCASE.
     */
    void printAllTitles()
    {

    }

    /**
     * Prints all titles that contain the specified parameter.
     * @param title
     */
    void printBookTitle(String title)
    {

    }

    /**
     * Prints all titles in alphabetical order, A-Z.
     */
    void printTitlesInAlphaOrder()
    {

    }

    /**
     * Prints all books for the inputted decade
     * IE 2000 -> print all book titles from 2000 - 2009
     * @param decade
     */
    void printGroupByDecade(int decade)
    {

    }

    /**
     * Find the longest title in the bookstore.
     */
    void getLongest()
    {

    }

    /**
     * Returns whether there's a book written in the year given
     * @param year
     * @return whether there's a book, as a boolean.
     */
    boolean isThereABookWrittenIn(int year)
    {
        return false;
    }

    /**
     * Returns the amount of Books that contain this word
     * in their title.
     * @param word
     * @return
     */
    int howManyBooksContain(String word)
    {
        return 0;
    }

    /**
     * Returns the percentage of the books that were written between
     * these two years (inclusive)
     * @param first
     * @param last
     * @return percentage of books, as an integer
     */
    int whichPercentWrittenBetween(int first, int last)
    {
        return 0;
    }

    /**
     * Returns the oldest book.
     * @return oldest book, as a Novel object
     */
    Novel getOldestBook()
    {
        return null;
    }

    /**
     * Returns the List of all books whose title is this length.
     *
     * @param titleLength
     * @return list of books, as a List<Novel>
     */
    List<Novel> getBooksThisLength(int titleLength)
    {

        return null;
    }

    public static void main(final String[] args) {
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;
        bookstore = new BookStore("Classic Novels Collection");
        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();
        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");
        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();
        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);
        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();
        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));
        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));
        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");
        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " +
                oldest.getYearPublished());
        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }

}
