package Controllers;
import Models.Book;
import Views.ViewConsole;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class BookController {
    private Book[] books;
    private ViewConsole viewConsole;

    public BookController(Book[] books, ViewConsole viewConsole) {
        this.books = books;
        this.viewConsole = viewConsole;
    }

    public void sortByName() {
        // Método para ordenar libros por nombre en orden descendente
        System.out.println("Ordenando libros por nombre en orden descendente...");
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j].getName().compareToIgnoreCase(books[j + 1].getName()) < 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    public Book searchByName(String name) {
        // Método para buscar un libro por nombre, ignorando mayúsculas y minúsculas
        System.out.println("Buscando libro por nombre: " + name);
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

}
