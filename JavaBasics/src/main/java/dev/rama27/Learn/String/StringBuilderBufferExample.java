package dev.rama27.Learn.String;

public class StringBuilderBufferExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(7, 12, "Java");
        System.out.println(sb); // Hello, Java

        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        sbuf.reverse();
        System.out.println(sbuf); // dlroW olleH

        long startTime = System.nanoTime();

        String result = "";
        for (int i = 0; i < 10000; i++) {
            result += "a";
        }

        System.out.println("String time: " + (System.nanoTime() - startTime) + " ns");

        System.out.println("String time: " + (System.nanoTime() - startTime)/1_000_000_000.0_0 + " s");
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