// Q2)Make sure that no null values should be used for initialization.

class Main{
    public static void main(String[] args) {
        Student student1 = new Student(1,null, 12);
        Student student2 = new Student(2, "Sahil", 11);
        System.out.println(student1 + "\n" + student2);
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
