/*
Write a class that implements the CharSequence interface found in the java.lang package. So, it
would contain the following methods.
(i) char charAt(int index)
(ii) int length()
(iii)CharSequence subSequence(int start, int end)
(iv)Override toString()
Your implementation should return the string backwards. Select one of the sentences from the
lecture slide to use as the data. Write a small main method to test your class; make sure to call all
four methods.
*/


class ReverseCharSequence implements CharSequence {

    private String data;

    // Constructor
    public ReverseCharSequence(String data) {
        this.data = data;
    }

    // i) charAt(int index)
    @Override
    public char charAt(int index) {
        return data.charAt(data.length() - 1 - index);
    }

    // ii) length()
    @Override
    public int length() {
        return data.length();
    }

    // iii) subSequence(int start, int end)
    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < end; i++) {
            sb.append(charAt(i));
        }
        return sb.toString();
    }

    // iv) toString()
    @Override
    public String toString() {
        return new StringBuilder(data).reverse().toString();
    }

    // Main method to test all methods
    public static void main(String[] args) {

        // Sentence from lecture-style content
        ReverseCharSequence rcs =
                new ReverseCharSequence("Object Oriented Programming");

        System.out.println("Original String: Object Oriented Programming");
        System.out.println("Reversed String (toString): " + rcs.toString());

        System.out.println("Length: " + rcs.length());

        System.out.println("charAt(0): " + rcs.charAt(0));
        System.out.println("charAt(5): " + rcs.charAt(5));

        System.out.println("subSequence(0, 6): " + rcs.subSequence(0, 6));
    }
}