package optional;

import java.util.Optional;

public class Teste {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Hec");
		
		Optional<Cliente> clienteOptional = Optional.ofNullable(cliente);  
		
//		String nome = clienteOptional.map(resposta -> resposta.getNome()).orElse("Cliente nao encontrado"));
		
		System.out.println();
		
	}
}
