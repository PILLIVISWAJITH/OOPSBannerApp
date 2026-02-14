/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 * @author Developer
 * @version 3.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Using String.join() instead of + for better efficiency
        System.out.println(String.join(" ", "   ***   ", "   ***   ", "******   ", "  *****  "));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", "**    ** ", " **      "));
        System.out.println(String.join(" ", "**     **", "**     **", "**     **", "  **     "));
        System.out.println(String.join(" ", "**     **", "**     **", "**    ** ", "    ***  "));
        System.out.println(String.join(" ", "**     **", "**     **", "******   ", "      ** "));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", "**       ", "     **  "));
        System.out.println(String.join(" ", "   ***   ", "   ***   ", "**       ", " ****    "));
    }
}
