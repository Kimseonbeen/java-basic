package static2;

public class DecoUtil1 {


    /**
     * deco() 라는 기능은 멤버 변수도 없고, 단순히 기능만 제공할 뿐이다.
     * @param str
     * @return
     */
    public String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
