package Uge_9;

public class FourenetGrund extends Grund {
    private int Fradrag;

    public FourenetGrund(int grundkvadratmeter, int grundkvadratmeterpris, int byggeret, int Fradrag) {
        super(grundkvadratmeter, grundkvadratmeterpris, byggeret);
        this.Fradrag = Fradrag;
    }
    public int vurdering() {
        return super.vurdering() - Fradrag;
    }

    public void setFradrag(int fradrag) {
        Fradrag = fradrag;
    }
}
