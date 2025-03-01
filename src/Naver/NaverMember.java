package Naver;

public class NaverMember {

    // 필드
    private String nId;
    private String nPw;
    private String nName;
    private String nBirth;
    private String nGender;
    private String nEmail;
    private String nPhone;


    // 생성자

    // 메소드  : getter, setter, toString

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public String getnPw() {
        return nPw;
    }

    public void setnPw(String nPw) {
        this.nPw = nPw;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    public String getnBirth() {
        return nBirth;
    }

    public void setnBirth(String nBirth) {
        this.nBirth = nBirth;
    }

    public String getnGender() {
        return nGender;
    }

    public void setnGender(String nGender) {
        this.nGender = nGender;
    }

    public String getnEmail() {
        return nEmail;
    }

    public void setnEmail(String nEmail) {
        this.nEmail = nEmail;
    }

    public String getnPhone() {
        return nPhone;
    }

    public void setnPhone(String nPhone) {
        this.nPhone = nPhone;
    }

    @Override
    public String toString() {
        return "회원정보[" +
                "아이디 : '" + nId + '\'' +
                ", 비밀번호 : '" + nPw + '\'' +
                ", 이름 : '" + nName + '\'' +
                ", 생일 : '" + nBirth + '\'' +
                ", 성별 : '" + nGender + '\'' +
                ", 이메일 : '" + nEmail + '\'' +
                ", 휴대폰번호 : '" + nPhone + '\'' +
                '}';
    }

    // DB 테이블 만들기





}
