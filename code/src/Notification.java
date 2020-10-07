import java.util.Date;

public abstract class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;


    public int getNotificationId() {
        return notificationId;
    }
    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public boolean sendNotification(Account account) {return true;}
}
