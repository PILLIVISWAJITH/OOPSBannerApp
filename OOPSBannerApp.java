/**
 * OOPSBannerApp UC7 – Store Character Pattern in a Class
 * This version uses an inner class to encapsulate character-to-pattern mappings.
 * @author Developer
 * @version 7.0
 */
public class OOPSBannerApp {

    /**
     * Inner static class to encapsulate a character and its ASCII banner pattern.
     */
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[]{"  ***  ", " ** ** ", "**   **", "**   **", "**   **", " ** ** ", "  ***  "}),
            new CharacterPatternMap('P', new String[]{" ****** ", " **  ** ", " **   **", " *****  ", " **     ", " **     ", " **     "}),
            new CharacterPatternMap('S', new String[]{" ***** ", " **     ", " **    ", "   *** ", "    ** ", "     **", "  ***** "}),
            new CharacterPatternMap(' ', new String[]{"       ", "       ", "       ", "       ", "       ", "       ", "       "})
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        int linesCount = 7;
        for (int i = 0; i < linesCount; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[i]).append(" ");
            }
            System.out.println(lineBuilder.toString());
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        printMessage(message, charMaps);
    }
}
