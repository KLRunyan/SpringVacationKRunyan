package beans;

public class VacationServiceImpl implements VacationService{
	
	private VacationDao vacationDao;
	
	public VacationServiceImpl(VacationDao vacationDao) {
		this.vacationDao=vacationDao;
	}
	public VacationServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public VacationDao getVacationDao() {
		return vacationDao;
	}
	public void setVacationDao(VacationDao vacationDao) {
		this.vacationDao = vacationDao;
	}
	public Vacation getVacationNum(int vacationNum) {
		// TODO Auto-generated method stub
		return vacationDao.find(vacationNum);
	}
	
	//public void bookVacation(int vacationNum, String vacationLocation, double amount) {
		// TODO Auto-generated method stub
//		Vacation sourceVacation = vacationDao.find(sourceVacationNum);
//		Vacation targetVacation = vacationDao.find(targetVacationNum);
//		
//		sourceVacation.setCost(sourceVacation.getCost() - amount);
//		targetVacation.setCost(targetVacation.getCost() + amount);
//		
//		vacationDao.update(sourceVacation);
//		vacationDao.update(targetVacation);	
	//}
//	public Vacation getVacation(int vacationNum) {
//		return vacationDao.find(vacationNum);
//	}
	public void bookVacation(int vacationNum) {
		Vacation vacation = vacationDao.find(vacationNum);
		vacation.setBooked(true);
		vacationDao.update(vacation);
	}
	public Vacation getVacationNum(int vacationNum, double amount) {
		// TODO Auto-generated method stub
		return null;
	}
}
