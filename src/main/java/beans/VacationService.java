package beans;

public interface VacationService {

	public void bookVacation(int sourceVacationNum, int targetVacationNum, double amount);
	
	public Vacation getVacationNum(int vacationNum);
}
