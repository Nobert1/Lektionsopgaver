import java.awt.color.*;
class Car {

    public String mærke;
    public String nummerplade;
    public String farve;
    public String regno;

    public Car(String mærke1, String nummerplade1, String farve1, String regno1) {

        mærke = mærke1;
        nummerplade = nummerplade1;
        farve = farve1;
        regno = regno1;

    }


    public String toString() {
        return ("[" + nummerplade + "] " + farve + " " + mærke);
    }

    public boolean equals(Car other) {
        if (this.nummerplade == other.nummerplade) {
            return true;
        } else {
            return false;
        }
    }

        public boolean alike (Car other) {
            if (this.mærke == other.mærke && this.farve == other.farve) {
                return true;
            } else {
                return false;
            }
        }

            String getLicenseplate() {
            return nummerplade;

        }   String getColor() {
        return farve; }

        String getBrand() {
        return mærke;
        }

        public void setBrand (String mærke){
            this.mærke = mærke;
        }
        public void setLicenseplate (String nummerplade) {
                this.nummerplade = nummerplade;
        }
        public void setColor (String farve){
            this.farve = farve;
        }
        String getRegno() {
        return regno;
        }
        //String getnextRegno(){
        //return;
        }




// Metoder
// toString(): Returnerer en String på formen: "[SV 27698] rød Citroën"

//        equals(Car otherCar): Returnerer en boolean der er true hvis nummerpladen er den samme - ellers false

//      alike(Car otherCar): Returnerer en boolean der er true hvis mærket og farven er den samme - ellers false