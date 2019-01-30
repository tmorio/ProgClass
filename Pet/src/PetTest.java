class PetTest {
    public static void main(String[] args){
        Pet myPet;
        Pet yourPet;
        Pet herPet;

        myPet = new Dog("Siro");
        yourPet = new Cat("Mike");
        herPet = new Monkey("Jiro");

        myPet.showInfo();
        yourPet.showInfo();
        herPet.showInfo();
    }
}
