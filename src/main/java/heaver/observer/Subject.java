package heaver.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标 抽象累
 *
 * @author newgaoxin
 * @date 2024/6/1 20:29
 */
public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObserver() {
        this.observers.forEach(observer -> observer.update(this));
    }
}
