
import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {
    public static void main(String args[]) {
        Salery salery = new Salery();
        new ManagerBonus(salery);
        new Employee(salery);
        salery.set(3000);
    }
}

class Salery {
    List<Observer> observers = new ArrayList<Observer>();

    public void attached(Observer ob) {
        observers.add(ob);
    }

    private int val;

    public void set(int val) {
        this.val = val;
        this.notifyAllObservers();
    }

    public int get() {
        return this.val;
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

abstract class Observer {
    protected Salery sal;

    public abstract void update();
}

class ManagerBonus extends Observer {

    public ManagerBonus(Salery sal) {
        this.sal = sal;
        this.sal.attached(this);
    }

    @Override
    public void update() {
        System.out.println("Manager bonus is " + (this.sal.get() * 3));

    }

}

class Employee extends Observer {

    public Employee(Salery sal) {
        this.sal = sal;
        this.sal.attached(this);
    }

    @Override
    public void update() {
        System.out.println("Employee bonus is " + (this.sal.get() * 2));
    }

}