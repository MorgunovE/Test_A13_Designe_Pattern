package edu.bdeb.a13.observer;

public class Main {

        public static void main(String[] args) {
            Message message = new Message("Hello World from Observer Pattern!");
            Message message2 = new Message("Hello World from Observer Pattern 2!");
            Message message3 = new Message("Hello World from Observer Pattern 3!");
            MessagePublisher publisher = new MessagePublisher();
            MessageSubscriber1 subscriber1 = new MessageSubscriber1();
            MessageSubscriber2 subscriber2 = new MessageSubscriber2();

            publisher.addObserver(subscriber1);
            publisher.addObserver(subscriber2);

            publisher.notifyObservers(message);
            publisher.notifyObservers(message2);

            publisher.removeObserver(subscriber2);

            MessageSubscriber3 subscriber3 = new MessageSubscriber3();

            publisher.addObserver(subscriber3);
            publisher.notifyObservers(message3);

            publisher.notifyObservers(message);
        }
}
