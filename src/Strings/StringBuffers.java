package Strings;

public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < 5; i++) {
          stringBuffer.append(i);
        }
        System.out.println(stringBuffer.toString());
    }
}
