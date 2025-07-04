
public class Main {
    public static void main(String[] args) {

        Author harrison = new Author("Гарри", "Гаррисон", 10);
        Author dick = new Author("Филипп", "Дик", 0);

        Book book1 = new Book("Рождение стальной крысы", 1985, harrison, 670);
        Book book2 = new Book("Неукротимая планета",1960, harrison,150);
        Book book3 = new Book("Снятся ли андроидам электроовцы?", 1968, dick, 100);

        System.out.println("Цена книги 1: " + book1.estimatePrice());
        System.out.println("Цена книги 2: " + book2.estimatePrice());
        System.out.println("Цена книги 3: " + book3.estimatePrice());
        System.out.println("Большая ли книга 1: " + book1.isBig());
        System.out.println("Большая ли книга 2: " + book2.isBig());
        System.out.println("Большая ли книга 3: " + book3.isBig());
        System.out.println("Книга 1 содержит 'сталь': " + book1.matches("сталь"));
        System.out.println("Книга 3 содержит 'сталь': " + book3.matches("сталь"));
        System.out.println("Книга 1 содержит 'гаррис': " + book1.matches("гаррис"));
        System.out.println("Книга 1 содержит 'дик': " + book1.matches("Дик"));
        System.out.println("Книга 3 содержит 'Дик': " + book3.matches("Дик"));
        System.out.println("Книга 3 содержит 'дик': " + book3.matches("дик"));
    }
}
