public class Timer {
    long start;
    long stop;

    public void start(){
        start = System.currentTimeMillis();
    }
    
    public void stop(){
        stop = System.currentTimeMillis();
    }

    public long getTime(){
        return stop - start;
    }

}
