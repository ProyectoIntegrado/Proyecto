//Salva Juan Soria
package saloscar;

public class Coche {
	String matricula;
	String marca;
	String modelo;
	String fechaMat;
	String color;
	int numPuertas;
	int id;
	
	public Coche(String matricula, String marca, String modelo, String fechaMat, String color, int numPuertas, int id) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.fechaMat = fechaMat;
		this.color = color;
		this.numPuertas = numPuertas;
		this.id = id;
	}
	public Coche() {
		// TODO Auto-generated constructor stub
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFechaMat() {
		return fechaMat;
	}
	public void setFechaMat(String fechaMat) {
		this.fechaMat = fechaMat;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNumPuertas() {
		return Integer.toString(numPuertas);
	}
	public void setNumPuertas(int i) {
		this.numPuertas = i;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
