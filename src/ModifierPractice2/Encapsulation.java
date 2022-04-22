package ModifierPractice2;

public class Encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
       Encapsulation encapsulationn = new Encapsulation();
       encapsulationn.setName("jay");
        System.out.println(encapsulationn.getName());

        encapsulationn.setName("Agrahari");
        System.out.println(encapsulationn.getName());
    }


}
