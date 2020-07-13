package com.productjava.oop.product;

import java.util.List;
import java.util.Scanner;

import com.productjava.oop.product.ProductService.CustomerService;
import com.productjava.oop.product.models.Customer;
import com.productjava.oop.product.models.Product;
import com.productjava.oop.product.utilities.Gender;
import com.productjava.oop.product.utilities.Terminate;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static CustomerService service;
    public static void main( String[] args )
    {
    	
    	service = new CustomerService();
        System.out.println( "Hello World!" );
        enterProducts();
        
        System.out.println("Enter Customer name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        
        System.out.println("Enter Customer phone number");
        Scanner input2 = new Scanner(System.in);
        String phone = input2.nextLine();
        
        System.out.println("Enter Customer gender");
        Scanner input3 = new Scanner(System.in);
        String gender = input3.nextLine();

        
        Customer customer = service.createCustomer(name, phone, gender);
        
        enterQuantity(customer);
        enterPromo(customer);
        
        service.calculateTotalPrice(customer);
        System.out.println("******************************************");
        System.out.println("CartItems Bought by customer");
        System.out.println("******************************************");
        List<Product> createdProducts = service.getcollecttedProducts();
        System.out.println("Display the List of products");
        System.out.println("******************************************");
        for(Product p : createdProducts) {
       	 System.out.println(p.toString());
        }
        System.out.println("******************************************");
        System.out.println("Overall Price + added tax: " + "$" + customer.getCartItems().getTotalPrice());
        System.out.println(" Overall Quantity " + customer.getCartItems().getTotalQuantity());
    } 
     
    public static void enterProducts() {
    	 int count = 1;
    	 System.out.println("Begin Shopping for Products ");
         while(true) {
         	System.out.println("*******************************");
         	Scanner prod = new Scanner(System.in);
         	
         	System.out.println("Enter product code: ");
         	String code = prod.nextLine();
         	
         	Scanner prodName = new Scanner(System.in);
         	System.out.println("Enter product name: ");
         	String name = prodName.nextLine();
         	
         	System.out.println("Enter price: ");
         	Double price = prod.nextDouble();
         	
         	Product product = new Product();
         	product.setCode(code);
         	product.setName(name);
         	product.setPrice(price);
         	
         	
         	service.collectProduct(product); // adding new items to cart
         	
         	System.out.println("Do you want to pick another product?: ");
         	Scanner userAnswer = new Scanner(System.in);
         	String response = userAnswer.nextLine();
         	if(response.equalsIgnoreCase(Terminate.no.toString())) {
         		break;
         	}
         	count++;
         }
         
    }
    
    public static void enterQuantity(Customer customer) {
    	for(Product product: customer.getProducts()) {
    		System.out.println("Enter quantity of product " + product.getName());
    		Scanner in = new Scanner(System.in);
    		int quantity = in.nextInt();
    		product.setQuantity(quantity);
    	}
    	
    }
    
    public static void enterPromo(Customer customer) {
    	for(Product product: customer.getProducts()) {
    		System.out.println("Do you have a coupon? (Yes/No): ");
    		Scanner answer = new Scanner(System.in);
    		String response = answer.nextLine();
    		product.setPromoAnswer(response);
    		if(response.equalsIgnoreCase("yes")) {
    			System.out.println("Enter coupon code: ");
    			Scanner coupon = new Scanner(System.in);
    			String code = coupon.nextLine();
    			product.setPromoCode(code);
    		}
    		else {
    			
             		break;
             	
    		}
    		
    	}
    }
    
    
}

