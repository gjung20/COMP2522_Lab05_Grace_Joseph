import java.util.Comparator;

/**
 * The NovelComparator class implements a Comparator for Novel objects.
 * It can compare novels either by publication year (descending) or by title (alphabetical),
 * based on the 'type' provided.
 */
public class NovelComparator implements Comparator<Novel> {

    /**
     * A coefficient used to reverse the comparison order when sorting by year.
     * Multiplying by -1 will invert the comparison result.
     */
    static final int REVERSE_COEFFICIENT = -1;

    /**
     * Determines the comparison strategy.
     * <ul>
     *   <li>1 Compare by year published in descending order.</li>
     *   <li>2 Compare by title in ascending (alphabetical) order.</li>
     * </ul>
     */
    final int type;

    /**
     * Constructs a NovelComparator with the specified comparison type.
     *
     * @param type an integer representing the comparison type
     *             (e.g., 1 for descending by year, 2 for alphabetical by title)
     */
    public NovelComparator(int type){
        this.type = type;
    }

    /**
     * Compares two Novel objects based on the specified comparison type.
     *
     * @param n1 the first Novel to be compared
     * @param n2 the second Novel to be compared
     * @return a negative integer, zero, or a positive integer
     *         as defined by Comparator.compare
     */
    @Override
    public int compare(Novel n1, Novel n2){
        switch (type) {
            case 1:
                // Sort by year published in descending order
                return REVERSE_COEFFICIENT
                        * Integer.compare(n1.getYearPublished(), n2.getYearPublished());
            case 2:
                // Sort by title in ascending (alphabetical) order
                return n1.getTitle().compareTo(n2.getTitle());
            default:
                // If an unrecognized type is provided, return 0 (equal)
                return 0;
        }
    }
}
