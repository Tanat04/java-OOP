package Year1.exam.quiz1;

public class ToDoList {

    private int nTasks;
    private String[] toDo;
    private boolean[] done;

    ToDoList(){
        nTasks = 1;
        toDo = new String[nTasks];
        done = new boolean[nTasks];
    }

    ToDoList(int nItems) {
        nTasks = nItems;
        toDo = new String[nItems];
        done = new boolean[nItems];

    }

    public void setTask(int taskN, String task){
        toDo[taskN] = task;
        done[taskN] = false;
    }

    public String getTask(int taskN) {
        return toDo[taskN];
    }

    public void setDone(int taskN) {
        done[taskN] = true;
    }

    public void displayAllTasks() {
        int count = 1;
        for (int i = 0; i < toDo.length; i++) {
            System.out.println("The "+ count +" task is "+ toDo[i]);
            count++;
        }
    }

    public void displayAllDoneTasks() {
        for (int i = 0; i < done.length; i++) {
            if (done[i] == true){
                System.out.println("the task '"+ toDo[i] + "' task is done");
            }
        }
    }

}
