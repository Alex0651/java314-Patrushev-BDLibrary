import java.util.*;

// Класс Main для тестирования библиотеки.
public class Main {
    public static void main(String[] args) {
        // Создание библиотеки.
        Library library = new Library();

        // Заполнение библиотеки книгами.
        library.addBook(new Book("Война и мир", "Лев Толстой"));
        library.addBook(new Book("Преступление и наказание", "Фёдор Достоевский"));
        library.addBook(new Book("Анна Каренина", "Лев Толстой"));
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков"));
        library.addBook(new Book("Идиот", "Фёдор Достоевский"));

        // Выдача книг посетителям.
        library.issueBook("Война и мир", "Иван Иванов");
        library.issueBook("Преступление и наказание", "Петр Петров");

        // Прием книг от посетителей.
        library.returnBook("Война и мир");
        library.returnBook("Преступление и наказание");

        // Списание книги.
        library.writeOffBook("Анна Каренина");

        // Прием новых книг.
        library.addBook(new Book("Братья Карамазовы", "Фёдор Достоевский"));
        library.addBook(new Book("Улисс", "Джеймс Джойс"));

        // Получение списка всех книг в библиотеке.
        List<Book> allBooks = library.getAllBooks();

        // Вывод списка всех книг в библиотеке.
        for (Book book : allBooks) {
            System.out.println(book);
        }
    }
}