package CreditManagement.business;

public class TeacherCreditManager extends BaseCreditManager implements CreditManager {

	@Override
	public void calculate() {
		System.out.println("Teacher Credit Calculated!");

	}

}
