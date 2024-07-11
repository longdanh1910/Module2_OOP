public class Main{
    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();
        stopWatch.start();
        stopWatch.stop();
        System.out.println("Time elapsed: " + stopWatch.getElapsedTime() + " milliseconds");
    }
}