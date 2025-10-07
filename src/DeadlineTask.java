public class DeadlineTask extends Task {
    private int deadline;

    public int getDeadline() { return deadline; }
    public void setDeadline(int deadline) { this.deadline = deadline; }

    public DeadlineTask(String taskName, String taskDescription, int taskCreationDate, int deadline ) {
        super(taskName, taskDescription, taskCreationDate);
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | deadline: %s", deadline);
    }
}