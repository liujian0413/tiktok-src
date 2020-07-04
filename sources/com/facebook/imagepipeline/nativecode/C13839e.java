package com.facebook.imagepipeline.nativecode;

import com.facebook.imageformat.C13509c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.imagepipeline.nativecode.e */
public interface C13839e {
    boolean isWebpNativelySupported(C13509c cVar);

    void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;
}
