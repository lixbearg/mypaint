package principal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import figuras.Figura;

public class AreaDeDesenho extends JPanel {

	private List<Figura> figuras;
	
	public AreaDeDesenho() {
		this.figuras = new ArrayList<Figura>();
		this.setPreferredSize(new Dimension(600, 400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// desenha algumas figuras
		for (Figura f : figuras) {
			f.desenha(g);
		}
	}

	public void adicionaFigura(Figura f) {
		this.figuras.add(f);
	}

}
