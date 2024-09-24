// Large interface with too many methods
interface Worker {
    void makeCoffee();
    void clean();
}

// Barista implements both methods, but only needs to make coffee
class Barista implements Worker {
    public void makeCoffee() {
        System.out.println("Barista is making coffee.");
    }

    // Barista shouldn't be cleaning, but is forced to implement this
    public void clean() {
        throw new UnsupportedOperationException("Barista doesn't clean!");
    }
}

// Cleaner implements both methods, but only needs to clean
class Cleaner implements Worker {
    public void clean() {
        System.out.println("Cleaner is cleaning the shop.");
    }

    // Cleaner shouldn't be making coffee, but is forced to implement this
    public void makeCoffee() {
        throw new UnsupportedOperationException("Cleaner doesn't make coffee!");
    }
}
