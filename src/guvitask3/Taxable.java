package guvitask3;
//INCOME TAX AND SALES TAX
//create interface as Taxable
public interface Taxable {
	    double salesTax = 0.07;          //7% for products TAX
	    double incomeTax = 0.105;        // 10.5% for employees TAX

	    double calcTax();              //ABSTRACT METHOD WHICH IMPLEMENTS IN Employee and Product classes to calculate TAX
	}
//Employee class which implements Taxable 
	class Employee implements Taxable {
	    private int empId;
	    private String name;
	    private double salary;
//parameterized constructor for Employee
	    public Employee(int empId, String name, double salary) {
	        this.empId = empId;
	        this.name = name;
	        this.salary = salary;
	    }
// method overridden to calculate INCOME TAX
	    @Override
	    public double calcTax() {
	        return salary * incomeTax;
	    }
//DISPLAY INCOME TAX
	    public void display() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Yearly Salary: $" + salary);
	        System.out.println("Income Tax: $" + calcTax());
	    }
	}