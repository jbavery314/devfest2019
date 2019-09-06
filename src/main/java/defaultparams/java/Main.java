package defaultparams.java;

public class Main {
    public static void main(String[] args) {
        Paragraph paragraph = new Paragraph();
        System.out.println(paragraph);

        paragraph = new Paragraph(32);
        System.out.println(paragraph);

        paragraph = new Paragraph(32, "Helvetica");
        System.out.println(paragraph);

        paragraph = new Paragraph(12, "Helvetica", Justification.CENTER);
        System.out.println(paragraph);

        paragraph = new Paragraph(12, "Helvetica", Justification.CENTER, "Italic");
        System.out.println(paragraph);

        paragraph = new Paragraph(12, "Helvetica", Justification.CENTER, "Italic", true);
        System.out.println(paragraph);
    }
}
