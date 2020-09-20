package task13;

import javax.imageio.stream.ImageInputStream;
import java.lang.*;

public class Book {
    private String name;
    private int page;

    public Book(String n, int p) {
        name = n;
        page = p;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public String toString() {
        return "Name: " + this.name + ", pages: " + this.page;
    }

    public static void main(String[] args) {
        Book b1 = new Book("War", 2576);
        Book b2 = new Book("Magic", 1257);
        Book b3 = new Book("The Master and Margarita", 2506);
        System.out.println (b1);
        System.out.println (b2);
        System.out.println (b3);
    }
}
