package pkg_A;

public class Package {
    public static void main(String[] args){
        pkg_B.Book bk = new pkg_B.Book("Java 入門", 1980);
        bk.showInfo();
    }
}
