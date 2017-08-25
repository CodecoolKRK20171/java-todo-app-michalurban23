/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);
    static Boolean appRunning = true;

    public static void main(String[] args) {
        clear();
        String listName = askForListName();
        TodoList list = new TodoList(listName);
        runMenu(list);
    }

    private static String askForListName() {
        System.out.println("Please enter name of the list");
        return input.nextLine();
    }

    public static void runMenu(TodoList list) {
        clear();
        while (appRunning) {
            printMenu();
            handleMenu(list);
        }
    }

    private static void printMenu() {
        clear();
        System.out.println("What do you want to do?\n");
        System.out.println("1) List all tasks");
        System.out.println("2) Add new task");
        System.out.println("3) Mark task");
        System.out.println("4) Unmark task");
        System.out.println("5) Archive completed tasks");
        System.out.println("\n0) Exit\n");
    }

    private static void handleMenu(TodoList list) {
        System.out.println("Choose an option: ");
        String option = input.nextLine();

        clear();
        if (option.equals("1")) {
            list.listItems();
        } else if (option.equals("2")) {
            list.addItem();
        } else if (option.equals("3")) {
            list.markItem();
        } else if (option.equals("4")) {
            list.unmarkItem();
        } else if (option.equals("5")) {
            list.archiveItems();
        } else if (option.equals("0")) {
            clear();
            System.exit(0);
        } else {
            System.out.println("Invalid option!\n");
        }
        pause();
    }

    static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static void pause() {
        Scanner pause = new Scanner(System.in);
        System.out.println("Press enter to continue ");
        pause.nextLine();
    }
}
