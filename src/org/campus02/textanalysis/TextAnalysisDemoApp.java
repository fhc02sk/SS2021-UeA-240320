package org.campus02.textanalysis;

public class TextAnalysisDemoApp {

    public static void main(String[] args) throws IllegalTextAnalysisFormatException {

        ResultManager rm = new ResultManager("D:\\temp\\textanalysis.txt");

        rm.read();

        System.out.println("rm = " + rm);

        rm.getCharacters().put('k', 42);
        rm.getCharacters().put('m', 9);
        rm.getCharacters().put('W', 7);
        rm.getCharacters().put('d', 71);

        rm.write();

/*        Character x1 = 'A';
        Character x2 = 'A';

        System.out.println("x1.hashCode() = " + x1.hashCode());
        System.out.println("x2.hashCode() = " + x2.hashCode());*/

    }
}
