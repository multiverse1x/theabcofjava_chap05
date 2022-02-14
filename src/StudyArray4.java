import java.util.Arrays;

public class StudyArray4 {
    public static void main(String[] args) {

        //배열 공부하기
        //배열의 출력
        int[] iArr = {1,2,3,4,5};
        System.out.println(iArr);
        /* 1,2,3,4,5가 출력하는게 아닌 [I@43a25848이 출력된다.
        [는 배열을 뜻하고 I는 int타입을 뜻함. @는 위치를 뜻함.(주소) >> 지금은 몰라도 됨.
        어쨋든 배열을 이렇게 출력해서는 1,2,3,4,5가 안나온다.
        단, char타입 배열은 출력됨.
        char[] chArr = {'a','b','c'};
        System.out.println(chArr); // abc가 출력됨
        */

        //배열의 요소를 출력하려면 for문을 쓰자.
        for(int i=0; i<iArr.length; i++){
            System.out.println(iArr[i]);
        }

        //좀 더 편한 방법도 있다. Arrays라는 클래스를 이용하면 돔. 배열 iArr의 모든 요소를 출력
        System.out.println(Arrays.toString(iArr)); // 문자열로 반환

    }
}
