/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TodoList{

    private ArrayList<TodoItem> listOfTasks;
    private String name;

    public TodoList(String name) {
        this.name = name;
        this.listOfTasks = new ArrayList<TodoItem>();
    }

    public void printAll() {

        int index = 1;
        for (TodoItem item : listOfTasks) {
            String mark = item.getCompleted() ? " " : "x";
            String status = "[" + mark + "]";
            System.out.println(index++ + ") " + status + item);
        }
    }
    // list; mark; unmark; create; add;

}
