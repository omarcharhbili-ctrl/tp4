package library.model;

public class Book implements Lendable {
    private final String title;
    private final String author;
    private boolean borrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void borrow() {
        if (!changeState(true)) {
            System.out.println("This book is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (!changeState(false)) {
            System.out.println("This book was not borrowed.");
        }
    }

    // Factorisation de borrow()/returnItem() : false si l'état est déjà celui demandé
    private boolean changeState(boolean newState) {
        if (borrowed == newState) {
            return false;
        }
        borrowed = newState;
        return true;
    }

    @Override
    public boolean isBorrowed() { return borrowed; }

    @Override
    public String getDescription() { return title + " by " + author; }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}
