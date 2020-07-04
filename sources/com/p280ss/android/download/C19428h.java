package com.p280ss.android.download;

import android.content.ContentValues;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.p482io.FileUtils;
import com.p280ss.android.download.DownloadInfo.NetworkState;
import com.p280ss.android.download.p861b.C19405c.C19406a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.ss.android.download.h */
public final class C19428h implements Runnable {

    /* renamed from: a */
    private final Context f52584a;

    /* renamed from: b */
    private final DownloadInfo f52585b;

    /* renamed from: c */
    private final C19439q f52586c;

    /* renamed from: d */
    private final C19437p f52587d;

    /* renamed from: e */
    private final C19414d f52588e;

    /* renamed from: f */
    private volatile boolean f52589f;

    /* renamed from: com.ss.android.download.h$a */
    static class C19429a {

        /* renamed from: a */
        public String f52590a;

        /* renamed from: b */
        public String f52591b;

        /* renamed from: c */
        public int f52592c;

        /* renamed from: d */
        public boolean f52593d;

        /* renamed from: e */
        public String f52594e;

        /* renamed from: f */
        public long f52595f = -1;

        /* renamed from: g */
        public long f52596g;

        /* renamed from: h */
        public String f52597h;

        /* renamed from: i */
        public boolean f52598i;

        /* renamed from: j */
        public long f52599j;

        /* renamed from: k */
        public long f52600k;

        /* renamed from: l */
        public int f52601l = -1;

        /* renamed from: m */
        public long f52602m;

        /* renamed from: n */
        public long f52603n;

        /* renamed from: o */
        public long f52604o;

        /* renamed from: p */
        public long f52605p = -1;

        /* renamed from: q */
        public String f52606q;

        /* renamed from: r */
        public String f52607r;

        /* renamed from: s */
        public int f52608s;

        /* renamed from: t */
        public URL f52609t;

        /* renamed from: a */
        public final void mo51463a() {
            this.f52605p = -1;
            this.f52606q = null;
            this.f52607r = null;
            this.f52608s = 0;
        }

        public C19429a(DownloadInfo downloadInfo) {
            this.f52591b = downloadInfo.f52331f;
            this.f52594e = downloadInfo.f52327b;
            this.f52590a = downloadInfo.f52330e;
            this.f52595f = downloadInfo.f52344s;
            this.f52596g = downloadInfo.f52345t;
        }
    }

    /* renamed from: a */
    private static boolean m63862a(int i) {
        return i == 495 || i == 500 || i == 503;
    }

    /* renamed from: a */
    private void m63861a(C19429a aVar, byte[] bArr, int i, OutputStream outputStream) throws C19436o {
        long j = (long) i;
        this.f52587d.mo51478a(this.f52585b.f52332g, aVar.f52590a, j);
        boolean z = false;
        while (true) {
            try {
                outputStream.write(bArr, 0, i);
                return;
            } catch (IOException e) {
                if (!z) {
                    this.f52587d.mo51480b(this.f52585b.f52332g, aVar.f52590a, j);
                    z = true;
                } else {
                    StringBuilder sb = new StringBuilder("Failed to write data: ");
                    sb.append(e);
                    throw new C19436o(492, sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private String m63855a() {
        String str = this.f52585b.f52342q;
        if (str == null) {
            return C19357a.f52376b;
        }
        return str;
    }

    public final void run() {
        Process.setThreadPriority(10);
        try {
            m63863b();
        } finally {
            this.f52588e.mo51438a(this.f52585b.f52326a, 0);
        }
    }

    /* renamed from: c */
    private void m63867c() throws C19436o {
        this.f52589f = false;
        NetworkState c = this.f52585b.mo51304c();
        if (c != NetworkState.OK) {
            int i = 196;
            if (c == NetworkState.UNUSABLE_DUE_TO_SIZE) {
                this.f52585b.mo51300a(true);
            } else if (c == NetworkState.RECOMMENDED_UNUSABLE_DUE_TO_SIZE) {
                this.f52585b.mo51300a(false);
            } else {
                i = 195;
            }
            throw new C19436o(i, c.name());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r3 != null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r3 != null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        r3.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f0, code lost:
        if (r3 != null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f3, code lost:
        r10.f52587d.mo51477a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f8, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[SYNTHETIC, Splitter:B:44:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f9 A[SYNTHETIC, Splitter:B:65:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0110  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x009c=Splitter:B:38:0x009c, B:26:0x006f=Splitter:B:26:0x006f} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m63863b() {
        /*
            r10 = this;
            android.content.Context r0 = r10.f52584a
            com.ss.android.download.f r0 = com.p280ss.android.download.C19422f.m63833a(r0)
            com.ss.android.download.DownloadInfo r1 = r10.f52585b
            long r1 = r1.f52326a
            int r0 = com.p280ss.android.download.DownloadInfo.m63502a(r0, r1)
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L_0x0013
            return
        L_0x0013:
            com.ss.android.download.h$a r0 = new com.ss.android.download.h$a
            com.ss.android.download.DownloadInfo r2 = r10.f52585b
            r0.<init>(r2)
            com.ss.android.download.DownloadInfo r2 = r10.f52585b
            int r2 = r2.f52336k
            android.content.Context r3 = r10.f52584a
            java.lang.String r4 = "power"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.os.PowerManager r3 = (android.os.PowerManager) r3
            r4 = 1
            r5 = 491(0x1eb, float:6.88E-43)
            r6 = 0
            java.lang.String r7 = "SsDownloadManager"
            android.os.PowerManager$WakeLock r3 = r3.newWakeLock(r4, r7)     // Catch:{ o -> 0x009a, Throwable -> 0x006d, all -> 0x0068 }
            r3.acquire()     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
            com.ss.android.download.q r7 = r10.f52586c     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
            android.net.NetworkInfo r7 = r7.mo51471b()     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
            if (r7 == 0) goto L_0x0043
            int r7 = r7.getType()     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
            r0.f52601l = r7     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
        L_0x0043:
            java.net.URL r7 = new java.net.URL     // Catch:{ MalformedURLException -> 0x005b }
            java.lang.String r8 = r0.f52594e     // Catch:{ MalformedURLException -> 0x005b }
            r7.<init>(r8)     // Catch:{ MalformedURLException -> 0x005b }
            r0.f52609t = r7     // Catch:{ MalformedURLException -> 0x005b }
            r10.m63856a(r0)     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
            m63864b(r0)     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
            m63857a(r0, r1)
            r10.m63858a(r0, r1, r6, r2)
            if (r3 == 0) goto L_0x00f3
            goto L_0x0091
        L_0x005b:
            r1 = move-exception
            com.ss.android.download.o r7 = new com.ss.android.download.o     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
            r8 = 400(0x190, float:5.6E-43)
            r7.<init>(r8, r1)     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
            throw r7     // Catch:{ o -> 0x0066, Throwable -> 0x0064 }
        L_0x0064:
            r1 = move-exception
            goto L_0x006f
        L_0x0066:
            r1 = move-exception
            goto L_0x009c
        L_0x0068:
            r1 = move-exception
            r3 = r6
            r7 = r3
            goto L_0x0108
        L_0x006d:
            r1 = move-exception
            r3 = r6
        L_0x006f:
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0106 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            java.lang.String r6 = "Exception for id "
            r4.<init>(r6)     // Catch:{ all -> 0x0095 }
            com.ss.android.download.DownloadInfo r6 = r10.f52585b     // Catch:{ all -> 0x0095 }
            long r6 = r6.f52326a     // Catch:{ all -> 0x0095 }
            r4.append(r6)     // Catch:{ all -> 0x0095 }
            java.lang.String r6 = ": "
            r4.append(r6)     // Catch:{ all -> 0x0095 }
            r4.append(r1)     // Catch:{ all -> 0x0095 }
            m63857a(r0, r5)
            r10.m63858a(r0, r5, r1, r2)
            if (r3 == 0) goto L_0x00f3
        L_0x0091:
            r3.release()
            goto L_0x00f3
        L_0x0095:
            r4 = move-exception
            r7 = r1
        L_0x0097:
            r1 = r4
            goto L_0x0108
        L_0x009a:
            r1 = move-exception
            r3 = r6
        L_0x009c:
            java.lang.String r7 = r1.getMessage()     // Catch:{ all -> 0x0106 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0104 }
            java.lang.String r8 = "Aborting request for download "
            r6.<init>(r8)     // Catch:{ all -> 0x0104 }
            com.ss.android.download.DownloadInfo r8 = r10.f52585b     // Catch:{ all -> 0x0104 }
            long r8 = r8.f52326a     // Catch:{ all -> 0x0104 }
            r6.append(r8)     // Catch:{ all -> 0x0104 }
            java.lang.String r8 = ": "
            r6.append(r8)     // Catch:{ all -> 0x0104 }
            r6.append(r7)     // Catch:{ all -> 0x0104 }
            int r1 = r1.mo51475a()     // Catch:{ all -> 0x0104 }
            r5 = 194(0xc2, float:2.72E-43)
            if (r1 == r5) goto L_0x00f9
            boolean r6 = m63862a(r1)     // Catch:{ all -> 0x0101 }
            if (r6 == 0) goto L_0x00ea
            boolean r6 = r0.f52593d     // Catch:{ all -> 0x0101 }
            if (r6 == 0) goto L_0x00ca
            r2 = 1
            goto L_0x00cc
        L_0x00ca:
            int r2 = r2 + 1
        L_0x00cc:
            r4 = 5
            if (r2 >= r4) goto L_0x00ea
            com.ss.android.download.q r4 = r10.f52586c     // Catch:{ all -> 0x0101 }
            android.net.NetworkInfo r4 = r4.mo51471b()     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x00e8
            int r6 = r4.getType()     // Catch:{ all -> 0x0101 }
            int r8 = r0.f52601l     // Catch:{ all -> 0x0101 }
            if (r6 != r8) goto L_0x00e8
            boolean r4 = r4.isConnected()     // Catch:{ all -> 0x0101 }
            if (r4 == 0) goto L_0x00e8
            r1 = 194(0xc2, float:2.72E-43)
            goto L_0x00ea
        L_0x00e8:
            r1 = 195(0xc3, float:2.73E-43)
        L_0x00ea:
            m63857a(r0, r1)
            r10.m63858a(r0, r1, r7, r2)
            if (r3 == 0) goto L_0x00f3
            goto L_0x0091
        L_0x00f3:
            com.ss.android.download.p r0 = r10.f52587d
            r0.mo51477a()
            return
        L_0x00f9:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0101 }
            java.lang.String r5 = "Execution should always throw final error codes"
            r4.<init>(r5)     // Catch:{ all -> 0x0101 }
            throw r4     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r4 = move-exception
            r5 = r1
            goto L_0x0097
        L_0x0104:
            r1 = move-exception
            goto L_0x0108
        L_0x0106:
            r1 = move-exception
            r7 = r6
        L_0x0108:
            m63857a(r0, r5)
            r10.m63858a(r0, r5, r7, r2)
            if (r3 == 0) goto L_0x0113
            r3.release()
        L_0x0113:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19428h.m63863b():void");
    }

    /* renamed from: b */
    private static void m63864b(C19429a aVar) {
        if (aVar.f52590a != null) {
            FileUtils.m28672a(aVar.f52590a, 420);
        }
    }

    /* renamed from: f */
    private boolean m63874f(C19429a aVar) {
        if (aVar.f52596g <= 0 || this.f52585b.f52328c || aVar.f52597h != null) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m63875g(C19429a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_data", aVar.f52590a);
        if (aVar.f52597h != null) {
            contentValues.put("etag", aVar.f52597h);
        }
        if (aVar.f52591b != null) {
            contentValues.put("mimetype", aVar.f52591b);
        }
        contentValues.put("total_bytes", Long.valueOf(this.f52585b.f52344s));
        C19422f.m63833a(this.f52584a).mo51449a(this.f52585b.mo51306e(), contentValues, (String) null, (String[]) null);
    }

    /* renamed from: c */
    private void m63868c(C19429a aVar) throws C19436o {
        synchronized (this.f52585b) {
            if (this.f52585b.f52334i == 1) {
                throw new C19436o(193, "download paused by owner");
            } else if (this.f52585b.f52335j == 490 || this.f52585b.f52348w) {
                throw new C19436o(490, "download canceled");
            }
        }
        if (this.f52589f) {
            m63867c();
        }
    }

    /* renamed from: e */
    private void m63872e(C19429a aVar) throws C19436o {
        boolean z;
        ContentValues contentValues = new ContentValues();
        contentValues.put("current_bytes", Long.valueOf(aVar.f52596g));
        if (aVar.f52605p == -1) {
            contentValues.put("total_bytes", Long.valueOf(aVar.f52596g));
        }
        C19422f.m63833a(this.f52584a).mo51449a(this.f52585b.mo51306e(), contentValues, (String) null, (String[]) null);
        if (aVar.f52605p == -1 || aVar.f52596g == aVar.f52605p) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        if (m63874f(aVar)) {
            throw new C19436o(489, "mismatched content length; unable to resume");
        }
        throw new C19436o(495, "closed socket before end of file");
    }

    /* renamed from: h */
    private void m63876h(C19429a aVar) throws C19436o {
        if (!TextUtils.isEmpty(aVar.f52590a)) {
            if (C19431j.m63890a(aVar.f52590a, this.f52587d.f52618a)) {
                File file = new File(aVar.f52590a);
                if (file.exists()) {
                    long length = file.length();
                    if (length == 0) {
                        file.delete();
                        aVar.f52590a = null;
                        if (C19357a.f52377c) {
                        }
                    } else if (this.f52585b.f52346u != null || this.f52585b.f52328c) {
                        aVar.f52596g = (long) ((int) length);
                        if (this.f52585b.f52344s != -1) {
                            aVar.f52605p = this.f52585b.f52344s;
                        }
                        aVar.f52597h = this.f52585b.f52346u;
                        aVar.f52598i = true;
                    } else {
                        file.delete();
                        throw new C19436o(489, "Trying to resume a download that can't be resumed");
                    }
                }
            } else {
                throw new C19436o(492, "found invalid internal destination filename");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m63856a(com.p280ss.android.download.C19428h.C19429a r6) throws com.p280ss.android.download.C19436o {
        /*
            r5 = this;
            r6.mo51463a()
            r5.m63876h(r6)
            long r0 = r6.f52596g
            long r2 = r6.f52595f
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            int r0 = r6.f52608s
            int r1 = r0 + 1
            r6.f52608s = r1
            r1 = 5
            if (r0 >= r1) goto L_0x00e2
            r0 = 0
            r5.m63867c()     // Catch:{ IOException -> 0x00d3 }
            java.net.URL r1 = r6.f52609t     // Catch:{ IOException -> 0x00d3 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x00d3 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x00d3 }
            r0 = 0
            r1.setInstanceFollowRedirects(r0)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r1.setConnectTimeout(r0)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r1.setReadTimeout(r0)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r5.m63873e(r6, r1)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            int r0 = r1.getResponseCode()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 489(0x1e9, float:6.85E-43)
            if (r0 == r2) goto L_0x00b3
            r2 = 206(0xce, float:2.89E-43)
            if (r0 == r2) goto L_0x009e
            r2 = 307(0x133, float:4.3E-43)
            if (r0 == r2) goto L_0x0080
            r2 = 416(0x1a0, float:5.83E-43)
            if (r0 == r2) goto L_0x0078
            r2 = 500(0x1f4, float:7.0E-43)
            if (r0 == r2) goto L_0x006e
            r2 = 503(0x1f7, float:7.05E-43)
            if (r0 == r2) goto L_0x0061
            switch(r0) {
                case 301: goto L_0x0080;
                case 302: goto L_0x0080;
                case 303: goto L_0x0080;
                default: goto L_0x0054;
            }     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
        L_0x0054:
            java.lang.String r2 = r1.getResponseMessage()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            com.p280ss.android.download.C19436o.m63911a(r0, r2)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            if (r1 == 0) goto L_0x000f
        L_0x005d:
            r1.disconnect()
            goto L_0x000f
        L_0x0061:
            m63871d(r6, r1)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            com.ss.android.download.o r6 = new com.ss.android.download.o     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.lang.String r0 = r1.getResponseMessage()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            throw r6     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
        L_0x006e:
            com.ss.android.download.o r6 = new com.ss.android.download.o     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.lang.String r0 = r1.getResponseMessage()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            throw r6     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
        L_0x0078:
            com.ss.android.download.o r6 = new com.ss.android.download.o     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.lang.String r0 = "Requested range not satisfiable"
            r6.<init>(r3, r0)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            throw r6     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
        L_0x0080:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r1.getHeaderField(r2)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.net.URL r4 = r6.f52609t     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r3.<init>(r4, r2)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r6.f52609t = r3     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r2 = 301(0x12d, float:4.22E-43)
            if (r0 != r2) goto L_0x009b
            java.net.URL r0 = r6.f52609t     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r6.f52594e = r0     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
        L_0x009b:
            if (r1 == 0) goto L_0x000f
            goto L_0x005d
        L_0x009e:
            boolean r0 = r6.f52598i     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            if (r0 == 0) goto L_0x00ab
            r5.m63860a(r6, r1)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            if (r1 == 0) goto L_0x00aa
            r1.disconnect()
        L_0x00aa:
            return
        L_0x00ab:
            com.ss.android.download.o r6 = new com.ss.android.download.o     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.lang.String r0 = "Expected OK, but received partial"
            r6.<init>(r3, r0)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            throw r6     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
        L_0x00b3:
            boolean r0 = r6.f52598i     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            if (r0 != 0) goto L_0x00c3
            r5.m63866b(r6, r1)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r5.m63860a(r6, r1)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            if (r1 == 0) goto L_0x00c2
            r1.disconnect()
        L_0x00c2:
            return
        L_0x00c3:
            com.ss.android.download.o r6 = new com.ss.android.download.o     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.lang.String r0 = "Expected partial, but received OK"
            r6.<init>(r3, r0)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            throw r6     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
        L_0x00cb:
            r6 = move-exception
            goto L_0x00dc
        L_0x00cd:
            r6 = move-exception
            r0 = r1
            goto L_0x00d4
        L_0x00d0:
            r6 = move-exception
            r1 = r0
            goto L_0x00dc
        L_0x00d3:
            r6 = move-exception
        L_0x00d4:
            com.ss.android.download.o r1 = new com.ss.android.download.o     // Catch:{ all -> 0x00d0 }
            r2 = 495(0x1ef, float:6.94E-43)
            r1.<init>(r2, r6)     // Catch:{ all -> 0x00d0 }
            throw r1     // Catch:{ all -> 0x00d0 }
        L_0x00dc:
            if (r1 == 0) goto L_0x00e1
            r1.disconnect()
        L_0x00e1:
            throw r6
        L_0x00e2:
            com.ss.android.download.o r6 = new com.ss.android.download.o
            r0 = 497(0x1f1, float:6.96E-43)
            java.lang.String r1 = "Too many redirects"
            r6.<init>(r0, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19428h.m63856a(com.ss.android.download.h$a):void");
    }

    /* renamed from: d */
    private void m63870d(C19429a aVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - aVar.f52603n;
        if (j > 500) {
            long j2 = ((aVar.f52596g - aVar.f52604o) * 1000) / j;
            if (aVar.f52602m == 0) {
                aVar.f52602m = j2;
            } else {
                aVar.f52602m = ((aVar.f52602m * 3) + j2) / 4;
            }
            if (aVar.f52603n != 0) {
                this.f52588e.mo51438a(this.f52585b.f52326a, aVar.f52602m);
            }
            aVar.f52603n = elapsedRealtime;
            aVar.f52604o = aVar.f52596g;
        }
        if (aVar.f52596g - aVar.f52599j > 4096 && elapsedRealtime - aVar.f52600k > 1500) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_bytes", Long.valueOf(aVar.f52596g));
            C19422f.m63833a(this.f52584a).mo51449a(this.f52585b.mo51306e(), contentValues, (String) null, (String[]) null);
            aVar.f52599j = aVar.f52596g;
            aVar.f52600k = elapsedRealtime;
        }
    }

    /* renamed from: a */
    private static void m63857a(C19429a aVar, int i) {
        if (aVar.f52590a != null && C19406a.m63754b(i)) {
            new File(aVar.f52590a).delete();
            aVar.f52590a = null;
        }
    }

    /* renamed from: b */
    private void m63866b(C19429a aVar, HttpURLConnection httpURLConnection) throws C19436o {
        m63869c(aVar, httpURLConnection);
        aVar.f52590a = C19431j.m63883a(this.f52584a, this.f52585b.f52327b, this.f52585b.f52329d, aVar.f52606q, aVar.f52607r, aVar.f52591b, this.f52585b.f52332g, aVar.f52605p, this.f52587d);
        m63875g(aVar);
        m63867c();
    }

    /* renamed from: d */
    private static void m63871d(C19429a aVar, HttpURLConnection httpURLConnection) {
        aVar.f52592c = httpURLConnection.getHeaderFieldInt("Retry-After", -1);
        if (aVar.f52592c < 0) {
            aVar.f52592c = 0;
            return;
        }
        if (aVar.f52592c < 30) {
            aVar.f52592c = 30;
        } else if (aVar.f52592c > 86400) {
            aVar.f52592c = 86400;
        }
        aVar.f52592c += C19431j.f52610a.nextInt(31);
        aVar.f52592c *= 1000;
    }

    /* renamed from: c */
    private void m63869c(C19429a aVar, HttpURLConnection httpURLConnection) throws C19436o {
        boolean z;
        aVar.f52606q = httpURLConnection.getHeaderField("Content-Disposition");
        aVar.f52607r = httpURLConnection.getHeaderField("Content-Location");
        if (aVar.f52591b == null) {
            aVar.f52591b = httpURLConnection.getContentType();
        }
        aVar.f52597h = httpURLConnection.getHeaderField("ETag");
        String headerField = httpURLConnection.getHeaderField("Transfer-Encoding");
        if (headerField == null) {
            aVar.f52605p = m63854a((URLConnection) httpURLConnection, "Content-Length", -1);
        } else {
            aVar.f52605p = -1;
        }
        aVar.f52595f = aVar.f52605p;
        this.f52585b.f52344s = aVar.f52605p;
        if (aVar.f52605p != -1 || (headerField != null && headerField.equalsIgnoreCase("chunked"))) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f52585b.f52328c && z) {
            throw new C19436o(489, "can't know size of download, giving up");
        }
    }

    /* renamed from: e */
    private void m63873e(C19429a aVar, HttpURLConnection httpURLConnection) {
        for (Pair pair : this.f52585b.mo51298a()) {
            C19430i.m63879a(httpURLConnection, (String) pair.first, (String) pair.second);
        }
        if (httpURLConnection.getRequestProperty("User-Agent") == null) {
            C19430i.m63879a(httpURLConnection, "User-Agent", m63855a());
        }
        C19430i.m63880b(httpURLConnection, "Accept-Encoding", "identity");
        if (aVar.f52598i) {
            if (aVar.f52597h != null) {
                C19430i.m63879a(httpURLConnection, "If-Match", aVar.f52597h);
            }
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(aVar.f52596g);
            sb.append("-");
            C19430i.m63879a(httpURLConnection, "Range", sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x006b, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0071, code lost:
        if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[Catch:{ IOException -> 0x0024, all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0052 A[SYNTHETIC, Splitter:B:44:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0059 A[SYNTHETIC, Splitter:B:48:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0061 A[Catch:{ IOException -> 0x006b, all -> 0x005d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m63860a(com.p280ss.android.download.C19428h.C19429a r5, java.net.HttpURLConnection r6) throws com.p280ss.android.download.C19436o {
        /*
            r4 = this;
            r0 = 0
            java.io.InputStream r6 = com.p280ss.android.download.C19430i.m63878a(r6)     // Catch:{ IOException -> 0x0047 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            java.lang.String r2 = r5.f52590a     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r3 = 1
            r1.<init>(r2, r3)     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r2 = r1
            java.io.FileOutputStream r2 = (java.io.FileOutputStream) r2     // Catch:{ IOException -> 0x0030 }
            java.io.FileDescriptor r2 = r2.getFD()     // Catch:{ IOException -> 0x0030 }
            r4.m63859a(r5, r6, r1)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x001c
            r6.close()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            r1.flush()     // Catch:{ IOException -> 0x0024, all -> 0x0028 }
            if (r2 == 0) goto L_0x0024
            r2.sync()     // Catch:{ IOException -> 0x0024, all -> 0x0028 }
        L_0x0024:
            r1.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x002d
        L_0x0028:
            r5 = move-exception
            r1.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            throw r5
        L_0x002d:
            return
        L_0x002e:
            r5 = move-exception
            goto L_0x0041
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = move-exception
            r2 = r0
            goto L_0x0050
        L_0x0035:
            r5 = move-exception
            r1 = r0
        L_0x0037:
            com.ss.android.download.o r2 = new com.ss.android.download.o     // Catch:{ all -> 0x003f }
            r3 = 492(0x1ec, float:6.9E-43)
            r2.<init>(r3, r5)     // Catch:{ all -> 0x003f }
            throw r2     // Catch:{ all -> 0x003f }
        L_0x003f:
            r5 = move-exception
            r2 = r0
        L_0x0041:
            r0 = r1
            goto L_0x0050
        L_0x0043:
            r5 = move-exception
            r6 = r0
            r2 = r6
            goto L_0x0050
        L_0x0047:
            r5 = move-exception
            com.ss.android.download.o r6 = new com.ss.android.download.o     // Catch:{ all -> 0x0043 }
            r1 = 495(0x1ef, float:6.94E-43)
            r6.<init>(r1, r5)     // Catch:{ all -> 0x0043 }
            throw r6     // Catch:{ all -> 0x0043 }
        L_0x0050:
            if (r6 == 0) goto L_0x0057
            r6.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0057
        L_0x0056:
        L_0x0057:
            if (r0 == 0) goto L_0x005f
            r0.flush()     // Catch:{ IOException -> 0x006b, all -> 0x005d }
            goto L_0x005f
        L_0x005d:
            r5 = move-exception
            goto L_0x0065
        L_0x005f:
            if (r2 == 0) goto L_0x0071
            r2.sync()     // Catch:{ IOException -> 0x006b, all -> 0x005d }
            goto L_0x0071
        L_0x0065:
            if (r0 == 0) goto L_0x006a
            r0.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            throw r5
        L_0x006b:
            if (r0 == 0) goto L_0x0074
        L_0x006d:
            r0.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x0074
        L_0x0071:
            if (r0 == 0) goto L_0x0074
            goto L_0x006d
        L_0x0074:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.download.C19428h.m63860a(com.ss.android.download.h$a, java.net.HttpURLConnection):void");
    }

    /* renamed from: a */
    private static long m63854a(URLConnection uRLConnection, String str, long j) {
        try {
            return Long.parseLong(uRLConnection.getHeaderField(str));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private int m63853a(C19429a aVar, byte[] bArr, InputStream inputStream) throws C19436o {
        try {
            return inputStream.read(bArr);
        } catch (IOException e) {
            if ("unexpected end of stream".equals(e.getMessage())) {
                return -1;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_bytes", Long.valueOf(aVar.f52596g));
            C19422f.m63833a(this.f52584a).mo51449a(this.f52585b.mo51306e(), contentValues, (String) null, (String[]) null);
            if (m63874f(aVar)) {
                StringBuilder sb = new StringBuilder("Failed reading response: ");
                sb.append(e);
                sb.append("; unable to resume");
                throw new C19436o(489, sb.toString(), e);
            }
            StringBuilder sb2 = new StringBuilder("Failed reading response: ");
            sb2.append(e);
            throw new C19436o(495, sb2.toString(), e);
        }
    }

    /* renamed from: a */
    private void m63859a(C19429a aVar, InputStream inputStream, OutputStream outputStream) throws C19436o {
        byte[] bArr = new byte[4096];
        while (true) {
            int a = m63853a(aVar, bArr, inputStream);
            if (a == -1) {
                m63872e(aVar);
                return;
            }
            aVar.f52593d = true;
            m63861a(aVar, bArr, a, outputStream);
            aVar.f52596g += (long) a;
            m63870d(aVar);
            m63868c(aVar);
        }
    }

    /* renamed from: b */
    private void m63865b(C19429a aVar, int i, String str, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        contentValues.put("_data", aVar.f52590a);
        contentValues.put("mimetype", aVar.f52591b);
        contentValues.put("lastmod", Long.valueOf(this.f52586c.mo51469a()));
        contentValues.put("numfailed", Integer.valueOf(i2));
        contentValues.put("method", Integer.valueOf(aVar.f52592c));
        if (!TextUtils.equals(this.f52585b.f52327b, aVar.f52594e)) {
            contentValues.put("uri", aVar.f52594e);
        }
        if (!TextUtils.isEmpty(str)) {
            contentValues.put("errorMsg", str);
        }
        C19422f.m63833a(this.f52584a).mo51449a(this.f52585b.mo51306e(), contentValues, (String) null, (String[]) null);
    }

    /* renamed from: a */
    private void m63858a(C19429a aVar, int i, String str, int i2) {
        m63865b(aVar, i, str, i2);
        if (C19406a.m63755c(i)) {
            this.f52585b.mo51303b();
        }
    }

    public C19428h(Context context, C19439q qVar, DownloadInfo downloadInfo, C19437p pVar, C19414d dVar) {
        this.f52584a = context;
        this.f52586c = qVar;
        this.f52585b = downloadInfo;
        this.f52587d = pVar;
        this.f52588e = dVar;
    }
}
