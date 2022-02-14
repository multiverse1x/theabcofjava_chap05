import java.util.Arrays;

public class StudyArray9 {
    public static void main(String[] args) {

        //배열 공부하기
        //배열의 활용. 숫자 섞기(shuffle)

        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i<100; i++){
            int n = (int)(Math.random()*10);    // 0~9 중에 한 값을 임의로 얻는다. n이 배열 인덱스에 들어갈거임.
            int tmp = numArr[0];                // tmp 변수 선언후 0번인덱스 값을 대입
            numArr[0] = numArr[n];
            numArr[n] = tmp;

        }
        System.out.println(Arrays.toString(numArr));
    }
}
