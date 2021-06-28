package br.inatel.bm.cachorros;

public class Cachorros {

	private int id;
	private double preco;
	private int numFilhotes;
	private String raca;
	
	public Cachorros(int id, String raca, int numFilhotes, double preco) {
		this.id = id;
		this.preco = preco;
		this.numFilhotes = numFilhotes;
		this.raca = raca;
		
	}

	public int getId() {
		return id;
	}

	public double getPreco() {
		return preco;
	}

	public int getNumFilhotes() {
		return numFilhotes;
	}

	public String getRaca() {
		return raca;
	}
	
	
	
	
	
	
	
	
}
