import java.awt.print.Book;
import java.util.ArrayList;


public class Branch {
    private String branchName;
    private ArrayList<Book> books=new ArrayList<Book>();
    private double balance;

    Branch(String name){
        this.branchName=name;
        this.balance=0;
    }

  //  public double LateFee(Date endDate)




    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
        
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
