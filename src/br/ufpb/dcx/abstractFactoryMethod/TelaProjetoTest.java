/**
 * 
 */
package br.ufpb.dcx.abstractFactoryMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.ufpb.dcx.gui.FabricaAndroid;
import br.ufpb.dcx.gui.FabricaWindows;

/**
 * @author Enos
 *
 */
class TelaProjetoTest {

	@Test
	void criarTelaWindows() {
		TelaProjeto telaProjeto = new TelaProjeto();
		telaProjeto.setFabrica(new FabricaWindows());
		telaProjeto.montar();
		
		String esperado = "JanelaWindows{MenuWindows, BotãoWindows}";

		assertEquals(esperado,telaProjeto.desenhar());
	}
	@Test
	void criarTelaAndroid() {
		TelaProjeto telaProjeto = new TelaProjeto();
		telaProjeto.setFabrica(new FabricaAndroid());
		telaProjeto.montar();
		
		String esperado = "JanelaAndroid{MenuAndroid, BotãoAndroid}";

		assertEquals(esperado,telaProjeto.desenhar());
	}
	

}
