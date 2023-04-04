package Year2.Class2;

import java.util.Scanner;

public class OrderedListDriver {

    public static void main(String[] args) {

/*        OrderedList mylist = new OrderedList();

        mylist.insert(4);
        mylist.insert(5);
        mylist.insert(3);
        mylist.insert(1);
        mylist.insert(1);

        System.out.println("My list: " + mylist);

        System.out.println("Index of '3': " + mylist.find(3));
        System.out.println("Index of '5': " + mylist.find(5));
        System.out.println("Index of '6': " + mylist.find(6));

        System.out.println("Count the number of item: " + mylist.count());
        mylist.delete(1);
        System.out.println("My list: " + mylist);*/

        printOut();

    }

    public static void printOut(){
        OrderedList mylist = new OrderedList();
        int[] count = new int[3];
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        reader.nextLine();

        for (int i = 0; i < number; i++) {
            String command = reader.nextLine();

            String[] store = command.split(" ");

            if (store[0].equalsIgnoreCase("insert")){
                if (mylist.insert(Integer.parseInt(store[1]))){
                    count[0]++;
                }
            }else if (store[0].equalsIgnoreCase("delete")){
                if(mylist.delete(Integer.parseInt(store[1]))){
                    count[1]++;
                }
            } else if (store[0].equalsIgnoreCase("find")){
                if(mylist.find(Integer.parseInt(store[1])) != -1){
                    count[2]++;
                }
            }
        }

        for (int each: count) {
            System.out.print(each + " ");
        }
        System.out.println(mylist.count());
        System.out.println(mylist);
    }
}
