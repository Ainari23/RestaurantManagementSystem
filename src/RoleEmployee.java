public class RoleEmployee {
    public String roleEmployee;

    public RoleEmployee(String roleEmployee){
        this.roleEmployee = roleEmployee;
    }

    public String getRoleEmployee() {
        return roleEmployee;
    }

    public void setRoleEmployee(String roleEmployee) {
        this.roleEmployee = roleEmployee;
    }

    @Override
    public String toString() {
        return "RoleEmployee{" +
                "roleEmployee='" + roleEmployee + '\'' +
                '}';
    }
}
