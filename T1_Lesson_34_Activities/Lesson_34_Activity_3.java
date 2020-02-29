class Lesson_34_Activity_Three{

    public static int findMax(int... ints){
        int max = ints[0];
        for (int value : ints){
            max = max < value ? value : max;
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println(findMax(1, 2, 3, 4, 5, 6, 7));
        System.out.println(findMax(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
