package br.ufpb.dcx.abstractFactoryMethod;

import br.ufpb.dcx.gui.Botao;
import br.ufpb.dcx.gui.FabricaAbstrata;
import br.ufpb.dcx.gui.Janela;
import br.ufpb.dcx.gui.Menu;

/**
 * @author Enos
 *
 */
public class TelaProjeto {
	FabricaAbstrata fabrica;
	Janela janela;
	Menu menu;
	Botao botao;
	

	public void montar() {
		janela = fabrica.criarJanela();
		menu = fabrica.criarMenu();
		botao = fabrica.criarBotao();
	}

	public String desenhar() {
		
		
		return ""+janela.desenhar() + "{"+ menu.desenhar() + ", "+botao.desenhar()+"}";
	}

	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;		
	}
}
