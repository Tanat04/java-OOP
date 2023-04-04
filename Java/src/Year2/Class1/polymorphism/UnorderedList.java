package Year2.Class1.polymorphism;

public class UnorderedList<T> {
    private Node<T> head;

    public UnorderedList(){
        this.head = null;
    }

    public UnorderedList(Node<T> head){
        this.head = head;
    }

    public Node<T> getHead() {
        return head;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean insert(T data){
        Node<T> newNode = new Node<T>(data);

        if(isEmpty()){
            head = newNode;
        }

        else{
            Node<T> current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }

        return true;
    }

    public boolean delete(){
        if(isEmpty()){
            return false;
        }

        head = head.getNext();
        return true;
    }

    public int count(){
        int count = 0;
        Node<T> current = head;
        while(current != null){
            count++;
            current = current.getNext();
        }

        return count;
    }

    public int find(T data){
        int index = 0;
        Node<T> current = head;
        while(current != null){
            if(current.getData() == data){
                return index;
            }
            index++;
            current = current.getNext();
        }

        return -1;
    }

    public T getFirstItem(){
        if(isEmpty()){
            return null;
        }
        return head.getData();
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        Node current = head;

        while(current != null){
            result.append(current.getData());
            result.append(", ");
            current = current.getNext();
        }

        result.delete(result.length()-2,result.length());
        result.append("]");
        return result.toString();
    }
}
