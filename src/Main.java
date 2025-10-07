import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Task simpleTask = new Task(
                "do kt",
                "play dota 2",
                7);

        DeadlineTask deadlineTask = new DeadlineTask(
                "javaLibrary",
                "need to do it",
                2,
                2);

        RecurringTask recurringTask = new RecurringTask(
                "play dota 2",
                "hard katka dota 2",
                12,
                "every day");


        TaskManager.addTask(simpleTask);
        TaskManager.addTask(deadlineTask);
        TaskManager.addTask(recurringTask);

        TaskManager.getTasks();
    }


}
