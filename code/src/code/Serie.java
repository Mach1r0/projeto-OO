package code;


public class Serie extends Programa {
	public Serie(String varTitulo, int varHorario, String varDiasemana, int varAno, String varDuracao,
			String varResumo) {
		super(varTitulo, varHorario, varDiasemana, varAno, varDuracao, varResumo);
		
	}

	private String quantidadep;

	public String getQuantidadep() {
		return quantidadep;
	}

	public void setQuantidadep(String quantidadep) {
		this.quantidadep = quantidadep;
	}
	
	@Override
	public String toString() {
		return "Quantidade de ep: " + this.quantidadep;
	}

}
