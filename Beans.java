/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineproject;

/**
 *
 * @author lenovo
 */
public class Beans {

    int levle;
    String type;

    public Beans(int levle, String type) {
        this.levle = levle;
        this.type = type;
    }

    public int getLevle() {
        return levle;
    }

    public void setBeans(int amount) throws OutOfWaterException {
        if (this.levle < amount) {
            throw new OutOfWaterException("Run out of the tank !");
        }else{
            this.levle-=amount;
        }

    }

    public void setLevle(int levle) {
        this.levle = levle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
