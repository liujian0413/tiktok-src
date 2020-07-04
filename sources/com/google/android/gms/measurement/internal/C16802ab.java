package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15267r;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.ab */
final class C16802ab implements Runnable {

    /* renamed from: a */
    private final URL f46903a;

    /* renamed from: b */
    private final byte[] f46904b;

    /* renamed from: c */
    private final C16960y f46905c;

    /* renamed from: d */
    private final String f46906d;

    /* renamed from: e */
    private final Map<String, String> f46907e;

    /* renamed from: f */
    private final /* synthetic */ C16957v f46908f;

    public C16802ab(C16957v vVar, String str, URL url, byte[] bArr, Map<String, String> map, C16960y yVar) {
        this.f46908f = vVar;
        C15267r.m44386a(str);
        C15267r.m44384a(url);
        C15267r.m44384a(yVar);
        this.f46903a = url;
        this.f46904b = bArr;
        this.f46905c = yVar;
        this.f46906d = str;
        this.f46907e = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2 A[SYNTHETIC, Splitter:B:44:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fd A[SYNTHETIC, Splitter:B:57:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            com.google.android.gms.measurement.internal.v r0 = r12.f46908f
            r0.mo43569b()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.v r2 = r12.f46908f     // Catch:{ IOException -> 0x00f6, all -> 0x00bc }
            java.net.URL r3 = r12.f46903a     // Catch:{ IOException -> 0x00f6, all -> 0x00bc }
            java.net.HttpURLConnection r2 = r2.mo44164a(r3)     // Catch:{ IOException -> 0x00f6, all -> 0x00bc }
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.f46907e     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r12.f46907e     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            com.google.android.gms.measurement.internal.C16803ac.m55393a(r2, r5, r4)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            goto L_0x001d
        L_0x0039:
            byte[] r3 = r12.f46904b     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            if (r3 == 0) goto L_0x0082
            com.google.android.gms.measurement.internal.v r3 = r12.f46908f     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            com.google.android.gms.measurement.internal.ej r3 = r3.mo43639f()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            byte[] r4 = r12.f46904b     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            byte[] r3 = r3.mo43890b(r4)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            com.google.android.gms.measurement.internal.v r4 = r12.f46908f     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            com.google.android.gms.measurement.internal.r r4 = r4.mo43585q()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            com.google.android.gms.measurement.internal.t r4 = r4.f47495i     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r5 = "Uploading data. size"
            int r6 = r3.length     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4.mo44161a(r5, r6)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4 = 1
            r2.setDoOutput(r4)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r5 = "gzip"
            com.google.android.gms.measurement.internal.C16803ac.m55393a(r2, r4, r5)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            int r4 = r3.length     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r2.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r2.connect()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            r4.write(r3)     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            r4.close()     // Catch:{ IOException -> 0x007c, all -> 0x0078 }
            goto L_0x0082
        L_0x0078:
            r3 = move-exception
            r10 = r0
            r0 = r4
            goto L_0x00bf
        L_0x007c:
            r3 = move-exception
            r10 = r0
            r8 = r3
            r0 = r4
            goto L_0x00fa
        L_0x0082:
            int r7 = r2.getResponseCode()     // Catch:{ IOException -> 0x00b9, all -> 0x00b6 }
            java.util.Map r10 = r2.getHeaderFields()     // Catch:{ IOException -> 0x00b2, all -> 0x00af }
            com.google.android.gms.measurement.internal.v r1 = r12.f46908f     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            byte[] r9 = com.google.android.gms.measurement.internal.C16957v.m56368a(r2)     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            if (r2 == 0) goto L_0x0095
            r2.disconnect()
        L_0x0095:
            com.google.android.gms.measurement.internal.v r0 = r12.f46908f
            com.google.android.gms.measurement.internal.at r0 = r0.mo43584p()
            com.google.android.gms.measurement.internal.z r1 = new com.google.android.gms.measurement.internal.z
            java.lang.String r5 = r12.f46906d
            com.google.android.gms.measurement.internal.y r6 = r12.f46905c
            r8 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo43645a(r1)
            return
        L_0x00ab:
            r3 = move-exception
            goto L_0x00c0
        L_0x00ad:
            r3 = move-exception
            goto L_0x00b4
        L_0x00af:
            r3 = move-exception
            r10 = r0
            goto L_0x00c0
        L_0x00b2:
            r3 = move-exception
            r10 = r0
        L_0x00b4:
            r8 = r3
            goto L_0x00fb
        L_0x00b6:
            r3 = move-exception
            r10 = r0
            goto L_0x00bf
        L_0x00b9:
            r3 = move-exception
            r10 = r0
            goto L_0x00f9
        L_0x00bc:
            r3 = move-exception
            r2 = r0
            r10 = r2
        L_0x00bf:
            r7 = 0
        L_0x00c0:
            if (r0 == 0) goto L_0x00da
            r0.close()     // Catch:{ IOException -> 0x00c6 }
            goto L_0x00da
        L_0x00c6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.v r1 = r12.f46908f
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a
            java.lang.String r4 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r5 = r12.f46906d
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C16953r.m56340a(r5)
            r1.mo44162a(r4, r5, r0)
        L_0x00da:
            if (r2 == 0) goto L_0x00df
            r2.disconnect()
        L_0x00df:
            com.google.android.gms.measurement.internal.v r0 = r12.f46908f
            com.google.android.gms.measurement.internal.at r0 = r0.mo43584p()
            com.google.android.gms.measurement.internal.z r1 = new com.google.android.gms.measurement.internal.z
            java.lang.String r5 = r12.f46906d
            com.google.android.gms.measurement.internal.y r6 = r12.f46905c
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo43645a(r1)
            throw r3
        L_0x00f6:
            r3 = move-exception
            r2 = r0
            r10 = r2
        L_0x00f9:
            r8 = r3
        L_0x00fa:
            r7 = 0
        L_0x00fb:
            if (r0 == 0) goto L_0x0115
            r0.close()     // Catch:{ IOException -> 0x0101 }
            goto L_0x0115
        L_0x0101:
            r0 = move-exception
            com.google.android.gms.measurement.internal.v r1 = r12.f46908f
            com.google.android.gms.measurement.internal.r r1 = r1.mo43585q()
            com.google.android.gms.measurement.internal.t r1 = r1.f47487a
            java.lang.String r3 = "Error closing HTTP compressed POST connection output stream. appId"
            java.lang.String r4 = r12.f46906d
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C16953r.m56340a(r4)
            r1.mo44162a(r3, r4, r0)
        L_0x0115:
            if (r2 == 0) goto L_0x011a
            r2.disconnect()
        L_0x011a:
            com.google.android.gms.measurement.internal.v r0 = r12.f46908f
            com.google.android.gms.measurement.internal.at r0 = r0.mo43584p()
            com.google.android.gms.measurement.internal.z r1 = new com.google.android.gms.measurement.internal.z
            java.lang.String r5 = r12.f46906d
            com.google.android.gms.measurement.internal.y r6 = r12.f46905c
            r9 = 0
            r11 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.mo43645a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16802ab.run():void");
    }
}
