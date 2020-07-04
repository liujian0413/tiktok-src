package com.bytedance.ttnet.p672d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10107a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ttnet.p670a.C12925a;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.d.c */
public final class C12971c implements C10107a {

    /* renamed from: d */
    private static C12971c f34342d;

    /* renamed from: a */
    public C12970b f34343a;

    /* renamed from: b */
    Handler f34344b = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            boolean z;
            if (message.what == 10000) {
                if (message.arg1 == 0) {
                    z = false;
                } else {
                    z = true;
                }
                C12971c.this.mo31491a(z);
            }
        }
    };

    /* renamed from: c */
    private long f34345c;

    /* renamed from: e */
    private boolean f34346e;

    /* renamed from: f */
    private Context f34347f;

    /* renamed from: g */
    private int f34348g;

    /* renamed from: h */
    private long f34349h;

    /* renamed from: i */
    private int f34350i;

    /* renamed from: j */
    private HashMap<String, Integer> f34351j = new HashMap<>();

    /* renamed from: k */
    private HashMap<String, Integer> f34352k = new HashMap<>();

    /* renamed from: l */
    private int f34353l = 0;

    /* renamed from: m */
    private HashMap<String, Integer> f34354m = new HashMap<>();

    /* renamed from: n */
    private HashMap<String, Integer> f34355n = new HashMap<>();

    /* renamed from: o */
    private boolean f34356o = true;

    /* renamed from: a */
    private static boolean m37804a(int i) {
        return i >= 200 && i < 400;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00ce, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24766a(okhttp3.Request r6, okhttp3.Response r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto L_0x00cd
            if (r7 != 0) goto L_0x0007
            goto L_0x00cd
        L_0x0007:
            boolean r0 = r5.f34356o     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r5)
            return
        L_0x000d:
            android.content.Context r0 = r5.f34347f     // Catch:{ all -> 0x00ca }
            boolean r0 = com.bytedance.ttnet.p672d.C12973d.m37815a(r0)     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x0017
            monitor-exit(r5)
            return
        L_0x0017:
            okhttp3.HttpUrl r0 = r6.url     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = r0.scheme     // Catch:{ all -> 0x00ca }
            java.lang.String r2 = r0.host     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = r0.encodedPath()     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = r6.ipAddrStr     // Catch:{ all -> 0x00ca }
            int r3 = r7.code     // Catch:{ all -> 0x00ca }
            java.lang.String r4 = "http"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x00ca }
            if (r4 != 0) goto L_0x0037
            java.lang.String r4 = "https"
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x0037
            monitor-exit(r5)
            return
        L_0x0037:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x003f
            monitor-exit(r5)
            return
        L_0x003f:
            okhttp3.Response r1 = r7.networkResponse     // Catch:{ all -> 0x00ca }
            if (r1 != 0) goto L_0x0045
            monitor-exit(r5)
            return
        L_0x0045:
            com.bytedance.ttnet.d.a r1 = r5.m37807c()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x0052
            boolean r4 = r1.f34326b     // Catch:{ all -> 0x00ca }
            if (r4 == 0) goto L_0x0052
            r5.m37802a(r7, r2)     // Catch:{ all -> 0x00ca }
        L_0x0052:
            if (r1 == 0) goto L_0x00c8
            boolean r7 = r1.f34325a     // Catch:{ all -> 0x00ca }
            if (r7 != 0) goto L_0x0059
            goto L_0x00c8
        L_0x0059:
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r1.f34327c     // Catch:{ all -> 0x00ca }
            if (r7 == 0) goto L_0x00c6
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r1.f34327c     // Catch:{ all -> 0x00ca }
            int r7 = r7.size()     // Catch:{ all -> 0x00ca }
            if (r7 <= 0) goto L_0x00c6
            java.util.Map<java.lang.String, java.lang.Integer> r7 = r1.f34327c     // Catch:{ all -> 0x00ca }
            boolean r7 = r7.containsKey(r2)     // Catch:{ all -> 0x00ca }
            if (r7 != 0) goto L_0x006e
            goto L_0x00c6
        L_0x006e:
            if (r3 <= 0) goto L_0x00c4
            boolean r7 = m37804a(r3)     // Catch:{ all -> 0x00ca }
            if (r7 == 0) goto L_0x0083
            int r6 = r5.f34350i     // Catch:{ all -> 0x00ca }
            if (r6 > 0) goto L_0x007e
            int r6 = r5.f34353l     // Catch:{ all -> 0x00ca }
            if (r6 <= 0) goto L_0x00c4
        L_0x007e:
            r5.m37809e()     // Catch:{ all -> 0x00ca }
            monitor-exit(r5)
            return
        L_0x0083:
            boolean r7 = r5.m37806b(r3)     // Catch:{ all -> 0x00ca }
            if (r7 != 0) goto L_0x00c4
            int r7 = r5.f34353l     // Catch:{ all -> 0x00ca }
            int r7 = r7 + 1
            r5.f34353l = r7     // Catch:{ all -> 0x00ca }
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r5.f34354m     // Catch:{ all -> 0x00ca }
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00ca }
            r7.put(r0, r3)     // Catch:{ all -> 0x00ca }
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r5.f34355n     // Catch:{ all -> 0x00ca }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00ca }
            r7.put(r6, r0)     // Catch:{ all -> 0x00ca }
            int r6 = r5.f34353l     // Catch:{ all -> 0x00ca }
            int r7 = r1.f34332h     // Catch:{ all -> 0x00ca }
            if (r6 < r7) goto L_0x00c4
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r5.f34354m     // Catch:{ all -> 0x00ca }
            int r6 = r6.size()     // Catch:{ all -> 0x00ca }
            int r7 = r1.f34333i     // Catch:{ all -> 0x00ca }
            if (r6 < r7) goto L_0x00c4
            java.util.HashMap<java.lang.String, java.lang.Integer> r6 = r5.f34355n     // Catch:{ all -> 0x00ca }
            int r6 = r6.size()     // Catch:{ all -> 0x00ca }
            int r7 = r1.f34334j     // Catch:{ all -> 0x00ca }
            if (r6 < r7) goto L_0x00c4
            r6 = 0
            r5.m37803a(r2, r6)     // Catch:{ all -> 0x00ca }
            r5.m37809e()     // Catch:{ all -> 0x00ca }
        L_0x00c4:
            monitor-exit(r5)
            return
        L_0x00c6:
            monitor-exit(r5)
            return
        L_0x00c8:
            monitor-exit(r5)
            return
        L_0x00ca:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x00cd:
            monitor-exit(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p672d.C12971c.mo24766a(okhttp3.Request, okhttp3.Response):void");
    }

    /* renamed from: a */
    public final void mo31491a(boolean z) {
        C12969a c = m37807c();
        if (c != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (z || this.f34345c + (((long) c.f34335k) * 1000) <= elapsedRealtime) {
                this.f34345c = elapsedRealtime;
                C12925a.m37625a(this.f34347f).mo31411a(C12973d.m37815a(this.f34347f));
            }
        }
    }

    /* renamed from: c */
    private C12969a m37807c() {
        if (this.f34343a != null) {
            return this.f34343a.f34339a;
        }
        return null;
    }

    /* renamed from: d */
    private Map<String, String> m37808d() {
        C12969a c = m37807c();
        if (c != null) {
            return c.f34328d;
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized C12971c m37800a() {
        C12971c cVar;
        synchronized (C12971c.class) {
            if (f34342d == null) {
                f34342d = new C12971c();
            }
            cVar = f34342d;
        }
        return cVar;
    }

    /* renamed from: b */
    private void m37805b() {
        SharedPreferences a = C7285c.m22838a(this.f34347f, "ttnet_tnc_config", 0);
        this.f34348g = a.getInt("tnc_probe_cmd", 0);
        this.f34349h = a.getLong("tnc_probe_version", 0);
    }

    /* renamed from: e */
    private void m37809e() {
        this.f34350i = 0;
        this.f34351j.clear();
        this.f34352k.clear();
        this.f34353l = 0;
        this.f34354m.clear();
        this.f34355n.clear();
    }

    private C12971c() {
    }

    /* renamed from: a */
    private static String m37801a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        C6497a.m20180a((Throwable) exc, new PrintWriter(stringWriter));
        return stringWriter.toString().toLowerCase();
    }

    /* renamed from: b */
    private boolean m37806b(int i) {
        if (i < 100 || i >= 1000) {
            return true;
        }
        C12969a c = m37807c();
        if (c != null && !TextUtils.isEmpty(c.f34337m)) {
            String str = c.f34337m;
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            if (str.contains(sb.toString())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final String mo31489a(String str) {
        String str2;
        if (TextUtils.isEmpty(str) || str.contains("/network/get_network") || str.contains("/get_domains/v4") || str.contains("/ies/speed")) {
            return str;
        }
        String str3 = null;
        try {
            URL url = new URL(str);
            str2 = url.getProtocol();
            try {
                str3 = url.getHost();
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2) || ((!WebKitApi.SCHEME_HTTP.equals(str2) && !WebKitApi.SCHEME_HTTPS.equals(str2)) || TextUtils.isEmpty(str3))) {
            return str;
        }
        Map d = m37808d();
        if (d == null || !d.containsKey(str3)) {
            return str;
        }
        String str4 = (String) d.get(str3);
        if (TextUtils.isEmpty(str4)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("://");
        sb.append(str3);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append("://");
        sb3.append(str4);
        String sb4 = sb3.toString();
        if (str.startsWith(sb2)) {
            str = str.replaceFirst(sb2, sb4);
        }
        return str;
    }

    /* renamed from: a */
    private void m37803a(boolean z, long j) {
        if (!this.f34344b.hasMessages(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT)) {
            Message obtainMessage = this.f34344b.obtainMessage();
            obtainMessage.what = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
            obtainMessage.arg1 = z ? 1 : 0;
            if (j > 0) {
                this.f34344b.sendMessageDelayed(obtainMessage, j);
            } else {
                this.f34344b.sendMessage(obtainMessage);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m37802a(okhttp3.Response r9, java.lang.String r10) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r10 = r8.f34356o
            if (r10 != 0) goto L_0x0008
            return
        L_0x0008:
            java.lang.String r10 = "tt-idc-switch"
            r0 = 0
            java.lang.String r9 = r9.header(r10, r0)
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x0016
            return
        L_0x0016:
            java.lang.String r10 = "@"
            java.lang.String[] r9 = r9.split(r10)
            if (r9 == 0) goto L_0x0085
            int r10 = r9.length
            r0 = 2
            if (r10 == r0) goto L_0x0023
            goto L_0x0085
        L_0x0023:
            r10 = 1
            r0 = 0
            r2 = 0
            r3 = r9[r2]     // Catch:{ Throwable -> 0x0034 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Throwable -> 0x0034 }
            r9 = r9[r10]     // Catch:{ Throwable -> 0x0035 }
            long r4 = java.lang.Long.parseLong(r9)     // Catch:{ Throwable -> 0x0035 }
            goto L_0x0036
        L_0x0034:
            r3 = 0
        L_0x0035:
            r4 = r0
        L_0x0036:
            long r6 = r8.f34349h
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x003d
            return
        L_0x003d:
            r8.f34348g = r3
            r8.f34349h = r4
            android.content.Context r9 = r8.f34347f
            java.lang.String r6 = "ttnet_tnc_config"
            android.content.SharedPreferences r9 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r9, r6, r2)
            android.content.SharedPreferences$Editor r9 = r9.edit()
            java.lang.String r2 = "tnc_probe_cmd"
            android.content.SharedPreferences$Editor r9 = r9.putInt(r2, r3)
            java.lang.String r2 = "tnc_probe_version"
            android.content.SharedPreferences$Editor r9 = r9.putLong(r2, r4)
            r9.apply()
            int r9 = r8.f34348g
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r9 != r2) goto L_0x0084
            com.bytedance.ttnet.d.a r9 = r8.m37807c()
            if (r9 != 0) goto L_0x0069
            return
        L_0x0069:
            java.util.Random r2 = new java.util.Random
            long r3 = java.lang.System.currentTimeMillis()
            r2.<init>(r3)
            int r3 = r9.f34336l
            if (r3 <= 0) goto L_0x0081
            int r9 = r9.f34336l
            int r9 = r2.nextInt(r9)
            long r0 = (long) r9
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
        L_0x0081:
            r8.m37803a(r10, r0)
        L_0x0084:
            return
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p672d.C12971c.m37802a(okhttp3.Response, java.lang.String):void");
    }

    /* renamed from: a */
    public final synchronized void mo31490a(Context context, boolean z) {
        if (!this.f34346e) {
            this.f34347f = context;
            this.f34356o = z;
            this.f34343a = new C12970b(context, z);
            if (z) {
                m37805b();
            }
            this.f34346e = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c0, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo24765a(okhttp3.Request r5, java.lang.Exception r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            boolean r0 = r4.f34356o     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x000b
            monitor-exit(r4)
            return
        L_0x000b:
            android.content.Context r0 = r4.f34347f     // Catch:{ all -> 0x00c1 }
            boolean r0 = com.bytedance.ttnet.p672d.C12973d.m37815a(r0)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x0015
            monitor-exit(r4)
            return
        L_0x0015:
            okhttp3.HttpUrl r0 = r5.url     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r0.scheme     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = r0.host     // Catch:{ all -> 0x00c1 }
            java.lang.String r0 = r0.encodedPath()     // Catch:{ all -> 0x00c1 }
            java.lang.String r5 = r5.ipAddrStr     // Catch:{ all -> 0x00c1 }
            java.lang.String r6 = m37801a(r6)     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = "http"
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x00c1 }
            if (r3 != 0) goto L_0x0037
            java.lang.String r3 = "https"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x0037
            monitor-exit(r4)
            return
        L_0x0037:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x003f
            monitor-exit(r4)
            return
        L_0x003f:
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x00bf
            java.lang.String r1 = "timeout"
            boolean r1 = r6.contains(r1)     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x00bf
            java.lang.String r1 = "time out"
            boolean r1 = r6.contains(r1)     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x00bf
            java.lang.String r1 = "unreachable"
            boolean r6 = r6.contains(r1)     // Catch:{ all -> 0x00c1 }
            if (r6 == 0) goto L_0x005e
            goto L_0x00bf
        L_0x005e:
            com.bytedance.ttnet.d.a r6 = r4.m37807c()     // Catch:{ all -> 0x00c1 }
            if (r6 == 0) goto L_0x00bd
            boolean r1 = r6.f34325a     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x0069
            goto L_0x00bd
        L_0x0069:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r6.f34327c     // Catch:{ all -> 0x00c1 }
            if (r1 == 0) goto L_0x00bb
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r6.f34327c     // Catch:{ all -> 0x00c1 }
            int r1 = r1.size()     // Catch:{ all -> 0x00c1 }
            if (r1 <= 0) goto L_0x00bb
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r6.f34327c     // Catch:{ all -> 0x00c1 }
            boolean r1 = r1.containsKey(r2)     // Catch:{ all -> 0x00c1 }
            if (r1 != 0) goto L_0x007e
            goto L_0x00bb
        L_0x007e:
            int r1 = r4.f34350i     // Catch:{ all -> 0x00c1 }
            int r1 = r1 + 1
            r4.f34350i = r1     // Catch:{ all -> 0x00c1 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = r4.f34351j     // Catch:{ all -> 0x00c1 }
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00c1 }
            r1.put(r0, r3)     // Catch:{ all -> 0x00c1 }
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.f34352k     // Catch:{ all -> 0x00c1 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00c1 }
            r0.put(r5, r1)     // Catch:{ all -> 0x00c1 }
            int r5 = r4.f34350i     // Catch:{ all -> 0x00c1 }
            int r0 = r6.f34329e     // Catch:{ all -> 0x00c1 }
            if (r5 < r0) goto L_0x00b9
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r4.f34351j     // Catch:{ all -> 0x00c1 }
            int r5 = r5.size()     // Catch:{ all -> 0x00c1 }
            int r0 = r6.f34330f     // Catch:{ all -> 0x00c1 }
            if (r5 < r0) goto L_0x00b9
            java.util.HashMap<java.lang.String, java.lang.Integer> r5 = r4.f34352k     // Catch:{ all -> 0x00c1 }
            int r5 = r5.size()     // Catch:{ all -> 0x00c1 }
            int r6 = r6.f34331g     // Catch:{ all -> 0x00c1 }
            if (r5 < r6) goto L_0x00b9
            r5 = 0
            r4.m37803a(r2, r5)     // Catch:{ all -> 0x00c1 }
            r4.m37809e()     // Catch:{ all -> 0x00c1 }
        L_0x00b9:
            monitor-exit(r4)
            return
        L_0x00bb:
            monitor-exit(r4)
            return
        L_0x00bd:
            monitor-exit(r4)
            return
        L_0x00bf:
            monitor-exit(r4)
            return
        L_0x00c1:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p672d.C12971c.mo24765a(okhttp3.Request, java.lang.Exception):void");
    }
}
