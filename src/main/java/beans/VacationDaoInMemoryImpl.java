package beans;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class VacationDaoInMemoryImpl implements VacationDao{

	private Map<Integer,Vacation>vacationsMap = new HashMap<Integer,Vacation>();
	
	public VacationDaoInMemoryImpl() {
		Vacation vacation1 = new Vacation(1, "Bermuda", 5, 1029.00, "Summer");
		Vacation vacation2 = new Vacation(2, "Peru", 4, 955.99, "Winter");
		
		vacationsMap.put(vacation1.getVacationNum(), vacation1);
		vacationsMap.put(vacation2.getVacationNum(), vacation2);
	}

	public void insert(Vacation vacation) {
		// TODO Auto-generated method stub
		vacationsMap.put(vacation.getVacationNum(), vacation);
	}

	public void update(Vacation vacation) {
		// TODO Auto-generated method stub
		vacationsMap.put(vacation.getVacationNum(), vacation);
	}

	public void update(List<Vacation> vacations) {
		// TODO Auto-generated method stub
		for(Vacation vacation: vacations) {
			update(vacation);
		}
	}

	public void delete(int vacationNum) {
		// TODO Auto-generated method stub
		vacationsMap.remove(vacationNum);
	}

	public Vacation find(int vacationNum) {
		// TODO Auto-generated method stub
		return vacationsMap.get(vacationNum);
	}

	public List<Vacation> find(List<Integer> vacationNums) {
		List<Vacation>vacations = new ArrayList<Vacation>();
		for(Integer vacationNum:vacationNums) {
			vacations.add(vacationsMap.get(vacationNum));
		}
		return vacations;
	}
	public List<Vacation> find(String vacationLocation) {
		List<Vacation>vacations = new ArrayList<Vacation>();
		for(Vacation vacation:vacationsMap.values()) {
			if(vacationLocation.equals(vacation.getVacationLocation())) {
				vacations.add(vacation);
			}
		}
		return vacations;
	}

	public List<Vacation> find(Double cost) {
		// TODO Auto-generated method stub
		return null;
	}
}
