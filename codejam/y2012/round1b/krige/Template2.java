package codejam.y2012.round1b.krige;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Template2 {

    private static final String INPUT_FILE_NAME = "B-sample.in";
    private static final String OUTPUT_FILE_NAME = "B-sample-template.out";

    private static final String ROOT_DIR = "dat";
    private static final String YEAR = "2012";
    private static final String ROUND = "round1b";

    private static final String PATH = ROOT_DIR + File.separator + YEAR
            + File.separator + ROUND + File.separator;

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new BufferedInputStream(
                new FileInputStream(PATH + INPUT_FILE_NAME)));
        PrintWriter output = new PrintWriter(new FileWriter(PATH
                + OUTPUT_FILE_NAME));

        int numTestCases = input.nextInt();
        for (int i = 1; i <= numTestCases; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            double[] p = new double[a];
            for (int j = 0; j < p.length; j++) {
                p[j] = input.nextDouble();
            }

            String outputLine = "Case #" + i + ": " + solve(b, p);

            System.out.println(outputLine);
            output.println(outputLine);
        }
        input.close();
        output.close();
    }

    private static String solve(int b, double[] p) {
        System.out.println(p.length + " " + b);
        for (double d : p) {
            System.out.print(d + " ");
        }
        System.out.println();
        return null;
    }
}
