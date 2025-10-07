import java.util.ArrayList;
import java.util.Comparator;

public class TaskManager {

    public static ArrayList<Task> tasks = new ArrayList<>();

    public static void addTask(Task task){
        tasks.add(task);
    }

    public void removeTask(Task task){
        tasks.remove(task);
    }

    public static void getTasks() {
        System.out.println(tasks);
    }
}

