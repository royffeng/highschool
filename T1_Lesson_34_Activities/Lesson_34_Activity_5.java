class Lesson_34_Activity_Five{

    public static int sumEven(int... ints){
        int sum = 0;
        for (int i : ints){
            if (i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(sumEven(1, 2, 3, 4, 5, 6, 7));
        System.out.println(sumEven(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
