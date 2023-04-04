package Year2.Class1.polymorphism;



public class ListDriver {
    public static void main(String[] args){
        UnorderedList myList = new UnorderedList();
        myList.insert("Dobri");
        myList.insert(2);
        myList.insert(7.0);
        myList.insert(true);
        System.out.println(myList.getFirstItem());
        System.out.println(myList.find(3));
        System.out.println(myList);

    }
}
