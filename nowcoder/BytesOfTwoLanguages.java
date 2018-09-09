public class BytesOfTwoLanguages {

    public static void main(String[] args) {
        String a = "test测试cherry樱花";
        int size = a.length();
        int byteLen = a.getBytes().length;
        System.out.println("英文字符个数: " + (size * 2 - byteLen));
        System.out.println("中文字符个数: " + (byteLen - size));
    }
}