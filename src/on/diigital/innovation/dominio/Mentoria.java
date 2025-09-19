package on.diigital.innovation.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;
	
	@Override
	public double calcularXp() {		
		return XP_PADRAO;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	

}
