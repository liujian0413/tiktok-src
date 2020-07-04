package kotlin.p1884io;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.io.a */
public final class C47972a {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static long m148915a(InputStream inputStream, OutputStream outputStream, int i) {
        C7573i.m23587b(inputStream, "$this$copyTo");
        C7573i.m23587b(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }
}
