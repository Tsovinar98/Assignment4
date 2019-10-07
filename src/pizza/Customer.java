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
public class Customer {
    private String username;
    private String password;
    private String email;
    private double amountSpent;
         
    public Customer(String username, String password, String email){
        this.username = username;
        this.password = password;
        this.email = email;
        amountSpent = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString(){
        System.out.println("");
        return ("\nCustomer username: " + username + "\nCustomer password: " + password + "\nCustomer email: " + email);
    }
    
    
}
