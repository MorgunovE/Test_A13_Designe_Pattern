package edu.bdeb.a13.sigleton;

public class SingletonImplementation {

    // SingletonImplementation instance
    private static SingletonImplementation instance = null;

    private SingletonImplementation() {
        System.out.println("SingletonImplementation created");
    }

    public static SingletonImplementation getInstance() {
        if (instance == null) {
            instance = new SingletonImplementation();
        }
        return instance;
    }
}
