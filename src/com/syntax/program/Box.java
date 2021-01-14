package com.syntax.program;

public class Box {

    int fact(int n) {
        int result;

        if(n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }

}

class BoxTest {

    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.fact(5));

        Apple ap;

        //System.out.println(Apple.BlueApple);
        Apple allApples[] = Apple.values();
        for(Apple a: allApples) {
            System.out.println("Array: " + a);
            System.out.println();
        }
        ap = Apple.valueOf("RedApple");
        System.out.println(ap);
    }

}
enum Apple {
    RedApple, GreenApple, BlueApple
}