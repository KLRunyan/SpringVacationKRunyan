package beans;

import java.util.List;

public interface VacationDao {

	public void insert(Vacation vacation);
	public void update(Vacation vacation);
	public void update(List<Vacation>vacations);
	public void delete(int vacationNum);
	public Vacation find(int vacationNum);
	//public List<Vacation>find(List<int>vacationNum);
	public List<Vacation>find(String vacationLocation);
	public List<Vacation>find(double cost);
	
}
