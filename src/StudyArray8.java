public class StudyArray8 {
    public static void main(String[] args) {

        //배열의 활용 - 배열의 요소 중에서서 최대값과 최값을 찾아보자

        int[] score = {45,65,841,416,54,68,463,45,3,6,874,56};
        int max = score[0];                      //배열의 첫번째 값으로 최대값을 초기화
        int min = score[0];                      //배열의 첫번째 값으로 최소값을 초기화

        for(int i=1; i<score.length; i++){       //배열의 두번째 요소부터 읽기 위해서 i의 값을 1로 초기화
            if(score[i] > max){
                max = score[i];
            }else if(score[i] < min){
                min = score[i];
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
