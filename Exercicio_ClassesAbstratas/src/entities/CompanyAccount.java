package entities;

public class CompanyAccount extends Account{

	private Integer employeesNumber;
	
	public CompanyAccount() {	
	}
	
	
	public CompanyAccount(String name, Double anualIncome, Integer employeesNumber) {
		super(name, anualIncome);
		this.employeesNumber = employeesNumber;
	}


	public Integer getEmployeesNumber() {
		return employeesNumber;
	}


	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}


	@Override
	public double getTribute() {
		if(employeesNumber < 10) {
			return getAnualIncome()*0.16;
		}
		else {
			return getAnualIncome()*0.14;
		}
	}

}
