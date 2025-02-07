public class Employee {
    private String name;
    private RoleEmployee roleEmployee;
    private double salary;

    public Employee(String name, RoleEmployee roleEmployee, double salary){
        this.name = name;
        this.roleEmployee = roleEmployee;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleEmployee getRoleEmployee() {
        return roleEmployee;
    }

    public void setRoleEmployee(RoleEmployee roleEmployee) {
        this.roleEmployee = roleEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void addEmployee(Employee employee){
        employee.addEmployee(employee);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", roleEmployee=" + roleEmployee +
                ", salary=" + salary + "$"+
                '}';
    }
}
