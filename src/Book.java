public class Book {

    String title;
    int releaseYear;
    Author author;
    int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public int estimatePrice() {
        double price = pages * 3 * Math.sqrt(author.getRating());
        int roundedPrice = (int) Math.floor(price);
//        return roundedPrice > 250 ? roundedPrice : 250;
        return Math.max(roundedPrice, 250);
    }

    public boolean matches(String word) {
        String phraseToFind = word.toLowerCase();
        return title.toLowerCase().contains(phraseToFind) ||
                author.getName().toLowerCase().contains(phraseToFind) ||
                author.getSurname().toLowerCase().contains(phraseToFind);
    }
}
