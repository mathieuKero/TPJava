package ExoARendre;

import javax.persistence.ManyToOne;

public class Bw_Caddy_Product {



	@ManyToOne
	private Caddy caddyId;
	
	
	/**
	 * @return the caddyId
	 */
	public Caddy getCaddyId() {
		return caddyId;
	}

	/**
	 * @param caddyId the caddyId to set
	 */
	public void setCaddyId(Caddy caddyId) {
		this.caddyId = caddyId;
	}
	
	
	@ManyToOne
	private Product productId;


	/**
	 * @return the productId
	 */
	public Product getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Product productId) {
		this.productId = productId;
	}
	
	protected Bw_Caddy_Product() {}
}
