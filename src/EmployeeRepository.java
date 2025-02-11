import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeRepository(){
        this.employees = new ArrayList<>();
    }
    //Add an employee
    public void addEmployee(Employee employee){
        if (employee != null && !employees.contains(employee)) {
            employees.add(employee);
        }
    }
    //Remove an employee
    public void removeEmployee(Employee employee){
        if (employee == null){
            throw new IllegalArgumentException("Employee cannot be null");
        }
        employees.remove(employee);
    }
    //find employee by id
    public Employee findEmployeeByName(String name){
        for (Employee employee : employees){
            if (employee.getName().equals(name)){
                return employee;
            }
        }
        return null;
    }

    //List all employees
    public List<Employee> getAllEmployee(){
        return employees;
    }
}
