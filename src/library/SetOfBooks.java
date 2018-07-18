package library;

import java.util.ArrayList;

public class SetOfBooks extends ArrayList<Book> {

//IT16083424 Perera P.A.H.E     SHU ID=27045240
    public SetOfBooks() {
        super();
    }

    public void addBook(Book aBook) {
        super.add(aBook);
    }

    public void removeBook(Book aBook) {
        super.remove(aBook);
    }

    public SetOfBooks findBookByAuthor(String a) {
        Book B = null;
        SetOfBooks sob = new SetOfBooks();
        for (int i = 0; i < super.size(); i++) {
            B = super.get(i);
            if (B.getAuthor().equals(a)) {
                sob.add(B);
            }
            else{
            B=null;
            }
        }
        return sob;
    }

    public SetOfBooks findBookFromTitle(String t) {
        Book B = null;
        SetOfBooks sob = new SetOfBooks();
        for (int i = 0; i < super.size(); i++) {
            B = super.get(i);
            if (B.getTitle().equals(t)) {
                sob.add(B);
            } else {
                B=null;
            }
        }
        return sob;
    }

    public Book findBookFromBookID(String bid) {
        Book B = null;
        for (int i = 0; i < super.size(); i++) {
            B = super.get(i);
            if (B.getBookID().equals(bid)) {
                break;
            } else {
                B = null;
            }
        }
        return B;
    }

    public SetOfBooks findBookFromISBN(String isbn) {
        Book B = null;
        SetOfBooks sob = new SetOfBooks();
        for (int i = 0; i < super.size(); i++) {
            B = super.get(i);
            if (B.getIsbn().equals(isbn)) {
                sob.add(B);
            }
            else{
            B=null;
            }
        }
        return sob;
    }

    public SetOfBooks getBooksOnLoan(Member mmbr) {
        Book B = null;
        SetOfBooks sobbor = new SetOfBooks();
        for (int i = 0; i < super.size(); i++) {
            B = super.get(i);
            if (B.getBorrower() == null) {
                continue;
            }
            if (B.getBorrower().getName().equals(mmbr.getName())) {
                sobbor.add(B);
            }
        }
        return sobbor;

    }

}
