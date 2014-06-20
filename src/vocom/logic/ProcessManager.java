package vocom.logic;

/**
 * Created by shengofer on 6/20/2014.
 */
public class ProcessManager {

   public ProcessManager(){

   }

    public void runProcess(String processName){
        try{
            Process p;
            p = Runtime.getRuntime().exec("cmd /c start "+processName);
        }catch(Exception ae){}

    }
}
