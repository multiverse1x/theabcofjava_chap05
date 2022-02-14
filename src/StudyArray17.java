import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class StudyArray17 {
    public static void main(String[] args) {

        //Arrays 클래스로 배열 다루기.
        //배열의 비교와 출력 - equals(), toString()

        int[] arr = {0,1,2,3,4,5,6};
        int[][] arr2D = {
                {11,12},
                {21,38}
        };

        System.out.println(Arrays.toString(arr));      // 배열을 문자열로 반환함
        System.out.println(Arrays.deepToString(arr2D));  //2차원, 다차원일때는 deepToString()

        String[][] str2D = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D,str2D2)); // 2차원 배열이상의 배열은 deepEquals로
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // 2차원 배열이상의 배열은 deepEquals로

        int[] arr3 = {0,1,2,3,4,5,6};
        System.out.println(Arrays.equals(arr,arr3)); // 1차원 배열은 equals.


        /*
        Arrays.toString()
        Arrays.deepToString()
        Arrays.equals(,)
        Arrays.deepEquals(,)
         */

    }
}
