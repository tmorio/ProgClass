package pkg_B;

public class Book {
    String title;
    int price;
    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    public void showInfo(){
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
