public class Opgave1 {

public class Student{
   private String name;
    private int age;


     Student(String name, int age){
         this.name = name;
         this.age = age;
    }

    void printInfo(){
        System.out.println(this.name + " " + this.age + " years old");
    }


}

    public static Student findEldest(Student[] students){
    Student oldest = students[0];
    for (Student student : students){
        if(student.age > oldest.age){
            oldest = student;
        }
    }
    return oldest;
    }




    void main(){
    Student Jabbar = new Student("Jabbar",35);
    Student June = new Student("June",22);
    Student James = new Student("James",50);

    Student[] students = new Student[3];
    students[0] = Jabbar;
    students[1] = June;
    students[2] = James;



    for(Student student : students){
        System.out.println(student.name + " " + student.age + " years old");
    }

    Student eldest = findEldest(students);
        System.out.println("Oldest student: ");
        eldest.printInfo();










    }














}
