import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;

public class StudentDriver {

    private static Student student1, student2, student3;
    private static Module ProSkills , BioChem , SoftEng;
    private static Course ComputerScience , Biology , Business;

    private static List<Course> course = new ArrayList<>();
    private static List<Student> student = new ArrayList<>();
    private static List<Module> module = new ArrayList<>();

   
    private static void addStudents() {

      student1 = new Student("Mark Burnell", 23, "14/7/98", 22);
      student2 = new Student("David Coffey", 21, "19/2/92", 25);
      student3 = new Student("Sam Smith", 2, "19/3/2000", 20);
    }
       
    private static void addModules(){
      BioChem = new Module("BioChem", "BC102");
      SoftEng = new Module("SoftEng", "CT417");
      ProSkills = new Module("Proskills", "BS307");
    }
        
    private static void addCourses(){
        ComputerScience = new Course("ComputerScience", new DateTime(2020, 19, 10, 0,0),
                new DateTime(2024, 6, 1, 0,0));
        Biology= new Course("Biology", new DateTime(2021, 1, 20, 0, 0),
                new DateTime(2024, 7, 1, 0, 0));
        Business= new Course("Business", new DateTime(2021, 2, 23, 0, 0),
                new DateTime(2024, 12, 1, 0, 0));
        }


    private static void addStudentstoModulesandtoCourse(){
        ProSkills.addStudent(student1);
        BioChem.addStudent(student2);
        SoftEng.addStudent(student3);

        ComputerScience.addModule(SoftEng);
        Business.addModule(ProSkills);
        Biology.addModule(BioChem);
    }
   
    private static void printInfo() {
    	
    	  for (Student student : students) {
              System.out.println(student.getName());
              System.out.println("\t" + student.getUsername());
              student.getCourses().forEach(course -> System.out.println("\t" + course.getName()));
              student.getModules().forEach(module -> System.out.println("\t\t" + module.getName()));
    	
    }
        

       
    
  
}