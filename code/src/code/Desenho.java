package code;

public class Desenho  extends Programa {
	
		public Desenho(String varTitulo, int varHorario, String varDiasemana, int varAno, String varDuracao,
			String varResumo) {
		super(varTitulo, varHorario, varDiasemana, varAno, varDuracao, varResumo);
		// TODO Auto-generated constructor stub
	}

		private String idademin;

		public String getIdademin() {
			return idademin;
		}

		public void setIdademin(String idademin) {
			this.idademin = idademin;
		}
		
		@Override
		public String toString() {
			return "Idade minima para assistir: " + this.idademin;
		}

}