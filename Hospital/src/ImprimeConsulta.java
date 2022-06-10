
public class ImprimeConsulta {
	
	public static void main(String []args) {
		Paciente Debora = new Paciente();
		Medico DrJorge = new Medico();
		Consulta consulta1 = new Consulta();
			
		Debora.id = 456;
		Debora.nome = " Debora ";
		Debora.cidade = "São Paulo";
		
		DrJorge.id = 100;
		DrJorge.nome = " DrJorge ";
		DrJorge.cidade = " Rio De Janeiro ";
		
		consulta1.id_paciente = Debora.id;
		consulta1.nome_paciente = Debora.nome;
		consulta1.cidade = Debora.cidade;
		
		consulta1.id_medico = DrJorge.id;
		consulta1.nome_medico = DrJorge.nome;
		consulta1.cidade = DrJorge.cidade;
		
		consulta1.VerConsulta();
		
	}
}
