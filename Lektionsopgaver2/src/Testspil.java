public class Testspil {
    public static void main(String[] args) {
        Spil spil = new Spil();
       //System.out.println(spil);
        //System.out.println(spil);
        System.out.println("Træk et kort");
        spil.blandkort();
        System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" );
        System.out.println("Du trak " +spil.traekkort());
        System.out.println("\n" + "\n" + "\n" + "\n" + "\n" + "\n" );
        int i = 0;
        while (i < 50) {
            System.out.println("Du trak " +spil.traekkort() + "\n");
            i++;
            if (i % 10 == 0) {
                spil.blandkort();
            }

        }
    }
}
