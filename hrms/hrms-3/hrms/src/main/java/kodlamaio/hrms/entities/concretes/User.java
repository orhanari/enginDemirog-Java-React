package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getter Setter lombok sistemi
@Entity //Sen bir veritabanı nesnesisin
@Table(name="users") //Veritabanında hangi tabloya karşılık geldiğini belirtir
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	
	@Id //Sorgular bu ID'ye göre yapılır
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Bir bir artacağını belirtiyoruz
	@Column(name="user_id")
	private int userId;
	
	@Column(name="email", unique=true)
	private String email;
	
	@Column(name="password")
	private String password;
	
}
