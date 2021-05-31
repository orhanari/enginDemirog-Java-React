package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data //Getter Setter lombok sistemi
@Entity //Sen bir veritabanı nesnesisin
@Table(name="general_job_positions") //Veritabanında hangi tabloya karşılık geldiğini belirtir
public class Job {
	
	@Id //Sorgular bu ID'ye göre yapılır
	@GeneratedValue //Bir bir artacağını belirtiyoruz
	@Column(name="general_job_position_id")
	private int generalJobPositionId;
	
	@Column(name="position_name")
	private String positionName;
	
	public Job() {
		
	}
	
	public Job(int generalJobPositionId, String positionName) {
		super();
		this.generalJobPositionId = generalJobPositionId;
		this.positionName = positionName;
	}
	
}
