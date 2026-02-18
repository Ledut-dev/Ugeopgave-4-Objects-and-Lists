public class Student {

    String name;
    int age;
    String studentId;

    public Student(String name, int age, String id){

        this.name = name;
        this.age = age;
        this.studentId = id;

    }


    public void printInfo(){

        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
        System.out.println("------------------");

    }

}
