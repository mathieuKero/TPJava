package ExoARendre;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author MKEROM
 *
 */
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private int quantity;
	
	@Column 
	private Boolean dead;
	
	@Column
	private float price;

	/**
	 * Protect Product constructor
	 */
	protected Product() {}
	
	/**
	 * @param name
	 * @param description
	 * @param quantity
	 * @param dead
	 * @param price
	 */
	public Product(String name, String description, int quantity, Boolean dead, float price) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.dead = dead;
		this.price = price;
	}

	
	/**
	* @Override qui permet de paramétrer la fonction toString();
	**/
	@Override
	public String toString() {
		return "name -> " + this.getName() + "    description -> " + this.getDescription() + "    quantity -> " + this.getTotalPrice() + "    dead -> " + this.getDead() + "    price -> " + getPrice()
	}
	
	//Liaison OneToMany vers la table d'association Bw_Caddy_Product
	@OneToMany(mappedBy = "product")getQuantity
	private List<Bw_Caddy_Product> ProductstoCad;
	
	
	/**
	 * @return the productstoCad
	 */
	public List<Bw_Caddy_Product> getProductstoCad() {
		return ProductstoCad;
	}

	/**
	 * @param productstoCad the productstoCad to set
	 */
	public void setProductstoCad(List<Bw_Caddy_Product> productstoCad) {
		ProductstoCad = productstoCad;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the dead
	 */
	public Boolean getDead() {
		return dead;
	}

	/**
	 * @param dead the dead to set
	 */
	public void setDead(Boolean dead) {
		this.dead = dead;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
}
