
import Tasks.Homework11.Author;
import Tasks.Homework11.Book;

void main(String[] args)
{
    Author ivan = new Author("Ivan", "Ivanovich");
    Author peter = new Author("Peter", "Petrov");

    Book book1 = new Book("Speed developing", ivan, 1960);
    Book book2 = new Book("Start developing", peter, 2012);

    book1.setYearPublication(2001);
}