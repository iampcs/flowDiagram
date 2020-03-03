package play.with.spring.flowDiagram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import play.with.spring.flowDiagram.Model.Employees;
import play.with.spring.flowDiagram.service.employeeService;

@RestController
@RequestMapping("/employeeOps")
public class employeeController {
	
	@Autowired
	private employeeService empService;
	
	@GetMapping
	public List<Employees> getAllEmployees()
	{
		return empService.getAllEmployee();
	}
	

}
