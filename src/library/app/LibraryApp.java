package library.app;

import library.model.Book;
import library.model.DigitalBook;
import library.model.Lendable;
import library.service.Library;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        Lendable book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Lendable book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Lendable book3 = new DigitalBook("Digital Fortress", "Dan Brown", 5);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        System.out.println("List of Books in the Library:");
        for (String description : library.listAllItems()) {
            System.out.println(description);
        }

        ParityReport.print(10);
    }
}
