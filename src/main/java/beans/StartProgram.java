package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		VacationService vacationService = applicationContext.getBean("vacationService",VacationService.class);
	
	System.out.println("Book Vacation");
	System.out.println("Vacation 1 Cost: " +vacationService.getVacationNum(1).getCost());
	System.out.println("Vacation 2 Cost: " +vacationService.getVacationNum(2).getCost());

	}

}
