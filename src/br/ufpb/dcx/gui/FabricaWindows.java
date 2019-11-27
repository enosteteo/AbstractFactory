package br.ufpb.dcx.gui;

public class FabricaWindows implements FabricaAbstrata{
	
	public Janela criarJanela() {
		return new JanelaWindows();
	}
	
	public Menu criarMenu() {
		return new MenuWindows();
	}
	public Botao criarBotao() {
		return new BotaoWindows();
	}
}
