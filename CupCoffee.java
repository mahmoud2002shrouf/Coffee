/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemachineproject;

/**
 *
 * @author lenovo
 */
public class CupCoffee {

    private String TypeBeans;
    private String TypeCoffee;
    private String sizeCoup;
    private int GraderRate;
    private int water_level;
    private int AR_level;
    private int  Rp_level ;

    public CupCoffee(String TypeBeans, String TypeCoffee, String sizeCoup, int GraderRate,int water_level,int AR_level,int  Rp_level) {
        this.TypeBeans = TypeBeans;
        this.TypeCoffee = TypeCoffee;
        this.sizeCoup = sizeCoup;
        this.GraderRate = GraderRate;
        this.AR_level=AR_level;
        this.Rp_level=Rp_level;
        this.water_level=water_level;
    }

    public String getTypeBeans() {
        return TypeBeans;
    }

    public void setTypeBeans(String TypeBeans) {
        this.TypeBeans = TypeBeans;
    }

    public String getTypeCoffee() {
        return TypeCoffee;
    }

    public void setTypeCoffee(String TypeCoffee) {
        this.TypeCoffee = TypeCoffee;
    }

    public String getSizeCoup() {
        return sizeCoup;
    }

    public void setSizeCoup(String sizeCoup) {
        this.sizeCoup = sizeCoup;
    }

    public int getWater_level() {
        return water_level;
    }

    public void setWater_level(int water_level) {
        this.water_level = water_level;
    }

    public int getAR_level() {
        return AR_level;
    }

    public void setAR_level(int AR_level) {
        this.AR_level = AR_level;
    }

    public int getRp_level() {
        return Rp_level;
    }

    public void setRp_level(int Rp_level) {
        this.Rp_level = Rp_level;
    }

    public int getGraderRate() {
        return GraderRate;
    }

    public void setGraderRate(int GraderRate) {
        this.GraderRate = GraderRate;
    }

    @Override
    public String toString() {
        return TypeBeans + ", " + TypeCoffee + ", " + sizeCoup + ", " + GraderRate;
    }

}
