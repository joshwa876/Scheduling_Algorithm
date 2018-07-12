import javax.swing.*;
import java.time.DayOfWeek;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
        boolean fanStart = true;
        int counter = 0;
        //out.println(new Employee("brent","McWhinney", 1303848,new Schedule(new Date(),new Date())).toString());
        int sleep = Integer.parseInt(JOptionPane.showInputDialog("Enter Sleep Duration (seconds)"));
        int wake = Integer.parseInt(JOptionPane.showInputDialog("Enter Wake Duration (seconds)"));
        /*while(counter<10){
           fanStart = testTime(fanStart,sleep,wake);
            counter++;
        }*/

    }

    //fan timers
    private static boolean testTime(boolean start, int sleep, int wake){
        if(start){
            try {
                java.awt.Toolkit.getDefaultToolkit().beep();
                out.println("System Running");
                //fan will run for whatever length the user specifies
                TimeUnit.SECONDS.sleep(wake);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return false;
        }else{
            try {
                java.awt.Toolkit.getDefaultToolkit().beep();
                out.println("System Stopped");
                //fan will sleep for whatever length the user specifies
                TimeUnit.SECONDS.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return true;
        }
    }
}
