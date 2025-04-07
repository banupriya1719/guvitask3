package guvitask3;
//MAIN CLASS FOR THE INCOME TAX AND SALES TAX
import java.util.Scanner;            //IMPORTING SCANNER TO GET INPUT
public class DriverMain {                      //DriverMain class has been created 
	    public static void main(String[] args) {              
	        Scanner scanner = new Scanner(System.in);        //Scanner object is created

	        System.out.println("Enter Employee Details:");
	        System.out.print("Employee ID: ");
	        int empId = scanner.nextInt();                 
	        scanner.nextLine();
	        System.out.print("Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Salary: ");
	        double salary = scanner.nextDouble();

	        Employee employee = new Employee(empId, name, salary);     //object creating for Employee
	        employee.display();                               //using employee object calling a function display

	        System.out.println("\nEnter Product Details:");
	        System.out.print("Product ID: ");
	        int pid = scanner.nextInt();
	        System.out.print("Price per unit: ");
	        double price = scanner.nextDouble();
	        System.out.print("Quantity: ");
	        int quantity = scanner.nextInt();

	        Product product = new Product(pid, price, quantity);       //object creating for Product
	        product.display();               //using product object calling a function display

	        scanner.close();
	    }
	}