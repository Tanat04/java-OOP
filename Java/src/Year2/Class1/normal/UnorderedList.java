package Year2.Class1.normal;

public class UnorderedList {

    private Node head;

    public UnorderedList() {
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean insert(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;
        }else {
            Node current = head;
            while (current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(newNode);
        }
        return true;
    }

    public boolean delete(){
        if (isEmpty()){
            return false;
        }else {
            head = head.getNext();
            return true;
        }
    }

    public int count(){
        int counter = 0;
        Node current = head;

        while(current != null) {
            counter += 1;
            current = current.getNext();
        }

        return counter;
    }

    /**
     *
     * @check if the intem is in the list
     * @param item
     * @return the index of the item. -1 if the item is not in the list
     */
    public int find(int item){
        int index = 0;
        Node current = head;

        while (current.getData() != item){
            if (current.getNext() == null){
                return -1;
            }else{
                index ++;
                current = current.getNext();
            }
        }
        return index;
    }

    /**
     *
     * @return the first value of the list. -1 if the list is empty
     */
    public int getFirstItem() {
        if(isEmpty()){
            return -1;
        }else {
            return head.getData();
        }
    }

    @Override
    public String toString() {
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
