//TODO:
// check if util.List is the proper list import
// see if we need to make listOfNovels final
// populate data
// see if we are allowed to use a special comparator class
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
    //The number used in order to get books sorted by year using the NovelComparator class.
    private static final int YEAR_COMPARISION_CODE = 1;
    //The number used in order to get books sorted by title using the NovelComparator class.
    private static final int TITLE_COMPARISION_CODE = 2;

    /**
     * Constructs a BookStore object.
     */
    public BookStore(final String name)
    {

        HashMap<String, Novel> novelMap = new HashMap<>();
        Set<String> keySet;
        Iterator<String> iterator;
        Iterator<String> keyListIterator;

        this.name = name;

        listOfNovels.add(new Novel("The Adventures of Augie March", "Saul Bellow", 1953));
        listOfNovels.add(new Novel("All the King’s Men", "Robert Penn Warren", 1946));
        listOfNovels.add(new Novel("American Pastoral", "Philip Roth", 1997));
        listOfNovels.add(new Novel("An American Tragedy", "Theodore Dreiser", 1925));
        listOfNovels.add(new Novel("Animal Farm", "George Orwell", 1946));
        listOfNovels.add(new Novel("Appointment in Samarra", "John O'Hara", 1934));
        listOfNovels.add(new Novel("Are You There God? It's Me, Margaret.", "Judy Blume", 1970));
        listOfNovels.add(new Novel("The Assistant", "Bernard Malamud", 1957));
        listOfNovels.add(new Novel("At Swim-Two-Birds", "Flann O'Brien", 1938));
        listOfNovels.add(new Novel("Atonement", "Ian McEwan", 2002));
        listOfNovels.add(new Novel("Beloved", "Toni Morrison", 1987));
        listOfNovels.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        listOfNovels.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        listOfNovels.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        listOfNovels.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        listOfNovels.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        listOfNovels.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        listOfNovels.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        listOfNovels.add(new Novel("Catch-22", "Joseph Heller", 1961));
        listOfNovels.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        listOfNovels.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        listOfNovels.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        listOfNovels.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        listOfNovels.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        listOfNovels.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        listOfNovels.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        listOfNovels.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        listOfNovels.add(new Novel("A Death in the Family", "James Agee", 1958));
        listOfNovels.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        listOfNovels.add(new Novel("Deliverance", "James Dickey", 1970));
        listOfNovels.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        listOfNovels.add(new Novel("Falconer", "John Cheever", 1977));
        listOfNovels.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        listOfNovels.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        listOfNovels.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        listOfNovels.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        listOfNovels.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        listOfNovels.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        listOfNovels.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        listOfNovels.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        listOfNovels.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        listOfNovels.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        listOfNovels.add(new Novel("Herzog", "Saul Bellow", 1964));
        listOfNovels.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        listOfNovels.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        listOfNovels.add(new Novel("I, Claudius", "Robert Graves", 1934));
        listOfNovels.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        listOfNovels.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        listOfNovels.add(new Novel("Light in August", "William Faulkner", 1932));
        listOfNovels.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        listOfNovels.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        listOfNovels.add(new Novel("Lord of the Flies", "William Golding", 1954));
        listOfNovels.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        listOfNovels.add(new Novel("Loving", "Henry Green", 1945));
        listOfNovels.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        listOfNovels.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        listOfNovels.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        listOfNovels.add(new Novel("Money", "Martin Amis", 1984));
        listOfNovels.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        listOfNovels.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        listOfNovels.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        listOfNovels.add(new Novel("Native Son", "Richard Wright", 1940));
        listOfNovels.add(new Novel("Neuromancer", "William Gibson", 1984));
        listOfNovels.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        listOfNovels.add(new Novel("1984", "George Orwell", 1948));
        listOfNovels.add(new Novel("On the Road", "Jack Kerouac", 1957));
        listOfNovels.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        listOfNovels.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        listOfNovels.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        listOfNovels.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        listOfNovels.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        listOfNovels.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        listOfNovels.add(new Novel("Possession", "A.S. Byatt", 1990));
        listOfNovels.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        listOfNovels.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        listOfNovels.add(new Novel("Rabbit, Run", "John Updike", 1960));
        listOfNovels.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        listOfNovels.add(new Novel("The Recognitions", "William Gaddis", 1955));
        listOfNovels.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        listOfNovels.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        listOfNovels.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        listOfNovels.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        listOfNovels.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        listOfNovels.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        listOfNovels.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        listOfNovels.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        listOfNovels.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        listOfNovels.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        listOfNovels.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        listOfNovels.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        listOfNovels.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        listOfNovels.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        listOfNovels.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        listOfNovels.add(new Novel("Ubik", "Philip K. Dick", 1969));
        listOfNovels.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        listOfNovels.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        listOfNovels.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        listOfNovels.add(new Novel("White Noise", "Don DeLillo", 1985));
        listOfNovels.add(new Novel("White Teeth", "Zadie Smith", 2000));
        listOfNovels.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));

        //--- convert listofNovels into novelMap ---
        novelMap = (HashMap<String, Novel>) convertListToHashMap(listOfNovels);

        //--- initialize keyset and iterator
        keySet = novelMap.keySet();
        iterator = keySet.iterator();

        List<String> keyList = new ArrayList<>(keySet);
        keyListIterator = keyList.iterator();

        System.out.println("-----PART 2 -----");
        //--call fn ---
        while (iterator.hasNext()) {
            String title = iterator.next();
            // Do something with the 'title', e.g., print it
            System.out.println(title);
        }

        novelMap.entrySet().removeIf(
                entry -> entry.getKey().toLowerCase().contains("the".toLowerCase()));

        Collections.sort(keyList);

        System.out.println("-----PART 2 Sorted without the-----");

        while (keyListIterator.hasNext()) {
            String title = keyListIterator.next();
            // Do something with the 'title', e.g., print it
            System.out.println(title);
        }

        
    }
//
//    public BookStore(String name, Novel novel)
//    {
//        HashMap<String, Novel> bookInventory = new HashMap();
//        this.name = name;
//    }

    /**
     * Converts a given Novel ArrayList and converts it to a map.
     *
     * @param list represents the ArrayList of novels
     * @return the list of novels as a map
     */
    public Map<String, Novel> convertListToHashMap(ArrayList<Novel> list) {
        Map<String, Novel> map = list.stream()
                .collect(Collectors.toMap(Novel::getTitle, Function.identity()));
        return map;
    }

    /**
     * Print all titles in UPPERCASE.
     */
    void printAllTitles()
    {
        for (final Novel n: listOfNovels){
            System.out.println(n.getTitle().toUpperCase());
        }
    }

    /**
     * Prints all titles that contain the specified parameter.
     * @param title title of book
     */
    void printBookTitle(String title)
    {
        listOfNovels.stream()
                .filter(novel -> novel.getTitle().toLowerCase().contains(title.toLowerCase()))
                .forEach(novel -> System.out.println(novel.getTitle()));
    }

    /**
     * Prints all titles in alphabetical order, A-Z.
     */
    void printTitlesInAlphaOrder()
    {
        NovelComparator nc = new NovelComparator(TITLE_COMPARISION_CODE);
        Collections.sort(listOfNovels, nc);

        //TODO: check the final for each syntax (on one of the lecture slides)
        for (final Novel n:listOfNovels) {
            System.out.println(n.getTitle());
        }
    }

    /**
     * Prints all books for the inputted decade
     * IE 2000 -> print all book titles from 2000 - 2009
     * @param decade
     */
    void printGroupByDecade(int decade)
    {
        listOfNovels.stream()
                .filter(novel -> novel.getYearPublished() / 10 == decade / 10)
                .forEach(System.out::println);
    }

    /**
     * Find the longest title in the bookstore.
     */
    String getLongest()
    {
        return listOfNovels.stream()
                .max(Comparator.comparingInt(n -> n.getTitle().length()))
                .map(Novel::getTitle)
                .orElse("No books available");
    }

    /**
     * Returns whether there's a book written in the year given
     * @param year
     * @return whether there's a book, as a boolean.
     */
    boolean isThereABookWrittenIn(int year)
    {
        return listOfNovels.stream().anyMatch(
                novel -> novel.getYearPublished() == year);
    }

    /**
     * Returns the amount of Books that contain this word
     * in their title.
     * @param word
     * @return the amount of books, as an int.
     */
    long howManyBooksContain(String word)
    {
        return listOfNovels.stream()
                .filter(
                        novel -> novel.getTitle().toLowerCase().contains(word.toLowerCase()))
                .count();
    }

    /**
     * Returns the percentage of the books that were written between
     * these two years (inclusive)
     * @param first
     * @param last
     * @return percentage of books, as an integer
     */
    double whichPercentWrittenBetween(int first, int last)
    {
        long count = listOfNovels.stream().filter(
                novel -> novel.getYearPublished() >=
                        first && novel.getYearPublished() <=
                        last).count();
        return count * 100.0 / listOfNovels.size();
    }

    /**
     * Returns the oldest book.
     * @return oldest book, as a Novel object, using the custom NovelComparator class
     */
    Novel getOldestBook()
    {
        NovelComparator nc = new NovelComparator(YEAR_COMPARISION_CODE);
        Collections.sort(listOfNovels, nc);
        return listOfNovels.getLast();
    }

    /**
     * Returns the List of all books whose title is this length.
     *
     * @param titleLength
     * @return list of books, as an ArrayList<Novel>
     */
    List<Novel> getBooksThisLength(int titleLength)
    {
        return listOfNovels.stream()
                .filter(novel -> novel.getTitle().length() == titleLength)
                .toList();
    }

    /**
     * main, creats a bookstore and a list and populates it
     * @param args
     */
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
