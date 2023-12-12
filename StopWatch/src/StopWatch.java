
import java.time.LocalTime;

public class StopWatch {
    LocalTime startTime, endTime;
    public StopWatch() {

    }
    public StopWatch(LocalTime startTime,LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getterStarTime(){
        return this .startTime;
    }
    public LocalTime getterEndTime(){
        return this.endTime;
    }
    public void start(){
        this.startTime = LocalTime.now();
    }
    public void stop(){
        this.endTime = LocalTime.now();
    }
    public double getElapsedTime(){
        double result = (this.endTime.getHour() - this.startTime.getHour ()) * 3600 + (this.endTime.getMinute() - this.startTime.getMinute ()) * 60 + (this.endTime.getSecond () - this.startTime.getSecond ());
        return result*1000;
    }
}