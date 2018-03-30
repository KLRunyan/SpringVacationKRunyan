package beans;

import java.util.List;

import org.springframework.context.annotation.Bean;

public class VacationDaoJpaImpl implements VacationDao{
	@Bean
	public VacationDao accountDaoJpa() {
	VacationDaoJpaImpl bean = new VacationDaoJpaImpl();
	return bean;
	}
	
	public void insert(Vacation vacation) {
		// TODO Auto-generated method stub
		
	}

	public void update(Vacation vacation) {
		// TODO Auto-generated method stub
		
	}

	public void update(List<Vacation> vacations) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int vacationNum) {
		// TODO Auto-generated method stub
		
	}

	public Vacation find(int vacationNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Vacation> find(List<Integer> vacationNums) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Vacation> find(String vacationLocation) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Vacation> find(double cost) {
		// TODO Auto-generated method stub
		return null;
	}

}
