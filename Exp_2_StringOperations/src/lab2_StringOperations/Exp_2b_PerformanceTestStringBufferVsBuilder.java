package lab2_StringOperations;

public class Exp_2b_PerformanceTestStringBufferVsBuilder {
    public static void main(String[] args) {
        // Number of iterations
        int iterations = 10000;
        String appendText = "AIET";

        // Test StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(appendText);
        }
        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;

        // Test StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(appendText);
        }
        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;

        // Output the results
        System.out.println("Time taken by StringBuffer (ns): " + bufferTime);
        System.out.println("Time taken by StringBuilder (ns): " + builderTime);

        // Conclusion
        if (bufferTime > builderTime) {
            System.out.println("Result: StringBuilder is faster than StringBuffer.");
        } else if (bufferTime < builderTime) {
            System.out.println("Result: StringBuffer is faster than StringBuilder (unexpected).");
        } else {
            System.out.println("Result: Both are equally fast.");
        }
    }
}

