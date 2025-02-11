import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private EmployeeRepository employeeRepository;

    public EmployeeManager(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    //Calculate Employee Salary (Business Logic Example)
    public double calculateSalary(Employee employee){
        return employee.getSalary() + (employee.getSalary()*0.10);
    }
    //Update employee's role
    public void updateRole(Employee employee, String newRole){
        if (employee == null || newRole == null || newRole.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid employee or role");
        }
        RoleEmployee role = new RoleEmployee(newRole);
        employee.setRoleEmployee(role);
    }
    //Example of a business method: Rewarding an employee
    public void rewardEmployee(Employee employee){
        double salary = calculateSalary(employee);
        System.out.println("Employee"+ employee.getName()+" has been rewarded with a salary of" +salary);
    }
    // Method to add an employee (uses the repository)
    public void addEmployee(Employee employee) {
        if (employee != null && !employeeRepository.getAllEmployee().contains(employee)) {
            employeeRepository.addEmployee(employee);
        }
    }

    // Méthode pour trouver un employé par ID
    public Employee findEmployeeByName(String name) {
        return employeeRepository.findEmployeeByName(name);
    }
}
