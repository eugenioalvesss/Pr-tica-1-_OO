package Exe3;

public class Main {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno ("Eugênio",12110990,0.0f,0.0f,0.0f,"ADS","Terceiro");
		
		aluno.setNotaAv1(10.0f);
		aluno.setNotaAv2(50.0f);
		aluno.setNotaAE(60.0f);
		aluno.avaliarAluno();
		aluno.avaliarRecuperacao();
		
		
		

	}

}
