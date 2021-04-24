public class Run {

    public static void main(String[] args) {
        ClockDisplay myClock = new ClockDisplay(6,58,48);
        for (int i= 0;i<2000;i++){
            myClock.timeTick();
            System.out.println(myClock.getTime());
        }
    }
}
