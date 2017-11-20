package ExoARendre;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author MKEROM
 *
 */
@Entity
public class Caddy {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private LocalDateTime date;
	
	@Column
	private EtatCaddy state;;
	
	@Column
	private float totalPrice;
	

	/**
	 * Protect caddy constructor
	 */
	protected Caddy() {}

	/**
	 * @param date
	 * @param state
	 * @param totalPrice
	 */
	public Caddy(LocalDateTime date, EtatCaddy state, float totalPrice) {
		super();
		this.date = date;
		this.state = state;
		this.totalPrice = totalPrice;
	}

	/**
	* @Override qui permet de paramétrer la fonction toString();
	**/
	@Override
	public String toString() {
		return "date -> " + this.getDate() + "    State -> " + this.getState() + "    TotalPrice -> " + this.getTotalPrice();	
	}

	//Liaison ManyToOne liaison vers le customer et identifiaction de celui - ci
	@ManyToOne
	private Customer customer;

	
	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	//Liaison OneTOMany création d'une liste de caddy pour la liaison avec production
	@OneToMany(mappedBy = "caddy")
	private List<Bw_Caddy_Product> caddysToProd;
	
	/**
	 * @return the caddysToProd
	 */
	public List<Bw_Caddy_Product> getCaddysToProd() {
		return caddysToProd;
	}

	/**
	 * @param caddysToProd the caddysToProd to set
	 */
	public void setCaddysToProd(List<Bw_Caddy_Product> caddysToProd) {
		this.caddysToProd = caddysToProd;
	}

	
	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	/**
	 * @return the totalPrice
	 */
	public float getTotalPrice() {
		return totalPrice;
	}

	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	/**
	 * @return the state
	 */
	public EtatCaddy getState() {
		return state;
	}
	
	/**
	 * @param state the state to set
	 */
	public void setState(EtatCaddy state) {
		this.state = state;
	}
}
