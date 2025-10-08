public class RecurringTask extends Task{
    int startDate;
    private String taskRecurenceInterval;

    public int getStartDate() { return startDate; }
    public void getStartDate(int description) { this.startDate = startDate;}

    public String getTaskRecurenceInterval() { return taskRecurenceInterval; }
    public void setTaskRecurenceInterval(int description) { this.taskRecurenceInterval = taskRecurenceInterval;}

    public RecurringTask(String taskName, String taskDescripton, String creationDate, String taskRecurenceInterval){
        super(taskName, taskDescripton, creationDate);
        this.startDate = startDate;
        this.taskRecurenceInterval = taskRecurenceInterval;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Recurence: %s | Start: %s",
                taskRecurenceInterval, startDate);
    }

}
