package principal;

import figuras.Figura;
import figuras.Linha;

public class FerramentaLinha extends Ferramenta {

	public FerramentaLinha(BarraDeFerramentas barra) {
		super(barra);
	}

	@Override
	public Figura criaFigura(int x0, int y0, int x1, int y1) {
		return new Linha(x0, y0, x1, y1);
	}

	@Override
	public String getNome() {
		return "Linha";
	}

	
}
