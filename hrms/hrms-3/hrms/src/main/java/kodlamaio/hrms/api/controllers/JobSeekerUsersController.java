package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerUserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeekerUser;

@RestController
@RequestMapping("/api/jobSeekerUsers")
public class JobSeekerUsersController {
	
	private JobSeekerUserService jobSeekerUserService;
	
	@Autowired
	public JobSeekerUsersController(JobSeekerUserService jobSeekerUserService) {
		super();
		this.jobSeekerUserService = jobSeekerUserService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobSeekerUser>> getAll(){
		return this.jobSeekerUserService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekerUser jobSeekerUser) {
		return this.jobSeekerUserService.add(jobSeekerUser);
	}
}
