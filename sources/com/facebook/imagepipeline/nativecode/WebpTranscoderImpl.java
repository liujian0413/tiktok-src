package com.facebook.imagepipeline.nativecode;

import android.os.Build.VERSION;
import com.facebook.common.internal.C13307g;
import com.facebook.common.p689f.C13296c;
import com.facebook.imageformat.C13508b;
import com.facebook.imageformat.C13509c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WebpTranscoderImpl implements C13839e {
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;

    public boolean isWebpNativelySupported(C13509c cVar) {
        if (cVar == C13508b.f35830f) {
            if (VERSION.SDK_INT >= 14) {
                return true;
            }
            return false;
        } else if (cVar == C13508b.f35831g || cVar == C13508b.f35832h || cVar == C13508b.f35833i) {
            return C13296c.f35196c;
        } else {
            if (cVar == C13508b.f35834j) {
                return false;
            }
            throw new IllegalArgumentException("Image format is not a WebP.");
        }
    }

    public void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException {
        C13838d.m40862a();
        nativeTranscodeWebpToPng((InputStream) C13307g.m38940a(inputStream), (OutputStream) C13307g.m38940a(outputStream));
    }

    public void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        C13838d.m40862a();
        nativeTranscodeWebpToJpeg((InputStream) C13307g.m38940a(inputStream), (OutputStream) C13307g.m38940a(outputStream), i);
    }
}
