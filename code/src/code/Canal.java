package code;

// classe 

public class Canal {
	private String programa;
	private int horario;
	private String genero;
	private int dia;
// construtor 
	
	public Canal( String varPrograma, int varHorario, String varGenero, int varDia) {
		programa = varPrograma;
		horario = varHorario;
		genero = varGenero;
		dia = varDia;
	}
	
// atributos 
	
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	} 
	
	@Override
	public String toString() {
		return "Programa: " + this.programa + ", Horario: " + this.horario +
			   ", Dia: " + this.dia + ", Genero: " + this.genero;
	}

	

}
