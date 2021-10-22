package br.com.sada.sistema.pedido.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sada.sistema.cadastro.model.Cliente;
import br.com.sada.sistema.pedido.interfaces.ClientRequest;

@RestController
@RequestMapping("pedido/")
public class PedidoController {

	@Autowired
	ClientRequest client;
	
	
	@GetMapping
	public Cliente buscaCliente() {
		return client.getCliente(1);
	}
	
	
}
