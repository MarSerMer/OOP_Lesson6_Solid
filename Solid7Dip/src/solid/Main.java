package solid;

import solid.dip.DisplayReport;
import solid.dip.Output;
import solid.dip.PrintReport;
import solid.dip.Report;

public class Main {
    public static void main(String[] args) {
        Output disRep = new DisplayReport();
        Output prRep = new PrintReport();
        Report report = new Report();
        report.calculate();
        //report.output(new PrintReport());
        report.output(prRep);
        //report.output(new DisplayReport());
        report.output(disRep);
    }
}
