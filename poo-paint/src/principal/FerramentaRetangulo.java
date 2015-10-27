package principal;

import figuras.Figura;
import figuras.Retangulo;

public class FerramentaRetangulo extends Ferramenta {

	public FerramentaRetangulo(BarraDeFerramentas barra) {
		super(barra);
	}

	@Override
	public Figura criaFigura(int x0, int y0, int x1, int y1) {
		return new Retangulo(x0, y0, x1 - x0, y1 - y0);
	}

	@Override
	public String getNome() {
		return "Retangulo";
	}
	
	public boolean ehFerramentaPadrao() {
		return true;
	}
}
