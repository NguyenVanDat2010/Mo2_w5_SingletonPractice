public class BookBorrower {
    private BookSingleton bookBorrower;
    private boolean haveBook = false;

    //Tạo phương thức mượn sách borrowBook()
    public void borrowBook() {
        bookBorrower = BookSingleton.borrowBook();

        if (bookBorrower == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    //Xây dựng phương thức lấy về thông tin sách mượn
    public String getAuthorAndTitle() {
        if (haveBook) {
            return bookBorrower.getAuthorAndTitle();
        }
        return "I don't have a book";
    }

    public void returnBook() {
        bookBorrower.returnBook(bookBorrower);
    }
}