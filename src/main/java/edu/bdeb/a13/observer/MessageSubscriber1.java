package edu.bdeb.a13.observer;

public class MessageSubscriber1 implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriber1 :: " + message.getMessageContent());
    }
}
