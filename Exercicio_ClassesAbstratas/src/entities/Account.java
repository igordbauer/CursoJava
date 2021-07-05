package entities;

public abstract class Account {

	private String name;
	private Double anualIncome;

	public Account() {
		
	}

	
	
	
	
	
	public String getName() {
		return name;
	}

	public Account(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}






	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	public abstract double getTribute();
}
