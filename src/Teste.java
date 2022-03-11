
public class Teste {

	public static void main(String[] args) {
		Professor p1 = new Professor();
		p1.setNome("Antonio");
		
		Professor p2 = new Professor();
		p2.setNome("Cristina");
		
		Professor p3 = new Professor();
		p2.setNome("Novo");
		
		Disciplina d1 = new Disciplina();
		d1.setNome("ENG III");
		d1.setQntdAulas(4);
		
		Disciplina d2 = new Disciplina();
		d2.setNome("POO");
		d2.setQntdAulas(4);
		
		d1.setProf(p2);
		d2.setProf(p1);
		
		d2.setProf(p2);
		d2.setProf(null);
		d2.setProf(p3);
		
		System.out.println("Nome da disciplina 1: "+d1.getNome());
		System.out.println("Nome da disciplina 2: "+d2.getNome());
		System.out.println("Nome do professor 1: "+p1.getNome());
		System.out.println("Nome do professor 2: "+p2.getNome());
		System.out.println("Nome do professor 3: "+p3.getNome());

	}

}
