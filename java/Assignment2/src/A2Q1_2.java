/*//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store.
//An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value

//If the quantity is not positive, it should be set to 0.
 * 
 * 
//If the price per item is not positive, it should be set to 0.0.
 * 
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.
 * 
*/class Invoice {
	String number;
	String Description;
	int qty;
	double price;
	public Invoice() {
		this.number = "";
		Description = "";
		this.qty = 0;
		this.price = 0;
	}
	public Invoice(String number, String description, int qty, double price) {
		this.number = number;
		Description = description;
		this.qty = qty;
		this.price = price;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		if (qty < 0) {
			this.qty = 0;
		} else
			this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0;
		} else
			this.price = price;
	}

	public double calculateamount() {
		return price * qty;
	}

}
