package Model;

public class Produto {
	private int num;
	private float preco;
	private String nome, categoria;
	
	public Produto(int num, float preco, String nome, String categoria) {
		this.num = num;
		this.nome = nome;
		this.categoria = categoria;
		this.preco = preco;
	}
	
	public Produto() {
		num = 0;
		nome = null;
		categoria = null;
		preco = 0;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	

	
	@Override
	public String toString(){
		return nome + "\n" + categoria + "\n" + num + "\n" + preco + "\n";
	}
	
	

}
