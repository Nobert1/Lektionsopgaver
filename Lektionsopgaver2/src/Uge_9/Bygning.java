package Uge_9;

public class Bygning    {
    private int kvadratmeter;
    private int kvadratmeterpris;

    public Bygning(int kvadratmeter, int kvadratmeterpris) {

        this.kvadratmeter = kvadratmeter;
        this.kvadratmeterpris = kvadratmeterpris;

    }
    public int vurdering() {

        return this.kvadratmeterpris * this.kvadratmeter;
    }
}

class Grund  {

    private int grundkvadratmeter;
    private int grundkvadratmeterpris;
    private int byggeret;

    public Grund(int grundkvadratmeter, int grundkvadratmeterpris, int byggeret) {

        this.grundkvadratmeter = grundkvadratmeter;
        this.grundkvadratmeterpris = grundkvadratmeterpris;
        this.byggeret = byggeret;

    }
    public int vurdering() {

        return this.grundkvadratmeterpris * this.grundkvadratmeter + this.byggeret;
    }
}



class Ejendom {
    private Bygning bygning;
    private Grund grund;

    public Ejendom(Bygning bygning, Grund grund) {
        this.bygning = bygning;
        this.grund = grund;
    }

    public int vurdering() {
        return bygning.vurdering() + grund.vurdering();
    }
}
