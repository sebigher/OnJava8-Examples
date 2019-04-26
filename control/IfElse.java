// control/IfElse.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class IfElse {
    static int result = 0;

    private static void test(int testval, int target) {
        if (testval > target)
            result = +1;
        else if (testval < target) // [1]
            result = -1;
        else
            result = 0; // Match
    }

    //another way to write it:
    // else if
    //is not a new keyword is just an else
    // followed by a new if
    private static void test2(int testval, int target) {
        if (testval > target)
            result = +1;
        else {
            if (testval < target) // [1]
                result = -1;
            else
                result = 0; // Match
        }
    }


    public static void main(String[] args) {
        test(10, 5);
        System.out.println(result);
        test(5, 10);
        System.out.println(result);
        test(5, 5);
        System.out.println(result);

        test2(5, 5);
        System.out.println(result);
    }
}
/* Output:
1
-1
0
*/
