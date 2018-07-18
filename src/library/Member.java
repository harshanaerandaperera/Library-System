package library;

import java.io.Serializable;

public class Member implements Serializable {

//IT16083424 Perera P.A.H.E     SHU ID=27045240
    
    private String name;
    private String email;
    private String mobile;
    private String memberID;
    private SetOfBooks currentLoans = new SetOfBooks();

    public Member(String memberID, String mName, String email, String telNo) {
        this.memberID = memberID;
        this.name = mName;
        this.email = email;
        this.mobile = telNo;
        currentLoans = new SetOfBooks();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getMemberID() {
        return memberID;
    }


    public void borrowBook(Book aBook) {
        currentLoans.addBook(aBook);
        aBook.setBorrower(this);
    }

    public void returnBook(Book aBook) {     //created by me
        currentLoans.remove(aBook);
        aBook.setBorrower(this);
    }

}
