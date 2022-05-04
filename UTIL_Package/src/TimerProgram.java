import java.util.Timer;
import java.util.TimerTask;

class myTimer extends TimerTask {
    public void run() {
        System.out.println("Rohith");
    }
}

public class TimerProgram {
    public static void main(String[] args) {
        Timer t = new Timer();
    }
}
