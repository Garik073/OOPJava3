
import java.util.Collections;


public class Homework3  {

    public static void main(String[] args) throws Exception {

             SchoolOther m = new SchoolOther();
            System.out.println("Вся школа");
            //TeacherAndStudent(String teacher, String student, String schoolClass,int scoolSubject, String schoolIteam 
            m.addSchool(new TeacherAndStudent("Petrov Ivan Vasilevich", "Makarov Igor Olegovich", "11A",
            48,"Mathematics",5));
            m.addSchool( new TeacherAndStudent("Anton Ivan Vasilevich", "Makarov Igor Olegovich", "11Б",
            48,"History",4));
            m.addSchool( new TeacherAndStudent("Gorisov Boris Vasilevich", "Lukin Igor Olegovich", "11A",
            48,"Mathematics", 5));
            m.addSchool(new TeacherAndStudent("Petrov Ivan Vasilevich", "Makarov Igor Olegovich", "11Б",
            48,"Mathematics",4));
            
            for (TeacherAndStudent teacherAndStudent : SchoolOther.schools ) {
                System.out.println(teacherAndStudent);
                
            }
            System.out.println("Отсортированны по преподователю");
            Collections.sort(SchoolOther.schools);
            System.out.println( SchoolOther.schools);

            System.out.println("Отсортированны по преподователю и оценки ученика");

            Collections.sort(SchoolOther.schools, new ComparatorEstimation());
            System.out.print(SchoolOther.schools.toString());
            
         }

         

}