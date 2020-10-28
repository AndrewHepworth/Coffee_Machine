package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Write how many cups of coffee you will need:");
//        int cups = scanner.nextInt();
//        System.out.println("For "+cups+" cups of coffee you will need:");
//        System.out.println(200*cups + " ml of water");
//        System.out.println(50*cups + " ml of milk");
//        System.out.println(15*cups + " g of coffee beans");
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;


//        System.out.println("Write how many ml of water the coffee machine has: ");
//        water = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has: ");
//        milk = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
//        coffee = scanner.nextInt();
//        System.out.println("Write how many cups of coffee you will need: ");
//        cups = scanner.nextInt();
//


        System.out.println("The coffee machine has: ");
        System.out.println(water+ " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String option = scanner.next();
            switch (option) {
                case "buy":
                    boolean canMake = false;
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino");
                    int bought = scanner.nextInt();

//                    int howManyCups = bought == 1 ? Math.min(Math.floorDiv(water,250),Math.floorDiv(coffee,16)) :
//                            bought == 2 ? Math.min(Math.min(Math.floorDiv(water,350),Math.floorDiv(coffee,20)),Math.floorDiv(milk,75) ) :
//                                    bought == 3 ? Math.min(Math.min(Math.floorDiv(water,200),Math.floorDiv(coffee,12)),Math.floorDiv(milk,100) ):
//                                            0;
//                    if(howManyCups< cups) {
//                        System.out.println("No, I can make only " + howManyCups + " cup(s) of coffee");
//                    }else if (howManyCups > cups){
//                        System.out.println("Yes, I can make that amount of coffee (and even "+ (howManyCups-cups)+ " more than that)");
//                    }else {
//                        System.out.println("Yes, I can make that amount of coffee");
//                    }

//                    if(howManyCups > 0) {
//                        water = bought == 1 ? water - 250 : bought == 2 ? water - 350 : bought == 3 ? water - 200 : water;
//                        milk = bought == 1 ? milk : bought == 2 ? milk - 75 : bought == 3 ? milk - 100 : milk;
//                        coffee = bought == 1 ? coffee - 16 : bought == 2 ? coffee - 20 : bought == 3 ? coffee - 12 : coffee;
//                        money = bought == 1 ? money + 4 : bought == 2 ? money + 7 : bought == 3 ? money + 6 : money;
//                        cups = bought == 1 || bought == 2 || bought == 3 ? cups - 1 : cups;
//                    }

                    if( bought == 1){
                        if ( water < 250 ){
                            System.out.println("Sorry, not enough water!");
                        }else if ( coffee < 16){
                            System.out.println("Sorry, not enough coffee!");
                        }else {
                            System.out.println("I have enough resources, making you a coffee!");
                            canMake = true;
                        }
                    } else if ( bought == 2){
                        if( water < 350 ){
                            System.out.println("Sorry, not enough water!");
                        }else if ( coffee < 20){
                            System.out.println("Sorry, not enough coffee!");
                        }else if ( milk < 75){
                            System.out.println("Sorry, not enough milk!");
                        }else {
                            System.out.println("I have enough resources, making you a coffee!");
                            canMake = true;
                        }
                    } else if ( bought == 3){
                        if( water < 200 ){
                            System.out.println("Sorry, not enough water!");
                        }else if ( coffee < 12){
                            System.out.println("Sorry, not enough coffee!");
                        }else if ( milk < 100){
                            System.out.println("Sorry, not enough milk!");
                        }else {
                            System.out.println("I have enough resources, making you a coffee!");
                            canMake = true;
                        }
                    }
                    //Now Remove the amount
                    if(canMake){
                        water = bought == 1 ? water - 250 : bought == 2 ? water - 350 : bought == 3 ? water - 200 : water;
                        milk = bought == 1 ? milk : bought == 2 ? milk - 75 : bought == 3 ? milk - 100 : milk;
                        coffee = bought == 1 ? coffee - 16 : bought == 2 ? coffee - 20 : bought == 3 ? coffee - 12 : coffee;
                        money = bought == 1 ? money + 4 : bought == 2 ? money + 7 : bought == 3 ? money + 6 : money;
                        cups = bought == 1 || bought == 2 || bought == 3 ? cups - 1 : cups;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add");
                    water += scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add: ");
                    milk += scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    coffee += scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add: ");
                    cups += scanner.nextInt();
                    break;

                case "take":
                    System.out.println("I gave you, " + money);
                    money = 0;
                    break;

                case "remaining":
                    System.out.println("The coffee machine has: ");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(coffee + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;

                case "exit":
                    break;
            }
            if(option.equals("exit")){
                break;
            }
            System.out.println("");
        }



    }
}
