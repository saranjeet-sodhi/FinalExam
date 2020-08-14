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
public class ShoppingCartDemo {
    
    public static void main( String args [ ] ) {
        PaymentServiceFactory factory = PaymentServiceFactory.getInstance( );
        PaymentService creditService = factory.getPaymentService( PaymentServiceType.CREDIT );
        PaymentService debitService = factory.getPaymentService( PaymentServiceType.DEBIT );   
        
          FactoryForDiscount discountFactory = FactoryForDiscount.getInstance();
        
            // create cart and add products
        Cart cart = new Cart( );
        cart.addProduct( new Product( "shirt" , 50 ) );
        cart.addProduct( new Product( "pants" , 60 ) );
        cart.addProduct( new Product( "shoes" , 90 ) );  //Adding another product to the cart
        
        
       
            // set credit service and pay
        cart.setPaymentService( creditService );     
        
        cart.addDiscount(discountFactory.create(Discount.DiscountType.AMOUNT,10)); 
        
        //Applying Discount type with regular amount
        
        cart.payCart();
            // set debit service and pay
        cart.setPaymentService( debitService );   
        
        cart.addDiscount(discountFactory.create(Discount.DiscountType.PERCENT,10));
        //Applying Discount type with  percentange
        cart.payCart();        
        
    } 
    
}
