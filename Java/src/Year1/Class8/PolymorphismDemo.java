package Year1.Class8;

import Year1.Class6.circle;

public class PolymorphismDemo {

    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent();
        Object s = new Student();
        Student s1 = (Student) s;
        Person p = new Person();
        circle c = new circle();

        printSth(g);
        printSth(s1);
        printSth(p);

    }

    public static void printSth(Object p) {
        System.out.println(p.toString());
    }
}

class Person extends Object {
    @Override
    public String toString() {
        return "Person result";
    }
}

class Student extends Person {
    @Override
    public String toString() {
        return "Student Original";
    }
}

class GraduateStudent extends Student {

}