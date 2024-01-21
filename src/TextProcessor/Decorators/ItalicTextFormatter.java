package TextProcessor.Decorators;

import TextProcessor.TextProcessor;

public class ItalicTextFormatter extends TextProcessorDecorator{

    TextProcessor textProcessor;

    public ItalicTextFormatter(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }

    @Override
    public String format(String text) {
        String formattedText = "\033[3m" + text;
        return textProcessor.format(formattedText);
    }
}
