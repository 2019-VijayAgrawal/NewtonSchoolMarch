package MockPrepration.Mock2;

public class StrCompress {
    static String comprss1(String s){
        String st = s.charAt(0)+"";
        for (int i = 1; i <s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            if (curr != prev){
                st +=curr;
            }
        }
        return st;
    }
    static String compress2(String str){
        String s = str.charAt(0)+"";
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if (curr == prev){
                count++;
            }
            else {
                if (count>=1){
                    s +=count;
                    count = 1;
                }
                s = s+curr;
            }
        }
        if (count>=1){
            s +=count;
        }
        return  s;
    }
    public static void main(String[] args) {
        String s = "abbccdd";
       // comprss1(s);
        System.out.println(comprss1(s));
        System.out.println(compress2(s));

    }
}
