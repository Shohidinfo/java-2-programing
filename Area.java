public class Area {

    void circleArea(double radius) {
        double area = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Area ob = new Area();
        ob.circleArea(5);
    }
}