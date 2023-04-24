/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coffeemachineproject;

/**
 *
 * @author lenovo
 */
import java.util.Timer;

public class Clean {

    public Clean() {
    }

    public int CleanMachine(int count_cup) throws InterruptedException {
        if (count_cup == 2) {
            System.out.println("Cleaning in progress ...");
            Thread.sleep(5000);
            System.out.println("clean Done ^_^");
            return 1;

        } else {
            System.out.println("clean !");
            return 0;

        }
    }

}
