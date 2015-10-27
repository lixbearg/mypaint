package principal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import figuras.Figura;

public class GerenciadorDeEventos extends MouseAdapter {

	private AreaDeDesenho area;
	private BarraDeFerramentas barraDeFerramentas;

	private int x0;
	private int y0;
	
	public GerenciadorDeEventos(AreaDeDesenho area, BarraDeFerramentas barraDeFerramentas) {
		this.area = area;
		this.barraDeFerramentas = barraDeFerramentas;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.x0 = e.getX();
		this.y0 = e.getY();
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		Ferramenta ferramenta = barraDeFerramentas.leFerramentaSelecionada();
		Figura f = ferramenta.criaFigura(this.x0, this.y0, e.getX(), e.getY());
		this.area.setFiguraTemporaria(f);
		this.area.repaint();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		Ferramenta ferramenta = barraDeFerramentas.leFerramentaSelecionada();
		Figura f = ferramenta.criaFigura(this.x0, this.y0, e.getX(), e.getY());
		this.area.adicionaFigura(f);
		this.area.setFiguraTemporaria(null);
		this.area.repaint();
	}
	
}
