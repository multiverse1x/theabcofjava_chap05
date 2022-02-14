import java.util.Arrays;  // ctrl+shift+o 자동으로 import문 추가

public class StudyArray5 {
    public static void main(String[] args) {

        //배열 공부하기
        //예제 실습1

        //for문을 이용해서 배열 출력하기
        int[] iArr = {100,90,80,70,60};            //길이가 5인 int배열
        for(int i=0; i<iArr.length; i++){
            System.out.println("iArr[" + i + "] = " + iArr[i]);
        }
        System.out.println(Arrays.toString(iArr));  // Arrays클래스의 toString을 이용해서 문자열로 배열 출력

    }
}
