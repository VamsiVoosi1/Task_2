package task2;

public class Employee extends Person{
    int employeeID;
    double salary;
    public Employee(String name,int age){
        System.out.println("Employee name is"+(super.name=name));
        System.out.println("Employee age is"+(super.age=age));
    }

    public static void main(String[] args) {
        Employee em=new Employee("Vamsi",25);
    }

}
