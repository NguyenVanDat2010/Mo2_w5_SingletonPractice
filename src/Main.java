public class Main {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN\n");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();

        bookBorrower1.borrowBook();
        System.out.println("BookBorrower1 asked to borrow the book");
        System.out.println("BookBorrower1 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower2.borrowBook();
        System.out.println("\nBookBorrower2 asked to borrow the book");
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(bookBorrower2.getAuthorAndTitle() + "\n");

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 returned the book");

        bookBorrower2.borrowBook();
        System.out.println("\nBookBorrower2 Author and Title: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("\nEND TESTING SINGLETON PATTERN");
    }
}
