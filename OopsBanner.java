public class OopsBanner  {

    // Inner class to map character with its pattern
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create character-pattern mappings
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] pPattern = {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };

        String[] sPattern = {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };

        String[] spacePattern = {
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
        };

        CharacterPatternMap[] characterPatternMap = new CharacterPatternMap[4];

        characterPatternMap[0] = new CharacterPatternMap('O', oPattern);
        characterPatternMap[1] = new CharacterPatternMap('P', pPattern);
        characterPatternMap[2] = new CharacterPatternMap('S', sPattern);
        characterPatternMap[3] = new CharacterPatternMap(' ', spacePattern);

        return characterPatternMap;
    }

    // Retrieve pattern for a character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    // Print banner message
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 7;

        for (int i = 0; i < height; i++) {
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        printMessage("OOPS", charMaps);
    }
}