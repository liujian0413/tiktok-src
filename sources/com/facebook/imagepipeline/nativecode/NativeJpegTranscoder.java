package com.facebook.imagepipeline.nativecode;

import com.facebook.common.internal.C13300b;
import com.facebook.common.internal.C13307g;
import com.facebook.imageformat.C13508b;
import com.facebook.imageformat.C13509c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13763q;
import com.facebook.imagepipeline.p726m.C13788a;
import com.facebook.imagepipeline.p726m.C13789b;
import com.facebook.imagepipeline.p726m.C13791d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NativeJpegTranscoder implements C13789b {
    private int mMaxBitmapSize;
    private boolean mResizingEnabled;
    private boolean mUseDownsamplingRatio;

    static {
        C13835a.m40859a();
    }

    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    public String getIdentifier() {
        return "NativeJpegTranscoder";
    }

    public boolean canTranscode(C13509c cVar) {
        if (cVar == C13508b.f35825a) {
            return true;
        }
        return false;
    }

    public NativeJpegTranscoder(boolean z, int i, boolean z2) {
        this.mResizingEnabled = z;
        this.mMaxBitmapSize = i;
        this.mUseDownsamplingRatio = z2;
    }

    public boolean canResize(C13647e eVar, C13597e eVar2, C13596d dVar) {
        if (eVar2 == null) {
            eVar2 = C13597e.m40009a();
        }
        if (C13791d.m40670a(eVar2, dVar, eVar, this.mResizingEnabled) < 8) {
            return true;
        }
        return false;
    }

    public static void transcodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13307g.m38943a(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13307g.m38943a(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13307g.m38943a(z4);
        C13307g.m38943a(C13791d.m40674a(i));
        if (!(i2 == 8 && i == 0)) {
            z5 = true;
        }
        C13307g.m38944a(z5, (Object) "no transformation requested");
        nativeTranscodeJpeg((InputStream) C13307g.m38940a(inputStream), (OutputStream) C13307g.m38940a(outputStream), i, i2, i3);
    }

    public static void transcodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13307g.m38943a(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13307g.m38943a(z3);
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13307g.m38943a(z4);
        C13307g.m38943a(C13791d.m40676b(i));
        if (!(i2 == 8 && i == 1)) {
            z5 = true;
        }
        C13307g.m38944a(z5, (Object) "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) C13307g.m38940a(inputStream), (OutputStream) C13307g.m38940a(outputStream), i, i2, i3);
    }

    public C13788a transcode(C13647e eVar, OutputStream outputStream, C13597e eVar2, C13596d dVar, C13509c cVar, Integer num) throws IOException {
        InputStream inputStream;
        if (num == null) {
            num = Integer.valueOf(85);
        }
        if (eVar2 == null) {
            eVar2 = C13597e.m40009a();
        }
        int a = C13763q.m40620a(eVar2, dVar, eVar, this.mMaxBitmapSize);
        try {
            int a2 = C13791d.m40670a(eVar2, dVar, eVar, this.mResizingEnabled);
            int c = C13791d.m40677c(a);
            if (this.mUseDownsamplingRatio) {
                a2 = c;
            }
            inputStream = eVar.mo33274c();
            try {
                if (C13791d.f36581a.contains(Integer.valueOf(eVar.mo33278f()))) {
                    transcodeJpegWithExifOrientation(inputStream, outputStream, C13791d.m40675b(eVar2, eVar), a2, num.intValue());
                } else {
                    transcodeJpeg(inputStream, outputStream, C13791d.m40671a(eVar2, eVar), a2, num.intValue());
                }
                C13300b.m38927a(inputStream);
                int i = 1;
                if (a != 1) {
                    i = 0;
                }
                return new C13788a(i);
            } catch (Throwable th) {
                th = th;
                C13300b.m38927a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            C13300b.m38927a(inputStream);
            throw th;
        }
    }
}
