// Book class
class Book {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    // Override toString method to display book details
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

// Library class
class Library {
    private java.util.ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new java.util.ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to search for a book by title
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Return null if book not found
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}

// Main class to test the Library Management System
public class Library {
    public static void main(String[] args) 
    {
        // Create a library instance
        Library library = new Library();

        // Add books to the library
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        library.addBook(new Book("1984", "George Orwell", "9780451524935"));

        // Display all books in the library
        System.out.println("All books in the library:");
        library.displayAllBooks();

        // Search for a book by title
        String searchTitle = "1984";
        Book foundBook = library.searchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("\nBook found: " + foundBook);
        } else {
            System.out.println("\nBook with title '" + searchTitle + "' not found.");
        }
    }
}

