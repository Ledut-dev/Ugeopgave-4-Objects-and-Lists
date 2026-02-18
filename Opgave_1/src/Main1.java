public class Main1 {


    public static void main(String[] args){

        Student lukas = new Student("Lukas", 26, "1");
        Student emil = new Student("Emil", 24, "2");
        Student kasper = new Student("Kasper", 18, "3");

        Student[] students = {lukas, emil, kasper};

        //Print all students info
        System.out.println("All students: ");
        for (Student s : students){
            s.printInfo();
            System.out.println();
        }

        System.out.println();

        //Find and print oldest
        Student oldest = students[0];
        for (Student s : students){
            if (oldest.age < s.age){
                oldest = s;
            }
        }
        System.out.println("Oldest student: ");
        oldest.printInfo();

        System.out.println();

        //Extra work - assigning ID to search for, printing student if found, otherwise informing no student with ID exists.
        String idSearch = "1";
        Student searchedStudent = findById(idSearch, students);
        if (searchedStudent!= null){
            System.out.println("Found student with ID " + idSearch);
            searchedStudent.printInfo();
        }
        else {
            System.out.println("No student with ID " + idSearch + " found");
        }

    }


    //Returns student if student with ID exists, otherwise returns null
    public static Student findById(String id, Student[] array){

        for (Student s : array){
            if (s.studentId.equals(id)){
                return s;
            }
        }
        return null;

    }

}
