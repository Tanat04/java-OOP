package Year1.Class6;

public class test {

    public static void main(String[] args) {

        circle shape = new circle(50);
        System.out.println(shape.getArea());
        shape.setColor("Yellow");
        System.out.println(shape.getColor());
        System.out.println(shape);
        System.out.println(shape.getClass());
        System.out.println();

        rectangle rec = new rectangle(5, 10);
        System.out.println(rec.getClass());
        System.out.println(rec);
        System.out.println(rec.getArea());
        System.out.println(rec.getPerimeter());

    }

}