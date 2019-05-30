package Model;

public class Cliente {
	private String nome, email;
	private int telefone;
	long cpf;
	
	public Cliente(String nome, String email, int telefone, long cpf) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	

	public Cliente(){
		nome = null;
		email = null;
		telefone = 0;
		cpf = 0;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	
	
	@Override
	public String toString(){
		return nome + "\n" + email + "\n" + telefone + "\n" + cpf + "\n";
	}
	

}
