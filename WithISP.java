// Separate smaller interfaces
interface CoffeeMaker {
    void makeCoffee();
}

interface Cleaner {
    void clean();
}

// Barista only makes coffee, so implements CoffeeMaker
class Barista implements CoffeeMaker {
    public void makeCoffee() {
        System.out.println("Barista is making coffee.");
    }
}

// Cleaner only cleans, so implements Cleaner
class ShopCleaner implements Cleaner {
    public void clean() {
        System.out.println("Cleaner is cleaning the shop.");
    }
}

// Main class to test the code
public class Main {
    public static void main(String[] args) {
        CoffeeMaker barista = new Barista();
        Cleaner cleaner = new ShopCleaner();

        barista.makeCoffee(); // Output: Barista is making coffee.
        cleaner.clean();      // Output: Cleaner is cleaning the shop.
    }
}
