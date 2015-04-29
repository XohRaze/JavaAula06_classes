package Pessoas;

public class Alunos extends Pessoa {
	private int numaluno;
	
	//construtor default de aluno
	public Alunos()
	{
		super();		//accionar o constructor default da classe super
		numaluno = 10;	//prenchimento do atributo local
	}
	
	
	public Alunos(String nome, String apelido, int numaluno)	//constructor com parametros de entrada para os atributos local e super
	{
		super(nome, apelido);		//constructor super com passagens dos dois valores .
		this.numaluno = numaluno;
	}

	//override do metodo dizola
	
	@Override
	public String Dizola(String nomeAmigo)
    {
    	return("ola" + nomeAmigo + " eu sou o " + nome + apelido + " e tenho o numero " + numaluno);
    }
	
	
	//getters and setters
	public int getNumaluno() {
		return numaluno;
	}


	public void setNumaluno(int numaluno) {
		this.numaluno = numaluno;
	}
	
}
