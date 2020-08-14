/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartdemo;

/**
 *
 * @author Saranjeet
 */
public abstract class Discount {
    
    protected double totalAmount;
    enum DiscountType{  // Creating ENUM types to be used to proccessing different types of disconts
        
        
        AMOUNT,PERCENT
    
}
    
    public Discount (double amount){
        
        totalAmount= amount;
    }

public abstract double addDiscount(double p);
}


