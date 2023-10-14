/*Q2. Create a class called Employee 
 * 
 * that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double).

 Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable.
 If the monthly salary
is not positive, do not set its value.

 Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/
class Employee {
	String name,last_name;
	double salary;
	public Employee() {
		this.name = "";
		this.last_name = "";
		this.salary = 0;
	}
	public Employee(String name, String last_name, double salary) {
		super();
		this.name = name;
		this.last_name = last_name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0) {
			return;
		}
		this.salary = salary;
	}
	public void display() {
		System.out.println("Salary "+this.salary+"\n Name "+name);
	}

}
