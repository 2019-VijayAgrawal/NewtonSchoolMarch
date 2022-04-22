package ModifierPractice2;

public class Interface implements interfaceExam {
    public static void main(String[] args) {
              Interface in = new Interface();
              in.animal();
              in.animalSleep();

    }

    @Override
    public void animal() {
        System.out.println("Hello Interface");
    }

    @Override
    public void animalSleep() {
        System.out.println("animal sleep");
    }

}
