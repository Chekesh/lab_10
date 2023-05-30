public class Main {
    public static void main(String[] args) {
        Director director = new Director("Панфилов Сергей Викторович", "20.09.2005", 50000);
        director.conFullName();
        director.conYearOfBirth();
        director.consalary();
        DepartmentHead departmentHead = new DepartmentHead("Андреев Андрей Андреевич", "01.01.2001", 30000);
        Worker worker = new Worker("Чакурин Илья Владович", "04.25.1999",20000);
    }
}