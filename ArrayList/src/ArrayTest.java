import java.util.*;
public class ArrayTest {
    public static void main(String[] args){
        ArrayList<String> city = new  ArrayList<String>();
        city.add("Utsunomiya");
        city.add("Oyama");
        city.add("Ashikaga");
        city.add("Sano");
        city.add("Kanuma");
        city.add("Mooka");
        for(int i = 0; i < city.size(); i++){
            System.out.println(i + ":" + city.get(i));
        }

        String old = city.get(3);
        city.set(3, "nikko");
        System.out.println(old + "->" + city.get(3));

        old = city.remove(1);

        System.out.println(old + "-> removed");
        for(int i = 0; i < city.size(); i++){
            System.out.println(i + ":" + city.get(i));
        }

        city.clear();
        System.out.println("clear");
        System.out.println("size: " + city.size());
    }
}
