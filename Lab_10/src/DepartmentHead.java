public class DepartmentHead extends Human {
    DepartmentHead(String FullName, String YearOfBirth, int salary){
        this.FullName = FullName;
        this.YearOfBirth = YearOfBirth;
        this.salary = salary;
    }
    void WorkWithDocumets(){
        System.out.println("is working with documets");
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
