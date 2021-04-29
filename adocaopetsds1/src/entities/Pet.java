package entities;

public class Pet {

	private String nome;
	private String raca;
	private int anoNascimento;
	private char sexo;
//Constructor
	public Pet() {
	}

	public Pet(String nome, String raca, int anoNascimento, char sexo) {
		this.nome = nome;
		this.raca = raca;
		this.anoNascimento = anoNascimento;
		this.sexo = sexo;
	}
//Methods
	public String getInfoPet() {
		String dados;
		dados = "Nome: " +nome+ String.format("\n")
				+"Raça: " +raca+ String.format("\n")
				+"Ano Nascimento: " +anoNascimento+ String.format("\n")
				+"Sexo: " +sexo+ String.format("\n");		
		return dados;
	}
	
}
