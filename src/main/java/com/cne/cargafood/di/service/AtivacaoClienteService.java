package com.cne.cargafood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cne.cargafood.di.modelo.Cliente;
import com.cne.cargafood.di.notificacao.NivelUrgencia;
import com.cne.cargafood.di.notificacao.Notificador;
import com.cne.cargafood.di.notificacao.TipoDoNotificador;

//@Component
public class AtivacaoClienteService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	//@PostConstruct
	public void init() {
		System.out.println("INIT" + notificador);
	}
	
	//@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}	
}
