import java.util.*;

class StringsAll {

    public static void main(String[] args) {

        String str = "hello world";

        // 1. Alternate characters
        System.out.print("Alternate: ");
        for (int i = 0; i < str.length(); i += 2)
            System.out.print(str.charAt(i) + " ");
        System.out.println();

        // 2. Vowels & Consonants
        int v = 0, c = 0;
        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) v++;
            else if (Character.isLetter(ch)) c++;
        }
        System.out.println("Vowels: " + v + " Consonants: " + c);

        // 3. Remove vowels
        String noVowel = "";
        for (char ch : str.toCharArray())
            if ("aeiouAEIOU".indexOf(ch) == -1) noVowel += ch;
        System.out.println("No Vowels: " + noVowel);

        // 4. Remove consecutive vowels
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && "aeiou".indexOf(str.charAt(i)) != -1
                    && str.charAt(i) == str.charAt(i - 1)) continue;
            res += str.charAt(i);
        }
        System.out.println("No consecutive vowels: " + res);

        // 5. Reverse string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        System.out.println("Reverse: " + rev);

        // 6. Split into 3 chars
        System.out.println("Chunks:");
        for (int i = 0; i < str.length(); i += 3) {
            int end = Math.min(i + 3, str.length());
            System.out.println(str.substring(i, end));
        }

        // 7. Palindrome
        String p = "madam";
        String r = "";
        for (int i = p.length() - 1; i >= 0; i--) r += p.charAt(i);
        System.out.println("Palindrome: " + p.equals(r));

        // 8. Anagram
        String a = "listen", b = "silent";
        char[] c1 = a.toCharArray(), c2 = b.toCharArray();
        Arrays.sort(c1); Arrays.sort(c2);
        System.out.println("Anagram: " + Arrays.equals(c1, c2));

        // 9. First palindrome substring
        String s = "ababa";
        outer:
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                String rr = new StringBuilder(sub).reverse().toString();
                if (sub.equals(rr)) {
                    System.out.println("First Palindrome Substring: " + sub);
                    break outer;
                }
            }
        }

        // 10. Character frequency
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray())
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        System.out.println("Char Frequency: " + map);

        // 11. Substring frequency
        String sub = "lo";
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++)
            if (str.substring(i, i + sub.length()).equals(sub)) count++;
        System.out.println("Substring count: " + count);

        // 12. Word exists
        System.out.println("Contains 'world': " + str.contains("world"));

        // 13. Reverse each word
        System.out.print("Reverse words: ");
        for (String w : str.split(" ")) {
            String rw = "";
            for (int i = w.length() - 1; i >= 0; i--) rw += w.charAt(i);
            System.out.print(rw + " ");
        }
        System.out.println();

        // 14. Prepend 0s
        int num = 45;
        System.out.println("Padded: " + String.format("%05d", num));

        // 15. Add + pad
        int x = 5, y = 7;
        System.out.println("Sum padded: " + String.format("%04d", x + y));

        // 16. Kth frequent substring → concept

        // 17. Top words → file concept

        // 18. Group anagrams
        String[] words = {"eat","tea","tan","ate"};
        Map<String, List<String>> m = new HashMap<>();
        for (String word : words) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            m.putIfAbsent(key, new ArrayList<>());
            m.get(key).add(word);
        }
        System.out.println("Grouped Anagrams: " + m.values());

        // 19. Regex-like (*)
        String city = "Bombay";
        System.out.println("Match: " + city.substring(city.indexOf("om")));

        // 20. Substring + remainder
        String s1 = "hello", s2 = "ell";
        if (s1.contains(s2))
            System.out.println("Result: " + s2 + " " + s1.replace(s2, ""));

        
    }
}
