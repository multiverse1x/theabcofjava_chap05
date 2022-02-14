public class StudyArray12 {
    public static void main(String[] args) {

        //String 배열 공부하기
        //커맨드 라인에서 입력받기

        System.out.println("매개변수의 개수:" + args.length);
        for(int i=0; i<args.length; i++){
            System.out.println("args [" + i + "] = \"" + args[i] + "\"");
        }
    }
}
