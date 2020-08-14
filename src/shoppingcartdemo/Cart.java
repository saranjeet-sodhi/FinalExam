/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saranjeet
 */
public class Cart {
    
    private List <Product> products = new ArrayList<>( );
    private PaymentService service;
    
    private int lengthofCart;
    private Discount discount =null;
    
    public int getCartSize(int Size){  //SaranjeetS creating method to return size of the Array
        
      
        
        return this.lengthofCart;
    }
    
    
    
    
    
    public void setPaymentService( PaymentService service ) {
        this.service  = service;
    }
    
    
    public void addProduct( Product product ) {
        products.add( product );
    }
    
    public void addDiscount(Discount dis){
        
        dis= discount;
    }
    
    
    public void payCart( ) {
        double total = 0;
        
       for ( Product product : products ) {
           total += product.getPrice( );
       }
       
       if(discount!=null) total=discount.addDiscount(total); //adding the Discoint logic that was creating in Discount class
       //SaranjeetS
       
       
        service.processPayment( total );
    }
    
    
    
}
