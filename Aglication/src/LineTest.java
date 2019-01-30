public class LineTest {
    public static void main(String[] args){
        Point p1;
        Point p2;
        Line line1;
        Line line2;

        p1 = new Point(0,0);
        p2 = new Point(3,4);
        line1 = new Line(p1,p2);
        line2 = new Line(new Point(2,3), new Point(5,8));

        System.out.println("Line1");
        line1.showInfo();
        System.out.println("Line2");
        line2.showInfo();

        line1.move(10,10);
    }
}
