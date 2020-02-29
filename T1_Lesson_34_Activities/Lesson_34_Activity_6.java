class Lesson_34_Activity_Six{
    public static boolean allPositive(int... ints){
        for (int i : ints){
            if (i < 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(allPositive(1, 3, 4));
        System.out.println(allPositive(1, 3, 4, 0));
        System.out.println(allPositive(1, 3, 4, -1));
    }
}
