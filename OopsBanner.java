import java.util.HashMap;

public class OopsBanner {

    // 1. Create and return character map
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();

        // ASCII patterns (height = 5)

        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        charMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return charMap;
    }

    // 2. Display banner using the map
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        // Loop through each row
        for (int line = 0; line < patternHeight; line++) {
            StringBuilder sb = new StringBuilder();

            // Loop through each character in message
            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(Character.toUpperCase(ch));

                if (pattern != null) {
                    sb.append(pattern[line]).append(" ");
                } else {
                    sb.append("     "); // space for unsupported characters
                }
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {
        HashMap<Character, String[]> charMap = createCharacterMap();
        displayBanner("OOPS", charMap);
    }
}