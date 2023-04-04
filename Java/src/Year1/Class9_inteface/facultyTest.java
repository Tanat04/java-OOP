package Year1.Class9_inteface;

public class facultyTest {
    public static void main(String[] args) {
        faculty vms = new VMS();
        System.out.println(vms.numberOfStudents);
        faculty bba = new BBA();
        System.out.println(bba.numberOfStudents);

        printFacultyName(vms);
        printFacultyName(bba);
    }

    public static void printFacultyName(faculty f) {
        System.out.println(f.getName());
    }
}
