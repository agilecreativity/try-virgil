package try_virgil;
public class SimpleLib {
    public String greeting(String name) {
        return "Hi there, " + name;
    }

    // Simple function to add number together
    public int addNumber(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        SimpleLib app = new try_virgil.SimpleLib();

        String message = app.greeting("Duke");
        System.out.println(message);

        System.out.println("addNumber(3,4) : " + app.addNumber(3,4));

        String userHome = System.getenv("HOME");
        System.out.println("userHome" + userHome);
    }
}
