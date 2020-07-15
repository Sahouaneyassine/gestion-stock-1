package orgsid.springmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import orgsid.springmvc.entities.*;
import orgsid.springmvc.dao.ProduitRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProduitService {
	@Autowired
	private  ProduitRepository produitRepository ;
	@GetMapping(path = "/listproduit")
	public List<Produit> getProduits(){
		return produitRepository.findAll();
	}
	@PostMapping(path = "/listproduit")
	public Produit addProduit(@RequestBody Produit p){
		return produitRepository.save(p);
	}
	@PutMapping (value = "/listproduit/{id}")
    public Produit update(@PathVariable(name = "id") Long id,@RequestBody Produit p){
		
        return  produitRepository.findById(id).map(produit -> {
        	produit.setPrixunitaire(p.getPrixunitaire());
        	produit.setQuantite(p.getQuantite());
        	produit.setRef(p.getRef());
        	return produitRepository.save(produit);
        }).orElseGet(()->{
        	p.setId(id);
        	return produitRepository.save(p);
        	
        });
        	    
        		
        		
        		
        		

    }
	@DeleteMapping (value = "/listproduit/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        produitRepository.deleteById(id);

    }
	@GetMapping(value = "/listproduit/{id}")
    public Produit listProduits(@PathVariable(name = "id") Long id){
        return produitRepository.findById(id).get();

}
}


