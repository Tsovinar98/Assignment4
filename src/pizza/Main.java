/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author Anonymous
 */
public class Main {
    public static void main(String[] args) {
        PizzaParlor parlor = new PizzaParlor();
        StartFrame start = new StartFrame(parlor);
        start.setVisible(true);
    }
}
