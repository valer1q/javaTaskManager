public class Main {
    public static void main(String[] args) {

        Task simpleTask = new Task(
                "do kt",
                "play dota 2",
                "08.07.1994");

        DeadlineTask deadlineTask = new DeadlineTask(
                "javaLibrary",
                "need to do it",
                "09.07.1994",
                2);

        RecurringTask recurringTask = new RecurringTask(
                "play dota 2",
                "hard katka dota 2",
                "10.07.1994",
                "every day");


        TaskManager.addTask(simpleTask);
        TaskManager.addTask(deadlineTask);
        TaskManager.addTask(recurringTask);

        TaskManager.getSortedTasksByDate();
    }


}
