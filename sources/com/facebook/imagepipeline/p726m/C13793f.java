package com.facebook.imagepipeline.p726m;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import com.facebook.common.p686c.C13286a;
import com.facebook.imageformat.C13508b;
import com.facebook.imageformat.C13509c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.common.C13597e;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13763q;
import java.io.OutputStream;

/* renamed from: com.facebook.imagepipeline.m.f */
public final class C13793f implements C13789b {

    /* renamed from: a */
    private final boolean f36586a;

    /* renamed from: b */
    private final int f36587b;

    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    public final boolean canTranscode(C13509c cVar) {
        if (cVar == C13508b.f35835k || cVar == C13508b.f35825a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static CompressFormat m40685a(C13509c cVar) {
        if (cVar == null) {
            return CompressFormat.JPEG;
        }
        if (cVar == C13508b.f35825a) {
            return CompressFormat.JPEG;
        }
        if (cVar == C13508b.f35826b) {
            return CompressFormat.PNG;
        }
        if (VERSION.SDK_INT < 14 || !C13508b.m39752b(cVar)) {
            return CompressFormat.JPEG;
        }
        return CompressFormat.WEBP;
    }

    public C13793f(boolean z, int i) {
        this.f36586a = z;
        this.f36587b = i;
    }

    /* renamed from: a */
    private int m40684a(C13647e eVar, C13597e eVar2, C13596d dVar) {
        if (!this.f36586a) {
            return 1;
        }
        return C13763q.m40620a(eVar2, dVar, eVar, this.f36587b);
    }

    public final boolean canResize(C13647e eVar, C13597e eVar2, C13596d dVar) {
        if (eVar2 == null) {
            eVar2 = C13597e.m40009a();
        }
        if (!this.f36586a || C13763q.m40620a(eVar2, dVar, eVar, this.f36587b) <= 1) {
            return false;
        }
        return true;
    }

    public final C13788a transcode(C13647e eVar, OutputStream outputStream, C13597e eVar2, C13596d dVar, C13509c cVar, Integer num) {
        Integer num2;
        C13597e eVar3;
        C13596d dVar2;
        C13793f fVar;
        Bitmap bitmap;
        C13647e eVar4 = eVar;
        if (num == null) {
            num2 = Integer.valueOf(85);
        } else {
            num2 = num;
        }
        if (eVar2 == null) {
            dVar2 = dVar;
            eVar3 = C13597e.m40009a();
            fVar = this;
        } else {
            fVar = this;
            eVar3 = eVar2;
            dVar2 = dVar;
        }
        int a = fVar.m40684a(eVar4, eVar3, dVar2);
        Options options = new Options();
        options.inSampleSize = a;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(eVar.mo33274c(), null, options);
            if (decodeStream == null) {
                C13286a.m38863d("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                return new C13788a(2);
            }
            Matrix a2 = C13791d.m40673a(eVar4, eVar3);
            if (a2 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), a2, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap = decodeStream;
                    try {
                        C13286a.m38861c("SimpleImageTranscoder", "Out-Of-Memory during transcode", (Throwable) e);
                        C13788a aVar = new C13788a(2);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return aVar;
                    } catch (Throwable th) {
                        th = th;
                        bitmap.recycle();
                        decodeStream.recycle();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                bitmap.compress(m40685a(cVar), num2.intValue(), outputStream);
                int i = 1;
                if (a > 1) {
                    i = 0;
                }
                C13788a aVar2 = new C13788a(i);
                bitmap.recycle();
                decodeStream.recycle();
                return aVar2;
            } catch (OutOfMemoryError e2) {
                e = e2;
                C13286a.m38861c("SimpleImageTranscoder", "Out-Of-Memory during transcode", (Throwable) e);
                C13788a aVar3 = new C13788a(2);
                bitmap.recycle();
                decodeStream.recycle();
                return aVar3;
            }
        } catch (OutOfMemoryError e3) {
            C13286a.m38861c("SimpleImageTranscoder", "Out-Of-Memory during transcode", (Throwable) e3);
            return new C13788a(2);
        }
    }
}
