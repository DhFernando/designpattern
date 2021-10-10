public class Strategy {
    public static void main(String arg[]) {
        Animal dog = new Dog();
        System.out.println(dog.tryToFly());
    }
}

interface Moves {
    String move();
}

class CanFly implements Moves {

    @Override
    public String move() {
        return "I can fly";
    }

}

class CanRun implements Moves {

    @Override
    public String move() {
        return "I can run";
    }
}

class Animal {
    public Moves mv;

    public String tryToFly() {
        return mv.move();
    }

    public void setNewFlyingAbility(Moves newMoveMethod) {
        mv = newMoveMethod;
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Hi I am Dog");
        mv = new CanRun();
    }

}