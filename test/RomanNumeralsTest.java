import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void shouldThrowNumberIsZero(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Romans did not use zero and negative");
        new RomanNumeral(0);

    }

    @Test
    public void shouldThrowNumberIsLessThanOne() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Romans did not use zero and negative");
        new RomanNumeral(-1);

    }

    @Test
    public void testOneEqualsI() {
        assertThat(new RomanNumeral(1).toString(), is("I"));
    }

    @Test
    public void testTwoEqualsII() {
        assertThat(new RomanNumeral(2).toString(), is("II"));
    }

    @Test
    public void testThreeEqualsIII() {
        assertThat(new RomanNumeral(3).toString(), is("III"));
    }

    @Test
    public void testFourEqualsIV() {
        assertThat(new RomanNumeral(4).toString(), is("IV"));
    }

    @Test
    public void testFiveEqualsV() {
        assertThat(new RomanNumeral(5).toString(), is("V"));

    }

    @Test
    public void testTenEqualsX() {
        assertThat(new RomanNumeral(10).toString(), is("X"));
    }

    @Test
    public void testFiftyEqualsL() {
        assertThat(new RomanNumeral(50).toString(), is("L"));
    }

    @Test
    public void testHundredEqualsC() {
        assertThat(new RomanNumeral(100).toString(), is("C"));
    }

    @Test
    public void testFiveHundredEqualsD() {
        assertThat(new RomanNumeral(500).toString(), is("D"));
    }

    @Test
    public void testOneThousandEqualsM() {
        assertThat(new RomanNumeral(1000).toString(), is("M"));
    }

    @Test
    public void testSixEqualsVI() {
        assertThat(new RomanNumeral(6).toString(), is("VI"));
    }

    @Test
    public void testSevenEqualsVII() {
        assertThat(new RomanNumeral(7).toString(), is("VII"));
    }

    @Test
    public void testEightEqualsVIII() {
        assertThat(new RomanNumeral(8).toString(), is("VIII"));
    }

    @Test
    public void testElevenEqualsXI() {
        assertThat(new RomanNumeral(11).toString(), is("XI"));
    }

    @Test
    public void testFifteenEqualsXV() {
        assertThat(new RomanNumeral(15).toString(), is("XV"));
    }

    @Test
    public void testTwentyEqualsXX() {
        assertThat(new RomanNumeral(20).toString(), is("XX"));
    }

    @Test
    public void testThirtyEqualsXXX() {
        assertThat(new RomanNumeral(30).toString(), is("XXX"));
    }

    @Test
    public void testFiftyEqualsLI() {
        assertThat(new RomanNumeral(51).toString(), is("LI"));
    }

    @Test
    public void testFiftyFiveEqualsLV() {
        assertThat(new RomanNumeral(55).toString(), is("LV"));
    }

    @Test
    public void testSixtyEqualsLX() {
        assertThat(new RomanNumeral(60).toString(), is("LX"));
    }

    @Test
    public void testSixtyOneEqualsLXI() {
        assertThat(new RomanNumeral(61).toString(), is("LXI"));
    }

    @Test
    public void testHundredOneEqualsCI() {
        assertThat(new RomanNumeral(101).toString(), is("CI"));
    }

    @Test
    public void testHundredTenEqualsCX() {
        assertThat(new RomanNumeral(110).toString(), is("CX"));
    }

    @Test
    public void testTwoHundresEqualsCC() {
        assertThat(new RomanNumeral(200).toString(), is("CC"));
    }

    @Test
    public void testTwoHundredsNineEqualsCCIX() {
        assertThat(new RomanNumeral(209).toString().toString(), is("CCIX"));
    }

    @Test
    public void testThreeHundredsEqualsCCC() {
        assertThat(new RomanNumeral(300).toString(), is("CCC"));
    }

    @Test
    public void testFourHundredsNinetyEqualsCDIX() {
        assertThat(new RomanNumeral(409).toString(), is("CDIX"));
    }

    @Test
    public void testFiveHundredsOneEqualsDI() {
        assertThat(new RomanNumeral(501).toString(), is("DI"));
    }

    @Test
    public void testNineHundredsNineEqualsCMIX() {
        assertThat(new RomanNumeral(909).toString(), is("CMIX"));
    }

    @Test
    public void testNineEqualsIX() {
        assertThat(new RomanNumeral(9).toString(), is("IX"));
    }

    @Test
    public void testNineteenEqualsXIX() {
        assertThat(new RomanNumeral(19).toString(), is("XIX"));
    }

    @Test
    public void testFortyEqualsXL() {
        assertThat(new RomanNumeral(40).toString(), is("XL"));
    }

    @Test
    public void testFiftyFourEqualsLIV() {
        assertThat(new RomanNumeral(54).toString(), is("LIV"));
    }

    @Test
    public void testFiftyNineEqualsLIX() {
        assertThat(new RomanNumeral(59).toString(), is("LIX"));
    }

    @Test
    public void testEightNineEqualsLXXXIX() {
        assertThat(new RomanNumeral(89).toString(), is("LXXXIX"));
    }

    @Test
    public void testNinetyOneEqualsXCI() {
        assertThat(new RomanNumeral(91).toString(), is("XCI"));
    }

    @Test
    public void testHundredNineEqualsCIX() {
        assertThat(new RomanNumeral(109).toString(), is("CIX"));
    }

    @Test
    public void testFourHundredsEqualsCD() {
        assertThat(new RomanNumeral(400).toString(), is("CD"));
    }

    @Test
    public void testNineHundredsEqualsCM() {
        assertThat(new RomanNumeral(900).toString(), is("CM"));
    }

    @Test
    public void testAnyNumberCanBeConverted() {
        assertThat(new RomanNumeral(1999).toString(), is("MCMXCIX"));
    }

    @Test
    public void shouldWorkTwice() {
        RomanNumeral romanNumeral = new RomanNumeral(1999);
        assertThat(romanNumeral.toString(), is("MCMXCIX"));
        assertThat(romanNumeral.toString(), is("MCMXCIX"));
    }


}
