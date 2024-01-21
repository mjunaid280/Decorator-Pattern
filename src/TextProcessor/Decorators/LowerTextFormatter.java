package TextProcessor.Decorators;

import TextProcessor.TextProcessor;

public class LowerTextFormatter extends TextProcessorDecorator{
    TextProcessor textProcessor;

    public LowerTextFormatter(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public String format(String text) {
        String LowerText = text.toLowerCase();
        return textProcessor.format(LowerText);
    }
}
