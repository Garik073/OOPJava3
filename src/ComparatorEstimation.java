import java.util.Comparator;

public class ComparatorEstimation implements Comparator<TeacherAndStudent> {

    

    @Override  
    public int compare (TeacherAndStudent o1,TeacherAndStudent o2){
        
        return Double.compare(o1.getEstimations(), o2.getEstimations());
    } 

    
}
