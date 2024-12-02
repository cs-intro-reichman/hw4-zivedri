public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        for (int i = 0; i < str.length();i++) {
            if ((str.charAt(i) >= 65) && (str.charAt(i) <= 90)) {
                char c = str.charAt(i);
                c = (char) (c + 32);
                if (i == 0) {
                    str = str.substring(i+1);
                    str = c + str;
                }
                else if (i == str.length() - 1) { // if the character is the last in the string.
                    str = str.substring(0, i);
                    str = str + c;
                }
                else {
                    String temp = str.substring(0,i); // removing the character that selected.
                    temp = temp + c;
                    str = temp + str.substring(i+1 );
                }
            }
        }
        return str;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1.length() < str2.length()){
            return false;
        }
        if (str2.length() == 0) {
            return true;
        }
        int i = 0;
        while (i < str1.length() && str1.charAt(i) != str2.charAt(0) ) {
            i++;
        }
        if (i == str1.length()) {
            return false;
        }
        str1 = str1.substring(i);
        for (int j = 0;j< str2.length();j++) {
            if (j >= str1.length()) {
                return false;
            }
            if (str2.charAt(j) != str1.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
