package TextProcessor;

public class TextProcessorImpl implements TextProcessor{
    @Override
    public String format(String text) {
        System.out.println(text);
        return text;
    }
}
