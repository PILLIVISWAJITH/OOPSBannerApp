/**
 * OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
 * This version uses static helper methods to generate character patterns.
 * @author Developer
 * @version 6.0
 */
public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "   ***   ",
            "  ** **  ",
            " **   ** ",
            " **   ** ",
            " **   ** ",
            "  ** **  ",
            "   ***   "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ******  ",
            " **   ** ",
            " **   ** ",
            " ******  ",
            " **      ",
            " **      ",
            " **      "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  ***** ",
            " **   * ",
            " **     ",
            "   ***  ",
            "     ** ",
            " *   ** ",
            " ****** "
        };
    }

    public static void main(String[] args) {
        // Invoke helper methods to get character patterns
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Use a loop to assemble and print each line of the "OOPS" banner
        // We use O twice to demonstrate the DRY principle (reusing getOPattern)
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}
