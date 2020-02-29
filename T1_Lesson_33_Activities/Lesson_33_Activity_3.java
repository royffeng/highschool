class Lesson_33_Activity_Three{
    public static void printit(int... ints){
        for (int i = 0 ; i < ints.length; i++){
            System.out.print(ints[i] + (i == ints.length - 1 ? "\n" : " "));
        }
    }

    public static void main(String... args){
        printit(1, 2, 3, 4, 5);
        printit(1, 2, 3, 4, 5, 6, 7, 8);
        printit(1, 2, 3, 4, 5, 6, 7, 80, 90, 13445);
    }
}
