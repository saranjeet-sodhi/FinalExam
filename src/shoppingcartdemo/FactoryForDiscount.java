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
public class FactoryForDiscount {
    
    public static FactoryForDiscount  factoryForDiscountInstance = null;
    
    //SaranjeetS
    


private FactoryForDiscount(){ //creating a singleton method for the class

}

public static FactoryForDiscount getInstance(){

if(factoryForDiscountInstance == null)
    {
    	factoryForDiscountInstance = new FactoryForDiscount();
    }
    
       return factoryForDiscountInstance;
}


public Discount create(Discount.DiscountType type, double amount) 
        
        //Creating a discount method which will differentiate between Discount Types 
        // based on the ENUM types that are selected
{
    if(type == Discount.DiscountType.AMOUNT)
    {
    	return new DiscountByAmount(amount);
    }else if(type == Discount.DiscountType.PERCENT)
    {
    	return new DiscountByPercentage(amount);
    }
    
    return null;
}


}