package orgsid.springmvc.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @AllArgsConstructor @NoArgsConstructor @ToString
public class User {
	public User(Object object, String string, String string2, boolean b) {
		// TODO Auto-generated constructor stub
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long id;
	@Column(unique = true)
	private String username;
	private String password;
	private boolean enable;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "USER_ROLES" , joinColumns = {@JoinColumn(name="ROLE_ID")} ,inverseJoinColumns = {@JoinColumn(name="USER_ID")} )
	private List<Role> roles;

}
