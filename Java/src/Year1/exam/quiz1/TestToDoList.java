package Year1.exam.quiz1;

public class TestToDoList {

    public static void main(String[] args) {

        ToDoList task = new ToDoList(3);
        task.setTask(0,"Bath");
        System.out.println(task.getTask(0));
        task.setTask(1,"hair");
        System.out.println(task.getTask(1));
        task.setTask(2,"brush");
        System.out.println(task.getTask(2));

        task.setDone(0);
        task.setDone(2);

        System.out.println("\nTasks:");
        task.displayAllTasks();

        System.out.println("\nCompleted Tasks:");
        task.displayAllDoneTasks();
        // for more than one number of tasks.

        ToDoList task1 = new ToDoList();
        task1.setTask(0,"H.W.");

        System.out.println(task1.getTask(0));

        System.out.println("\nTasks:");
        task1.displayAllTasks();

        System.out.println("\nCompleted Tasks:");
        task1.displayAllDoneTasks();
        // for only one number of task.

    }

}
