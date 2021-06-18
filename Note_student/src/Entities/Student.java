package Entities;

public class Student {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public String Result;

	public String toString() {
		return "Estudante: " 
				+ name
				+ " \r\nNota 1: "
				+ String.format("%.2f",this.grade1)
				+ " \r\nNota 2: "
				+ String.format("%.2f",this.grade2)
				+ " \r\nNota 3: "
				+ String.format("%.2f",this.grade3);
	}
	public double Avaliation() {
		double valor = (0.30*this.grade1 + 0.35*this.grade2 + 0.35*this.grade2)*10;
		return valor;
	}
}
