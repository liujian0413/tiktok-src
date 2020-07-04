package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker;

import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import java.io.File;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.am */
public final class C39561am {
    /* renamed from: a */
    public static final String m126375a() {
        StringBuilder sb = new StringBuilder();
        File file = EffectPlatform.f72450b;
        C7573i.m23582a((Object) file, "EffectPlatform.LOCAL_PIN_CACHEDIR");
        sb.append(file.getAbsolutePath());
        sb.append(File.separator);
        sb.append(System.currentTimeMillis());
        sb.append("-pin.json");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
        if (r1 == null) goto L_0x002c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x000b] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.nio.ByteBuffer m126376a(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x0027, all -> 0x0020 }
            java.lang.String r2 = "r"
            r1.<init>(r4, r2)     // Catch:{ Exception -> 0x0027, all -> 0x0020 }
            long r2 = r1.length()     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            int r4 = (int) r2     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x001e, all -> 0x001b }
            r1.readFully(r4)     // Catch:{ Exception -> 0x0019, all -> 0x001b }
        L_0x0015:
            r1.close()
            goto L_0x002c
        L_0x0019:
            goto L_0x0029
        L_0x001b:
            r4 = move-exception
            r0 = r1
            goto L_0x0021
        L_0x001e:
            r4 = r0
            goto L_0x0029
        L_0x0020:
            r4 = move-exception
        L_0x0021:
            if (r0 == 0) goto L_0x0026
            r0.close()
        L_0x0026:
            throw r4
        L_0x0027:
            r4 = r0
            r1 = r4
        L_0x0029:
            if (r1 == 0) goto L_0x002c
            goto L_0x0015
        L_0x002c:
            if (r4 == 0) goto L_0x0030
            int r0 = r4.length
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r0.put(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39561am.m126376a(java.lang.String):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0027 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m126377a(java.lang.String r2, java.nio.ByteBuffer r3) {
        /*
            if (r2 == 0) goto L_0x0028
            if (r3 != 0) goto L_0x0005
            goto L_0x0028
        L_0x0005:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0020, all -> 0x0019 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0020, all -> 0x0019 }
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch:{ Exception -> 0x0020, all -> 0x0019 }
            r2.write(r3)     // Catch:{ Exception -> 0x0021, all -> 0x0016 }
            if (r2 == 0) goto L_0x0015
            goto L_0x0023
        L_0x0015:
            return
        L_0x0016:
            r3 = move-exception
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r3 = move-exception
        L_0x001a:
            if (r0 == 0) goto L_0x001f
            r0.close()
        L_0x001f:
            throw r3
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r2 == 0) goto L_0x0027
        L_0x0023:
            r2.close()
            return
        L_0x0027:
            return
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39561am.m126377a(java.lang.String, java.nio.ByteBuffer):void");
    }
}
