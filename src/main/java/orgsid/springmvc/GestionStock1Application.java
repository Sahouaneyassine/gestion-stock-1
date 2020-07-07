package orgsid.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import orgsid.springmvc.dao.ProduitRepository;
import orgsid.springmvc.entities.Produit;

@SpringBootApplication
public class GestionStock1Application implements CommandLineRunner {
	@Autowired
	private  ProduitRepository produitRepository ;

	public static void main(String[] args) {
		SpringApplication.run(GestionStock1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//oduit p1 = new Produit(null,"PC Portable",100,30);
	//roduitRepository.save(p1);
		
	}
	

}
