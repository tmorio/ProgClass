public class PolyTest {
    public static void main(String[] args){
        Point p1 = new Point(3,5);
        Point p2 = new ColoredPoint(10,20,"Red");
        System.out.println("---p1---");
        p1.showPoint();
        System.out.println("---p2---");
        p2.showPoint();
    }
}
