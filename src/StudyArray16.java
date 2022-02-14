public class StudyArray16 {
    public static void main(String[] args) {

        //String클래스 공부하기

        //     index  01234
        String str = "ABCDE";  // index 01234

        char ch = str.charAt(3);
        System.out.println(ch);  // 'D'

        String str2 = str.substring(1,4);
        System.out.println(str2);  // substring은 from~to까지 인데 to는 포함안된다. "BCD"
        String str2_1 = str.substring(1);
//        String str2_1 = str.substring(1,str.length());  to에 str.length()가 들어간것과 같음
        System.out.println(str2_1); // 뒤에 to를 생략하면 끝까지 나옴+


        int str3 = str.length();
        System.out.println(str3);  //문자열의 길이 반환

        /*
        char charAt(int index) : 문자열에서 해당 위치에 있는 문자 반환
        int length() : 문자열의 길이 반환
        String substring(int from, int to) : 문자열에서 해당 범위의 문자열 반환
        boolean equals(Object obj) : 문자열의 내용이 같은지 확인. 같으면 true, 다르면 false
        char[] toCharArray() : 문자열을 문자배열로 변환해서 반환환
         */


    }
}
