import java.util.ArrayList;
import java.util.Date;
import java.util.Queue;

public class Schedule {
    private Date aStartOfShift, aEndOfShift;
    private Queue<Employee> aScheduled;
    private Queue<Employee> aNotScheduled;
    private ArrayList<String> aDaysOfTheWeek;
    private ArrayList<String> aShiftHours;

    Schedule(Date startOfShift, Date endOfShift){
        this.aStartOfShift = startOfShift; this.aEndOfShift = endOfShift;
    }

    public void mGenerateShift(){

    }
}
