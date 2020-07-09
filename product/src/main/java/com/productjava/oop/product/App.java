package com.productjava.oop.product;

import java.util.List;
import java.util.Scanner;

import com.productjava.oop.product.ProductService.CustomerService;
import com.productjava.oop.product.models.Product;
import com.productjava.oop.product.utilities.Terminate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        enterProducts();
        
    }  
     
    public static void enterProducts() {
    	 int count = 1;
    	CustomerService service = new CustomerService();
    	
         while(true) {
         	System.out.println("Begin Shopping for Products ");
         	System.out.println("*******************************");
         	Scanner prod = new Scanner(System.in);
         	
         	System.out.println("Enter product code: ");
         	int code = prod.nextInt();
         	
         	Scanner prodName = new Scanner(System.in);
         	System.out.println("Enter product name: ");
         	String name = prodName.nextLine();
         	
         	System.out.println("Enter quantity: ");
         	int quantity = prod.nextInt();
         	
         	Product product = new Product();
         	product.setCode(code);
         	product.setName(name);
         	product.setQuantity(quantity);
         	
         	
         	service.collectProduct(product); // adding new items to cart
         	
         	System.out.println("Do you want to pick another product?: ");
         	Scanner userAnswer = new Scanner(System.in);
         	String response = userAnswer.nextLine();
         	if(response.equalsIgnoreCase(Terminate.no.toString())) {
         		break;
         	}
         	count++;
         }
         
         List<Product> createdProducts = service.getcollectProducts();
         
         for(Product p : createdProducts) {
        	 System.out.println(p.toString());
         }
    }
}

