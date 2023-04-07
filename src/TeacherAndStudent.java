import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TeacherAndStudent implements Comparable<TeacherAndStudent>  {
    private String teacher;
    private String student;
    private String schoolClass;
    private int schoolSubject;
    private String schoolIteam;
    private  final double estimation;


    public TeacherAndStudent(String teacher, String student, String schoolClass,int schoolSubject, String schoolIteam, int estimation ){
        this.teacher = teacher;
        this.student = student;
        this.schoolClass = schoolClass;
        this.schoolSubject = schoolSubject;
        this.schoolIteam = schoolIteam;
        this.estimation = estimation;


    }

    @Override
    public String toString() {
        return String.format(" %s teacher: %s student: %s schoolClass: %d scoolSubject: %s schoolIteam: %f estimation \n ", 
         teacher,  student,  schoolClass, schoolSubject, schoolIteam, estimation );
    }

    
    
    public String getTeacher(){
        return teacher;
    }

    public double  getEstimations(){
        return estimation;
    } 
    

    @Override
    public int compareTo(TeacherAndStudent o) {
        return teacher.compareTo(o.teacher);
    }


}