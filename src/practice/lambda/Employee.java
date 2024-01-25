package practice.lambda;

public class Employee {
    public String ename;
    public int salary;
    public int experience;
    public Employee(String ename, int salary, int experience){
        this.ename=ename;
        this.salary=salary;
        this.experience=experience;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "ename='" + ename + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                ']';
    }
}
