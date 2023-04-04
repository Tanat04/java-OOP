package Year1.Class5;

public class Exercise1_person {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.firstname = "Tanat";
        p1.lastname = "Arora";
        p1.yearOfBirth = 2004;

        System.out.println(p1.firstname);
        System.out.println(p1.lastname);
        System.out.println(p1.yearOfBirth);

        Person p2 = new Person("Jim", "Yo", 1990);

        System.out.println(p2.firstname);
        System.out.println(p2.lastname);
        System.out.println(p2.yearOfBirth);

        Person p3 = new Person();
        System.out.println(p3.firstname);
        System.out.println(p3.lastname);
        System.out.println(p3.yearOfBirth);

    }

}