public class Dog implements Sing,Suckle {
    public Dog(){
        System.out.println("A dog was born");
    }

    public void sing(){
        System.out.println("won,won");
    }

    public void suckle(){
        System.out.println("Chu-chu-");
    }

    public void dogWalk(){
        System.out.println("... ...");
    }
}
