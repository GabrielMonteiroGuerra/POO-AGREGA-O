
public class Disciplina {
	private String nome;
	private Professor prof;
	private int qntdAulas;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Professor getProf() {
		return prof;
	}
	
	public void setProf(Professor valor) {
		this.prof = valor;
	}
	
	public int getQntdAulas() {
		return qntdAulas;
	}
	
	public void setQntdAulas(int qntdAulas) {
		this.qntdAulas = qntdAulas;
	}
}
