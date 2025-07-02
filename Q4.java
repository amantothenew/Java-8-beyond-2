// Q4) Use a Sealed class Class concept to create a class hierarchy

import javax.print.attribute.standard.MediaSize;
import java.util.Objects;

public class Main{
    public static void main(String[] args) {
        Employee employee = new Employee();
        Manager manager = new Manager();
        Engineers engineers = new Engineers();

        employee.Display();
        manager.Display();
        engineers.Display();
    }
}

sealed class Employee permits Manager, Engineers {
    void Display(){
        System.out.println("This is Sealed class");
    }
}

final class Manager extends Employee{
    void Display(){
        System.out.println("This is a Final class");
    }
}

non-sealed class Engineers extends Employee{
    void Display(){
        System.out.println("This is a non-sealed class");
    }
}


