/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{

    private String name;
    private Boolean completed;

    public TodoItem(String name) {
        this.name = name;
        this.completed = false;
    }

    public Boolean getCompleted() {
        return this.completed;
    }

    public void setCompletedTrue() {
        this.completed = true;
    }

    public void setCompletedFalse() {
        this.completed = false;
    }

    public String toString() {
        return this.name;
    }
}
