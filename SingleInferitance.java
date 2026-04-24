class Employee {
    float salary = 40000;

    void work() {
        System.out.println("Employee is working ");
    }
}

class Programmer extends Employee {
    int bonus = 1000;

    void coding() {
        System.out.println("Programmer is writing code,");
    }
}

public class SingleInferitance {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.work();
        p.coding();
        System.out.println("Programmer Salary: " + p.salary);
        System.out.println("Programmer Bonus: " + p.bonus);
        System.out.println("Total Income: " + (p.bonus + p.salary));

    }
}
