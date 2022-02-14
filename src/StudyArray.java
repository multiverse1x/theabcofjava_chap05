import java.util.Arrays;

public class StudyArray {
    public static void main(String[] args) {

        //배열 공부하기기
        //배열의 길이 배열이름.length - 배열의 길이(int형 상수)
        //배열은 한번 생성하면 길이를 바꿀 수 없다.(실행동안)


       // int[] score;           // 1. 배열 score를 선언(참조변수)
        // score = new int[5];    // 2.배열의 생성(int저장공간 x 5)

        int[] score = new int[5];   // 배열의 선언과 생성을 동시에
        score[3] = 100;
        System.out.println("score[0]=" + score[0]);
        System.out.println("score[1]=" + score[1]);
        System.out.println("score[2]=" + score[2]);
        System.out.println("score[3]=" + score[3]);
        System.out.println("score[4]=" + score[4]);


        int vale = score[3];
        System.out.println("vale=" + vale);
    }
}
