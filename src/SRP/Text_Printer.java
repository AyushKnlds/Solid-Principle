package SRP;

import java.util.Arrays;

public class Text_Printer {
    Text_Manipulator textmanipulator;

    public Text_Printer(Text_Manipulator textmanipulator ){
        this.textmanipulator = textmanipulator;
    }

    public void printText(){
        System.out.println(textmanipulator.getText());
    }

    public void printOutEachWordOfText(){
        System.out.println(Arrays.toString(textmanipulator.getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex){
        System.out.println(textmanipulator.getText().substring(startingIndex,endIndex));
    }
}
