package entities;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String cpf;
	private int anoNascimento;
	private ArrayList<Pet> petsAdotados;
	private static final int MAXIMO_PETS = 2;
//Constructor	
	public Pessoa() {
	}

	public Pessoa(String nome, String cpf, int anoNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		petsAdotados = new ArrayList<Pet>();
	}
//Methods
	public boolean adotarPet(Pet pet) {
		boolean control = true;
		if (anoNascimento < 2003 && petsAdotados.size()<MAXIMO_PETS) {
			petsAdotados.add(pet);
		}else {
			control = false;
		}
		return control;
	}
	
	public String listarPets() {
		String dados = "";
		for (Pet p : petsAdotados) {
			dados += p.getInfoPet()+String.format("\n");
		}
		return dados;
	}
//Getters and Setters
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
}
