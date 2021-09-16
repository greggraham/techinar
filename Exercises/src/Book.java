public class Book {
    final static int DEFAULT_YEAR = 2014;
    final String title;
    final int releaseYear;
    int copiesSold;

    Book(String t) {
        // Call base constructor
        this(t, DEFAULT_YEAR, 0);
    }

    Book(String t, int r) {
        // Call base constructor
        this(t, r, 0);
    }

    // This is the base constructor that has no defaults, so all
    // values must be supplied by the parameters.
    Book(String t, int r, int s) {
        title = t;
        releaseYear = r;
        copiesSold = s;
    }
}
