package ModifierPractice2;

import ModifiersPractice.Main;
import ModifiersPractice.Main2;

public class Main3 {
    public static void main(String[] args) {
        Main2 main = new Main2();
        main.a = 9;
        System.out.println(main.a);
  //      main.b = 7 //can not accisible becos b is initialize as protected
     //  main.c = 8   // can not accisible becos b is initialize as private
     //   main.d = 2  // can not accisible becos b is initialize as default
    }
}
