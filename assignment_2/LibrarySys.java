package assignment_2;

public class LibrarySys{
    public static void main(String[] args){
        items myBooks = new books("The Great Gatsby", " Scott", 2003, "Fiction");
        items myMagazine = new magazine("New York Times", "James", 2002, 1);
        myBooks.displayDetails();
        myMagazine.displayDetails();

    }
     
}
class items{
    String title;
    String author;
    int Publication_year;

    items(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.Publication_year = publicationYear;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + Publication_year);
    }

}
class books extends items{
    String genre;
    books(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear); 
        this.genre = genre;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " +  genre);
    }

}
class magazine extends items{
    int  issueNumber;
    magazine(String title, String author, int publicationYear, int issueNumber){
        super(title, author, publicationYear);
        this.issueNumber=issueNumber;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("issuNumber: " + issueNumber);
    }

}
