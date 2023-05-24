/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineproject;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class BeansTank {

    private int capacity = 1000;
    private ArrayList<Beans> typeBeans=new ArrayList<Beans>();
 Beans type1 = new Beans(new DB().BeansArabica(), "AR");
        Beans type2;
    public BeansTank() throws SQLException, ClassNotFoundException {
        this.type2 = new Beans(new DB().BeansRopusta(), "RP");
       
        typeBeans.add(type1);
        typeBeans.add(type2);

    }
//1 AR
    //RP
    public void addBeans(int type, int amount) {
        if (type == 1) {
            if (this.typeBeans.get(0).levle == 500 || this.typeBeans.get(0).levle + amount > 500 || amount < 0) {
                System.out.println("wrong entry !");
            } else {
                this.typeBeans.get(0).levle += amount;
            }
        } else {
            if (this.typeBeans.get(1).levle == 500 || this.typeBeans.get(1).levle + amount > 500 || amount < 0) {
                System.out.println("wrong entry !");
            } else {
                this.typeBeans.get(1).levle += amount;
            }
        }
    }

    public int getlevleBeans(String type) {
        if (type == "AR") {
            return this.typeBeans.get(0).levle;
        } else {
            return this.typeBeans.get(1).levle;

        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void getInfoOfBeans() {
        System.out.println("the levle of beans = " +"Ar "+ this.getlevleBeans("AR") +"- Rp "+ this.getlevleBeans("RP") + " / " + this.capacity);
    }

    public String toString1() {
        return ""+type1.levle;
    }
      public String toString2() {
        return ""+type2.levle;
    }
    
    

}
