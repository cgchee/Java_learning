package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수이름 짓는 법
        //1. 저장한 값에 어울리는 이름 
        //2. 밑줄 문자, 숫자 사용 가능( 공백 사용 불가)
        //3. 밑줄 또는 문자로 시작 가능
        //4. 한 단어 또는 2개 이상의 단어의 연속
        //5. 소문지러 시작, 각 단어의 시작 글자는 대문자 
        //6. 예약어 사용 불가 
        
        //입국 신고서
        String nationality = "대한민국"; //국적
        String firstName = "현성"; //이름
        String lastName = "김"; // 성
        String dateOfBirth = "2001-12-31";
        String residentialAddress = "무슨 호텔"; //제휴지
        String purposeOFVisit = "관광"; //입국목적
        String flightNo = "KE657"; //항공 편명
        String _flightNo = "KE657"; //밑줄시작
        String flight_no_2 = "KE657";//밑줄과 숫자 포함

        int accompany = 2; //동반 가족수
        int lenghOfStay = 5; //체류기간

        String item1 = "시계";
        String item2 = "가방";
        final String CODE = "KR";
        //CODE = "siuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu";
    }
}
