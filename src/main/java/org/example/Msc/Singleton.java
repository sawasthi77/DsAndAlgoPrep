package org.example.Msc;

public class Singleton {

    private static Singleton instance = null;
    private Singleton(){}

    static Singleton getInstance(){
        if(instance == null){
            return new Singleton();
        }
        return instance;
    }
}
