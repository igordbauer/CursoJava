package entities;

public class IndividualAccount extends Account{

	
	private Double healthExpenses;

	
	public IndividualAccount() {
	}
	

	public IndividualAccount(String name, Double anualIncome, Double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}


	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}


	@Override
	public double getTribute() {
		
		if(getAnualIncome() < 20000) {
			return getAnualIncome()*0.15 - (healthExpenses*0.5);
		}
		else {
			return getAnualIncome() *0.25 - (healthExpenses*0.5);
		}
		
	}
}
