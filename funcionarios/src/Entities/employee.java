package Entities;

public class employee {
	public String name;
	public double gloss_salary;
	public double tax;

	public double Netsalary() {
		return this.gloss_salary -=tax;
	}

	public double Increase_salary(double percentage) {
		double aux = this.gloss_salary += this.gloss_salary*percentage/100;
		return aux;
	}

	public String toString() {
		return "Employee: " + name + ", $ " + String.format("%.2f", this.gloss_salary);
	}
}