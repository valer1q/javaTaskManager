public class Task {
    private String taskName;
    private String taskDescription;
    private String taskCreationDate;

    public Task(String taskName, String taskDescription, String taskCreationDate){
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCreationDate = taskCreationDate;


    }

    public String getTitle() { return taskName; }
    public void setTitle(String title) { this.taskName = title; }

    public String getTaskDescription() { return taskDescription; }
    public void setTaskDescription(String description) { this.taskDescription = description; }

    public String getTaskCreationDate(){return taskCreationDate;}
    public void setCreationDate(){ this.taskCreationDate = taskCreationDate;}

    @Override
    public String toString() {
        return String.format("Task: %s | Description: %s | Created: %s",
                taskName, taskDescription, taskCreationDate);
    }
}

