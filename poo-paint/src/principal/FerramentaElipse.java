package principal;

import figuras.Elipse;
import figuras.Figura;

public class FerramentaElipse extends Ferramenta {

	public FerramentaElipse(BarraDeFerramentas barra) {
		super(barra);
	}
	
	@Override
	public Figura criaFigura(int x0, int y0, int x1, int y1) {
		int xc = Math.min(x0, x1);
		int yc = Math.min(y0, y1);
		int largura = Math.abs(x1 - x0);
		int altura = Math.abs(y1 - y0);
		return new Elipse(xc, yc, largura, altura);
	}

	@Override
	public String getNome() {
		return "Círculo";
	}
}
