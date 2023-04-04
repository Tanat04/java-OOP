package Year2.Class2;

public class StackDriver {

    public static void main(String[] args) {

        Stack myList = new Stack();

        myList.push(1);
        myList.push(2);
        myList.push(3);
        myList.push(4);
        myList.push(5);

        System.out.println("My Stack: " + myList);

        myList.pop();
        System.out.println("New Stack: " + myList);
        System.out.println("Top item: " + myList.getTopItem());
        System.out.println("Is the stack empty? " + myList.isEmpty());
    }
}
