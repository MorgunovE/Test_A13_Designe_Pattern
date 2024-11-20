package edu.bdeb.a13.observer;

public class MessageSubscriber3 implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriber3 :: " + message.getMessageContent());
    }
}
