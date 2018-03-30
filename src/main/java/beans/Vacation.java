package beans;


public class Vacation {
	
	private int vacationNum;
	private String vacationLocation;
	private int numOfDays;
	private double cost;
	private String season;
	
	
	
	public Vacation() {
	
	}

	public Vacation(int vacationNum, String vacationLocation, int numOfDays, double cost, String season) {
		super();
		this.vacationLocation = vacationLocation;
		this.numOfDays = numOfDays;
		this.cost = cost;
		this.season = season;
	}

	public int getVacationNum() {
		return vacationNum;
	}

	public void setVacationNum(int vacationNum) {
		this.vacationNum = vacationNum;
	}

	public String getVacationLocation() {
		return vacationLocation;
	}



	public void setVacationLocation(String vacationLocation) {
		this.vacationLocation = vacationLocation;
	}



	public int getNumOfDays() {
		return numOfDays;
	}



	public void setNumOfDays(int numOfDays) {
		this.numOfDays = numOfDays;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public String getSeason() {
		return season;
	}



	public void setSeason(String season) {
		this.season = season;
	}


	
	
}
