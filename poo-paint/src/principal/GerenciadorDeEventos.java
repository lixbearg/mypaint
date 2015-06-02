package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class GerenciadorDeEventos extends MouseAdapter {

	private AreaDeDesenho area;
	private BarraDeFerramentas barraDeFerramentas;

	public GerenciadorDeEventos(AreaDeDesenho area, BarraDeFerramentas barraDeFerramentas) {
		this.area = area;
		this.barraDeFerramentas = barraDeFerramentas;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Ferramenta ferramenta = barraDeFerramentas.leFerramentaSelecionada();
		Figura f = ferramenta.criaFigura(e.getX(), e.getY());
		this.area.adicionaFigura(f);
		this.area.repaint();
	}
}
