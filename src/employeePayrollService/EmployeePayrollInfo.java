package employeePayrollService;

public class EmployeePayrollInfo {
	int employeeId;
	String employeeName;
	double employeeSalary;

	public EmployeePayrollInfo(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollInfo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}
