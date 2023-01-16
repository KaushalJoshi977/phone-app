public class Main {
    public static void main(String[] args) {

        Landline l1 = new Landline("363636");
        Landline l2 = new Landline("121212");

        l1.callNumber("121212");
        l2.receive("121212");
        l2.answer();
    }
}