package Year2.Class1.polymorphism;

public class Node <T>{
    private T data = null;
    private Node<T> next = null;


    public Node(){

    }

    public Node(T data){
        this.data = data;
    }
    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
