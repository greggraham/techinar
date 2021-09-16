public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Out of the Silent Planet");
        Book b2 = new Book("Perelandra", 1941);
        Book b3 = new Book("That Hideous Strength", 1943, 20);
        printBook(b1);
        printBook(b2);
        printBook(b3);
    }

    static void printBook(Book b) {
        System.out.printf("%s was released in %s and sold %s copies.\n", b.title, b.releaseYear, b.copiesSold);
    }
}
