/**
 * 
 */
package ExoARendre;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * @author MKEROM
 *
 */
@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
	
	
	@Bean
	public CommandLineRunner CLRCustomer(CustomerRep CustomerRepo, ProductRep ProductRepo, CaddyRep Caddyrepo) {
		
		// Jeux de tests : ajout de donnée dans les classes. 
		return(args) -> {

			ProductRepo.save(new Product("saucisson", "a Manger", 51, false, 65));
			
			LocalDateTime dateNow = LocalDateTime.now();
			
			Caddyrepo.save(new Caddy(dateNow, EtatCaddy.Terminé, 98854562));
			
			CustomerRepo.save(new Customer("philipe", "je sais où tu te cache ! ", "01 01 01 01 01", "10 rue de la paix", 54210, "Tregorentuc la vanoise"));
			

			// affichage des classes avec le logger: 
			
			
			
			
		};
	}


}
