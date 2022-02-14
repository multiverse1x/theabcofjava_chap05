import java.util.Arrays;

public class StudyArray10 {
    public static void main(String[] args) {

        //배열 공부하기
        //로또번호 직접 만들어보기. 배열 섞기를 이용해 중복없이!!

        int[] numArr = new int[45];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] += i + 1;
        }
        for (int i = 0; i < numArr.length; i++) {
            int n = (int) (Math.random() * 45);
            int tmp = numArr[i];
            numArr[i] = numArr[n];
            numArr[n] = tmp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(numArr[i]);
        }
    }
}


