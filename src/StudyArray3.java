public class StudyArray3 {
    public static void main(String[] args) {

        //배열 공부하기
        //배열의 초기화
        //배열은 기본적으로 자동 초기화가 된다.
        //하지만 내가 원하는 값으로 초기화를 하려면?!

        int[] score = new int[5]; // 이렇게 선언과 생성후 각 요소에 직접 저장할 수있다.
        score[0] = 50;
        score[1] = 60;
        score[2] = 70;
        score[3] = 80;
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        System.out.println(score[3]);
        System.out.println("---------");

        //for문을 이용하면 이렇게도 가능. 하지만 조건에 따라 규칙성이 필요하다.
        int[] score2 = new int[6];
        for(int i=0; i<score2.length; i++ ){
            System.out.println(score2[i] = i*10);
            /* i=0부터 시작해야 출력때 score[i]에서 0번인덱스도 출력가능. i < score.length에서
               i <= score.length는 예외발생. 왜냐면 i가 0부터 시작해서 총 0~5까지 6개인데, i<=score.length.를하면 i가
               0~6까지 총 7개가 되버림.*/
            }

        //쉽게 그리고 보통 초기화 하는 방법
        int[] score3 = new int[] {50, 60, 70, 80};   // 이 방법은 별로 안쓴다.
        int[] score4 = {50, 60, 70, 80};             // 99%는 이렇게 쓴다. 배열 선언후 대입값에 바로 초기화값 넣어주기. 일단 이렇게 쓰는것만 알아둬도 된다.

        //하지만 선언과 초기화를 나눠야할때가 가끔 있는데 이때는 바로 쓰면 에러남.
        int[] score5;
//      score5 = {50,60,70,80};                   // 에러남!!!!
        score5 = new int[]{50,60,70,80};          //이렇게 해줘야함


    }
}
