class Lesson_32_Activity_Four{

    //Takes in the number of seconds and calls upon the three methods to print out the converted time values
    public static void realTime(int numberSeconds){
        System.out.println("Hours: " + toHoursDigits(numberSeconds));
        System.out.println("Minutes: " + toMinutesDigits(numberSeconds));
        System.out.println("Seconds: " + toSecondsDigits(numberSeconds));
    }

    //Converts the seconds to hours
    public static int toHoursDigits(int totalSec){
        return totalSec / 3600;
    }

    //Converts the seconds to minutes
    public static int toMinutesDigits(int totalSec){
        return (totalSec / 60) % 60;
    }

    //Finds the remaining seconds
    public static int toSecondsDigits(int totalSec){
        return totalSec % 60;
    }

    public static void main(String[] args){
        realTime(0);
        realTime(299);
        realTime(3600);
        realTime(7201);
        realTime(7499);
    }
}
