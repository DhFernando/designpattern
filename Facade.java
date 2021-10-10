public class Facade {
    public static void main(String args[]) {
        // ------ //
        // this is usual way
        // ------ //
        // Pizza_ p = new Pizza_();
        // p.prepareFood("dought");
        // System.out.println(p.deliverFood());

        System.out.print(Waiter.deliverFood("Pizza"));
    }
}

interface Food {
    public void prepareFood(String itemsRequired);

    public String deliverFood();
}

class Pizza_ implements Food {

    public String preparedItem;

    @Override
    public void prepareFood(String itemsRequired) {
        this.preparedItem = "This is chees " + itemsRequired;

    }

    @Override
    public String deliverFood() {
        return this.preparedItem;
    }

}

class Pasta implements Food {
    public String preparedItem;

    @Override
    public void prepareFood(String itemsRequired) {
        this.preparedItem = "This is chees and tomato" + itemsRequired;

    }

    @Override
    public String deliverFood() {
        return this.preparedItem;
    }

}

class Waiter {
    public static String deliverFood(String type) {
        if (type.equalsIgnoreCase("pizza")) {
            Food pizza_ = new Pizza_();
            pizza_.prepareFood("meet pizza");
            return pizza_.deliverFood();
        } else if (type.equalsIgnoreCase("pasta")) {
            Food pasta = new Pizza_();
            pasta.prepareFood("meet pasta");
            return pasta.deliverFood();
        } else
            return null;
    }
}