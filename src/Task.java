import java.time.LocalTime;

public class Task {
    private LocalTime startTime;
    private LocalTime endTime;
    private String taskDesc;
    private String taskName;
    //private bool completed;


    // Constructor
    public Task(LocalTime startTime, LocalTime endTime, String taskDesc, String taskName)
    {
        this.startTime = startTime;
        this.endTime = endTime;
        this.taskDesc = taskDesc;
        this.taskName = taskName;
    }

    // Getters and Setters.
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public String getTaskDesc() {
        return taskDesc;
    }
    public String getTaskName() {
        return taskName;
    }
    public void setStartTimeTime(LocalTime startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }




}
