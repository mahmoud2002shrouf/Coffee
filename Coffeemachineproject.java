/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package coffeemachineproject;

/**
 *
 * @author lenovo
 */
import java.sql.SQLException;
import java.util.Scanner;

public class Coffeemachineproject {

    public static void main(String[] args) throws OutOfWaterException, InterruptedException, OutOfBeansException, SQLException, ClassNotFoundException {
        new formCoffee().setVisible(true);
    }
}
