package FirstBlock.Tasks.Homework11;

public class Book {
    private final String name;
    private final Author author;

    private int yearPublication;

    public Book(String name, Author author, int yearPublication) {
        this.name = name;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getName()
    { return name; }

    public Author getAuthor()
    { return author; }

    public int getYearPublication()
    { return yearPublication; }

    public void setYearPublication(int yearPublication)
    { this.yearPublication = yearPublication; }
}
