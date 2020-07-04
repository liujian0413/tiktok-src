package android.support.p022v4.graphics;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;

/* renamed from: android.support.v4.graphics.d */
class C0726d extends C0740f {
    C0726d() {
    }

    /* renamed from: a */
    private static File m3089a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005a, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005b, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x005f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0060, code lost:
        r2 = r6;
        r6 = r4;
        r4 = r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0015] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo2879a(android.content.Context r4, android.os.CancellationSignal r5, android.support.p022v4.p025c.C0658b.C0664b[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            if (r0 > 0) goto L_0x0005
            return r1
        L_0x0005:
            android.support.v4.c.b$b r6 = r3.mo2945a(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.f2559a     // Catch:{ IOException -> 0x0074 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0074 }
            java.io.File r6 = m3089a(r5)     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            if (r6 == 0) goto L_0x002c
            boolean r7 = r6.canRead()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            if (r7 != 0) goto L_0x0022
            goto L_0x002c
        L_0x0022:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            if (r5 == 0) goto L_0x002b
            r5.close()     // Catch:{ IOException -> 0x0074 }
        L_0x002b:
            return r4
        L_0x002c:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            android.graphics.Typeface r4 = android.support.p022v4.graphics.C0740f.m3146a(r4, r6)     // Catch:{ Throwable -> 0x0045, all -> 0x0042 }
            r6.close()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            if (r5 == 0) goto L_0x0041
            r5.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0041:
            return r4
        L_0x0042:
            r4 = move-exception
            r7 = r1
            goto L_0x004b
        L_0x0045:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r7 = move-exception
            r2 = r7
            r7 = r4
            r4 = r2
        L_0x004b:
            if (r7 == 0) goto L_0x0056
            r6.close()     // Catch:{ Throwable -> 0x0051, all -> 0x005a }
            goto L_0x0059
        L_0x0051:
            r6 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r7, r6)     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
            goto L_0x0059
        L_0x0056:
            r6.close()     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
        L_0x0059:
            throw r4     // Catch:{ Throwable -> 0x005d, all -> 0x005a }
        L_0x005a:
            r4 = move-exception
            r6 = r1
            goto L_0x0063
        L_0x005d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005f }
        L_0x005f:
            r6 = move-exception
            r2 = r6
            r6 = r4
            r4 = r2
        L_0x0063:
            if (r5 == 0) goto L_0x0073
            if (r6 == 0) goto L_0x0070
            r5.close()     // Catch:{ Throwable -> 0x006b }
            goto L_0x0073
        L_0x006b:
            r5 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r6, r5)     // Catch:{ IOException -> 0x0074 }
            goto L_0x0073
        L_0x0070:
            r5.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0073:
            throw r4     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.graphics.C0726d.mo2879a(android.content.Context, android.os.CancellationSignal, android.support.v4.c.b$b[], int):android.graphics.Typeface");
    }
}
