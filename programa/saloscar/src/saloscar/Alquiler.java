//Salva Juan Soria
package saloscar;

public class Alquiler {
	String cliente;
	String matricula;
	String fechaAlq;
	String fechaEnt;
	int id;
	
	public Alquiler(String cliente, String matricula, String fechaAlq, String fechaEnt, int id) {
		this.cliente = cliente;
		this.matricula = matricula;
		this.fechaAlq = fechaAlq;
		this.fechaEnt = fechaEnt;
		this.id = id;
	}

	public Alquiler() {
		// TODO Auto-generated constructor stub
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFechaAlq() {
		return fechaAlq;
	}

	public void setFechaAlq(String fechaAlq) {
		this.fechaAlq = fechaAlq;
	}

	public String getFechaEnt() {
		return fechaEnt;
	}

	public void setFechaEnt(String fechaEnt) {
		this.fechaEnt = fechaEnt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
