package com.cne.cargafood.di.notificacao;

import com.cne.cargafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
	
}