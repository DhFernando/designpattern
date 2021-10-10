public class Decorator {
    public static void main(String[] args) {

        Pizza basicPizza = new Mozzarell(new TomatoSource(new PlainPizza()));

        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());
    }
}

interface Pizza {
    public String getDescription();

    public double getCost();
}

class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 4.00;
    }

}

abstract class ToppingDecorator implements Pizza {
    protected Pizza tempPizza;

    public ToppingDecorator(Pizza pizza) {
        this.tempPizza = pizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }
}

class Mozzarell extends ToppingDecorator {

    public Mozzarell(Pizza pizza) {
        super(pizza);
        // TODO Auto-generated constructor stub

        System.out.println("Adding Moz");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarella";
    }

    public double getCost() {
        return tempPizza.getCost() + .5;
    }

}

class TomatoSource extends ToppingDecorator {

    public TomatoSource(Pizza pizza) {
        super(pizza);
        // TODO Auto-generated constructor stub

        System.out.println("Adding Souce");
    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Source";
    }

    public double getCost() {
        return tempPizza.getCost() + .35;
    }

}