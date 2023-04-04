package Year1.exam.Quiz2.Question2;

public class TestHollowCylinder {

    public static void main(String[] args) {

        HollowCylinder cylinder1 = new HollowCylinder();
        System.out.println(cylinder1.getRadius());
        System.out.println(cylinder1.getOuterRadius());
        cylinder1.setHeight(5);
        System.out.println(cylinder1.getHeight());
        System.out.println(cylinder1.getVoloume());

        HollowCylinder cylinder2 = new HollowCylinder(4);
        System.out.println(cylinder2.getRadius());
        System.out.println(cylinder2.getColor());
        cylinder2.setColor("brown");
        System.out.println(cylinder2.getColor());

        HollowCylinder cylinder3 = new HollowCylinder(5, 2);
        System.out.println(cylinder3.getVoloume());
        cylinder3.setColor("Eww");
        System.out.println(cylinder3.getHeight());

        HollowCylinder cylinder4 = new HollowCylinder(1, 4, 2);
        cylinder4.setRadius(3);
        System.out.println(cylinder4.getRadius());
        System.out.println(cylinder4.getVoloume());

        HollowCylinder cylinder5 = new HollowCylinder(0.5, 3, 10, "pink");
        System.out.println(cylinder5.getRadius());
        System.out.println(cylinder5.getOuterRadius());
        System.out.println(cylinder5.getHeight());
        System.out.println(cylinder5.getVoloume());
        System.out.println(cylinder5.getColor());

        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
        System.out.println(cylinder4);
        System.out.println(cylinder5);


    }
}
