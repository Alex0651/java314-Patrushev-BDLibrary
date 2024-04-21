import java.util.ArrayList;
import java.util.List;

// Класс Library представляет библиотеку.
class Library {
    private List<Book> books;  // Список книг в библиотеке

    public Library() {
        books = new ArrayList<>();
    }

    // Добавление книги в библиотеку.
    public void addBook(Book book) {
        books.add(book);
    }

    // Выдача книги читателю.
    public boolean issueBook(String title, String reader) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isIssued()) {
                book.setReader(reader);
                return true;
            }
        }
        return false;
    }

    // Возврат книги в библиотеку.
    public boolean returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isIssued()) {
                book.setReader(null);
                return true;
            }
        }
        return false;
    }

    // Списание книги из библиотеки.
    public boolean writeOffBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setCondition(Book.Condition.LOST);
                return true;
            }
        }
        return false;
    }

    // Получение списка всех книг в библиотеке.
    public List<Book> getAllBooks() {
        return books;
    }
}
