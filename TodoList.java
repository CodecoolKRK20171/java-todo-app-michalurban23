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

    public void listItems() {

        if (listOfTasks.isEmpty()) {
            System.out.println("List is empty");
        } else {
            int index = 1;
            System.out.println("List of tasks:\n");
            for (TodoItem item : listOfTasks) {
                String mark = item.getCompleted() ? "x" : " ";
                String status = "[" + mark + "] ";
                System.out.println(index++ + ") " + status + item);
            }
            System.out.println("");
        }
    }

    public void addItem() {
        Scanner read = new Scanner(System.in);

        System.out.println("What is the name of this new item?");
        TodoItem newItem = new TodoItem(read.nextLine());
        listOfTasks.add(newItem);
    }

    public void markItem() {
        listItems();
        System.out.println("Which item do you want to mark?");
        Scanner read = new Scanner(System.in);

        Integer index = read.nextInt();
        listOfTasks.get(index-1).setCompletedTrue();
    }

    public void unmarkItem() {
        listItems();
        System.out.println("Which item do you want to unmark?");
        Scanner read = new Scanner(System.in);

        Integer index = read.nextInt();
        listOfTasks.get(index-1).setCompletedFalse();
    }

    public void archiveItems() {

        for (TodoItem item : listOfTasks) {
            if (item.getCompleted()) {
                listOfTasks.remove(item);
            }
        }
    }

}
