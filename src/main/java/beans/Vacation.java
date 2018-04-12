package beans;

import java.text.DecimalFormat;

public class Vacation {
	
	private int vacationNum;
	private String vacationLocation;
	private int numOfDays;
	private double cost;
	private String season;
	boolean isBooked;
	DecimalFormat df = new DecimalFormat("##.##");
	
	
	
	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public Vacation() {
	
	}

	public Vacation(int vacationNum, String vacationLocation, int numOfDays, double cost, String season) {
		super();
		this.vacationNum = vacationNum;
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
