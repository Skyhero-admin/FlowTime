import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.swing.*;

public class Reminder {
    Timer timer1;

    public Reminder(int seconds){
        timer1 = new Timer();
        timer1.schedule(new ReminderTask(), seconds*1000*60);
    }

    class ReminderTask extends TimerTask{
        public void run(){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showConfirmDialog((Component) null, "Break finished.", "Break message", JOptionPane.PLAIN_MESSAGE);

            timer1.cancel();
        }
    }
}