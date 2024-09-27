public class Circle {

    private static double radius;
    private static double diameter;
    private static double area;

    public Circle() {
        this.radius = 1; 
        updateCircle();
    }

    private void updateCircle() {
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    public void setRadius(double rad) {
        radius = rad;
        updateCircle();
    }

    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}
