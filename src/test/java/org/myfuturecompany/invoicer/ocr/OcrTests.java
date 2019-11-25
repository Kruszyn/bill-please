package org.myfuturecompany.invoicer.ocr;

import org.junit.jupiter.api.Test;

public class OcrTests {


    @Test
    public void testOCR(){
        TessaractOcr ocr = new TessaractOcr();
        ocr.ocr();
    }
}
