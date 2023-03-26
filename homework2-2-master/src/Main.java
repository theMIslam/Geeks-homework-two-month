public class Main {
    public static void main(String[] args) {
        BMW e34 = new BMW();
        Mercedes Maybach = new Mercedes();
        CarRepolmpl Gay = new CarRepolmpl();

        e34.setNewSound("ВУУУМ");
        Maybach.setNewSound("ВВВВОМ");

        Gay.newSound(e34);
        Gay.newSound(Maybach);



    }
}