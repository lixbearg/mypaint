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
		int ferramenta = barraDeFerramentas.leFerramentaSelecionada();
		Figura f = null;
		if (ferramenta == BarraDeFerramentas.RETANGULO) {
			f = new Retangulo(e.getX(), e.getY(), 40, 40);
		} else if (ferramenta == BarraDeFerramentas.CIRCULO) {
			f = new Circulo(e.getX(), e.getY(), 20);
		}
		this.area.adicionaFigura(f);
		this.area.repaint();
	}
}
