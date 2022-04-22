package ModifiersPractice;

public class Main {
    private int aa;

    public int getAa() {
        return aa;
    }

    public int setAa(int aa) {
        this.aa = aa;
        return aa;
    }

    public static void main(String[] args) {
      Main2 main2 = new Main2();
      main2.a = 5;
      main2.b = 6;
    //  main2.c = 5; // showing error because c is private which is access in the same class only
      main2.d = 7;
        System.out.println(main2.a);
        System.out.println(main2.b);
        System.out.println(main2.b);

  //      main2.aa;  --> Not Accisible because private but if we create getter method by which we can access that variable
        Main main = new Main();
        int aaa = main.getAa();

        // aaa = 5
        int ab = main.setAa(5);
        System.out.println(ab+"set");



    }
}
