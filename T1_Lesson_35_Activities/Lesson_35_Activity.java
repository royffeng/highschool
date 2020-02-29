class Lesson_35_Activity{
    public static double randomize(double first, double last){
        return Math.random() * (last - first + Double.MIN_VALUE) + first;
    }

    public static double randomize(double range){
        return randomize(0.0, range);
    }

    public static int randomize(int first, int last){
        return (int) (Math.random() * (last - first + 1)) + first;
    }

    public static int randomize(int range){
        return (int) randomize(0, range);
    }

    public static void main(String[] args){
        for (int i = 0; i < 10; ++i){
            System.out.println(randomize(10.0, 20.0));
            System.out.println(randomize(10.0));
            System.out.println(randomize(10, 20));
            System.out.println(randomize(10));
        }
    }
}
