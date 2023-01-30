package rca.ac.rw.dao;

import org.apache.poi.hssf.record.formula.functions.Not;
import rca.ac.rw.orm.Notification;

import java.util.List;

public interface NotificationDao {

    public void saveNotification(Notification notification);
    public void updateNotification(Notification notification);
    public void deleteNotification(int id);
    public List<Notification> getNotifications();
}
