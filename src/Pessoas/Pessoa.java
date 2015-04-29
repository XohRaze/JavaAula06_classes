package Pessoas;

public class Pessoa {
	//Atributos Sempre privados
    protected String nome,
                   apelido,
                   dataNascimento,
                   morada,
                   nomeAmigo;

    public String getNomeAmigo() {
		return nomeAmigo;
	}

	public void setNomeAmigo(String nomeAmigo) {
		this.nomeAmigo = nomeAmigo;
	}

	private int telefone,   //9                    
                nif;        //9
                

    private long bi,         //11
                 niss;       //11 N�mero de informa��o da seguran�a social
    

    //Construtores ---------------------------------------------------------------

    public Pessoa(){ //constructor por defeito
     nome = "alberto ";
     apelido = "manel";
    } 
    
    public Pessoa(String nomeAmigo)
    {
    	this.nomeAmigo = nomeAmigo;
    }
    public Pessoa(String nome, String apelido)
    {
        this.nome = nome;
        this.apelido = apelido;
    }       

    public Pessoa(String nome, String apelido, String dataNascimento)
    {
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
    }
    
    public String Dizola(String nomeAmigo)
    {
    	return("ola" + nomeAmigo + " eu sou o " + nome);
    }
             
    // Pode haver v�rios desde que tenham assinaturas diferentes:
    // assinaturas � o tipo e/ou n� de par�metros
    //O nome do construtor � SEMPRE o nome da classe
    //Os construtores n�o t�m return type.  



    //M�todos --------------------------------------------------------------------

    //SETS

    public void setDataNascimento(String dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public void setMorada(String morada)
    {
        this.morada = morada;
    }

    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }

    public void setBI(long bi)
    {
        this.bi = bi;
    }

    public void setNIF(int nif)
    {
        this.nif = nif;
    }

    public void setNISS(long niss)
    {
        this.niss = niss;
    }

    //GETS
    
    public String getName()
    {
        return nome;
    }

    public String getApelido()
    {
        return apelido;
    }
    
    public String getDataNascimento()
    {
        return this.dataNascimento;
    }

    public String getMorada()
    {
        return this.morada;
    }

    public int getTelefone()
    {
        return this.telefone;
    }

    public long getBI()
    {
        return this.bi;
    }

    public int getNIF()
    {
        return this.nif;
    }

    public long getNISS()
    {
        return this.niss;
    }
    // T�m return type. Neste caso s�o strings.
    // Podem ser void e podem n�o ter par�metros de 
    // entrada. Se tiverem return type t�m de ter
    // a key word (comando) RETURN no fim dos m�todos, ou seja,
    // t�m de devolver um e um s� dado, do tipo que
    // est� definido no return type.

}
