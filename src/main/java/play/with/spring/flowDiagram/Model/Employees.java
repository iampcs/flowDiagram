package play.with.spring.flowDiagram.Model;

public class Employees {
	private int employeeID;
	private String employeeName;
	private String employeeAddress;
	private String employeePhoneNumber;
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}
	public void setEmployeePhoneNumber(String employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}
	public Employees(int employeeID, String employeeName, String employeeAddress, String employeePhoneNumber) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhoneNumber = employeePhoneNumber;
	}
	
	
	
	
	

}
