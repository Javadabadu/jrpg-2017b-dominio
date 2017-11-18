package dominio;

/**
 * Clase que representa el inventario 
 */
public class Inventario {

	private int idInventario;
	private int manos1;
	private int manos2;
	private int pie;
	private int cabeza;
	private int pecho;
	private int accesorio;
	
	/**
	 * Constructor Parametrizado
	 * @param idInventario
	 * @param manos1
	 * @param manos2
	 * @param pie
	 * @param cabeza
	 * @param pecho
	 * @param accesorio
	 */
	public Inventario(int idInventario, int manos1, int manos2, int pie, int cabeza, int pecho, int accesorio) {
		this.idInventario = idInventario;
		this.manos1 = manos1;
		this.manos2 = manos2;
		this.pie = pie;
		this.cabeza = cabeza;
		this.pecho = pecho;
		this.accesorio = accesorio;
	}
	/**
	 * 
	 * @param idInventario
	 */
	public Inventario(int idInventario) {
		this.idInventario = idInventario;
		this.manos1 = -1;
		this.manos2 = -1;
		this.pie = -1;
		this.cabeza = -1;
		this.pecho = -1;
		this.accesorio = -1;
	}
	/**
	 * Metodo que obtiene el id del Inventario
	 * @return id Inventario
	 */
	public int getIdInventario() {
		return idInventario;
	}
	
	/**
	 * Metodo que setea el id Inventario
	 * @param idInventario
	 */
	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}
	
	/**
	 * Metodo que obtiene la mano1
	 * @return Obtiene manos1
	 */
	public int getManos1() {
		return manos1;
	}
	
	/**
	 * Metodo que setea Manos1
	 * @param manos1
	 */
	public void setManos1(int manos1) {
		this.manos1 = manos1;
	}
	
	/**
	 * Metodo que obtiene las manos2
	 * @return Obtiene manos2
	 */
	public int getManos2() {
		return manos2;
	}
	
	/**
	 * Metodo que setea Manos2
	 * @param manos2
	 */
	public void setManos2(int manos2) {
		this.manos2 = manos2;
	}
	
	/**
	 * Metodo que obtiene Pie
	 * @return Obtiene pie
	 */
	public int getPie() {
		return pie;
	}
	
	/**
	 * Metodo que setea Pie
	 * @param pie
	 */
	public void setPie(int pie) {
		this.pie = pie;
	}
	
	/**
	 * Metodo que obtiene las manos2
	 * @return Obtiene manos2
	 */
	public int getCabeza() {
		return cabeza;
	}
	
	/**
	 * Metodo que setea Cabeza
	 * @param cabeza
	 */
	public void setCabeza(int cabeza) {
		this.cabeza = cabeza;
	}
	
	/**
	 * Metodo que obtiene Pecho
	 * @return Obtiene pecho
	 */
	public int getPecho() {
		return pecho;
	}
	
	/**
	 * Metodo que setea Pecho
	 * @param pecho
	 */
	public void setPecho(int pecho) {
		this.pecho = pecho;
	}
	
	/**
	 * Metodo que obtiene accesorio
	 * @return Obtiene accesorio
	 */
	public int getAccesorio() {
		return accesorio;
	}
	
	/**
	 * Metodo que setea Accesorio
	 * @param accesorio
	 */
	public void setAccesorio(int accesorio) {
		this.accesorio = accesorio;
	}
	
}