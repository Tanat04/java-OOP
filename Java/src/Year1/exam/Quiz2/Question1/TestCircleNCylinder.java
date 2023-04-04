package Year1.exam.Quiz2.Question1;

public class TestCircleNCylinder {

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println(circle1.getRadius());
        circle1.setColor("Red");
        System.out.println(circle1.getColor());
        System.out.println(circle1.getArea());

        Circle circle2 = new Circle(5);
        System.out.println(circle2.getRadius());

        Circle circle3 = new Circle(3, "Green");
        System.out.println(circle3.getRadius());
        System.out.println(circle3.getColor());
        System.out.println(circle3.getArea());

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);


        System.out.println("\n===== ===== ===== ===== =====\n");

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1.getRadius());
        System.out.println(cylinder1.getColor());
        cylinder1.setHeight(5);
        System.out.println(cylinder1.getHeight());
        System.out.println(cylinder1.getVoloume());

        Cylinder cylinder2 = new Cylinder(4);
        System.out.println(cylinder2.getRadius());

        Cylinder cylinder3 = new Cylinder(5, 2);
        System.out.println(cylinder3.getVoloume());
        cylinder3.setColor("Eww");
        System.out.println(cylinder3.getHeight());

        Cylinder cylinder4 = new Cylinder(1, 3, "Violet");
        cylinder4.setRadius(3);
        System.out.println(cylinder4.getRadius());
        System.out.println(cylinder4.getVoloume());

        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
        System.out.println(cylinder4);

    }
}
