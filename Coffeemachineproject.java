/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.coffeemachineproject;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class Coffeemachineproject {

    public static void main(String[] args) throws OutOfWaterException, InterruptedException, OutOfBeansException {
        Scanner input = new Scanner(System.in);
        CoffeeMachine c1 = new CoffeeMachine(new WaterTank(1000), new BeansTank(), new Grinder(1));
        Clean cl1 = new Clean();
        int option;
        do {
                    System.out.println("1-make caffee\n2-get water levle\n3-get beans levle\n4-fill beans\n5-fill water\n6-cleaning\n7-Exit");

            option = input.nextInt();
            switch (option) {
                case 1 -> {

                    System.out.println("enter  (1) asb || (2) amr\n");
                    int typeCoffee = input.nextInt();
                    System.out.println("enter (1) AR || (2) RP\n");
                    int typeBeans = input.nextInt();
                    System.out.println("enter (1) single || (2) double\n");
                    int TypeSize = input.nextInt();
                    System.out.println("enter grader rate ( 1 , 2 , 3 )\n");
                    int geagerRate = input.nextInt();
                    try {
                        c1.MakeCoffee(typeBeans, typeCoffee, TypeSize, geagerRate);
                    } catch (OutOfWaterException e) {
                        System.out.println("Sorry, the machine is out of water.");
                    }
                    

                }
                case 2 ->
                    c1.getWaterLevle();

                case 3 ->
                    c1.getBeansLevle();
            
                case 5 -> {
                    System.out.println("enter amount of water ^-^ \n");
                    int amount = input.nextInt();
                    c1.getWater().fillTank(amount);
                }
                case 4 -> {
                    System.out.println("enter type of beans ( (1) AR || (2) RP) ^-^ \n");
                    int types = input.nextInt();
                    System.out.println("Enter amount of Beans ^_^");
                    int amount = input.nextInt();
                    c1.getBean().addBeans(types, amount);

                    c1.getWater().fillTank(amount);
                }
                case 6 -> {
                    cl1.CleanMachine(c1.count_cup);
                    c1.count_cup = 0;
                }
                    case 7 ->
                    System.exit(0);

                default ->
                    System.out.println("Choice must be a value between 1 and 3.");

            }

        } while (true);

    }
}
