public class ReverseCharSequence implements CharSequence {

    private String data;

    // Constructor
    public ReverseCharSequence(String data) {
        this.data = data;
    }

    // (i) length()
    @Override
    public int length() {
        return data.length();
    }

    // (ii) charAt()
    @Override
    public char charAt(int index) {
        // reverse indexing
        return data.charAt(data.length() - 1 - index);
    }

    // (iii) subSequence()
    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < end; i++) {
            sb.append(charAt(i));
        }
        return sb.toString();
    }

    // (iv) toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(data);
        return sb.reverse().toString();
    }

    // Test main method
    public static void main(String[] args) {

        ReverseCharSequence rcs =
                new ReverseCharSequence("Java Programming");

        System.out.println("Original String: Java Programming");
        System.out.println("Reversed String: " + rcs.toString());

        System.out.println("Length: " + rcs.length());
        System.out.println("charAt(0): " + rcs.charAt(0));
        System.out.println("subSequence(0, 4): " + rcs.subSequence(0, 4));
    }
}
