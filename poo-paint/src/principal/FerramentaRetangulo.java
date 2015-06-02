package principal;

import figuras.Figura;
import figuras.Retangulo;

public class FerramentaRetangulo extends Ferramenta {

	public FerramentaRetangulo(BarraDeFerramentas barra) {
		super(barra);
	}

	@Override
	public Figura criaFigura(int x, int y) {
		return new Retangulo(x, y, 40, 40);
	}

	@Override
	public String getNome() {
		return "Retangulo";
	}
	
	public boolean ehFerramentaPadrao() {
		return true;
	}
}
