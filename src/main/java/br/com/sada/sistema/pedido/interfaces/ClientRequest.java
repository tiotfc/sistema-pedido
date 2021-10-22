package br.com.sada.sistema.pedido.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sada.sistema.cadastro.model.Cliente;

@FeignClient("cadastro")
public interface ClientRequest {

	@RequestMapping(method = RequestMethod.GET, value = "/cliente/{id}")
	Cliente getCliente(@PathVariable("id") int id);
	
}
