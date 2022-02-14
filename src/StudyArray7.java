public class StudyArray7 {
    public static void main(String[] args) {

        //배열의 활용 = 총합과 평균. 배열의 모든 요소를 더해서 총합과 평균을 구해보기

        int sum = 0;
        double average = 0;

        int[] score = {189,88,106,156,45};

        for (int i=0; i<score.length; i++){
            sum += score[i];
        }
        average = sum / (double)score.length;

        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + average);
    }
}

