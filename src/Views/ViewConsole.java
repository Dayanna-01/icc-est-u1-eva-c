package Views;

public class ViewConsole {
    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showError(String error) {
        System.err.println(error);
    }

    public void showBooks(String[] books) {
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void showBookDetails(String bookDetails) {
        System.out.println(bookDetails);
    }
    
}
