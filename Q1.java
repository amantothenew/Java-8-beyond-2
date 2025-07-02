// Q1)Create a Record for the Student with the following Fields: id name standard

class Main{
    public static void main(String[] args) {
        Student student1 = new Student(1,"Aman", 12);
        Student student2 = new Student(2, "Sahil", 11);
        System.out.println(student1 + "\n" + student2);
    }
}

record Student(int id, String name, int standard){
    public Student(int id, String name, int standard){
        this.id = id;
        this.name = name.isBlank() ? "Unknown" : name;
        this.standard = standard>0 ? standard : 10;
    }
}
