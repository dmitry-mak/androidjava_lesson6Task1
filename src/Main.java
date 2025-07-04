

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Рождение стальной крысы", 1985, new Author("Гарри", "Гаррисон", 10), 670);
        Book book2 = new Book("Снятся ли андроидам электроовцы?", 1968, new Author("Филипп", "Дик", 0), 100);

        System.out.println("Цена книги 1: " + book1.estimatePrice());
        System.out.println("Цена книги 2: " + book2.estimatePrice());
        System.out.println("Большая ли книга 1: " + book1.isBig());
        System.out.println("Большая ли книга 2: " + book2.isBig());
        System.out.println("Книга 1 содержит 'сталь': " + book1.matches("сталь"));
        System.out.println("Книга 2 содержит 'сталь': " + book2.matches("сталь"));
        System.out.println("Книга 1 содержит 'гаррис': " + book1.matches("гаррис"));
        System.out.println("Книга 1 содержит 'дик': " + book1.matches("Дик"));
        System.out.println("Книга 2 содержит 'Дик': " + book2.matches("Дик"));
        System.out.println("Книга 2 содержит 'дик': " + book2.matches("дик"));
    }
}
