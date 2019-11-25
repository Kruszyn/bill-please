package org.myfuturecompany.invoicer.dataextraction;

import java.io.File;

public interface DataExtractor {
    void extractFromHocr(File hocrFile);
}
