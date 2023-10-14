
public class Customes {
	long  accno;
	double balance;
	double bill;
	double credit;
	double limit;
	public Customes() {
		this.accno = 0;
		this.balance = 0;
		this.bill =0;
		this.credit = 0;
		this.limit = 0;
	}
	public Customes(long accno, double balance, double bill, double credit, double limit) {
		super();
		this.accno = accno;
		this.balance = balance;
		this.bill = bill;
		this.credit = credit;
		this.limit = limit;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public void calculatebill() {
		double s;
		s=balance+bill-credit;
		if(s>limit) {
			System.out.println("Credit limit exeeds");
		}
		else {
			System.out.println("Total credit this month: "+s);
		}
	}
	
	
}
