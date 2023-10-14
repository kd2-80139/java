
public class DriveCost {
	double totalDistance;
	double fuelCost;
	double avg;
	float parking;
	float tolls;
	public DriveCost() {

		this.totalDistance = 0;
		this.fuelCost = 0;
		this.avg = 0;
		this.parking = 0;
		this.tolls = 0;
	}
	public DriveCost(double totalDistance, double fuelCost, double avg, float parking, float tolls) {

		this.totalDistance = totalDistance;
		this.fuelCost = fuelCost;
		this.avg = avg;
		this.parking = parking;
		this.tolls = tolls;
	}
	public void calculate() {
		double cost=totalDistance/avg;
		cost=cost*fuelCost+parking+tolls;
		System.out.println("Total Cost: "+cost);
	}
	
}
