package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.entities.concretes.Job;

@RestController // Sen bir RestController'sın.
@RequestMapping("/api/jobs") //Birden fazla controller olabilir. Bunu da RequestMapping anotasyonu ile yapıyoruz. Örnek: kodlama.io/api/jobs böyle bir istek gelirse bu controller karşılayacaktır.
public class JobsController {
	// Dış dünyanın, sistemimiz ile iletişim kurduğu yer Controller'dır.
	// Farklı platformlara API desteği sağlıyoruz.
	
	
	private JobService jobService;
	
	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}



	@GetMapping("/getall") // Veri istediğimizi belirtiyoruz.
	public List<Job> getAll(){
		//API > Business'e istekte bulunuyor > Business > Data Access'a istekte bulunuyor. Bu şekilde cevap dönüyor. Eğer hata varsa, iş kurallarından geçmeyip API'ye geri dönebilir, veritabanına gitmeyi engelleyebilir.
		
		return this.jobService.getAll();
		
		
	}
}
