package br.ufpb.dcx.gui;

public class FabricaAndroid implements FabricaAbstrata{

	public Janela criarJanela() {
		return new JanelaAndroid();
	}
	
	public Menu criarMenu() {
		return new MenuAndroid();
	}
	public Botao criarBotao() {
		return new BotaoAndroid();
	}
}
