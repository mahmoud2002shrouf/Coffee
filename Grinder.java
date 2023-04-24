/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeemachineproject;

import java.util.Timer;

/**
 *
 * @author lenovo
 */
public class Grinder {
private int GrinderRate;
    public Grinder(int GrinderRate) {
        this.GrinderRate=GrinderRate;
    }

    public void Grinder(int GrinderRate) throws InterruptedException {
        if (GrinderRate == 1) {
            Thread.sleep(5000);

        } else if (GrinderRate == 2) {
            Thread.sleep(10000);

        } else {
            Thread.sleep(15000);

        }
    }
}
