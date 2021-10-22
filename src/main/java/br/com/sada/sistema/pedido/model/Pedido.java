package br.com.sada.sistema.pedido.model;

import java.util.List;

import javax.persistence.Entity;

import br.com.sada.sistema.cadastro.model.Cliente;
import br.com.sada.sistema.catalogo.model.Produto;

@Entity
public class Pedido {

	private int id;
	private Cliente cliente;
	private List<Produto> listaProdutos;
	
	
	
}
