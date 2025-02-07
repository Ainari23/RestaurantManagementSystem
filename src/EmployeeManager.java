import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees;

    public EmployeeManager(){
        this.employees = new ArrayList<>();
    }
    //Add an employee
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    //Update employee's salary
    public void updateSalary(Employee employee, double newSalary){
        employee.setSalary(newSalary);
    }
    //Update employee's role
    public void updateRole(Employee employee, RoleEmployee newRole){
        employee.setRoleEmployee(newRole);
    }
    //Obtains List of employee
    public List<Employee> getEmployees(){
        return employees;
    }
}
