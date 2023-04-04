package Year2.Class1.normal;

public class ListDriver {

    public static void main(String[] args) {

        UnorderedList mylist = new UnorderedList();
        mylist.insert(1);
        mylist.insert(3);
        mylist.insert(5);
        mylist.insert(7);

        System.out.println("Original list: " + mylist);
        mylist.delete();
        mylist.delete();
        System.out.println("New updated list: " + mylist);
        System.out.println("Get first Item: " + mylist.getFirstItem());
        System.out.println("Get index of '4' in the list: " + mylist.find(4));
        System.out.println("Get index of '5' in the list: " + mylist.find(5));

    }
}
