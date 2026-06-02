package String;

public class countVowel {
    public static String Vowelcount(String str) {
        // StringBuilder sb = new StringBuilder(str);
        StringBuilder name = new StringBuilder("");
        // int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' ||
                    ch == 'i' || ch == 'o' ||
                    ch == 'u' || ch=='A'||
                ch=='E' || ch=='I'||
            ch=='O'|| ch=='U') {
                name.append(ch);

                // count++;

            }

        }
        // System.out.println(name.reverse());
        // System.out.println(count);
        return  name.reverse().toString();

    }

    public static void main(String[] args) {
        String str = "AjaysnxxhusmzIOaABfU";
       System.out.println( Vowelcount(str));
    }
}
