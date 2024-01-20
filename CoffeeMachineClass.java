package machine;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMachineClass {
    private int water;
    private int milk;
    private int coffee;
    private int cups;
    private int money;
    private Scanner scan;

    public CoffeeMachineClass() {
        this.water = 400;
        this.milk = 540;
        this.coffee = 120;
        this.cups = 9;
        this.money = 550;
        this.scan = new Scanner(System.in);
    }

    public void buyEspresso() {
        if (water < 250) {
            System.out.println("Sorry, not enough water!");
            return;
        } if (coffee < 16) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
            return;
        }
        System.out.println("I have enough resources, making you a coffee!");
        water -= 250;
        coffee -= 16;
        money += 4;
        cups--;
    }

    public void buyLatte() {
        if (water < 350) {
            System.out.println("Sorry, not enough water!");
            return;
        } if (milk < 75) {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        if (coffee < 20) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
            return;
        }
        System.out.println("I have enough resources, making you a coffee!");
        water -= 350;
        milk -= 75;
        coffee -= 20;
        money += 7;
        cups--;
    }

    public void buyCappuccino() {
        if (water < 200) {
            System.out.println("Sorry, not enough water!");
            return;
        } if (milk < 100) {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        if (coffee < 12) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        } if (cups < 1) {
            System.out.println("Sorry, not enough cups!");
            return;
        }
        System.out.println("I have enough resources, making you a coffee!");
        water -= 200;
        milk -= 100;
        coffee -= 12;
        money += 6;
        cups--;
    }

    public void fillCoffeeMachine() {
        System.out.println("Write how many ml of water you want to add:");
        water += scan.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scan.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffee += scan.nextInt();
        System.out.println("Write how many disposable cups you want to add:");
        cups += scan.nextInt();
    }

    public void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    @Override
    public String toString() {
        return "The coffee machine has:\n" +
                water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffee + " g of coffee beans\n" +
                cups + " disposable cups\n" +
                "$" + money + " of money";
    }
}
