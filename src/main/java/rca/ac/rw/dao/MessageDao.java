package rca.ac.rw.dao;


import rca.ac.rw.orm.Message;

import java.util.List;

public interface MessageDao {

    public void saveMessage(Message message);

    public void updateMessage(Message message);

    public void deleteMessage(int id);

    public List<Message> getMessages();
}
