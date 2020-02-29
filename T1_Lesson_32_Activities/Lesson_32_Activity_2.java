class Lesson_32_Activity_Two{

    public static void monthDays(int userInputNumberOfMonth){
        System.out.println(numberOfDays(userInputNumberOfMonth));
    }

    public static int numberOfDays(int userInputNumberOfMonth){
        switch (userInputNumberOfMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                throw new IllegalArgumentException("Only months 1 through 12 exist.");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            monthDays(i);
        }
    }
}
