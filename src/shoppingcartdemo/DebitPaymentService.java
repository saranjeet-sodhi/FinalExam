/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartdemo;

/**
 *
 * @author ramses
 */
public class DebitPaymentService extends PaymentService {

    public void processPayment( double amount ) {
        System.out.println( "Processing debit payment of $" + amount );
    }
        
}
