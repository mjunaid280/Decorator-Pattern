import TextProcessor.Decorators.BoldTextFormatter;
import TextProcessor.Decorators.ItalicTextFormatter;
import TextProcessor.Decorators.LowerTextFormatter;
import TextProcessor.Decorators.UpperTextFormatter;
import TextProcessor.TextProcessorImpl;
import TextProcessor.TextProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in).useDelimiter("\\n");;
        System.out.println("Hello and welcome! Please input text to format");
        System.out.println("In the new line please enter a sequence of u,l,i,b for text formatting where u = Uppercase , i = italic, b = bold, l = lowercase");
        String text = scn.next();
        scn.nextLine();
        String formatting = scn.nextLine();
        System.out.println("formatting " + formatting);

        TextProcessor textProcessor = getTextProcessor(formatting);

        if(textProcessor == null) System.out.println("wrong input");

        assert textProcessor != null;
        textProcessor.format(text);
    }

    private static TextProcessor getTextProcessor(String formatting) {
        TextProcessor textProcessor = new TextProcessorImpl();

        for(int i = 0; i< formatting.length(); i++){
            char c = formatting.charAt(i);
            if(c=='l'){
                textProcessor = new LowerTextFormatter(textProcessor);
            }
            else if(c=='u'){
                textProcessor = new UpperTextFormatter(textProcessor);
            }
            else if(c=='i'){
                textProcessor = new ItalicTextFormatter(textProcessor);
            }
            else if(c=='b'){
                textProcessor = new BoldTextFormatter(textProcessor);
            }
            else return null;
        }
        return textProcessor;
    }
}