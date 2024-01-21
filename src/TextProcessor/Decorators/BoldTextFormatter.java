package TextProcessor.Decorators;

import TextProcessor.TextProcessor;

public class BoldTextFormatter extends TextProcessorDecorator{

    TextProcessor textProcessor;

    public BoldTextFormatter(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public String format(String text) {
        String formattedText = "\033[1m"+text;
        return textProcessor.format(formattedText);
    }
}
