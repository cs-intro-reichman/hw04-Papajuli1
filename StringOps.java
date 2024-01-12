public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("Hello World"));
        System.out.println(capVowelsLowRest("One two tHRee world"));
        System.out.println(capVowelsLowRest("vowels are fun"));
        System.out.println(capVowelsLowRest("intro"));
        System.out.println(capVowelsLowRest("yellow"));
        System.out.println();
        // System.out.println(firstToLower("YEllow"));
        // System.out.println(firstToUpper("HELLO world"));
        // System.out.println();
        // System.out.println(camelCase("Hello World"));
        // System.out.println(camelCase("HELLO world"));
        // System.out.println(camelCase(" tWo wordS"));
        // System.out.println(camelCase("world"));
        // System.out.println(camelCase(" Intro to coMPUter sCIEncE"));
        System.out.println(allIndexOf("Hello world", 'l'));
        System.out.println(allIndexOf("Hello worLd", 'l'));
        System.out.println(allIndexOf("Hello world", 'o'));
        System.out.println(allIndexOf("Hello world", ' '));
        System.out.println(allIndexOf("Hello world", 'd'));
        System.out.println(allIndexOf("MMMM", 'M'));
    }

    public static String capVowelsLowRest(String string) {
        String str = "";
        String vowels = "aeiou";
        String Vowels = "AEIOU";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                if (Vowels.indexOf(string.charAt(i)) != -1)
                    str += string.charAt(i);
                else
                    str += (char) (string.charAt(i) + 32);
            } else if (vowels.indexOf(string.charAt(i)) != -1)
                str += (char) (string.charAt(i) - 32);
            else
                str += string.charAt(i);
        }
        return str;
    }

    public static String firstToLower(String string) {
        String str = "";
        int p = 0;
        int count = 0;
        while (string.charAt(p) == 32) {
            count++;
            p++;
        }
        for (int i = count; i < string.length(); i++) {
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
                str += (char) (string.charAt(i) + 32);
            else
                str += string.charAt(i);
        }
        return str;
    }

    public static String firstToUpper(String string) {
        String str = "";
        str += string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i - 1) == ' ') {
                if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
                    str += (char) (string.charAt(i) - 32);
                else
                    str += string.charAt(i);
            } else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z')
                str += (char) (string.charAt(i) + 32);
            else
                str += string.charAt(i);
        }
        return str;
    }

    public static String deleteSPaces(String string) {
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != 32)
                str += string.charAt(i);
        }
        return str;
    }

    public static String camelCase(String string) {
        string = firstToLower(string);
        string = firstToUpper(string);
        string = deleteSPaces(string);
        return string;
    }

    public static int[] allIndexOf(String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr)
                count++;
        }
        int[] array = new int[count];
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }
}
