package try_virgil;

public class SimpleLib {

    public void greeting(String name) {
        System.out.println("Hi there :" + name);
    }

    public void sayHi() {
        System.out.println("Hi, what's your name?");
    }

    public int addNumber(int n1, int n2) {
        System.out.println("Again I am using addNumber()");
        return n1 + n2;
    }

    public int multNumber(int n1, int n2) {
        System.out.println("FYI: I am in multNumber()");
        return n1 * n2;
    }

    public static void main(String[] args) {
        SimpleLib app = new try_virgil.SimpleLib();

        app.greeting("Clojurian");
        app.sayHi();

        System.out.println("FYI: add two number(3,4)" + app.addNumber(3,4));

        String userHome = System.getenv("HOME");
        System.out.println("userHome" + userHome);
    }
}
