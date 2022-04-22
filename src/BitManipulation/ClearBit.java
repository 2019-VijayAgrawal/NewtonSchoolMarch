package BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitMask = 1<< pos;
        int notBitMask = ~bitMask;
        int newNum = notBitMask & n;
        System.out.println(newNum);
    }
}
