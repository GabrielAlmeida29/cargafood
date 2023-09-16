package com.cne.cargafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.cne.cargafood.di.notificacao.NivelUrgencia;
import com.cne.cargafood.di.notificacao.Notificador;
import com.cne.cargafood.di.notificacao.TipoDoNotificador;
import com.cne.cargafood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event){
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!" );
	}
}
