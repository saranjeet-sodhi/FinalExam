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
public class DiscountByAmount extends Discount {
    
    public DiscountByAmount(double totalAmount){
        
        super(totalAmount);
        
    }
    //SaranjeetS
    //Creating override methods for the class
    
    
    @Override
    
    public double addDiscount(double p){
        
        //The total price after discount should be deducted with the discount amoumt
        
        double price=
                p-
                this.totalAmount;
        
        if (price <0)
            return 0.0;
        else
            return price;
    }
}
