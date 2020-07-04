package com.p280ss.ugc.live.gift.resource.p1828b;

import com.C1642a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.ugc.live.gift.resource.p1828b.C46214b.C46215a;
import com.p280ss.ugc.live.gift.resource.p1830d.C46232d;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.ugc.live.gift.resource.b.c */
public final class C46216c implements C46214b {

    /* renamed from: a */
    private final ExecutorService f118807a = C46219d.m145133a(3);

    /* renamed from: com.ss.ugc.live.gift.resource.b.c$a */
    static class C46218a extends IOException {

        /* renamed from: a */
        private int f118811a;

        /* renamed from: a */
        public final int mo114169a() {
            return this.f118811a;
        }

        public C46218a(String str, int i) {
            super(str);
            this.f118811a = i;
        }
    }

    /* renamed from: a */
    private static boolean m145127a(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: b */
    private static boolean m145128b(int i) {
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

    /* renamed from: a */
    public final void mo114164a(final C46213a aVar, final C46215a aVar2) {
        if (C46232d.m145169a(aVar.f118805a)) {
            aVar2.mo114166a((Throwable) new IllegalArgumentException("request is not valid"), 0);
        } else {
            this.f118807a.submit(new Runnable() {
                public final void run() {
                    C46216c.this.mo114167b(aVar, aVar2);
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x003c A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0044 A[Catch:{ all -> 0x0056 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004a A[SYNTHETIC, Splitter:B:33:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0059 A[SYNTHETIC, Splitter:B:42:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0060  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo114167b(com.p280ss.ugc.live.gift.resource.p1828b.C46213a r5, com.p280ss.ugc.live.gift.resource.p1828b.C46214b.C46215a r6) {
        /*
            r4 = this;
            r0 = 5
            r1 = 0
            java.net.HttpURLConnection r5 = r4.m145126a(r5, r0)     // Catch:{ IOException -> 0x0034, all -> 0x0030 }
            if (r5 == 0) goto L_0x0022
            java.io.InputStream r0 = com.p280ss.ugc.live.gift.resource.p1828b.C46219d.m145132a(r5)     // Catch:{ IOException -> 0x001d, all -> 0x001a }
            java.lang.String r1 = "Content-Length"
            r2 = -1
            int r1 = r5.getHeaderFieldInt(r1, r2)     // Catch:{ IOException -> 0x0018 }
            long r1 = (long) r1     // Catch:{ IOException -> 0x0018 }
            r6.mo114165a(r0, r1)     // Catch:{ IOException -> 0x0018 }
            goto L_0x0023
        L_0x0018:
            r1 = move-exception
            goto L_0x0038
        L_0x001a:
            r6 = move-exception
            r0 = r1
            goto L_0x0057
        L_0x001d:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0038
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x002a
            r0.close()     // Catch:{ IOException -> 0x0029 }
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            if (r5 == 0) goto L_0x0055
            r5.disconnect()
            return
        L_0x0030:
            r6 = move-exception
            r5 = r1
            r0 = r5
            goto L_0x0057
        L_0x0034:
            r5 = move-exception
            r0 = r1
            r1 = r5
            r5 = r0
        L_0x0038:
            boolean r2 = r1 instanceof com.p280ss.ugc.live.gift.resource.p1828b.C46216c.C46218a     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0044
            r2 = r1
            com.ss.ugc.live.gift.resource.b.c$a r2 = (com.p280ss.ugc.live.gift.resource.p1828b.C46216c.C46218a) r2     // Catch:{ all -> 0x0056 }
            int r2 = r2.mo114169a()     // Catch:{ all -> 0x0056 }
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            r6.mo114166a(r1, r2)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            if (r5 == 0) goto L_0x0055
            r5.disconnect()
            return
        L_0x0055:
            return
        L_0x0056:
            r6 = move-exception
        L_0x0057:
            if (r0 == 0) goto L_0x005e
            r0.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x005e
        L_0x005d:
        L_0x005e:
            if (r5 == 0) goto L_0x0063
            r5.disconnect()
        L_0x0063:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ugc.live.gift.resource.p1828b.C46216c.mo114167b(com.ss.ugc.live.gift.resource.b.a, com.ss.ugc.live.gift.resource.b.b$a):void");
    }

    /* renamed from: a */
    private HttpURLConnection m145126a(C46213a aVar, int i) throws IOException {
        String str;
        String str2 = aVar.f118805a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
        long j = aVar.f118806b;
        if (j > 0) {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j);
            sb.append("-");
            C46219d.m145134a(httpURLConnection, "range", sb.toString());
        }
        httpURLConnection.setConnectTimeout(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
        httpURLConnection.setReadTimeout(5000);
        int responseCode = httpURLConnection.getResponseCode();
        if (m145127a(responseCode)) {
            return httpURLConnection;
        }
        if (m145128b(responseCode)) {
            String headerField = httpURLConnection.getHeaderField("Location");
            httpURLConnection.disconnect();
            if (headerField == null || i <= 0) {
                if (i == 0) {
                    str = C1642a.m8034a("URL %1$s too many redirects", new Object[]{str2});
                } else {
                    str = C1642a.m8034a("URL %1$s invalid redirect", new Object[]{str2});
                }
                throw new IOException(str);
            }
            aVar.f118805a = headerField;
            m145126a(aVar, i - 1);
            return httpURLConnection;
        }
        httpURLConnection.disconnect();
        StringBuilder sb2 = new StringBuilder("error response code:");
        sb2.append(responseCode);
        throw new C46218a(sb2.toString(), responseCode);
    }
}
