/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeemachineproject;

/**
 *
 * @author lenovo
 */
public class CoffeeMachine {

    private WaterTank water;
    private BeansTank bean;
    private Grinder grinder;
    private Clean cleans;
    public int count_cup =0;

    public CoffeeMachine(WaterTank water, BeansTank bean, Grinder gr) {
        this.water = water;
        this.bean = bean;
        this.grinder = gr;
    }

    public CoffeeMachine() {

    }

    public WaterTank getWater() {
        return water;
    }

    public void setWater(WaterTank water) {
        this.water = water;
    }

    public BeansTank getBean() {
        return bean;
    }

    public void setBean(BeansTank bean) {
        this.bean = bean;
    }

    public Grinder getGrinder() {
        return grinder;
    }

    public void setGrinder(Grinder grinder) {
        this.grinder = grinder;
    }

    public void MakeCoffee(int typeBeans, int typeCoffee, int TypeSize, int geagerRate) throws InterruptedException ,OutOfWaterException,OutOfBeansException{
//1 asb 2 amr
//1 AR 2 RP
//1 single 2 double
        if (this.count_cup == 2) {
            System.out.println("Clean the machine !");
        }else{
        if (typeCoffee == 1) {
            if (typeBeans == 1) {
                if (TypeSize == 1) {
                    this.bean.type1.setBeans(7);
                    this.water.setWater(30);
                    System.out.println("The grain is being milled ...");
                    this.grinder.Grinder(geagerRate);
                    System.out.println("Done ^_^");
                    this.count_cup += 1;

                } else {
                    this.bean.type1.setBeans(14);
                    this.water.setWater(60);
                    System.out.println("The grain is being milled ...");

                    this.grinder.Grinder(geagerRate);
                    System.out.println("Done ^_^");
                    this.count_cup += 1;

                }
            } else {
                if (TypeSize == 1) {
                    this.bean.type2.setBeans(7);
                    this.water.setWater(30);
                    System.out.println("The grain is being milled ...");

                    this.grinder.Grinder(geagerRate);
                    System.out.println("Done ^_^");
                    this.count_cup += 1;

                } else {
                    this.bean.type2.setBeans(14);
                    this.water.setWater(60);
                    System.out.println("The grain is being milled ...");

                    this.grinder.Grinder(geagerRate);
                    System.out.println("Done ^_^");
                    this.count_cup += 1;

                }
            }
        } else {
            if (typeBeans == 1) {
                if (TypeSize == 1) {
                    this.bean.type1.setBeans(7);
                    this.water.setWater(170);
                    System.out.println("The grain is being milled ...");

                    this.grinder.Grinder(geagerRate);
                    System.out.println("Done ^_^");
                    this.count_cup += 1;

                } else {
                    this.bean.type1.setBeans(14);
                    this.water.setWater(220);
                    System.out.println("The grain is being milled ...");

                    this.grinder.Grinder(geagerRate);
                    System.out.println("Done ^_^");
                    this.count_cup += 1;

                }
            } else {
                if (TypeSize == 1) {
                    this.bean.type2.setBeans(7);
                    this.water.setWater(170);
                    System.out.println("The grain is being milled ...");

                    this.grinder.Grinder(geagerRate);
                    System.out.println("Done ^_^");
                    this.count_cup += 1;

                } else {
                    this.bean.type2.setBeans(14);
                    this.water.setWater(220);
                    System.out.println("The grain is being milled ...");

                    this.grinder.Grinder(geagerRate);
                    System.out.println("Done ^_^");
                    this.count_cup += 1;

                }
            }
        }}
        

    }

    public void getWaterLevle() {
        this.water.getInfoOfTankWater();
    }

    public void getBeansLevle() {
        this.bean.getInfoOfBeans();
    }

    public int getCount_cup() {
        return count_cup;
    }


    


   
}
