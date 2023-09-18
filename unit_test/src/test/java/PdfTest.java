package test.java;/*
import org.junit.jupiter.api.Test;
import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.util.PDFTextStripper;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PdfTest {

    @Test
    public void canReadFile() throws IOException {
        String expectedText = "YOUR QUEUE № IS" + "\n" +
                "42" +
                "THANK YOU!";
        File file = new File("");
        PDDocument document = PDDocument.load(file);
        PDFTextStripper stripper = new PDFTextStripper();
        String text = stripper.getText(document);
        document.close();

        assertEquals(expectedText, text);
    }


}*/
