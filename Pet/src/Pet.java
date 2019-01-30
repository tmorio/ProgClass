abstract class Pet{
    private String name;

    Pet(String name){
        this.name = name;
    }

    abstract void cry();

    void showInfo(){
        System.out.println(name);
        cry();
    }
}