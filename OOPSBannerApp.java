/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 * This version enhances readability by combining declaration and population.
 * @author Developer
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Inline initialization: Declaration, Construction, and Population in one go
        String[] lines = {
            String.join(" ", "  ***  ", "  ***  ", "******   ", "  ****  "),
            String.join(" ", " ** ** ", " ** ** ", "**    ** ", " **  *  "),
            String.join(" ", "**   **", "**   **", "**     **", " **     "),
            String.join(" ", "**   **", "**   **", "**    ** ", " ****   "),
            String.join(" ", "**   **", "**   **", "******   ", "  ****  "),
            String.join(" ", " ** ** ", " ** ** ", "**       ", " *  *** "),
            String.join(" ", "  ***  ", "  ***  ", "**       ", " ****** ")
        };

        // Standard enhanced for-loop to print the lines
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
