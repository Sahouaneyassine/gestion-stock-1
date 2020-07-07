package orgsid.springmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import orgsid.springmvc.entities.*;
import orgsid.springmvc.dao.ProduitRepository;

@RestController
public class ProduitService {
	@Autowired
	private  ProduitRepository produitRepository ;
	@GetMapping(path = "/listproduit")
	public List<Produit> getProduits(){
		return produitRepository.findAll();
	}

}
