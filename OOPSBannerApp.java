/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * This version uses a String array to store banner lines and a for-each loop to print them.
 * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Define a String array to store all seven lines [cite: 182]
        String[] lines = new String[7];

        // Populate each line using String.join() [cite: 183]
        lines[0] = String.join(" ", "  ***  ", "  ***  ", "******   ", "  **** ");
        lines[1] = String.join(" ", " ** ** ", " ** ** ", "**    ** ", " **  *  ");
        lines[2] = String.join(" ", "**   **", "**   **", "**     **", " **     ");
        lines[3] = String.join(" ", "**   **", "**   **", "**    ** ", " ****   ");
        lines[4] = String.join(" ", "**   **", "**   **", "******   ", "  ****  ");
        lines[5] = String.join(" ", " ** ** ", " ** ** ", "**       ", " *  *** ");
        lines[6] = String.join(" ", "  ***  ", "  ***  ", "**       ", " ****** ");

        // Use an enhanced for-each loop to print each line sequentially [cite: 180, 184]
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
