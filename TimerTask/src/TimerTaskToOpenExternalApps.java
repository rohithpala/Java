import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

class RunApp extends TimerTask{
    @Override
    public void run() {
        try{
            Runtime.getRuntime().exec("C:\\Windows\\notepad.exe");
        } catch (IOException exception) {
            System.out.println("Error Opening Notepad");
        }
    }
}

public class TimerTaskToOpenExternalApps {
    public static void main(String[] args) {
        Timer myTimer = new Timer();
        RunApp app = new RunApp();
        myTimer.schedule(app, 1000, 1000);
        try{
            Thread.sleep(5000);
        } catch(InterruptedException e){
            System.out.println(e);
        }
        myTimer.cancel();
    }
}
