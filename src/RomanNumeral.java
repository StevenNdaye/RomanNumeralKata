public class RomanNumeral {

    private int arabicNumber;

    public RomanNumeral(int arabicNumber) {

        if(arabicNumber < 1){
            throw new IllegalArgumentException("Romans did not use zero and negative");
        }
        this.arabicNumber = arabicNumber;
    }

    @Override
    public String toString() {

        int numberToConvert = arabicNumber;
        String output = "";
        int index = 0;

        while(numberToConvert > 0){
            Numerals numeral = Numerals.values()[index];
            if (numeral.arabic <= numberToConvert){
                output += numeral.roman;
                numberToConvert -= numeral.arabic;
                index--;
            }
            index++;
            if(index >= Numerals.values().length){
                index--;
            }
        }
        return output;
    }

}
