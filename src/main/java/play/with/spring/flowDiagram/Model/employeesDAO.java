package play.with.spring.flowDiagram.Model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class employeesDAO implements genericEmployeeDAO{
	
	
	private List<Employees> employeeDB;
	
	
	public employeesDAO() {
		super();
		this.employeeDB = new ArrayList<Employees>();
	}
	
	


	@Override
	public boolean addEmployee(Employees employee) {
		
		return employeeDB.add(employee);
	}

	@Override
	public List<Employees> getAllEmployees() {
		
		return employeeDB;
	}

	@Override
	public Employees getEmployeeByID(int id) {
		
		return employeeDB.stream().filter(employee -> employee.getEmployeeID() == id).findFirst().get();
	}

	@Override
	public boolean updateEmployeeByID(int id, Employees employee) {
		for(Employees emp : employeeDB)
		{
			if(emp.getEmployeeID() == id)
			{
				emp.setEmployeeAddress(employee.getEmployeeAddress());
				emp.setEmployeeName(employee.getEmployeeName());
				emp.setEmployeePhoneNumber(employee.getEmployeePhoneNumber());
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteEmployeeByID(int id) {
		for(Employees emp : employeeDB)
		{
			if(emp.getEmployeeID() == id)
			{
				return employeeDB.remove(emp);
				
			}
		}
		return false;
	}

	

}
