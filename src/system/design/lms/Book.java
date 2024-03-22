/**
 * Create by saurabh
 * Date: 22/03/24
 * Project Name: Design-Patterns
 */
package system.design.lms;

public class Book {
    private String bookName;
    private String bookSerialNumber;
    private Genre bookGenre;

    public Book(String bookName,String bookSerialNumber,Genre bookGenre){
        this.bookName = bookName;
        this.bookSerialNumber = bookSerialNumber;
        this.bookGenre = bookGenre;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookSerialNumber() {
        return bookSerialNumber;
    }

    public void setBookSerialNumber(String bookSerialNumber) {
        this.bookSerialNumber = bookSerialNumber;
    }

    public Genre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(Genre bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookSerialNumber='" + bookSerialNumber + '\'' +
                ", bookGenre=" + bookGenre +
                '}';
    }
}
