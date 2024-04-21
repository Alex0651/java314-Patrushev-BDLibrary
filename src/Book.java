// Класс Book представляет книгу в библиотеке.
class Book {
    private String title;  // Название книги
    private String author;  // Автор книги
    private String reader;  // Читатель, которому выдана книга (null, если не выдана)
    private Condition condition;  // Состояние книги

    // Перечисление возможных состояний книги.
    enum Condition {
        GOOD,
        DAMAGED,
        LOST
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.reader = null;
        this.condition = Condition.GOOD;
    }

    // Получение названия книги.
    public String getTitle() {
        return title;
    }

    // Получение автора книги.
    public String getAuthor() {
        return author;
    }

    // Получение читателя, которому выдана книга.
    public String getReader() {
        return reader;
    }

    // Установка читателя, которому выдана книга.
    public void setReader(String reader) {
        this.reader = reader;
    }

    // Получение состояния книги.
    public Condition getCondition() {
        return condition;
    }

    // Установка состояния книги.
    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    // Проверка, выдана ли книга.
    public boolean isIssued() {
        return reader != null;
    }

    // Форматирование информации о книге в строку.
    @Override
    public String toString() {
        return String.format("%s (%s) - %s", title, author, condition);
    }
}
