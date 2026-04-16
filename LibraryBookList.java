class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

public class LibraryBookList {

    static void printBooksByAuthor(Book[] books, String authorName) {
        boolean found = false;
        System.out.println("Books by " + authorName + ":");
        for (Book b : books) {
            if (b.author.equalsIgnoreCase(authorName)) {
                System.out.println("- " + b.title);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found.");
        }
    }

    public static void main(String[] args) {
        // Hardcoded input
        Book[] books = {
            new Book("BookA", "Author1"),
            new Book("BookB", "Author2"),
            new Book("BookC", "Author1"),
            new Book("BookD", "Author3"),
            new Book("BookE", "Author1")
        };

        String searchAuthor = "Author1"; // hardcoded author to search

        printBooksByAuthor(books, searchAuthor);
    }
}
