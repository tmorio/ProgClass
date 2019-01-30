public class MultiInterfaceTest {
    public static void main(String[] args){
        Sing[] s = new Sing[4];
        s[0] = new Cat();
        s[1] = new Dog();
        s[2] = new Crow();
        s[3] = new Cow();

        for(int i = 0; i < s.length; i++){
            s[i].sing();
        }
    }
}
