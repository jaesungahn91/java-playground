package io.github.js.callbyvalue;

import java.util.Arrays;

/**
 * 자바 창시자인 제임스 고슬링은 수많은  parameter passing 방법이 있지만 자바에는 간단하게 "call by value"만을 참고했다고 한다.
 * -The Java Programming Language, 2nd ed. by Ken Arnold and James Gosling, section 2.6.1, page 40, 3rd paragraph.
 * <p>
 * <p>
 * the Java authors choose to only include one simple idea - pass-by-value, with no default values or optional parameter (overloading often provides a satisfactory alternative),
 * no variable length parameter lists (added finally in Java 5), no named parameters, no pass-by-reference, no const (a general Java issue) parameters, etc.
 */
public class CallByValueArray {

    public static void main(String[] args) {
        int[] src = {1, 2, 3};

        foo(src);
        System.out.println(Arrays.toString(src));
        boo(src);
        // 보조 객체(arr)가 주소값을 통해 주소값이 가리키고 있는 값을 변경하면 같은 주소값을 가리키고 있는 원본 객체(src)의 값도 변경
        System.out.println(Arrays.toString(src));
    }

    static void foo(int[] arr) {
        arr = new int[]{3, 4, 5};
        arr[0] = 9;
    }

    static void boo(int[] arr) {
        arr[0] = 2; // 이건 주소 값의 가리키는 변수를 바꾼 것
    }

}
