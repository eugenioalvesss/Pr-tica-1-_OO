package Exe2;

public class EmpregoFaculdade {

	private String nome;
	private double salario;
	private int horasAula;
	
	public EmpregoFaculdade(String nome, double salario, int horasAula) {
		this.nome = nome;
		this.salario = salario;
		this.horasAula = horasAula;
	}
	double getGastos () {
		double bonus = horasAula*40;
		
		
		return this.salario+bonus;
	}
	String getInfo () {
		return "nome: " + this.nome + "com salario de " + (this.salario+(this.horasAula*40)); 
	}
}
