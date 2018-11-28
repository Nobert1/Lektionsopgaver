/*
public class Cinema {
        private int seatsOnRow[];
        private String[][] array;

    public Cinema( int[] seatsOnRow){
            this.seatsOnRow = seatsOnRow;
            array = new String[seatsOnRow.length][];
            for (int i = 0; i < seatsOnRow.length ;i++){
                array[i] = new String[seatsOnRow[i]];
            }
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "0";
            }
        }
        }


        public int rows () {
            return seatsOnRow.length;
        }

        //-giver antal rækker i biografen.
        int seatsOnRow (int row){
            return seatsOnRow[row];

        }
        //totalt giver antal sæder i biografen.

        int seats() {
            int sum = 0;
            for (int i = 0; i < seatsOnRow.length; i++) {
                sum += seatsOnRow[i];
                //for (int j =0; j < seatsOnRow.length; j++){
                    //seatsOnRow[i];
             //   }
            }
            return sum;
        }


        int rowVacancies (int row) {
            String[][] layout;
            for (int i = 0; layout.length > i; i++) {
                layout[i] = new String[scan.nextInt()];
            }
            return
        }
    void booking(int row, int seat) {

    }
    private int layout [][];

    public int getSeatsOnRow() {
        return seatsOnRow.length;
    }

    @Override
    public String toString() {
String output = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                output += array[i][j];
            }
            output += "/n";
        }
        return output;
    }
}






// · int rows()  -giver antal rækker i biografen.
//· int seatsOnRow(int row) - giver antal sæder på række row.
//· int seats() totalt giver antal sæder i biografen.
//· int rowVacancies(int row) giver antal ledige pladser på række row.
//· int vacancies() giver det samlede antal ledige pladser i biografen.
//· void booking(int row, int seat) booker sæde seat på række row.
//· void release(int row, int seat) ophæver bookingen af sæde seat på række row.
//· String toString() giver en streng som viser hvilke sæder der optaget (#) og hvilke der er ledige (O).
*/