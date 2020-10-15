
/*

This is a coffee machine project that is designed to simulate
a real coffee machine. It has four action which you can select from,i.e,
1. buy - Allows you to buy three types of coffees and also checks whether the resources for the coffee is available or not
2. fill - Allows you to fill the coffee machine with specified amount of resources.
3. take - Allows you to take the money collected from the coffee machine.
4. remaining - Allows you to check the amount of resources remaining in the coffee machine.
5. exit - Allows you to exit out of the program.

The coffee machine has the initial resources of 400 ml of water, 540 ml of milk, 120 g of coffee beans, 9 disposable cups, $550 in cash.

 */
import java.util.Scanner;
import java.lang.Math;
public class Coffee_Machine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        System.out.println ("Welcome to the coffee machine choose one of the options below." );
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = input.nextLine();
        String caf = "0";
        Boolean a = false;
        while(a==false){


            switch(action){

                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    System.out.println ("type 1 to 3" );
                    caf = input.next();
                    switch(caf){

                        case "1":

                            if ( water < 250 || (beans < 16 || cups < 1) ) {
                                System.out.println("I dont have");
                            } else {
                                water -= 250;
                                beans -= 16;
                                money += 4;
                                cups -= 1;
                                System.out.println ( "I have enough resources, making you a coffee!" );
                            }

                            break;
                        case "2":
                            if(water<350||(beans<20||(cups<1||milk<75))){
                                System.out.println("I dont have");
                            }else {
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                money += 7;
                                cups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            break;
                        case "3":
                            if(water<200||(beans<12||(cups<1||milk<100))){
                                System.out.println("I dont have");
                            }else {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                money += 6;
                                cups -= 1;
                                System.out.println("I have enough resources, making you a coffee!");
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    water += input.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    milk += input.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    beans += input.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    cups += input.nextInt();
                    break;

                case "take":
                    System.out.println("I gave you $"+money);
                    money = 0;
                    break;

                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water+" of water");
                    System.out.println(milk+" of milk");
                    System.out.println(beans+" of coffee beans");
                    System.out.println(cups+" of disposable cups");
                    System.out.println(money+" of money");
                    break;

                case "exit":
                    a = true;
            }
            if(a==false){
                System.out.println ( "Write action (buy, fill, take, remaining, exit):" );
                action = input.next ( );
            }

        }



    }
}
