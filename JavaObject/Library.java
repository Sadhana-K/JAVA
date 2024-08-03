class User{
    String name;
    float inTime;
    float outTime;
}
class Book{
    String Category;
    String Author;
    String BookName;
    int PublishYear;
    String Publication;
}
class Card{
    long idnumber;
} 
class Remindermessage{
    String endDue;

}

public class Library{
    public static void main(String []args){
    Book ComicBook = new Book();
    ComicBook.Publication= "Disney";
    ComicBook.BookName = "HaaryPotter";
    System.out.println(ComicBook.Publication);
    }

}
