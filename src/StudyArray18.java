import java.util.Arrays;

public class StudyArray18 {
    public static void main(String[] args) {

        //Arrays 클래스로 배열 다루기.
        //배열의 비교와 출력 - copyOf(), copyOfRange()
        //배열의 정력 - sort()


        int[] arr = {0,1,2,3,4};
        int[] arr2 = Arrays.copyOf(arr, arr.length);           // arr2=[0,1,2,3,4]
        int[] arr3 = Arrays.copyOf(arr, 3);          // arr3=[0,1,2]
        int[] arr4 = Arrays.copyOf(arr, 7);          // arr4=[0,1,2,3,4,0,0]
        int[] arr5 = Arrays.copyOfRange(arr, 2 ,4);   // arr5=[2,3] >4는(to) 불포함함
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);   // arr6=[0,1,2,3,4,0,0]

        int[] arr7 = {3,2,0,1,4};
        Arrays.sort(arr7);                                      //오름차순으로 정렬
        System.out.println(Arrays.toString(arr));               //[0,1,2,3,4]

    }
}


