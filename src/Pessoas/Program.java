package Pessoas;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Criação de 2 objetos do tipo Pessoa
        // O 1º usa o construtor com assinatura de uma só string
        // que vai preencher o atributo nome, apenas.
        // O 2º construtor aceita duas strings, uma para o atributo nome
        // a outra para o atributo apelido.
		//Pessoa p = new Pessoa("António");	//Cria um objeto p do tipo Pessoa
		//Pessoa p2 = new Pessoa("António", "Silva");
		
		Pessoa p = new Pessoa("António", "Silva", "20 de Janeiro de 2000"); //Cria uma instância
        
        p.setMorada("Rua de Angola");
        p.setTelefone(219156789);
        p.setBI(1234567890);
        p.setNIF(87654321);
        p.setNISS(987654321);
		
		// Para extrair os nomes dos atributos, usamos os métodos
        // criados na classe para esse efeito, e automaticamente
        // passados para os objetos p e p2, no momento da sua
        // criação: getName() e getApelido().
		//System.out.println(p.getName());		
		//System.out.println(p2.getName() + " " + p2.getApelido());
        
        System.out.println(p.getName() + " " + p.getApelido() + " " + p.getDataNascimento());
        System.out.println("Morada: " + p.getMorada());
        System.out.println("Telefone: " + p.getTelefone());
        System.out.println("BI: " + p.getBI());
        System.out.println("NIF: " + p.getNIF());
        System.out.println("NISS " + p.getNISS());
        
        System.out.println("");
        System.out.println("------------------------");
        
        Pessoa p1 = new Pessoa();
        
        System.out.println("p1 tem o nome: " + p1.nome + p1.apelido);
        
        Alunos a = new Alunos();
        
        System.out.println("a tem o nome: " + a.nome +  a.apelido + " e o numero: " + a.getNumaluno());
        
        Alunos a1 = new Alunos("manel", "das coves", 35);
        
        System.out.println(a1.Dizola(" rogério batatas "));
        

        System.out.println("------------------------ Herança Peca-------------/n/n/n");
        System.out.println("");System.out.println("");
        Peca z1 = new PecaUm();
        Peca z2 = new PecaDois();
        
        
        //array do tipo super para guardar os objetos derivados
        Peca[] pecas = new Peca[2];		//array :)
        
        pecas[0] = z1;
        pecas[1]= z2;
        System.out.println("Método de impressão usando o FOR: /n");
        System.out.println("");
        
        //para cada objeto da classe super (peca), encontrada no array (pecas) , executa o seu método
        //move()
        for(Peca objPeca : pecas)
        {
        	objPeca.move();
        	
        }

        System.out.println("");System.out.println("");System.out.println("");
            
        System.out.println("método de impressão peca.metodo();");
        z1.move();
        z2.move();
        
        
        

	}

}
