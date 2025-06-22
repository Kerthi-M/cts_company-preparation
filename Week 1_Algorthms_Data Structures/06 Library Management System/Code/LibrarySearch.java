package work;
import java.util.*;

class Book {
    int bookId;
    String title;
    String author;

    Book(int id, String t, String a) {
        bookId = id;
        title = t;
        author = a;
    }
}

public class LibrarySearch {
    static int linearSearch(Book[] books, String key) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].title.equalsIgnoreCase(key)) return i;
        }
        return -1;
    }

    static int binarySearch(Book[] books, String key) {
        int l = 0, r = books.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int cmp = books[m].title.compareToIgnoreCase(key);
            if (cmp == 0) return m;
            if (cmp < 0) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books? ");
        int n = sc.nextInt();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Book ID: ");
            int id = sc.nextInt();
            System.out.print("Title: ");
            String title = sc.next();
            System.out.print("Author: ");
            String author = sc.next();
            books[i] = new Book(id, title, author);
        }
        System.out.print("Enter title to search: ");
        String search = sc.next();
        int linear = linearSearch(books, search);
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
        int binary = binarySearch(books, search);
        System.out.println("Linear Search Index: " + linear);
        System.out.println("Binary Search Index: " + binary);
    }
}

