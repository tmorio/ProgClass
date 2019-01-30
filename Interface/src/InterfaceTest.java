class InterfaceTest{
    public static void main(String[] args){
        Circle circ = new Circle(10.0);
        Recatangle rect = new Recatangle(5.0, 8.0);
        System.out.println("半径" + circ.getR() + "の円の面積: " + circ.getArea());
        System.out.println("縦: " + rect.getY() + "横: " + rect.getX() + "の四角形の面積: " + rect.getArea());
    }
}