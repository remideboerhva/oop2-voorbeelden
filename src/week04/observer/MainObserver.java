package week04.observer;

import java.util.ArrayList;
import java.util.List;

class MainObserver {
    public static void main(String[] args) {
        Subject subject = new Subject("Ik word bekeken!");

        Observer observer01 = new Observer();
        Observer observer02 = new Observer();

        subject.addObserver(observer01);
        subject.addObserver(observer02);
        // dubbel toevoegen kan nu wel

        subject.setDeString("De gewijzigde String");
    }

}

class Subject {
    // nu willen we weten of deze is veranderd
    private String deString;

    private List<Observer> observers = new ArrayList<>();

    public Subject(String string) {
        this.deString = string;
    }

    public void setDeString(String deString) {
        this.deString = deString;
        // en alle observers laten weten dat de zaken gewijzigd zijn
        for(Observer observer: observers){
            observer.update(this.deString);
        }
    }

    // registeren
    public void addObserver(Observer observer){
        observers.add(observer);
    }
}

class Observer {

    public void update(String deString) {
        System.out.println("De gewijzigde de String is: " + deString);
    }
}


