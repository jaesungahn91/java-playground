package io.github.js.callbyvalue;

public class CallByValueString {

    public static void main(String[] args) {
        String s = new String("abc");
        String s2 = s;

        foo(s);

        System.out.println("#3 " + s.equals("abc")); // true
        System.out.println("#4 " + s.equals("ccc")); // false
        System.out.println("#5 " + (s == s2)); // true

        // 만약 call by reference라면
        // System.out.println(s.equals("ccc")); // true
        // System.out.println(s==s2); // true
    }

    static void foo(String str) {
        System.out.println("#1 " + str.equals("abc")); // true

        str = new String("ccc");
        System.out.println("#2 " + str.equals("ccc")); // true
    }

}
