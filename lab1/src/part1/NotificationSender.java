package part1;

// I4 ад I1
public interface NotificationSender extends OrderProcessor {
    void sendNotification(String message);
}
