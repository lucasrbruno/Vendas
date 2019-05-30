package Model;
import java.util.List;
import java.util.ArrayList;

public class Venda {
	private int num;
	private Cliente cliente;
	private List<Produto> produtos; 
	private float desconto;
	private int quant;
	
	public Venda(int num, Cliente cliente, List<Produto> produtos, float desconto, int quant) {
		this.num = num;
		this.cliente = cliente;
		this.produtos = produtos;
		this.desconto = desconto;
		this.quant = quant;
	}
	
	public Venda(){
		num = 0;
		cliente = new Cliente();
		produtos = new ArrayList<Produto>();
		desconto = 0;
		quant = 0;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
        
        public float PrecoTotal(){
            float total = 0;
            for (Produto p : produtos){
			total = total + (p.getPreco() - p.getPreco() * desconto);
		}
            return total;
        }

	
	
	@Override
	public String toString(){
		float total = 0;
		String s = "";
		for (Produto p : produtos){
			s += "" + p;
			total = total + (p.getPreco() - p.getPreco() * desconto);
		}
		return num + "\n" + cliente + quant + "\n" + s + desconto + "\n";
	}
	
	

}
