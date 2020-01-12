package org.myfuturecompany.invoicer.ocr;


import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;
import java.util.Collections;

public class TessaractOcr implements OcrOperations{

    @Override
    public void ocrFile(File fileToOcr) {
        Tesseract tesseract = new Tesseract();
        try {

            tesseract.setDatapath("C://Users//HP//Desktop//tessdata-master");
            tesseract.setLanguage("deu");
            //tesseract.setTessVariable("tessedit_create_hocr", "1");
            // the path of your tess data folder
            // inside the extracted file
            String text
                    = tesseract.doOCR(new File("ReceiptSwiss.jpg"));
            // path of your image file
            System.out.print(text);
        }
        catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}
