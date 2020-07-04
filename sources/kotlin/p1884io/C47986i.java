package kotlin.p1884io;

import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.io.i */
public class C47986i extends C47985h {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        kotlin.p1884io.C47973b.m148917a(r1, r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m148932a(java.io.File r1, java.nio.charset.Charset r2) {
        /*
            java.lang.String r0 = "$this$readText"
            kotlin.jvm.internal.C7573i.m23587b(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.InputStream r0 = (java.io.InputStream) r0
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r0, r2)
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 0
            r0 = r1
            java.io.InputStreamReader r0 = (java.io.InputStreamReader) r0     // Catch:{ Throwable -> 0x0028 }
            java.io.Reader r0 = (java.io.Reader) r0     // Catch:{ Throwable -> 0x0028 }
            java.lang.String r0 = kotlin.p1884io.C47991m.m148954b(r0)     // Catch:{ Throwable -> 0x0028 }
            kotlin.p1884io.C47973b.m148917a(r1, r2)
            return r0
        L_0x0026:
            r0 = move-exception
            goto L_0x002a
        L_0x0028:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0026 }
        L_0x002a:
            kotlin.p1884io.C47973b.m148917a(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p1884io.C47986i.m148932a(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        kotlin.p1884io.C47973b.m148917a(r0, r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m148936a(java.io.File r2, byte[] r3) {
        /*
            java.lang.String r0 = "$this$writeBytes"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = 0
            r1 = r0
            java.io.FileOutputStream r1 = (java.io.FileOutputStream) r1     // Catch:{ Throwable -> 0x001e }
            r1.write(r3)     // Catch:{ Throwable -> 0x001e }
            kotlin.p1884io.C47973b.m148917a(r0, r2)
            return
        L_0x001c:
            r3 = move-exception
            goto L_0x0020
        L_0x001e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001c }
        L_0x0020:
            kotlin.p1884io.C47973b.m148917a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p1884io.C47986i.m148936a(java.io.File, byte[]):void");
    }

    /* renamed from: a */
    public static final void m148934a(File file, String str, Charset charset) {
        C7573i.m23587b(file, "$this$writeText");
        C7573i.m23587b(str, "text");
        C7573i.m23587b(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        C47984g.m148936a(file, bytes);
    }
}
