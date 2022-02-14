import java.util.Arrays;

public class StudyArray6 {
    public static void main(String[] args) {

        //배열 공부하기

        int[] iArr1 = new int[10];                     //기본(자동)으로 0으로 초기화
        int[] iArr2 = new int[10];
        int[] iArr3 = {100, 90, 80, 70, 60};
        char[] chArr1 = {'a','b','c','d','e'};

        for(int i=0; i<iArr1.length; i++){
            iArr1[i] = i+1; //1~10의 숫자를 순서대로 배열
        }

        for(int i=0; i < iArr2.length; i++){
            iArr2[i] = (int)(Math.random()*10)+1;
        }

        //배열에 저장된 값들을 출력
        for(int i=0; i< iArr1.length; i++){
            System.out.print(iArr1[i]+",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr1));
        System.out.println(iArr3);
        System.out.println(chArr1);
    }
}
