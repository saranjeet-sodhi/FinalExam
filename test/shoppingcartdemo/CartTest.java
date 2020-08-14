/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcartdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Saranjeet
 */
public class CartTest {
    
    public CartTest() {
    }
    
    
    
    @BeforeClass
    public static void setUp() {
    }
    
    @AfterClass
    public static void tearDown() {
    }

    /**
     * Test of getCartSize method, of class Cart.
     */
   
    
    @Test
    public void testGetCartSizeGood() {
        System.out.println("getCartSize");
        Cart instance = new Cart();
        int expResult =0;
        int result = instance.getCartSize(0);
        assertEquals("The Cart has more than 0 item",expResult, result);
        //SaranjeetS
        //Creating two testing classes
        
    }

    @Test
    public void testGetCartSizeBad() {
        System.out.println("getCartSize");
        Cart instance = new Cart();
        int expResult = 0;
        int result = instance.getCartSize(0);
        assertEquals("The cart does not have a minimum number of items",expResult, result);
        //SaranjeetS
        //Creating test classes for SizeBad which should return 0
        
    }

    
    
    /**
     * Test of setPaymentService method, of class Cart.
     */
    /*
    @Test
    public void testSetPaymentService() {
        System.out.println("setPaymentService");
        PaymentService service = null;
        Cart instance = new Cart();
        instance.setPaymentService(service);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class Cart.
     */
    /*
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        Product product = null;
        Cart instance = new Cart();
        instance.addProduct(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of payCart method, of class Cart.
     */
    /*@Test
    public void testPayCart() {
        System.out.println("payCart");
        Cart instance = new Cart();
        instance.payCart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
