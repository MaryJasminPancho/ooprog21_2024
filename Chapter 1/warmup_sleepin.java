public class warmup_sleepin {
    public static void main(String[] args) {
        
        boolean shouldSleepIn = sleepIn(false, false);
        System.out.println("sleepIn(false, false)--> " + shouldSleepIn);
        
        shouldSleepIn = sleepIn(true, false);
        System.out.println("sleepIn(true, false) --> " + shouldSleepIn);

        shouldSleepIn = sleepIn(false, true);
        System.out.println("sleepIn(false, true) --> " + shouldSleepIn);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation){
            return true;
        }
        return false;
    } 
}