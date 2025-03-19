package dev.rama27;

public class StringBuilderBufferExample {
    public static void main(String[] args) {
        // StringBuilder example (faster, not thread-safe)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(7, 12, "Java");
        System.out.println(sb); // Hello, Java

        // StringBuffer example (thread-safe)
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        sbuf.reverse();
        System.out.println(sbuf); // dlroW olleH

        // Performance comparison
        long startTime = System.nanoTime();

        // String concatenation (very inefficient)
        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += "a";
        }

        System.out.println("String time: " + (System.nanoTime() - startTime) + " ns");

        System.out.println("String time: " + (System.nanoTime() - startTime)/1_000_000_000.0_0 + " s");
        // StringBuilder (much more efficient)
        startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            builder.append("a");
        }
        String builderResult = builder.toString();

        System.out.println("StringBuilder time: " + (System.nanoTime() - startTime) + " ns");
        System.out.println("String time: " + (System.nanoTime() - startTime)/1_000_000_000.0_0 + " s");
    }
}