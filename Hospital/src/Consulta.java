
public class Consulta {
	public int id;
	public int id_paciente;
	public int id_medico;
	public String nome_paciente;
	public String nome_medico;
	public String cidade;
	
	public void VerConsulta() {
		System.out.println(this.id_paciente + this.nome_paciente +  
		"\n" + this.id_medico + "\n" + this.nome_medico + "\n" + this.cidade );
	}
}
