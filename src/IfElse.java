public class IfElse {
    static int result=0;
    static void test (int testval, int target) {
        if (testval>target)
            result=+1;
        else if (testval<target)
            result=-1;
        else result=0;
    }
    public static void main(String[] args) {

        for (int c=0;c<100;c++)
            // if (Character.isLowerCase(c))
            System.out.println(c);
        test(5,10);
        System.out.println(result);
        test(5,5);
        System.out.println(result);
    }
}