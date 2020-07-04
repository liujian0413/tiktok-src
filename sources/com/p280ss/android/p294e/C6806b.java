package com.p280ss.android.p294e;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p280ss.android.p294e.p870b.C19539b;
import com.p280ss.android.p294e.p871c.C19541a;
import com.p280ss.android.p294e.p871c.C19542b;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.e.b */
public final class C6806b {

    /* renamed from: f */
    private static C6806b f19400f = new C6806b();

    /* renamed from: i */
    private static Context f19401i;

    /* renamed from: a */
    public boolean f19402a = false;

    /* renamed from: b */
    public long f19403b = 300000;

    /* renamed from: c */
    public int f19404c = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;

    /* renamed from: d */
    private Map<String, C6805a> f19405d = new ConcurrentHashMap();

    /* renamed from: e */
    private Map<Pattern, String> f19406e = new LinkedHashMap();

    /* renamed from: g */
    private C6807a f19407g;

    /* renamed from: h */
    private C19541a f19408h;

    /* renamed from: com.ss.android.e.b$a */
    class C6807a extends BroadcastReceiver {
        C6807a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (C6806b.this.mo16632b()) {
                C6806b.this.mo16628a((C6805a) null);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo16632b() {
        return C19540c.m64408a(this);
    }

    /* renamed from: a */
    public final void mo16630a(String str, Exception exc) {
        if (mo16632b() && m21151d()) {
            new StringBuilder("on link api error:").append(str);
            m21149c(str);
        }
    }

    /* renamed from: a */
    public final void mo16629a(C19542b bVar) {
        if (this.f19408h != null) {
            this.f19408h.mo51686a(bVar);
        }
    }

    /* renamed from: c */
    public final C6806b mo16633c() {
        m21147b(f19401i);
        return this;
    }

    /* renamed from: e */
    private static void m21152e() {
        if (f19401i == null) {
            throw new IllegalStateException("LinkSelector may not been initialize! call init() in Application.onCreate() or make sure init() has been called before getInstance().");
        }
    }

    private C6806b() {
    }

    /* renamed from: a */
    public static C6806b m21144a() {
        m21152e();
        if (f19400f == null) {
            f19400f = new C6806b();
        }
        return f19400f;
    }

    /* renamed from: d */
    public static boolean m21151d() {
        if (f19401i == null) {
            return true;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f19401i.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            new StringBuilder("isNetworkAvailable:").append(e.toString());
            return false;
        }
    }

    /* renamed from: a */
    public final C6806b mo16624a(C19541a aVar) {
        this.f19408h = aVar;
        return this;
    }

    /* renamed from: a */
    public final C6806b mo16622a(int i) {
        this.f19404c = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
        return this;
    }

    /* renamed from: a */
    public final C6806b mo16623a(long j) {
        if (j < 60000) {
            j = 60000;
        }
        this.f19403b = j;
        return this;
    }

    /* renamed from: b */
    private synchronized void m21148b(Map<Pattern, String> map) {
        if (map != null) {
            this.f19406e.clear();
            this.f19406e.putAll(map);
        }
    }

    /* renamed from: a */
    public static C6806b m21145a(Context context) {
        if (context != null) {
            f19401i = context.getApplicationContext();
            return m21144a();
        }
        throw new IllegalArgumentException("context can't be null");
    }

    /* renamed from: b */
    private C6806b m21147b(Context context) {
        if (context == null || this.f19407g != null) {
            return this;
        }
        this.f19407g = new C6807a();
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        Context applicationContext = context.getApplicationContext();
        f19401i = applicationContext;
        applicationContext.registerReceiver(this.f19407g, intentFilter);
        return this;
    }

    /* renamed from: c */
    private void m21149c(String str) {
        if (mo16632b()) {
            for (Entry entry : this.f19405d.entrySet()) {
                if (entry.getValue() != null) {
                    ((C6805a) entry.getValue()).mo16621b(str);
                }
            }
        }
    }

    /* renamed from: a */
    private synchronized void m21146a(Map<String, List<C19539b>> map) {
        if (map != null) {
            this.f19405d.clear();
            for (Entry entry : map.entrySet()) {
                this.f19405d.put(entry.getKey(), new C6805a((List) entry.getValue()));
            }
        }
    }

    /* renamed from: b */
    public final void mo16631b(String str) {
        if (mo16632b()) {
            new StringBuilder("on link api success:").append(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        return r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.p280ss.android.p294e.C6805a m21150d(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00a7 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r5)
            return r1
        L_0x000a:
            java.net.URI r0 = java.net.URI.create(r6)     // Catch:{ Exception -> 0x0026 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0026 }
            r2.<init>()     // Catch:{ Exception -> 0x0026 }
            java.lang.String r3 = r0.getHost()     // Catch:{ Exception -> 0x0026 }
            r2.append(r3)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0026 }
            r2.append(r0)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0026 }
            goto L_0x0050
        L_0x0026:
            java.lang.String r0 = "?"
            int r0 = r6.indexOf(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r2 = "#"
            int r2 = r6.indexOf(r2)     // Catch:{ all -> 0x00a7 }
            int r3 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x00a7 }
            r4 = -1
            if (r3 != r4) goto L_0x003d
            int r3 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x003d:
            java.lang.String r0 = "://"
            int r0 = r6.indexOf(r0)     // Catch:{ all -> 0x00a7 }
            int r0 = r0 + 3
            if (r3 == r4) goto L_0x004c
            java.lang.String r0 = r6.substring(r0, r3)     // Catch:{ all -> 0x00a7 }
            goto L_0x0050
        L_0x004c:
            java.lang.String r0 = r6.substring(r0)     // Catch:{ all -> 0x00a7 }
        L_0x0050:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00a7 }
            if (r2 == 0) goto L_0x0058
            monitor-exit(r5)
            return r1
        L_0x0058:
            java.util.Map<java.util.regex.Pattern, java.lang.String> r2 = r5.f19406e     // Catch:{ all -> 0x00a7 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a7 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a7 }
        L_0x0062:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a7 }
            if (r3 == 0) goto L_0x00a5
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a7 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a7 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00a7 }
            java.util.regex.Pattern r4 = (java.util.regex.Pattern) r4     // Catch:{ all -> 0x00a7 }
            java.util.regex.Matcher r4 = r4.matcher(r0)     // Catch:{ all -> 0x00a7 }
            boolean r4 = r4.matches()     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = "path group key = "
            r1.<init>(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a7 }
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            java.lang.String r4 = " for "
            r1.append(r4)     // Catch:{ all -> 0x00a7 }
            r1.append(r6)     // Catch:{ all -> 0x00a7 }
            java.util.Map<java.lang.String, com.ss.android.e.a> r1 = r5.f19405d     // Catch:{ all -> 0x00a7 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x00a7 }
            com.ss.android.e.a r1 = (com.p280ss.android.p294e.C6805a) r1     // Catch:{ all -> 0x00a7 }
            if (r1 != 0) goto L_0x00a5
            goto L_0x0062
        L_0x00a5:
            monitor-exit(r5)
            return r1
        L_0x00a7:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p294e.C6806b.m21150d(java.lang.String):com.ss.android.e.a");
    }

    /* renamed from: a */
    public final C6806b mo16626a(boolean z) {
        this.f19402a = z;
        return this;
    }

    /* renamed from: a */
    public final String mo16627a(String str) {
        if (!mo16632b()) {
            return str;
        }
        C6805a d = m21150d(str);
        if (d != null) {
            return d.mo16618a(str);
        }
        return str;
    }

    /* renamed from: a */
    public final void mo16628a(C6805a aVar) {
        if (mo16632b()) {
            for (Entry entry : this.f19405d.entrySet()) {
                if (entry.getValue() != null) {
                    new StringBuilder("need opt = ").append((String) entry.getKey());
                    ((C6805a) entry.getValue()).mo16619a();
                }
            }
        }
    }

    /* renamed from: a */
    public final C6806b mo16625a(Map<String, List<C19539b>> map, Map<Pattern, String> map2) {
        m21146a(map);
        m21148b(map2);
        return this;
    }
}
