public class CalcEstatePrice {
    private CalcAreaImple calcAreaImple;
    private int estatePrice;

    public CalcEstatePrice(int arg){
        calcAreaImple = new CalcAreaImple();
        estatePrice = arg;
    }

    public int calcArea(int width, int height){
        return calcAreaImple.calcArea(width,height);
    }

    public int getEstatePrice(){
        return estatePrice;
    }
}
