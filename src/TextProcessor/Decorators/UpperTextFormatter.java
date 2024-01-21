package TextProcessor.Decorators;

import TextProcessor.TextProcessor;

public class UpperTextFormatter extends TextProcessorDecorator{

    TextProcessor textProcessor;

    public UpperTextFormatter(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public String format(String text) {
        String upperText = text.toUpperCase();
        return textProcessor.format(upperText);
    }
}
