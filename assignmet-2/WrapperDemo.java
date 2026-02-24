public class WrapperDemo {
    public static void main(String[] args) {

        /* 1. Primitive → Wrapper (Autoboxing) */
        int a = 10;
        Integer obj1 = a;   // autoboxing
        System.out.println("Primitive to Wrapper: " + obj1);

        /* 2. Wrapper → Primitive (Unboxing) */
        int b = obj1;      // unboxing
        System.out.println("Wrapper to Primitive: " + b);

        /* 3. Primitive → String */
        String s1 = String.valueOf(a);
        System.out.println("Primitive to String: " + s1);

        /* 4. String → Primitive */
        int c = Integer.parseInt(s1);
        System.out.println("String to Primitive: " + c);

        /* 5. Wrapper → String */
        String s2 = obj1.toString();
        System.out.println("Wrapper to String: " + s2);

        /* 6. String → Wrapper */
        Integer obj2 = Integer.valueOf(s2);
        System.out.println("String to Wrapper: " + obj2);
    }
}
