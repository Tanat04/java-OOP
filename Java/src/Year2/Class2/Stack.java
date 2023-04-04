package Year2.Class2;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public Stack(Node top) {
        this.top = top;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public boolean isEmpty(){
        return top == null;
    }
    //[1,2,3,4]
    //[,2,1]
    public boolean push(int item){
        Node newNode = new Node((item));

        if(isEmpty()){
            top = newNode;
        }else {
            Node temp = top;
            top = newNode;
            top.setNext(temp);
        }
        return true;
    }

    public boolean pop(){
        if(isEmpty()){
            return false;
        }else{
            top = top.getNext();
            return true;
        }
    }

    public int getTopItem(){
        if(isEmpty()){
            return -1;
        }else{
            return top.getData();
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("[ ");

        Node current = top;
        while(current != null) {
            result.append(current.getData());
            result.append(" ");
            current = current.getNext();
        }

        result.append("]");
        //result.delete(result.length()-2,result.length());
        return result.toString();
    }
}
