import Tasks.Homework11.Author;
import Tasks.Homework11.Book;

void main()
{
    Author authorIvan = new Author("Ivan","Ivanov");
    Author authorPeter = new Author("Peter", "Petrov");

    Book book1 = new Book("Rapid game",authorIvan,1963);
    Book book2 = new Book("Start developing",authorPeter,2012);

    book1.setYearPublication(2001);
}