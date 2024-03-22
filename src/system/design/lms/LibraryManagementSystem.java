/**
 * Create by saurabh
 * Date: 22/03/24
 * Project Name: Design-Patterns
 */
package system.design.lms;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Genre fiction = new Genre("Fiction");
        Genre nonFiction = new Genre("Non Fiction");
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Harry Potter","12345",fiction));
        bookList.add(new Book("Gandhi","225234",nonFiction));
        System.out.println("Book in the library");
        bookList.forEach((book)->System.out.println(book));

    }

}
