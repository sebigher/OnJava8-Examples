// control/WhileTest.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Demonstrates the while loop

public class WhileTest {
    static boolean condition() {
        double someRandomness = Math.random();
        System.out.println("randomness: " + someRandomness);
        boolean isLessThan0dot99 = someRandomness < 0.99;
        System.out.print(isLessThan0dot99 + ", ");
        return isLessThan0dot99;
    }

    // emphasis: you can have a method call also as a stop&go condition
    public static void main(String[] args) {
        int spinner = 0;
        while (condition()) {
            spinner++;
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while' after spinning it: " + spinner);

        //simpler
        spinner = 0;
        while (Math.random() < 0.99) spinner++;
        System.out.println("while was working: " + spinner);


        //do-while
        //use case: you need the iteration to work at least one time
        //before it stops
        spinner = 0;
        do {
            System.out.println("spin the wheel: " + spinner++);
        } while (Math.random() < 0.99);

        do spinner++; while (Math.random() < 0.99);
        System.out.println("do-while worked: " + spinner + " times");

    }
}
/* Output: (First and Last 5 Lines)
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
...________...________...________...________...
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
true, Inside 'while'
false, Exited 'while'
*/
