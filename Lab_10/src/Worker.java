public class Worker extends Human {
    Worker(String FullName, String YearOfBirth, int salary){
        this.FullName = FullName;
        this.YearOfBirth = YearOfBirth;
        this.salary = salary;
    }
    void work(){
        System.out.println("is working");
    }
    @Override
    void conFullName() {
        System.out.println(FullName);
    }
    @Override
    void conYearOfBirth() {
        System.out.println(YearOfBirth);
    }
    @Override
    void consalary() {
        System.out.println(salary);
    }
}