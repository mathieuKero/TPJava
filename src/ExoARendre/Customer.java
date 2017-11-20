package ExoARendre;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 * @author MKEROM
 *
 */
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(nullable = false, length = 255)
	private String lastName;
	
	@Column(nullable = false, unique = true, length = 255)
	private String firstName;
	
	@Column(nullable = false, length = 20)
	private String phone;
	
	@Column 
	private String address;
	
	@Column
	private int cp;
	
	@Column 
	private String city;

	/**
	 * Protect customer constructor
	 */
	protected Customer() {}
	

	/**
	 * @param lastName
	 * @param firstName
	 * @param phone
	 * @param address
	 * @param cp
	 * @param city
	 */
	public Customer(String lastName, String firstName, String phone, String address, int cp, String city) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.address = address;
		this.cp = cp;
		this.city = city;
	}
	
	
	/**
	* @Override qui permet de paramétrer la fonction toString();
	**/
	@Override
	public String toString() {
		return "lastName -> " + this.getLastName() + "    firstName -> " + this.getFirstName() + "    phone -> " + this.getPhone()  + "    address -> " + this.getAddress()  + "    cp -> " + this.getCp()  + "    city -> " + this.setCity();
	}
	
	//Liaison OneToMany qui créé une liste de caddy vers l'utilisateur
	@OneToMany(mappedBy = "customer")
	private List<Caddy> caddys;
	
	
	/**
	 * @return the caddys
	 */
	public List<Caddy> getCaddys() {
		return caddys;
	}

	//TODO Change if necessary	
	/**
	 * @param caddys the caddys to set
	 */
	public void setCaddys(List<Caddy> caddys) {
		this.caddys = caddys;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the cp
	 */
	public int getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(int cp) {
		this.cp = cp;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}	
}
