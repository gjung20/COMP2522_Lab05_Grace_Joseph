/**
 * Represents a novel with a title, an author's name, and a publication year.
 * @author Grace Jung
 * @author Joseph Louwerse
 * @version 1.0
 */
public class Novel {

    // The novel's title
    private String title;

    // The author's name
    private String authorName;

    // The year that the novel was published
    private int yearPublished;

    /**
     * Constructs a Novel object with the specified title, author name, and publication year.
     *
     * @param title         The title of the novel
     * @param authorName    The name of the author
     * @param yearPublished The year the novel was published
     */
    public Novel(final String title, final String authorName, final int yearPublished) {
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of this novel.
     *
     * @return The novel's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the name of the author of this novel.
     *
     * @return The author's name
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * Returns the year this novel was published.
     *
     * @return The publication year
     */
    public int getYearPublished() {
        return yearPublished;
    }
}
