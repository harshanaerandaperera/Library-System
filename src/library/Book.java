package library;

import java.io.Serializable;

public class Book implements Serializable {

//IT16083424 Perera P.A.H.E     SHU ID=27045240
   
    private String title;
    private String author;
    private String isbn;
    private String status;
    private String bookID;

    private Member borrower=null;

    public Book(String bookID, String isbn, String title, String author) {
        this.bookID = bookID;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.status = "Available";
        
    }

    public void changeStatus(String name, boolean tof) {
        if (tof) {
            this.status = "Available";
            title = name;
        } else {
            this.status = "Not Available";
            title = name;
        }
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

     public String getStatus() {
        return status;
    }
     
    public void setBorrower(Member theBorrower) {
        borrower = theBorrower;
    }

    public Member getBorrower() {
        return this.borrower;
    }

    public boolean isOnLoan() {

        boolean t;
        if (getStatus() == "Not Available") {
            t = false;
        } else {
            t = true;
        }
        return t;
    }
}
