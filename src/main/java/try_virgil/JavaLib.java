package try_virgil;
public class JavaLib {
    public String greeting(String name) {
        return "Greeting from Java : " + name;
    }

    public static void main(String[] args) {
        JavaLib app = new try_virgil.JavaLib();
        String message = app.greeting("Duke");
        System.out.println(message);
    }
}
