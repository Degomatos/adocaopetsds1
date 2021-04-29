package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Pessoa;
import entities.Pet;

public class AdocaoMain {

    public static void main(String[] args) {   
//Declaração Pets    	
    	Pet pet1 = new Pet("Noturno","Gato Comum - Preto",2019,'M');
    	Pet pet2 = new Pet("Vampira","Gata Comum - Rajada",2019,'F');
    	Pet pet3 = new Pet("Bugy","Vira-Latas",2014,'M');
    	Pet pet4 = new Pet("Radamanthys","Husky Siberiano",2010,'M');
    	ArrayList<Pet> petsAdocao = new ArrayList<Pet>();
    	petsAdocao.add(pet1);
    	petsAdocao.add(pet2);
    	petsAdocao.add(pet3);
    	petsAdocao.add(pet4);

//Declaração Pessoa    	    	
    	Pessoa pessoa = new Pessoa("Diego Souza", "045.566.475-76",1990);
    	Scanner sc = new Scanner(System.in);
    	int option = 0;    	
    	
    	do {
    		System.out.println("---SISTEMA DE ADOÇÃO DE PETS---");
    		System.out.println("1) Adotar Pet");
    		System.out.println("2) Listar Pets Adotados");
    		System.out.println("3) Listar Pets Restantes");
    		System.out.println("4) Sair");
    		option = sc.nextInt();
    		
    		switch (option) {
			case 1: 
				realizarAdocao(pessoa, petsAdocao, sc);
				break;
			case 2:
				listarPetsAdotados(pessoa);
				break;
			case 3:
				listarPetsRestantes(petsAdocao);
				break;
			case 4: 
				break;
			default:
				System.out.println("Opção inválida! Tente novamente:");
			}
    	}while(option!=4);
    	
    	System.out.println("Agradecemos por usar nosso sistema!");
    	System.out.println("Cuide bem dos animas Adotados!");
    	System.out.println("Tenha um bom dia!");
    	
    }
    
    private static void realizarAdocao(Pessoa pessoa, ArrayList<Pet> petsAdocao, Scanner entrada) {
        System.out.println("Informe qual pet deseja adotar: ");
        for (int i = 0; i < petsAdocao.size(); i++) {
            System.out.println(i + " - " + petsAdocao.get(i).getInfoPet());
        }
        int numeroPet = entrada.nextInt();
        Pet candidato = petsAdocao.get(numeroPet);
        if (pessoa.adotarPet(candidato) == true) {
            System.out.println("Pet " + numeroPet + " adotado com sucesso!\n");
            petsAdocao.remove(candidato);
        } else {
            System.out.println("VocÃª jÃ¡ adotou o mÃ¡ximo de pets permitidos!\n");
        }
    }
    
    private static void listarPetsAdotados(Pessoa pessoa) {
        System.out.println("\nPets adotados atÃ© o momento: ");
        System.out.println(pessoa.listarPets());
    }
    
    private static void listarPetsRestantes(ArrayList<Pet> petsAdocao) {
        System.out.println("\nPets restantes para adoÃ§Ã£o: ");
        for (Pet p : petsAdocao) {
            System.out.println(p.getInfoPet());
        }
    }

}
