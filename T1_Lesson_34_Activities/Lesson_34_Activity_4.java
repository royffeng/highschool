class Lesson_34_Activity_Four{

    public static int findMin(int... ints){
        int min = ints[0];
        for (int i : ints){
            if (i < min){
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args){
        System.out.println(findMin(1, 2, 3, 4, 5, 6, 7));
        System.out.println(findMin(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
