public class StudyArray2 {
    public static void main(String[] args) {

        //배열 공부하기
        //배열의 길이
        //index 범위 : 0~9


        int[] arr = new int[10];
        System.out.println("arr.length=" + arr.length);

        arr[4] = 1080;

        for(int i =0; i<arr.length; i++){ //i<arr.length에서 arr.length대신 숫자로 쓰면 나중에 바꿀때 에러 발생위험있다. index범위를 벗어나는 에러
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        //ArrayIndexOutOfBoundsException : 배열의 범위를 벗어났다는 에러


    }
}

