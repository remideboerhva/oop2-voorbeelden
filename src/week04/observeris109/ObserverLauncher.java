package week04.observeris109;

import java.util.ArrayList;
import java.util.List;

class ObserverLauncher {
    public static void main(String[] args) {
        // we willen een object volgen en
        // Observers volgen Subject
        // Subject
        Subject subject = new Subject("De data");

        // Observers
        Observer observer01 = new Observer();
        Observer observer02 = new Observer();
        Observer observer03 = new Observer();
        // toevoegen observers aan subject
        subject.addObserver(observer01);
        subject.addObserver(observer02);
        subject.addObserver(observer03);
        subject.addObserver(observer01);
        // update subject

        subject.setData("Nieuw String!!!!");
    }
}

class Subject {
    private String data;
    private List<Observer> observers = new ArrayList<>(); //!!!!!

    public Subject(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;

        for(Observer obs: observers){
            obs.update(this.data);
        }
    }

    @Override
    public String toString() {
        return "Subject{" +
                "data='" + data + '\'' +
                '}';
    }

    public void addObserver(Observer observer){
        // check of al bestaat
        this.observers.add(observer);
    }
}

class Observer {

    public void update(String data) {
        System.out.println("De gewijzigde data: " + data);
    }
}
