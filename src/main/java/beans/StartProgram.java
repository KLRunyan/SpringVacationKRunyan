package beans;

import java.text.DecimalFormat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/beans.xml");
		
	VacationService vacationService = applicationContext.getBean("vacationService",VacationService.class);
	
	double cost1 = vacationService.getVacationNum(1).getCost();
	double cost2 = vacationService.getVacationNum(2).getCost();
	
	System.out.println("Book Vacation");
	vacationService.bookVacation(1);
	DecimalFormat df = new DecimalFormat();
	System.out.println("Vacation 1 Cost: $" + df.format(cost1));
	System.out.println("Vacation 2 Cost: $" + df.format(cost2));

	}

}
