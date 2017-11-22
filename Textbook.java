import java.lang.*;

/**
 */
public class Textbook {
    /**
     */
    private String title;

    /**
     */
    private String isbn;

    /**
     */
    private Vector<String> Author;

    /**
     * @return 
     */
    public Vector<String> getAuthor() {
        return Author;
    }

    /**
     * @param Author 
     */
    public void setAuthor(String Author) {
        this.Author.add(Author);
    }

    /**
     * @return 
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn 
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return 
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title 
     */
    public void setTitle(String title) {
        this.title = title;
    }
}

