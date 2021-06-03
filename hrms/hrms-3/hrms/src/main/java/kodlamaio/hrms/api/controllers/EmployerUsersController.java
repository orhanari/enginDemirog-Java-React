package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerUserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.EmployerUser;

@RestController
@RequestMapping("/api/employerUsers")
public class EmployerUsersController {
	private EmployerUserService employerUserService;
	
	@Autowired
	public EmployerUsersController(EmployerUserService employerUserService) {
		super();
		this.employerUserService = employerUserService;
	}

	@GetMapping("/getall")
	public DataResult<List<EmployerUser>> getAll(){
		return this.employerUserService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody EmployerUser employerUser) {
		return this.employerUserService.add(employerUser);
	}
}
