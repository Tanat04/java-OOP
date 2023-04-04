package Year1.exam.Quiz2.Question3;

public class TestCylinderNHollowCylinder {

    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1.getRadius());
        System.out.println(cylinder1.getColor());
        cylinder1.setHeight(5);
        System.out.println(cylinder1.getHeight());
        System.out.println(cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(4);
        System.out.println(cylinder2.getRadius());

        Cylinder cylinder3 = new Cylinder(5, 2);
        System.out.println(cylinder3.getVolume());
        cylinder3.setColor("Eww");
        System.out.println(cylinder3.getHeight());

        Cylinder cylinder4 = new Cylinder(1, 3, "Violet");
        cylinder4.setRadius(3);
        System.out.println(cylinder4.getRadius());
        System.out.println(cylinder4.getVolume());

        System.out.println(cylinder1);
        System.out.println(cylinder2);
        System.out.println(cylinder3);
        System.out.println(cylinder4);

        System.out.println("\n===== ===== ===== ===== =====\n");

        HollowCylinder hollowCylinder1 = new HollowCylinder();
        System.out.println(hollowCylinder1.getRadius());
        System.out.println(hollowCylinder1.getOuterRadius());
        hollowCylinder1.setHeight(5);
        System.out.println(hollowCylinder1.getHeight());
        System.out.println(hollowCylinder1.getVolume());

        HollowCylinder hollowCylinder2 = new HollowCylinder(4);
        System.out.println(hollowCylinder2.getRadius());
        System.out.println(hollowCylinder2.getColor());
        hollowCylinder2.setColor("brown");
        System.out.println(hollowCylinder2.getColor());

        HollowCylinder hollowCylinder3 = new HollowCylinder(5, 7);
        System.out.println(hollowCylinder3.getVolume());
        hollowCylinder3.setColor("Eww");
        System.out.println(hollowCylinder3.getHeight());

        HollowCylinder hollowCylinder4 = new HollowCylinder(1, 4, 2);
        hollowCylinder4.setRadius(3);
        System.out.println(hollowCylinder4.getRadius());
        System.out.println(hollowCylinder4.getVolume());

        HollowCylinder hollowCylinder5 = new HollowCylinder(0.5, 3, 10, "pink");
        System.out.println(hollowCylinder5.getRadius());
        System.out.println(hollowCylinder5.getOuterRadius());
        System.out.println(hollowCylinder5.getHeight());
        System.out.println(hollowCylinder5.getVolume());
        System.out.println(hollowCylinder5.getColor());

        System.out.println(hollowCylinder1);
        System.out.println(hollowCylinder2);
        System.out.println(hollowCylinder3);
        System.out.println(hollowCylinder4);
        System.out.println(hollowCylinder5);
    }
}
