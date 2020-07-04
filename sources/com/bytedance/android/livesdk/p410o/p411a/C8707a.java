package com.bytedance.android.livesdk.p410o.p411a;

import android.content.Context;

/* renamed from: com.bytedance.android.livesdk.o.a.a */
public final class C8707a implements C8710d {
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002f A[SYNTHETIC, Splitter:B:19:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m26022a() {
        /*
            r0 = 44100(0xac44, float:6.1797E-41)
            r1 = 3
            r2 = 2
            r3 = 0
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r1, r2)     // Catch:{ Exception -> 0x002c }
            android.media.AudioRecord r1 = new android.media.AudioRecord     // Catch:{ Exception -> 0x002c }
            r5 = 1
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 3
            r8 = 2
            r4 = r1
            r9 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x002c }
            r1.startRecording()     // Catch:{ Exception -> 0x002d }
            if (r0 <= 0) goto L_0x0026
            byte[] r2 = new byte[r0]
            int r0 = r1.read(r2, r3, r0)
            r1.release()     // Catch:{ Exception -> 0x0027 }
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 <= 0) goto L_0x002b
            r0 = 1
            return r0
        L_0x002b:
            return r3
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.release()     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p410o.p411a.C8707a.m26022a():boolean");
    }

    /* renamed from: a */
    public final boolean mo21711a(Context context, String str) {
        return m26022a();
    }
}
