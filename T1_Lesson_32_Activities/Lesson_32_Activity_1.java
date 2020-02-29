class Lesson_32_Activity_One{

    //Parameter of the user int input will be taken
    //Calls on the toMonthName method to print out the corresponding actual name of the month
    public static void monthName(int userInputNumberOfMonth){
        System.out.println(toMonthName(userInputNumberOfMonth));
    }

    //Uses a switch statement to run through the user's inputs and assign the month number to its name
    public static String toMonthName(int userInputNumberOfMonth){
        switch (userInputNumberOfMonth){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                //This is for when the user's input is not within the valid range of any of the switch statements
                //The switch statement will out the following error message
                throw new IllegalArgumentException("Only months 1 through 12 exist.");
        }
    }

    //Main method, uses a for loop to call upon the monthName method which calls upon the toMonthName method
    public static void main(String[] args){
        for (int i = 0; i < 12; i++){
            monthName(i);
        }
    }
}
