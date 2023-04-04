package Year2.Class1.polymorphism;

public class NodeDriver {
    public static void main(String[] args){

        Node node1 = new Node("Anil");
        Node node2 = new Node(1);
        Node node3 = new Node("Dobri");
        Node node4 = new Node(2.0);
        Node node5 = new Node(true);

        node1.setNext(node2);
        node2.setNext(node3);

        Node myList = node1;
        Node current = myList;

        while(current != null){
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }
}
