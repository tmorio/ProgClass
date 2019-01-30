public class EstateTest {
    public static void main(String[] args){
        CalcEstatePrice estate;
        estate = new CalcEstatePrice(1800);
        System.out.println("土地面積" + estate.getEstatePrice() + "万円");
        System.out.println("土地面積" + estate.calcArea() + "m^2");
    }
}
