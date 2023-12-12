
public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan ();
        fan1.setSpeed (3);
        fan1.setRadius (10);
        fan1.setColor ("yellow");
        fan1.setOn ();
        System.out.printf (fan1.toString ());
        System.out.println ();
        Fan fan2 = new Fan ();
        fan2.setSpeed (2);
        fan2.setRadius (5);
        fan2.setColor ("blue");
        System.out.printf (fan2.toString ());
    }
}