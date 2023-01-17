package entities;

public class Produtos {
	private String nome;
	private Double preco;
	private Integer quant;
	
	public Produtos(String nome, Double preco, Integer quant) {
		
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}
	
	public Double valorEmEstoque(){
		return  quant * preco;
	}
	
	
	
	public String toString() {
		return  "\nNome do produto: " 
				+ nome 
				+ "\n"
				+"Preço unitario R$"
				+ String.format("%.2f%n", preco)
				+"Valor total em estoque: " 
				+ String.format("%.2f", valorEmEstoque());
	}
	
}
