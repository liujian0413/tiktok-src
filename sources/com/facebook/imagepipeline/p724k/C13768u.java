package com.facebook.imagepipeline.p724k;

import android.net.Uri;
import com.C1642a;
import com.facebook.common.util.C13337d;
import com.facebook.imagepipeline.p720g.C13647e;
import com.facebook.imagepipeline.p724k.C13683ai.C13684a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.facebook.imagepipeline.k.u */
public final class C13768u extends C13736c<C13767t> {

    /* renamed from: a */
    private int f36548a;

    /* renamed from: b */
    private final ExecutorService f36549b;

    /* renamed from: a */
    private static boolean m40637a(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: b */
    private static boolean m40638b(int i) {
        switch (i) {
            case C34943c.f91128x /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.x int)*/:
            case 301:
            case 302:
            case 303:
            case 307:
            case 308:
                return true;
            default:
                return false;
        }
    }

    public C13768u() {
        this(C13771v.m40642a(3));
    }

    private C13768u(ExecutorService executorService) {
        this.f36549b = executorService;
    }

    public C13768u(int i) {
        this(C13771v.m40642a(3));
        this.f36548a = i;
    }

    /* renamed from: a */
    private static HttpURLConnection m40635a(Uri uri) throws IOException {
        return (HttpURLConnection) C13337d.m39033a(uri).openConnection();
    }

    public final C13767t createFetchState(C13748k<C13647e> kVar, C13700an anVar) {
        return new C13767t(kVar, anVar);
    }

    /* renamed from: a */
    private static String m40634a(String str, Object... objArr) {
        return C1642a.m8035a(Locale.getDefault(), str, objArr);
    }

    public final void fetch(final C13767t tVar, final C13684a aVar) {
        final Future submit = this.f36549b.submit(new Runnable() {
            public final void run() {
                C13768u.this.mo33373a(tVar, aVar);
            }
        });
        tVar.f36544e.mo33334a(new C13738e() {
            /* renamed from: a */
            public final void mo29896a() {
                if (submit.cancel(false)) {
                    aVar.mo33323a();
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003d A[SYNTHETIC, Splitter:B:31:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x004d A[SYNTHETIC, Splitter:B:41:0x004d] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33373a(com.facebook.imagepipeline.p724k.C13767t r4, com.facebook.imagepipeline.p724k.C13683ai.C13684a r5) {
        /*
            r3 = this;
            r0 = 0
            android.net.Uri r4 = r4.mo33371c()     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            r1 = 5
            java.net.HttpURLConnection r4 = r3.m40636a(r4, r1)     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            if (r4 == 0) goto L_0x0026
            java.io.InputStream r1 = com.facebook.imagepipeline.p724k.C13771v.m40641a(r4)     // Catch:{ IOException -> 0x0021, all -> 0x001f }
            r0 = -1
            r5.mo33324a(r1, r0)     // Catch:{ IOException -> 0x0019, all -> 0x0016 }
            r0 = r1
            goto L_0x0026
        L_0x0016:
            r5 = move-exception
            r0 = r1
            goto L_0x004b
        L_0x0019:
            r0 = move-exception
            r2 = r1
            r1 = r4
            r4 = r0
            r0 = r2
            goto L_0x0038
        L_0x001f:
            r5 = move-exception
            goto L_0x004b
        L_0x0021:
            r1 = move-exception
            r2 = r1
            r1 = r4
            r4 = r2
            goto L_0x0038
        L_0x0026:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x002d
        L_0x002c:
        L_0x002d:
            if (r4 == 0) goto L_0x0048
            r4.disconnect()
            return
        L_0x0033:
            r5 = move-exception
            r4 = r0
            goto L_0x004b
        L_0x0036:
            r4 = move-exception
            r1 = r0
        L_0x0038:
            r5.mo33325a(r4)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0042
            r0.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            if (r1 == 0) goto L_0x0048
            r1.disconnect()
            return
        L_0x0048:
            return
        L_0x0049:
            r5 = move-exception
            r4 = r1
        L_0x004b:
            if (r0 == 0) goto L_0x0052
            r0.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0052
        L_0x0051:
        L_0x0052:
            if (r4 == 0) goto L_0x0057
            r4.disconnect()
        L_0x0057:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13768u.mo33373a(com.facebook.imagepipeline.k.t, com.facebook.imagepipeline.k.ai$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.net.HttpURLConnection m40636a(android.net.Uri r8, int r9) throws java.io.IOException {
        /*
            r7 = this;
        L_0x0000:
            java.net.HttpURLConnection r0 = m40635a(r8)
            int r1 = r7.f36548a
            r0.setConnectTimeout(r1)
            int r1 = r0.getResponseCode()
            boolean r2 = m40637a(r1)
            if (r2 == 0) goto L_0x0014
            return r0
        L_0x0014:
            boolean r2 = m40638b(r1)
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x006f
            java.lang.String r2 = "Location"
            java.lang.String r2 = r0.getHeaderField(r2)
            r0.disconnect()
            if (r2 != 0) goto L_0x002a
            r0 = 0
            goto L_0x002e
        L_0x002a:
            android.net.Uri r0 = android.net.Uri.parse(r2)
        L_0x002e:
            java.lang.String r2 = r8.getScheme()
            if (r9 <= 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            java.lang.String r6 = r0.getScheme()
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0044
            int r9 = r9 + -1
            r8 = r0
            goto L_0x0000
        L_0x0044:
            if (r9 != 0) goto L_0x0055
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r8 = r8.toString()
            r9[r4] = r8
            java.lang.String r8 = "URL %s follows too many redirects"
            java.lang.String r8 = m40634a(r8, r9)
            goto L_0x0069
        L_0x0055:
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.String r8 = r8.toString()
            r9[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r9[r5] = r8
            java.lang.String r8 = "URL %s returned %d without a valid redirect"
            java.lang.String r8 = m40634a(r8, r9)
        L_0x0069:
            java.io.IOException r9 = new java.io.IOException
            r9.<init>(r8)
            throw r9
        L_0x006f:
            r0.disconnect()
            java.io.IOException r9 = new java.io.IOException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r8 = r8.toString()
            r0[r4] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r0[r5] = r8
            java.lang.String r8 = "Image URL %s returned HTTP code %d"
            java.lang.String r8 = com.C1642a.m8034a(r8, r0)
            r9.<init>(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p724k.C13768u.m40636a(android.net.Uri, int):java.net.HttpURLConnection");
    }
}
