/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeemachineproject;

/**
 *
 * @author lenovo
 */
public class WaterTank {

    private int capacity = 10000;
    private int levle;

    public WaterTank(int levle) {
        this.levle = levle;
    }

    public void fillTank(int amount) {
        if (amount < 0 || amount + this.levle > this.capacity) {
            System.out.println("wrong entry !");
        } else {
            this.levle += amount;
        }
    }

    public void setWater(int amount) throws OutOfWaterException {
    if(this.levle<amount){
throw new OutOfWaterException("Not enough water remaining.");

    }else{
        this.levle-=amount;
    }
    }

    public int getLevleOfWater() {
        return this.getLevleOfWater();
    }

    public void getInfoOfTankWater() {
        System.out.println("the levle of water = " + this.levle + " / " + this.capacity + " mm");
    }
}
