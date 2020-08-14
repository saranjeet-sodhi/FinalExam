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
public class DiscountByPercentage extends Discount {
    
    
    public DiscountByPercentage(double totalAmount){
        super(totalAmount);
        
    }
    //SaranjeetS
    //Creating override methods for the class
    
    
    @Override
    
    public double addDiscount (double p){
        
        
        //The total price after discount should be deducted with the discount amoumt
        double value = (100.00/p)
                *this.totalAmount;
        double total = p - value;
        return total;
                
    }
    
}
