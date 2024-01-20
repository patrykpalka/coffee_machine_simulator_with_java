package machine;

import java.util.Scanner;

public class UserInterface {
    private Scanner scan;

    public UserInterface(Scanner scanner) {
        this.scan = scanner;
    }

    public void start() {
        CoffeeMachineClass coffeeMachine = new CoffeeMachineClass();
        while (true) {
            System.out.println("Write action (buy, fill, take):");
            String input = scan.nextLine();
            if (input.equals("buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                String coffeeType = scan.nextLine();
                switch (coffeeType) {
                    case "1":
                        coffeeMachine.buyEspresso();
                        break;
                    case "2":
                        coffeeMachine.buyLatte();
                        break;
                    case "3":
                        coffeeMachine.buyCappuccino();
                        break;
                    case "back":
                        break;
                }
            } else if (input.equals("fill")) {
                coffeeMachine.fillCoffeeMachine();
            } else if (input.equals("take")) {
                coffeeMachine.takeMoney();
            } else if (input.equals("remaining")) {
                System.out.println(coffeeMachine);
            } else if (input.equals("exit")) {
                break;
            } else {
                System.out.println("Restart the program and provide correct command");
            } 
        }        
    }
}
