package CreditManagement.business;

public class MilitaryCreditManager extends BaseCreditManager implements CreditManager {

	@Override
	public void calculate() {
		System.out.println("Military Credit calculated!");

	}

}
