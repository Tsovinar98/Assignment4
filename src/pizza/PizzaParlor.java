/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anonymous
 */
public class PizzaParlor {
    
    private String name;
    private String address;
    private static ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<String> pizzaOrder;

    public PizzaParlor() {
        System.out.println("here");
        name = "Tsovinayan Pizza Ship";
        address = "8282 University City Blvd";
        pizzaOrder = new ArrayList<>();
        readCustomers();
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }

    public void readCustomers() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Pizza/customers.txt"));
            String username = "";
            String password = "";
            String email = "";
            while ((username = reader.readLine()) != null) {
                password = reader.readLine();
                email = reader.readLine();
                customers.add(new Customer(username, password, email));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(customers);
    }
    
    public Customer validateLogin(String user, String pass) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getUsername().equals(user)) {
                if (customers.get(i).getPassword().equals(pass)) {
                    return customers.get(i);
                }
            }
        }
        return null;
    }

    public Customer signUp(String user, String pass, String email) {
        if(!email.contains("@") || !email.contains(".")){
            return null;
        }
        customers.add(new Customer(user, pass, email));
        FileWriter fileWriter = null;
        BufferedWriter writer = null;
        try {
            fileWriter = new FileWriter("src/Pizza/customers.txt", true);
            writer = new BufferedWriter(fileWriter);
            writer.write(user);
            writer.newLine();
            writer.write(pass);
            writer.newLine();
            writer.write(email);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(PizzaParlor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers.get(customers.size()-1);
    }
   
}
