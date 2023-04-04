package Year1.Class9_abstract;

public class facultyTest {
    public static void main(String[] args) {
        faculty vms = new VMS();
        faculty bba = new BBA();

        //bba.numberOfStudents = 9; (cannot do coz its 'final')
        System.out.println(vms.numberOfStudents);
        System.out.println(bba.numberOfStudents);

        printFacultyName(vms);
        printFacultyName(bba);

        printFacultyBuilding(vms);
        printFacultyBuilding(bba);
    }
    public static void printFacultyName(faculty name) {
        System.out.println(name.getName());
    }

    public static void printFacultyBuilding(faculty Building) {
        System.out.println(Building.getBuidling());
    }
}
