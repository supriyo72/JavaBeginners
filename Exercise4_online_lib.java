class Library{
    int no_of_books;
    String[] books;

    Library(){
        this.books= new String [100];
        this.no_of_books=0;
    }
    void AddBook(String AddBk){
        this.books[no_of_books]=AddBk;
        no_of_books++;
        System.out.println(AddBk+" Book is Added");
        //will print these below if i use continue instead of break.
        this.books[4]="amar";
        this.books[8]="Doglapan";
    }
    void showAvailablrBk(){
        System.out.println("Available books are: ");
        for(String e:books){
            if(e==null){
                continue;
            }
            System.out.println("*"+e);
        }
    }
    void issuedBook(String IB){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]==IB){
                System.out.println("Book "+IB+ " is issued");
                return;
            }
        }
        System.out.println("Book "+IB+ " is not issued");

    }
    void returnBkk(String retBk){
        System.out.println("Returned Book: "+retBk);
        AddBook(retBk);
    }

}
public class Exercise4_online_lib {
    public static void main(String[] args) {
        Library l = new Library();
        l.AddBook("Tiger");
        l.AddBook("Pathaan");
        l.AddBook("War");
        l.showAvailablrBk();
        l.issuedBook("War");
        l.showAvailablrBk();
        l.returnBkk("hindi medium");
        l.returnBkk("Tiger");
        l.showAvailablrBk();
    }
}
