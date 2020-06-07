//Salva Juan Soria
package saloscar;

public class Taller {
	private String cliente;
	private String matricula;
	private String fechaEnt;
	private String fechaSal;
	private boolean aceite;
	private boolean frenos;
	private boolean ruedas;
	private boolean pintura;
	private boolean bujia;
	private boolean filtro;
	private int id;
	
	public Taller(String cliente, String matricula, String fechaEnt, String fechaSal, boolean aceite, boolean frenos,
			boolean ruedas, boolean pintura, boolean bujia, boolean filtro, int id) {
		this.cliente = cliente;
		this.matricula = matricula;
		this.fechaEnt = fechaEnt;
		this.fechaSal = fechaSal;
		this.aceite = aceite;
		this.frenos = frenos;
		this.ruedas = ruedas;
		this.pintura = pintura;
		this.bujia = bujia;
		this.filtro = filtro;
		this.id = id;
	}

	public Taller() {
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

	public String getFechaEnt() {
		return fechaEnt;
	}

	public void setFechaEnt(String fechaEnt) {
		this.fechaEnt = fechaEnt;
	}

	public String getFechaSal() {
		return fechaSal;
	}

	public void setFechaSal(String fechaSal) {
		this.fechaSal = fechaSal;
	}

	public boolean isAceite() {
		return aceite;
	}

	public void setAceite(boolean aceite) {
		this.aceite = aceite;
	}

	public boolean isFrenos() {
		return frenos;
	}

	public void setFrenos(boolean frenos) {
		this.frenos = frenos;
	}

	public boolean isRuedas() {
		return ruedas;
	}

	public void setRuedas(boolean ruedas) {
		this.ruedas = ruedas;
	}

	public boolean isPintura() {
		return pintura;
	}

	public void setPintura(boolean pintura) {
		this.pintura = pintura;
	}

	public boolean isBujia() {
		return bujia;
	}

	public void setBujia(boolean bujia) {
		this.bujia = bujia;
	}

	public boolean isFiltro() {
		return filtro;
	}

	public void setFiltro(boolean filtro) {
		this.filtro = filtro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
