public class Book {
    final static int DEFAULT_YEAR = 2014;
    final String title;
    final int releaseYear;
    int copiesSold;

    Book(String t) {
        title = t;
        releaseYear = DEFAULT_YEAR;
        // copiesSold will default to 0;
    }

    Book(String t, int r) {
        title = t;
        releaseYear = r;
        // copiesSold will default to 0
    }

    Book(String t, int r, int s) {
        title = t;
        releaseYear = r;
        copiesSold = s;
    }
}
