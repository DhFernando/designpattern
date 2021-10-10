public class SingleObject {
    public static void main(String args[]) {

    }
}

class SingleObject_ {

    // create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    // make the constructor private so that this class cannot be
    // instantiated
    private SingleObject_() {
    }

    // Get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}

// Lazy
class LazySingleObject {

    // create an object of SingleObject
    private static LazySingleObject instance = null;

    // make the constructor private so that this class cannot be
    // instantiated
    private LazySingleObject() {
    }

    // Get the only object available
    public static LazySingleObject getInstance() {
        if (instance == null) {
            instance = new LazySingleObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}