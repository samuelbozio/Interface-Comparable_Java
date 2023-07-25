public class Employee implements Comparable<Employee> {

    private String name;
    private Double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) { //Compara um objeto com outro.
        return -salary.compareTo(o.getSalary());
        //Mude a comparação de salário ou nome.
    }
}
