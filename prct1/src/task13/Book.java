package task13;

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

        public String toString() {return "Name: "+this.name+", pages: "+this.page;
        }
    }
