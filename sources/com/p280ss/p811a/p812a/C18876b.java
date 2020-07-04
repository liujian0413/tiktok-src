package com.p280ss.p811a.p812a;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import com.p280ss.android.ugc.aweme.policy.Policy;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;

/* renamed from: com.ss.a.a.b */
public abstract class C18876b {

    /* renamed from: p */
    private static HostnameVerifier f50877p = new C18879d();

    /* renamed from: a */
    public String f50878a = "";

    /* renamed from: b */
    private Context f50879b;

    /* renamed from: c */
    private String f50880c;

    /* renamed from: d */
    private int f50881d;

    /* renamed from: e */
    private int f50882e;

    /* renamed from: f */
    private byte[] f50883f;

    /* renamed from: g */
    private int f50884g = -1;

    /* renamed from: h */
    private byte[] f50885h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f50886i = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f50887j = 1;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f50888k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f50889l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public HandlerThread f50890m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f50891n;

    /* renamed from: o */
    private boolean f50892o;

    /* renamed from: q */
    private HttpURLConnection f50893q;

    public C18876b(Context context, String str) {
        if (str == null || str.length() <= 0) {
            str = "";
        }
        this.f50879b = context;
        this.f50880c = str;
    }

    /* renamed from: a */
    private void m61616a(int i) {
        String str;
        switch (i) {
            case 1:
                str = "POST";
                break;
            case 3:
                str = "PUT";
                break;
            case 4:
                str = Policy.ACTION_DELETE;
                break;
            case 5:
                str = "HEAD";
                break;
            case 6:
                str = "TRACE";
                break;
            default:
                str = "GET";
                break;
        }
        this.f50893q.setRequestMethod(str);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a7, code lost:
        if (r3 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        if (r3 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        if (r7.f50893q == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r7.f50893q.disconnect();
        r7.f50893q = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e1, code lost:
        if (r0 == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e3, code lost:
        mo50247a(r7.f50884g, r7.f50885h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ea, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3 A[Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m61617a() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.lang.String r4 = r7.f50878a     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            boolean r4 = r7.f50892o     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            if (r4 == 0) goto L_0x0037
            javax.net.ssl.TrustManager[] r4 = new javax.net.ssl.TrustManager[r1]     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            com.ss.a.a.e r5 = new com.ss.a.a.e     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r5.<init>()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r4[r0] = r5     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.lang.String r5 = "TLS"
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getInstance(r5)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.security.SecureRandom r6 = new java.security.SecureRandom     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r6.<init>()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r5.init(r2, r4, r6)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            javax.net.ssl.SSLSocketFactory r4 = r5.getSocketFactory()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r4)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.net.Proxy r4 = java.net.Proxy.NO_PROXY     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.net.URLConnection r4 = r3.openConnection(r4)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
        L_0x0034:
            r7.f50893q = r4     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            goto L_0x003e
        L_0x0037:
            java.net.URLConnection r4 = r3.openConnection()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            goto L_0x0034
        L_0x003e:
            java.lang.String r4 = "https"
            java.lang.String r3 = r3.getProtocol()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            boolean r3 = r4.equals(r3)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            if (r3 == 0) goto L_0x0057
            java.net.HttpURLConnection r3 = r7.f50893q     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            javax.net.ssl.HostnameVerifier r4 = f50877p     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r3.setHostnameVerifier(r4)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
        L_0x0057:
            java.net.HttpURLConnection r3 = r7.f50893q     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            int r4 = r7.f50886i     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r3.setConnectTimeout(r4)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.net.HttpURLConnection r3 = r7.f50893q     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            int r4 = r7.f50886i     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r3.setReadTimeout(r4)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            int r3 = r7.f50881d     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r7.m61616a(r3)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            int r3 = r7.f50882e     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r7.m61621b(r3)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            byte[] r3 = r7.f50883f     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            if (r3 == 0) goto L_0x008e
            byte[] r3 = r7.f50883f     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            int r3 = r3.length     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            if (r3 <= 0) goto L_0x008e
            java.net.HttpURLConnection r3 = r7.f50893q     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r3.setDoOutput(r1)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.net.HttpURLConnection r3 = r7.f50893q     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.io.OutputStream r3 = r3.getOutputStream()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            byte[] r4 = r7.f50883f     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r3.write(r4)     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r3.flush()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r3.close()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
        L_0x008e:
            java.net.HttpURLConnection r3 = r7.f50893q     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            r3.connect()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            java.net.HttpURLConnection r3 = r7.f50893q     // Catch:{ Throwable -> 0x00b7, all -> 0x00af }
            int r3 = r3.getResponseCode()     // Catch:{ Throwable -> 0x00b7, all -> 0x00af }
            r7.f50884g = r3     // Catch:{ Throwable -> 0x00b7, all -> 0x00af }
            java.net.HttpURLConnection r3 = r7.f50893q     // Catch:{ Throwable -> 0x00b7, all -> 0x00af }
            java.io.InputStream r3 = com.p280ss.p811a.p812a.C18878c.m61630a(r3)     // Catch:{ Throwable -> 0x00b7, all -> 0x00af }
            byte[] r4 = m61619a(r3)     // Catch:{ Throwable -> 0x00b8, all -> 0x00ad }
            r7.f50885h = r4     // Catch:{ Throwable -> 0x00b8, all -> 0x00ad }
            if (r3 == 0) goto L_0x00bb
        L_0x00a9:
            r3.close()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
            goto L_0x00bb
        L_0x00ad:
            r1 = move-exception
            goto L_0x00b1
        L_0x00af:
            r1 = move-exception
            r3 = r2
        L_0x00b1:
            if (r3 == 0) goto L_0x00b6
            r3.close()     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
        L_0x00b6:
            throw r1     // Catch:{ Throwable -> 0x00d5, all -> 0x00c8 }
        L_0x00b7:
            r3 = r2
        L_0x00b8:
            if (r3 == 0) goto L_0x00bb
            goto L_0x00a9
        L_0x00bb:
            java.net.HttpURLConnection r0 = r7.f50893q
            if (r0 == 0) goto L_0x00c6
            java.net.HttpURLConnection r0 = r7.f50893q
            r0.disconnect()
            r7.f50893q = r2
        L_0x00c6:
            r0 = 1
            goto L_0x00e1
        L_0x00c8:
            r0 = move-exception
            java.net.HttpURLConnection r1 = r7.f50893q
            if (r1 == 0) goto L_0x00d4
            java.net.HttpURLConnection r1 = r7.f50893q
            r1.disconnect()
            r7.f50893q = r2
        L_0x00d4:
            throw r0
        L_0x00d5:
            java.net.HttpURLConnection r1 = r7.f50893q
            if (r1 == 0) goto L_0x00e1
            java.net.HttpURLConnection r1 = r7.f50893q
            r1.disconnect()
            r7.f50893q = r2
        L_0x00e1:
            if (r0 == 0) goto L_0x00ea
            int r1 = r7.f50884g
            byte[] r2 = r7.f50885h
            r7.mo50247a(r1, r2)
        L_0x00ea:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.p811a.p812a.C18876b.m61617a():boolean");
    }

    /* renamed from: a */
    private static byte[] m61619a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        while (true) {
            int read = inputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    private void m61621b(int i) {
        String str;
        switch (i) {
            case 1:
                str = "application/json; charset=utf-8";
                break;
            case 2:
                str = "application/octet-stream";
                break;
            default:
                str = "";
                break;
        }
        if (str.length() > 0) {
            C18878c.m61631a(this.f50893q, "Content-Type", str);
        }
        StringBuilder sb = new StringBuilder("sessionid=");
        sb.append(this.f50880c);
        C18878c.m61631a(this.f50893q, "Cookie", sb.toString());
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Locale.getDefault().toString());
                sb2.append(",");
                sb2.append(language);
                sb2.append(";q=0.9");
                C18878c.m61631a(this.f50893q, "Accept-Language", sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Locale.getDefault().toString());
            sb3.append(",");
            sb3.append(language);
            sb3.append(";q=0.9,en-US;q=0.6,en;q=0.4");
            C18878c.m61631a(this.f50893q, "Accept-Language", sb3.toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    private void m61622b(int i, int i2, byte[] bArr) {
        this.f50881d = i;
        this.f50882e = i2;
        this.f50883f = bArr;
    }

    /* renamed from: a */
    public final synchronized void mo50246a(int i, int i2, byte[] bArr) {
        if (!this.f50889l) {
            this.f50887j = 2;
            m61622b(i, i2, bArr);
            this.f50889l = true;
            this.f50888k = 0;
            this.f50890m = new HandlerThread("request");
            this.f50890m.start();
            this.f50891n = new Handler(this.f50890m.getLooper(), new Callback() {
                public final boolean handleMessage(Message message) {
                    if (C18876b.this.f50888k >= C18876b.this.f50887j) {
                        C18876b.this.f50889l = false;
                        C18876b.this.f50888k = 0;
                        C18876b.this.f50890m.quit();
                        return false;
                    } else if (C18876b.this.m61617a()) {
                        C18876b.this.f50889l = false;
                        C18876b.this.f50888k = 0;
                        C18876b.this.f50890m.quit();
                        return true;
                    } else {
                        C18876b.this.f50891n.sendEmptyMessageDelayed(1, (long) (C18876b.this.f50886i * 1));
                        C18876b.this.f50888k = C18876b.this.f50888k + 1;
                        return false;
                    }
                }
            });
            this.f50891n.sendEmptyMessage(1);
        }
    }

    /* renamed from: a */
    public abstract boolean mo50247a(int i, byte[] bArr);
}
