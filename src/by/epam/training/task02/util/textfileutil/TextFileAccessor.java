package by.epam.training.task02.util.textfileutil;

import java.io.*;

/**
 * Created by higgs on 01.04.15.
 */
public final class TextFileAccessor {

    private TextFileAccessor() {
    }

    public static String readFromFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(
                    new File(fileName).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void writeToFile(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
