package code;
// nome classe 
	public abstract class Programa {
	// construtor
		public Programa ( String varTitulo, int varHorario, String varDiasemana, int varAno, String varDuracao, String varResumo) {
			titulo = varTitulo;
			horario = varHorario;
			diasemana = varDiasemana;
			ano = varAno;
			duracao = varDuracao;
			resumo = varResumo;
		}
	// atributos
	private String titulo;
	private String duracao;
	private int horario; 
	private String diasemana;
	private int ano;
	private String resumo;
// metodos gets e sets
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario){
		this.horario = horario;
	}
	public String getDiasemana() {
		return diasemana;
	}
	public void setDiasemana(String diasemana) {
		this.diasemana = diasemana;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	@Override
	public String toString() {
		return "Titulo: " + this.titulo + ", Duração: " + this.duracao+
			   ", Resumo: " + this.resumo + ", Horario: " + this.horario+
			   ", dia da semana: " + this.diasemana;
	}

}
