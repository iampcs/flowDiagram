package play.with.spring.flowDiagram.Model;

import java.util.List;

public interface genericEmployeeDAO {
	
	
	
	public boolean addEmployee(Employees employee);
	public List<Employees> getAllEmployees();
	public Employees getEmployeeByID( int id);
	public boolean updateEmployeeByID(int id, Employees employee);
	public boolean deleteEmployeeByID(int id);
	

}
