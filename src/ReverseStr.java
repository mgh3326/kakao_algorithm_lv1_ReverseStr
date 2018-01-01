public class ReverseStr {
    public String reverseStr(String str){
        char[] arr=new char[str.length()];
        arr[0]=str.charAt(0);
        for(int i=1;i<str.length();i++)
        {
            if(arr[0]<str.charAt(i))
            {

            }
        }
        return "";
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}
//https://www.welcomekakao.com/learn/challenge_codes/98
//문자열 내림차순으로 배치하기 Level 1
//        reverseStr 메소드는 String형 변수 str을 매개변수로 입력받습니다.
//        str에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 String을 리턴해주세요.
//        str는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
//        예를들어 str이 "Zbcdefg"면 "gfedcbZ"을 리턴하면 됩니다.