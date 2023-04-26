/*
 * Programa: Estadistica Descriptiva
 * Autor: Yader Ibraldo Quiroga Torres
 * Fecha: 24-4-2023
 * */

package logica;

public class Descriptiva {
	private double num1;
	private double num2;
	private double num3;
	private double num4;
	private double num5;
	
	public Descriptiva(double n1, double n2,double n3,double n4,double n5){
		this.num1 = n1;
		this.num2 = n2;
		this.num3 = n3;
		this.num4 = n4;
		this.num5 = n5;

		
	}
	// metodos modificadores y accesores:
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}

	public double getNum4() {
		return num4;
	}

	public void setNum4(double num4) {
		this.num4 = num4;
	}

	public double getNum5() {
		return num5;
	}

	public void setNum5(double num5) {
		this.num5 = num5;
	}
	
	// calcula el promedio
	public double promedio() {
		return (num1+num2+num3+num4+num5)/5;
	}
	
	// calcula la varianza
	public double varianza() {
		return (Math.pow(num1 - promedio(),2) + Math.pow(num2 - promedio(),2) + Math.pow(num3 - promedio(),2) +
				Math.pow(num4 - promedio(),2) + Math.pow(num5 - promedio(),2))/5;
	}
	
	//calcula la desviacion tipica
	public double desviacion() {
		return Math.sqrt(varianza());
	}
	
}

