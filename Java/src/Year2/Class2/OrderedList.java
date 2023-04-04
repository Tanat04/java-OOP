package Year2.Class2;

public class OrderedList {

    private Node head;

    public OrderedList(){
        this.head = null;
    }

    public OrderedList(Node head){
        this.head = head;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean insert(int data){
        if(find(data) != -1){
            return false;
        }

        Node newNode = new Node(data);
        Node current = head;
        Node previous = null;
        while(current != null && newNode.getData() > current.getData()){
            previous = current;
            current = current.getNext();
        }

        if(previous == null){
            newNode.setNext(head);
            head = newNode;
        } else{
            previous.setNext(newNode);
            newNode.setNext(current);
        }

        return true;
    }


    public boolean delete(int data){
        int dataIndex = find(data);
        if(isEmpty() || dataIndex == -1){
            return false;
        }

        if(dataIndex == 0){
            head = head.getNext();
            return true;
        }

        Node current = head;
        for(int i = 0;i<dataIndex-1;i++){
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());

        return true;
    }

    public int find(int data){
        Node current = head;
        int count = 0;
        boolean stop = false;

        while(current != null && stop == false){
            if (current.getData() == data){
                return count;
            }else{
                if (current.getData() > data){
                    stop = true;
                }else{
                    current = current.getNext();
                    count++;
                }
            }
        }
        return -1;
    }

    public int count(){
        Node current = head;
        int count = 0;
        while (current != null){
            count++;
            current = current.getNext();
        }
        return count;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("[ ");

        Node current = head;
        while(current != null) {
            result.append(current.getData());
            result.append(" ");
            current = current.getNext();
        }

        result.append("]");
        return result.toString();
    }
}

