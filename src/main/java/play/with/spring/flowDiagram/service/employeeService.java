package play.with.spring.flowDiagram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import play.with.spring.flowDiagram.Model.Employees;
import play.with.spring.flowDiagram.Model.genericEmployeeDAO;

@Service
public class employeeService {

	@Autowired
	private genericEmployeeDAO employeeDao ;
	
	public List<Employees> getAllEmployee()
	{
		return employeeDao.getAllEmployees();	
	
	}
	
	
	
	
}
