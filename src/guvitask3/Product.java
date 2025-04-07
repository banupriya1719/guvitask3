package guvitask3;
//Product class which implements Taxable 
class Product implements Taxable{
	    private int pid;
	    private double price;
	    private int quantity;
//parameterized constructor for Product
	    public Product(int pid, double price, int quantity) {
	        this.pid = pid;
	        this.price = price;
	        this.quantity = quantity;
	    }
// method overridden to calculate the SALES TAX
	    @Override
	    public double calcTax() {
	        return price * salesTax;
	    }
//DISPLAY SALES TAX
	    public void display() {
	        System.out.println("Product ID: " + pid);
	        System.out.println("Price per unit: $" + price);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Sales Tax per unit: $" + calcTax());
	    }
}
