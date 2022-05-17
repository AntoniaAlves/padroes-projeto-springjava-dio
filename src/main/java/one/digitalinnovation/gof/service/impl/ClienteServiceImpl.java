package one.digitalinnovation.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.ClienteService;
import one.digitalinnovation.gof.service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ProductsService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 *
 * @author Antonia
 */

@Service
public class ClienteServiceImpl implements ClienteService {
	
	//  Singleton: Injetar os componentes do Spring com @Autowired.
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	
	//  Strategy: Implementar os metodos definidos na Interface.
	//  Facade: Abstrair integrações com subsistemas, provendo uma interface simples. 
	
@Override  
public Iterable<Cliente> buscarTodos(){
	return clienteRepository.findAll();

}

@Override
public Cliente buscarporId(Long id) {
	Optional <Cliente> cliente = clienteRepository.findById(id); 
	return cliente.get();
}

@Override
public void inserir(Cliente cliente) {
	salvarClienteComCep(cliente);
}

@Override
public void atualizar(Long id, Cliente cliente) {
	// FIXME Buscar Cliente por Id, caso exista.
	Optional <Cliente> clientebd = clienteRepository.findById(id); 
	if (clientebd.isPresent()) {
		salvarClienteComCep(cliente);
		
	// FIXME verificar se o endereço do cliente já existe (pelo CEP)
	// FIXME caso não exista integrar com o ViaCep e persistir o retorno.
	// FIXME Inserir Cliente, vinculando o Endereço (novo ou existente)
	
		}
	}

	@Override
	public void deletar(Long id) {
		// FIXME Deletar Cliente por Id.
		clienteRepository.deleteById(id);
		
	}
	
	private void salvarClienteComCep(Cliente cliente) {
		// Verificar se o endereço do cliente já existe (pelo CEP)
		String cep = cliente.getEndereco().getCep();
		enderecoRepository.findById(cep);
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() ->{
			//Caso não exista integrar com o ViaCep e persistir o retorno.
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		// FIXME Inserir Cliente, vinculando o Endereço (novo ou existente).
		clienteRepository.save(cliente);
	}


}