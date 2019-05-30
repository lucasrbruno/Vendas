package Control;
import Model.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

public abstract class Arquivo {
	
	public static ArrayList<Produto> carregar_produto(Path path) throws IOException{
	
		ArrayList<Produto> lista = new ArrayList<>();
		FileReader fr = new FileReader(path.toFile());
		BufferedReader br = new BufferedReader(fr);
		String linha = br.readLine();
		
		while(linha != null){
			Produto produto = new Produto();
			
			produto.setNome(linha);
			linha = br.readLine();
			
			produto.setCategoria(linha);
			linha = br.readLine();
			
			produto.setNum(Integer.parseInt(linha));
			linha = br.readLine();
			
			produto.setPreco(Float.parseFloat(linha));
			linha = br.readLine();
			
			lista.add(produto);		
		} 
			
		br.close();		
		return lista;
	}
	
	public static ArrayList<Cliente> carregar_cliente(Path path)throws IOException{
		ArrayList<Cliente> lista = new ArrayList<>();
		
		FileReader fr = new FileReader(path.toFile());
		BufferedReader br = new BufferedReader(fr);
		String linha = br.readLine();
		
		while(linha != null){
			Cliente cliente = new Cliente();
			
			cliente.setNome(linha);
			linha = br.readLine();
			
			cliente.setEmail(linha);
			linha= br.readLine();
			
			cliente.setTelefone(Integer.parseInt(linha));
			linha= br.readLine();
			
			cliente.setCpf(Long.parseLong(linha));
			linha= br.readLine();
			
			lista.add(cliente);
		} 
			
		br.close();			
		
		return lista;
	}
	
	public static ArrayList<Venda> carregar_venda(Path path)throws IOException{
		ArrayList<Venda> lista = new ArrayList<>();
		FileReader fw31 = new FileReader(path.toFile());
		BufferedReader prv1 = new BufferedReader(fw31);
		String linhavenda = prv1.readLine();
		
		while(linhavenda != null){
			Venda venda = new Venda();
			
			venda.setNum(Integer.parseInt(linhavenda));
			linhavenda = prv1.readLine();
			
			Cliente cliente = new Cliente();
			
			cliente.setNome(linhavenda);
			linhavenda = prv1.readLine();
			
			cliente.setEmail(linhavenda);
			linhavenda = prv1.readLine();
			
			cliente.setTelefone(Integer.parseInt(linhavenda));
			linhavenda = prv1.readLine();
			
			cliente.setCpf(Long.parseLong(linhavenda));
			linhavenda = prv1.readLine();
			
			venda.setCliente(cliente);
			
			venda.setQuant(Integer.parseInt(linhavenda));
			linhavenda = prv1.readLine();
			
			for (int i = 0; i < venda.getQuant(); i++){
				Produto produto = new Produto();
				
				produto.setNome(linhavenda);
				linhavenda = prv1.readLine();
				
				produto.setCategoria(linhavenda);
				linhavenda = prv1.readLine();
				
				produto.setNum(Integer.parseInt(linhavenda));
				linhavenda = prv1.readLine();
				
				produto.setPreco(Float.parseFloat(linhavenda));
				linhavenda = prv1.readLine();
				
				venda.getProdutos().add(produto);	
			}
			
			venda.setDesconto(Float.parseFloat(linhavenda));
			linhavenda = prv1.readLine();
			lista.add(venda);
		}
		
		prv1.close();	
	
		return lista;
	}
	
	public static void escrever_produto(ArrayList<Produto> lista, Path path) throws IOException{
		FileWriter fw2 = new FileWriter(path.toFile(),false);
		BufferedWriter prp = new BufferedWriter(fw2);
		
		for (Produto p : lista){
			prp.write(p.toString());		
		}	
		prp.close();
	}
	
	public static void escrever_cliente(ArrayList<Cliente> lista, Path path) throws IOException{
		FileWriter fw2 = new FileWriter(path.toFile(),false);
		BufferedWriter prp = new BufferedWriter(fw2);
		
		for (Cliente c : lista){
			prp.write(c.toString());		
		}	
		prp.close();
	}
	
	public static void escrever_venda(ArrayList<Venda> lista, Path path) throws IOException{
		FileWriter fw2 = new FileWriter(path.toFile(),false);
		BufferedWriter prp = new BufferedWriter(fw2);
		
		for (Venda v : lista){
			prp.write(v.toString());		
		}	
		prp.close();
	}
}
