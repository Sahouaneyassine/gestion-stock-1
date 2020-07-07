package orgsid.springmvc.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity @AllArgsConstructor @NoArgsConstructor @ToString
public class Produit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ; 
    private  String ref ;
	private int quantite ;
    private double   prixunitaire ;

}
