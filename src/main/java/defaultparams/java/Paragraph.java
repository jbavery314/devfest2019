package defaultparams.java;

public class Paragraph {
    private int fontSize;
    private String font;
    private Justification justification;
    private String fontWeight;
    private boolean strikeThrough;

    Paragraph() {
        this(12);
    }

    Paragraph(int fontSize) {
        this(fontSize, "Verdana");
    }

    Paragraph(int fontSize, String font) {
        this(fontSize, font, Justification.LEFT);
    }

    Paragraph(int fontSize, String font, Justification justification) {
        this(fontSize, font, justification, "Bold");
    }

    Paragraph (int fontSize, String font, Justification justification, String fontWeight) {
        this(fontSize, font, justification, fontWeight, false);
    }

    Paragraph( int fontSize, String font, Justification justification, String fontWeight, boolean strikeThrough) {
        this.fontSize = fontSize;
        this.font = font;
        this.justification = justification;
        this.fontWeight = fontWeight;
        this.strikeThrough = strikeThrough;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "fontSize=" + fontSize +
                ", font='" + font + '\'' +
                ", justification=" + justification +
                ", fontWeight='" + fontWeight + '\'' +
                ", strikeThrough=" + strikeThrough +
                '}';
    }
}
