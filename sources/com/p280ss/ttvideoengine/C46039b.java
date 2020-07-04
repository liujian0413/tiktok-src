package com.p280ss.ttvideoengine;

import android.os.Handler;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.b */
public class C46039b {

    /* renamed from: a */
    public static C46039b f117602a = null;

    /* renamed from: c */
    public static String f117603c = "EEE, dd MMM yyy hh:mm:ss";

    /* renamed from: d */
    public static String f117604d = "yyyyMMdd'T'HHmmss'Z'";

    /* renamed from: b */
    public volatile C46042c f117605b;

    /* renamed from: e */
    public Handler f117606e;

    /* renamed from: f */
    private volatile Map<String, C46041b> f117607f;

    /* renamed from: g */
    private volatile Map<String, Runnable> f117608g;

    /* renamed from: h */
    private int f117609h = 600000;

    /* renamed from: com.ss.ttvideoengine.b$a */
    class C46040a implements Runnable {

        /* renamed from: b */
        private String f117611b;

        public final void run() {
        }

        public C46040a(String str) {
            this.f117611b = str;
        }
    }

    /* renamed from: com.ss.ttvideoengine.b$b */
    public static class C46041b {

        /* renamed from: a */
        public String f117612a;

        /* renamed from: b */
        public String f117613b;

        /* renamed from: c */
        public String f117614c;

        /* renamed from: d */
        public String f117615d;

        /* renamed from: e */
        public long f117616e;

        /* renamed from: f */
        public String f117617f;

        /* renamed from: g */
        public long f117618g;

        /* renamed from: h */
        public long f117619h;

        /* renamed from: a */
        public final long mo112127a() {
            if (this.f117618g > 0) {
                return (System.currentTimeMillis() - this.f117619h) + this.f117618g;
            }
            return -1;
        }

        public final String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("AccessKeyId", this.f117612a);
                jSONObject.put("SecretAccessKey", this.f117613b);
                jSONObject.put("SessionToken", this.f117614c);
                jSONObject.put("ExpiredTime", this.f117615d);
                jSONObject.put("CurTime", this.f117617f);
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    /* renamed from: com.ss.ttvideoengine.b$c */
    public class C46042c {

        /* renamed from: a */
        public long f117620a = -1;

        /* renamed from: b */
        public long f117621b = -1;

        /* renamed from: c */
        public boolean f117622c;

        /* renamed from: a */
        private long m144248a() {
            if (this.f117622c) {
                return (System.currentTimeMillis() - this.f117621b) + this.f117620a;
            }
            return -1;
        }

        public C46042c() {
        }

        /* renamed from: a */
        public final String mo112129a(String str) {
            long a = m144248a();
            if (a == -1) {
                a = System.currentTimeMillis();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat.format(Long.valueOf(a));
        }
    }

    /* renamed from: a */
    public static C46039b m144243a() {
        if (f117602a == null) {
            synchronized (C46039b.class) {
                if (f117602a == null) {
                    f117602a = new C46039b();
                }
            }
        }
        return f117602a;
    }

    private C46039b() {
        if (this.f117606e == null) {
            this.f117606e = new Handler(C46122g.m144534c());
        }
        this.f117605b = new C46042c();
        this.f117607f = new HashMap();
        this.f117608g = new HashMap();
    }

    /* renamed from: b */
    public final synchronized void mo112125b(String str) {
        m144244a(str, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p280ss.ttvideoengine.C46039b.C46041b mo112124a(java.lang.String r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Map<java.lang.String, com.ss.ttvideoengine.b$b> r0 = r8.f117607f     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x0035 }
            com.ss.ttvideoengine.b$b r0 = (com.p280ss.ttvideoengine.C46039b.C46041b) r0     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0013
            r8.m144244a(r9, r1)     // Catch:{ all -> 0x0035 }
            r9 = 0
            monitor-exit(r8)
            return r9
        L_0x0013:
            long r3 = r0.f117616e     // Catch:{ all -> 0x0035 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            long r3 = r0.f117618g     // Catch:{ all -> 0x0035 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0033
            long r3 = r0.f117616e     // Catch:{ all -> 0x0035 }
            long r5 = r0.mo112127a()     // Catch:{ all -> 0x0035 }
            r7 = 0
            long r3 = r3 - r5
            int r5 = r8.f117609h     // Catch:{ all -> 0x0035 }
            int r5 = r5 + -30000
            long r5 = (long) r5     // Catch:{ all -> 0x0035 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0033
            r8.m144244a(r9, r1)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r8)
            return r0
        L_0x0035:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.C46039b.mo112124a(java.lang.String):com.ss.ttvideoengine.b$b");
    }

    /* renamed from: a */
    private void m144244a(String str, long j) {
        Runnable runnable = (Runnable) this.f117608g.get(str);
        if (runnable == null) {
            runnable = new C46040a(str);
            this.f117608g.put(str, runnable);
        } else {
            this.f117606e.removeCallbacks(runnable);
        }
        this.f117606e.postDelayed(runnable, 0);
    }
}
