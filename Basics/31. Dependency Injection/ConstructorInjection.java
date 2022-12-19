public interface Food {}

public class Burger implements Food{}

public class Pizza implements Food{}

public class Chef{
    private Food food;

    public Chef(Food food) {
        this.food = food;
    } // here, we pass the dependency to the constructor
    // we decoupled the construction of our main class from construction to its dependencies
    // THIS IS THE MOST COMMON, AND RECOMMENDED, DEPENDENCY INJECTION

    public void prepareFood(){

    }
}

public class ConstructorInjection {
    public static void main(String args[]) {
        Chef pizzaHut = new Chef(new Pizza());
        Chef burgerKing = new Chef(new Burger());
    }
}