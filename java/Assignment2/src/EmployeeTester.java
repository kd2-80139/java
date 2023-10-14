
public class EmployeeTester {
	public static void main(String[] args) {
		Employee e;
		e=new Employee("Ujjwal","Singh",99999999);
		e.display();
		Employee e1;
		e1=new Employee("XYZ","ABC",9999);
		e1.display();
		double x=e1.getSalary();
		x=x+x*0.1;
		e1.setSalary(x);
		e1.display();
		x=e.getSalary();
		x=x+x*0.1;
		e.setSalary(x);
		e.display();
		System.out.println(e1.getSalary()*12);
		System.out.println(e.getSalary()*12);
	}
}
