// Q3)Use equal and hashCode methods with Student records

import java.util.Objects;

class Main{
    public static void main(String[] args) {
        Student student1 = new Student(1,"Aman", 12);
        Student student3 = new Student(1,"Aman", 12);
        Student student2 = new Student(2, "Sahil", 11);
        
        // USING EQUALS
        System.out.println(student1.equals(student3));
        System.out.println(student1.equals(student2));

        //USING HASHCODE
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());

    }
}

record Student(Integer id, String name, Integer standard){
    public Student(Integer id, String name, Integer standard){
        if (id == null) throw new NullPointerException("id cannot be null");
        if (name == null) throw new NullPointerException("name cannot be null");
        if (standard == null) throw new NullPointerException("standard cannot be null");

        this.id = id > 0 ? id : 0;
        this.name = name.isBlank() ? "Unknown" : name;
        this.standard = standard > 0 ? standard : 10;
    }
}
