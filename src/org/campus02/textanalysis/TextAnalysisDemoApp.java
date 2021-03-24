package org.campus02.textanalysis;

public class TextAnalysisDemoApp {

    public static void main(String[] args) throws IllegalTextAnalysisFormatException {

        ResultManager rm = new ResultManager("D:\\temp\\textanalysis.txt");

        rm.read();

        System.out.println("rm = " + rm);

    }
}
