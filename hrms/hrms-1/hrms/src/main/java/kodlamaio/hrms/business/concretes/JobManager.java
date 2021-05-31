package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.entities.concretes.Job;

@Service //Bu class, projede servis görevi göreceğine dair spring'e bilgi veriyoruz.
public class JobManager implements JobService{
	//Sen bir JobService referansı tutan bir arkadaşsın.
	
	// Spring nasıl çalışıyor? Normal şartlarda burada injection'ın yapılabilmesi için burada JobDao injectionu yapıyoruz. JobDao bir interface. Onun içerisindeki JpaRepository'de interface. Yani burada bir class yok. Generic olarak çalışıyor ve arkaplanda verdiğimiz değerlere, bilgilere göre arka tarafta spring bir repository class oluşturuyor. Kısacası bir instance oluşturuyor. Instance'ın ne olduğuna dair bir bilgi vermek için @Autowired kullanıyoruz.
	
	
	private JobDao jobDao;
	
	//@Autowired Java dünyasında çok popülerdir. Yeni nesil projelerde %100'e yakın kullanım oranı vardır. Normalde bağımlılık oluştursa da, bu şekilde kullanılmaktadır. Projeyi tarar, projede buna karşılık gelen sınıf varsa onu yerleştirmektedir. Injection'ı bu şekilde yapmaktadır.
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public List<Job> getAll() {
		// Eklemek, silmek, güncellemek,aramak, sayfalı getirmek, tek bir eleman getirmek gibi bir sürü operasyon mevcuttur.
		return this.jobDao.findAll();
	}

}
