public class Director extends Human {
    Director(String FullName, String YearOfBirth, int salary){
        this.FullName = FullName;
        this.YearOfBirth = YearOfBirth;
        this.salary = salary;
    }
    void EnterТegotiations(){
        System.out.println("is will enter negotiations");
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
