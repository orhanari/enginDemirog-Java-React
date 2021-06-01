package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getter Setter lombok sistemi
@Entity //Sen bir veritabanı nesnesisin
@Table(name="general_job_positions") //Veritabanında hangi tabloya karşılık geldiğini belirtir
@AllArgsConstructor
@NoArgsConstructor
public class Job {
	
	@Id //Sorgular bu ID'ye göre yapılır
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Bir bir artacağını belirtiyoruz
	@Column(name="general_job_position_id")
	private int generalJobPositionId;
	
	@Column(name="position_name")
	private String positionName;
	
/*	public Job() { //@NoArgsConstructor
		
	}
	
	public Job(int generalJobPositionId, String positionName) { //@AllArgsConstructor
		super();
		this.generalJobPositionId = generalJobPositionId;
		this.positionName = positionName;
	}
	*/
}
