package Classes_and_Methods;

public class TestProgrammers {
    public static void main(String[] args) {


        Programmer programmer1 = new Programmer("Giuseppe", 27, true);
        Programmer programmer2 = new Programmer("Andrea", 30, false);


        programmer1.drinkCoffe();
        programmer1.printDetails();

        programmer2.printDetails();
        programmer2.hasGlasses();

    }
}
