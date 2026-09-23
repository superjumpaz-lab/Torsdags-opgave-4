import java.util.ArrayList;

public class Opgave5 {
    public class Book {
        private String name;
        private String author;
        private boolean available;

        public Book(String name, String author, boolean available){
            this.name = name;
            this.author = author;
            this.available = available;
        }

        public String getName(){
            return name;
        }

        public String getAuthor(){
            return author;
        }

        public boolean isAvailable(){
            return available;
        }

        public void borrow(){
            if(this.available = true){
                available = false;
            }
        }

        public void returnBook(){
                available = true;
        }

        public String toString(){
            return this.name + " by " + this.author;
        }
    }

    public class Library{
        private String libraryName;
         ArrayList<Book> books;

         public Library(String libraryName){
             this.libraryName = libraryName;
             this.books = new ArrayList<>();
         }

        public void addBook(Book book){
             books.add(book);
        }

        public ArrayList<Book> findAvailableBooks(){
              ArrayList<Book> availableBooks = new ArrayList<>();
             for(Book book : books){
                 if(book.isAvailable()){
                 availableBooks.add(book);
                 }
             }
             return availableBooks;
        }

        public Book findBookByTitle(String title){
             for(Book book : books){
                 if(book.name.equals(title)){
                     return book;
                 }
             }
            return null;
        }

        public void printAllBooks(){
            for(Book book : books){
                System.out.println("- " + book);
            }
        }

    }

    void main(){
        Library biblo = new Library("Lyngby bibliotek");
        biblo.addBook(new Book("Empire of vampires","Simon",true));
        biblo.addBook(new Book("jaja","jojo",false));
        biblo.addBook(new Book("jepsikondi","din far", true));
        biblo.addBook(new Book("Fourth Wing", "Epi",true));
        biblo.addBook(new Book("Epifano","Jarl",false));

        Book book1 = biblo.findBookByTitle("Empire of vampires");
        if (book1 != null){
            book1.borrow();
        }

        Book book2 = biblo.findBookByTitle("Epifano");
        if (book2 != null){
            book2.borrow();
        }

        biblo.findAvailableBooks();


        if (book1 != null){
            book1.returnBook();
        }

        System.out.println(biblo.findAvailableBooks());

        biblo.printAllBooks();

    }















}
