package Uge_9;

public class Test02 {
        public static void main(String[] args) {

            Grund grund = new FourenetGrund(500, 500, 400000, 100000);
            System.out.println(grund.vurdering());
            ((FourenetGrund)grund).setFradrag(150000);
            System.out.println(grund.vurdering());

        }

    }
