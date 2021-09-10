package SRP;

public class main {
    public static void main(String[] args) {
        Text_Manipulator text_manipulator = new Text_Manipulator("Ayush Kumar Knolder");
        Text_Printer textPrinter = new Text_Printer(text_manipulator);
        System.out.println(text_manipulator.appendText("SRP_Code_Example"));
        textPrinter.printOutEachWordOfText();
    }
}
