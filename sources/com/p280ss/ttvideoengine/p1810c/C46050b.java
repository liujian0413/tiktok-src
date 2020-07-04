package com.p280ss.ttvideoengine.p1810c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.ttvideoengine.C46039b;
import com.p280ss.ttvideoengine.C46039b.C46041b;
import com.p280ss.ttvideoengine.Resolution;
import com.p280ss.ttvideoengine.p1809b.C46044b;
import com.p280ss.ttvideoengine.p1809b.C46044b.C46045a;
import com.p280ss.ttvideoengine.p1810c.C46047a.C46049a;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import com.p280ss.ttvideoengine.p1813f.C46102h;
import com.p280ss.ttvideoengine.p1813f.C46103i;
import com.p280ss.ttvideoengine.p1813f.C46106j;
import com.p280ss.ttvideoengine.p1813f.C46106j.C46107a;
import com.p280ss.ttvideoengine.p1816i.C46115b;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.c.b */
public final class C46050b {

    /* renamed from: a */
    public C46083h f117662a;

    /* renamed from: b */
    public boolean f117663b;

    /* renamed from: c */
    public int f117664c;

    /* renamed from: d */
    public String f117665d = "";

    /* renamed from: e */
    public C46057a f117666e;

    /* renamed from: f */
    public HashMap<String, Resolution> f117667f;

    /* renamed from: g */
    public String f117668g;

    /* renamed from: h */
    private Handler f117669h;

    /* renamed from: i */
    private int f117670i;

    /* renamed from: j */
    private String f117671j;

    /* renamed from: k */
    private C46106j f117672k;

    /* renamed from: l */
    private int f117673l;

    /* renamed from: m */
    private boolean f117674m;

    /* renamed from: n */
    private String f117675n;

    /* renamed from: o */
    private TreeMap<String, String> f117676o;

    /* renamed from: p */
    private Future f117677p;

    /* renamed from: q */
    private JSONObject f117678q;

    /* renamed from: r */
    private JSONObject f117679r;

    /* renamed from: s */
    private String f117680s;

    /* renamed from: t */
    private C46039b f117681t;

    /* renamed from: u */
    private String f117682u;

    /* renamed from: v */
    private Context f117683v;

    /* renamed from: w */
    private boolean f117684w;

    /* renamed from: x */
    private boolean f117685x = true;

    /* renamed from: y */
    private String[] f117686y = {"device_type", "device_id", "ac", "aid", "device_platform", "ab_version", "app_name", "version_code", "os_version", "menifest_version_code", "update_version_code", "user_id", "web_id", "player_version"};

    /* renamed from: z */
    private String[] f117687z = {"Action", "Version", "video_id", "codec_type", "base64", "url_type", "format_type", "ptoken", "preload", "cdn_type"};

    /* renamed from: com.ss.ttvideoengine.c.b$a */
    public interface C46057a {
        /* renamed from: a */
        void mo112097a(int i, String str);

        /* renamed from: a */
        void mo112098a(C46083h hVar, C46117c cVar);

        /* renamed from: a */
        void mo112099a(C46117c cVar);

        /* renamed from: a */
        void mo112100a(String str);
    }

    /* renamed from: com.ss.ttvideoengine.c.b$b */
    static class C46058b extends Handler {

        /* renamed from: a */
        private final WeakReference<C46050b> f117694a;

        public final void handleMessage(Message message) {
            C46050b bVar = (C46050b) this.f117694a.get();
            if (bVar != null) {
                C46057a aVar = bVar.f117666e;
                if (aVar != null) {
                    if (bVar.f117663b) {
                        aVar.mo112100a("fetcher is cancelled");
                        return;
                    }
                    switch (message.what) {
                        case 0:
                            aVar.mo112099a((C46117c) message.obj);
                            return;
                        case 1:
                            aVar.mo112098a((C46083h) null, (C46117c) message.obj);
                            return;
                        case 2:
                            C46083h hVar = (C46083h) message.obj;
                            bVar.f117662a = hVar;
                            aVar.mo112098a(hVar, (C46117c) null);
                            return;
                        case 3:
                            aVar.mo112097a(message.arg1, (String) message.obj);
                            break;
                    }
                }
            }
        }

        public C46058b(C46050b bVar, Looper looper) {
            super(looper);
            this.f117694a = new WeakReference<>(bVar);
        }
    }

    /* renamed from: a */
    public final void mo112147a(boolean z) {
        this.f117684w = z;
        if (z) {
            C46044b.m144253a(this.f117683v);
        }
    }

    /* renamed from: a */
    public final void mo112143a() {
        synchronized (this) {
            this.f117669h.removeCallbacksAndMessages(null);
            if (this.f117666e != null) {
                this.f117666e.mo112100a("fetcher cancelled");
                if (!this.f117663b) {
                    this.f117663b = true;
                    if (this.f117677p != null) {
                        this.f117677p.cancel(true);
                    }
                    this.f117672k.mo112277a();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo112148b() {
        if (this.f117684w && (TextUtils.isEmpty(this.f117665d) || !C46102h.m144481b(this.f117683v))) {
            C46115b.m144501a((Runnable) new Runnable() {
                public final void run() {
                    C46045a a = C46044b.m144252a(C46050b.this.f117668g);
                    if (a != null && !TextUtils.isEmpty(a.f117629b)) {
                        try {
                            JSONObject jSONObject = new JSONObject(a.f117629b);
                            C46123h.m144545a("VideoInfoFetcher", "using videomodel from DB");
                            C46050b.this.mo112146a(jSONObject, a);
                            return;
                        } catch (Exception e) {
                            C46123h.m144545a("VideoInfoFetcher", e.toString());
                        }
                    }
                    if (TextUtils.isEmpty(C46050b.this.f117665d)) {
                        C46050b.this.mo112149b(new C46117c("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty and no cache"));
                    } else {
                        C46050b.this.mo112150c();
                    }
                }
            });
        } else if (TextUtils.isEmpty(this.f117665d)) {
            mo112149b(new C46117c("kTTVideoErrorDomainFetchingInfo", -9999, "apistring empty"));
        } else {
            mo112150c();
        }
    }

    /* renamed from: c */
    public final void mo112150c() {
        if (this.f117673l == 3) {
            if (!TextUtils.isEmpty(this.f117665d)) {
                this.f117665d.indexOf(WebKitApi.SCHEME_HTTPS);
            }
            String a = m144278a(this.f117665d);
            if (a != null) {
                mo112149b(new C46117c("kTTVideoErrorDomainFetchingInfo", -9980, a));
            } else if (this.f117685x) {
                m144281a(this.f117665d, (JSONObject) null);
            } else {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("Env", this.f117678q);
                    jSONObject.put("Params", this.f117679r);
                    C46123h.m144545a("VideoInfoFetcher", "_fetchInfoInternal no encrypt");
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("EncryptKey", null);
                        jSONObject2.put("CipherText", null);
                        jSONObject2.put("Data", jSONObject);
                        m144281a(this.f117680s, jSONObject2);
                    } catch (JSONException e) {
                        mo112144a(new C46117c("kTTVideoErrorDomainFetchingInfo", -9979, e.toString()));
                    }
                } catch (JSONException e2) {
                    mo112144a(new C46117c("kTTVideoErrorDomainFetchingInfo", -9979, e2.toString()));
                }
            }
        } else {
            m144281a(this.f117665d, (JSONObject) null);
        }
    }

    /* renamed from: c */
    private void m144283c(C46117c cVar) {
        this.f117669h.sendMessage(this.f117669h.obtainMessage(0, cVar));
    }

    /* renamed from: b */
    public final void mo112149b(C46117c cVar) {
        this.f117669h.sendMessage(this.f117669h.obtainMessage(1, cVar));
    }

    /* renamed from: a */
    private void m144280a(C46083h hVar) {
        this.f117669h.sendMessage(this.f117669h.obtainMessage(2, hVar));
    }

    /* renamed from: b */
    private Map<String, String> m144282b(String str) {
        C46047a aVar;
        C46041b a = this.f117681t.mo112124a(this.f117682u);
        if (a == null) {
            C46123h.m144545a("VideoInfoFetcher", "AuthTimer getAuth empty");
            return null;
        }
        String str2 = a.f117614c;
        String str3 = a.f117612a;
        String str4 = a.f117613b;
        TreeMap treeMap = new TreeMap();
        treeMap.put("Host", this.f117675n);
        treeMap.put("x-amz-date", this.f117681t.f117605b.mo112129a(C46039b.f117604d));
        treeMap.put("X-Amz-Security-Token", str2);
        TreeMap<String, String> treeMap2 = this.f117676o;
        if (this.f117685x) {
            aVar = new C46049a(str3, str4).mo112135a("cn-north-1").mo112137b("vod").mo112140c("GET").mo112141d("/").mo112136a(this.f117676o).mo112138b(treeMap).mo112142e(str).mo112134a().mo112139b();
        } else {
            aVar = new C46049a(str3, str4).mo112135a("cn-langfang-1").mo112137b("vod").mo112140c("POST").mo112141d("/").mo112136a(this.f117676o).mo112138b(treeMap).mo112142e(str).mo112134a().mo112139b();
        }
        return aVar.mo112133a();
    }

    /* renamed from: a */
    private String m144278a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "_parseAPIString:apistring is empty";
        }
        try {
            this.f117675n = new URL(str).getHost();
            String[] split = str.split("[?]");
            if (split.length < 2) {
                return "_parseAPIString:apistring param is empty";
            }
            String[] split2 = split[1].split("&");
            StringBuilder sb = new StringBuilder();
            sb.append(split[0]);
            sb.append("?");
            this.f117680s = sb.toString();
            this.f117678q = new JSONObject();
            this.f117679r = new JSONObject();
            this.f117676o = new TreeMap<>();
            for (int i = 0; i < split2.length; i++) {
                if (this.f117685x) {
                    String[] split3 = split2[i].split("=");
                    this.f117676o.put(split3[0], split3[1]);
                } else if (split2[i].indexOf("Action") == 0 || split2[i].indexOf("Version") == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f117680s);
                    sb2.append(split2[i]);
                    this.f117680s = sb2.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.f117680s);
                    sb3.append("&");
                    this.f117680s = sb3.toString();
                    String[] split4 = split2[i].split("=");
                    this.f117676o.put(split4[0], split4[1]);
                } else {
                    String[] split5 = split2[i].split("=");
                    if (split5.length >= 2) {
                        String str2 = split5[0];
                        String str3 = split5[1];
                        for (int i2 = 2; i2 < split5.length; i2++) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            sb4.append("=");
                            sb4.append(split5[i2]);
                            str3 = sb4.toString();
                        }
                        int i3 = 0;
                        while (i3 < this.f117686y.length) {
                            try {
                                if (this.f117686y[i3].equals(str2)) {
                                    this.f117678q.put(str2, str3);
                                }
                                i3++;
                            } catch (JSONException unused) {
                                return "_parseAPIString:put params error";
                            }
                        }
                        for (String equals : this.f117687z) {
                            if (equals.equals(str2)) {
                                this.f117679r.put(str2, str3);
                            }
                        }
                    }
                }
            }
            this.f117680s = this.f117680s.substring(0, this.f117680s.length() - 1);
            return null;
        } catch (Throwable unused2) {
            return "_parseAPIString:apistring to URL error";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00df, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112144a(com.p280ss.ttvideoengine.p1816i.C46117c r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f117663b     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            return
        L_0x0007:
            r0 = -9994(0xffffffffffffd8f6, float:NaN)
            if (r5 == 0) goto L_0x003b
            java.lang.String r1 = r5.f118006c     // Catch:{ all -> 0x00e0 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0026
            int r1 = r5.f118004a     // Catch:{ all -> 0x00e0 }
            r2 = -9979(0xffffffffffffd905, float:NaN)
            if (r1 != r2) goto L_0x0026
            com.ss.ttvideoengine.i.c r0 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "kTTVideoErrorDomainFetchingInfo"
            int r3 = r5.f118005b     // Catch:{ all -> 0x00e0 }
            java.lang.String r5 = r5.f118007d     // Catch:{ all -> 0x00e0 }
            r0.<init>(r1, r2, r3, r5)     // Catch:{ all -> 0x00e0 }
            r5 = r0
            goto L_0x0042
        L_0x0026:
            java.lang.String r1 = r5.f118006c     // Catch:{ all -> 0x00e0 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00e0 }
            if (r1 == 0) goto L_0x0042
            com.ss.ttvideoengine.i.c r1 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = "kTTVideoErrorDomainFetchingInfo"
            int r3 = r5.f118005b     // Catch:{ all -> 0x00e0 }
            java.lang.String r5 = r5.f118007d     // Catch:{ all -> 0x00e0 }
            r1.<init>(r2, r0, r3, r5)     // Catch:{ all -> 0x00e0 }
            r5 = r1
            goto L_0x0042
        L_0x003b:
            com.ss.ttvideoengine.i.c r5 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "kTTVideoErrorDomainFetchingInfo"
            r5.<init>(r1, r0)     // Catch:{ all -> 0x00e0 }
        L_0x0042:
            int r0 = r5.f118004a     // Catch:{ all -> 0x00e0 }
            r1 = -9969(0xffffffffffffd90f, float:NaN)
            if (r0 != r1) goto L_0x00a2
            int r0 = r5.f118005b     // Catch:{ all -> 0x00e0 }
            int r0 = r0 / 10000
            r1 = 10
            r2 = -9970(0xffffffffffffd90e, float:NaN)
            if (r0 == r1) goto L_0x005c
            int r0 = r5.f118005b     // Catch:{ all -> 0x00e0 }
            if (r0 != r2) goto L_0x0057
            goto L_0x005c
        L_0x0057:
            r0 = -9990(0xffffffffffffd8fa, float:NaN)
            r5.f118004a = r0     // Catch:{ all -> 0x00e0 }
            goto L_0x0075
        L_0x005c:
            int r0 = r4.f117673l     // Catch:{ all -> 0x00e0 }
            r1 = 3
            if (r0 != r1) goto L_0x0075
            int r0 = r5.f118005b     // Catch:{ all -> 0x00e0 }
            if (r0 == r2) goto L_0x006e
            r1 = 100009(0x186a9, float:1.40142E-40)
            if (r0 == r1) goto L_0x006e
            switch(r0) {
                case 100012: goto L_0x006e;
                case 100013: goto L_0x006e;
                default: goto L_0x006d;
            }     // Catch:{ all -> 0x00e0 }
        L_0x006d:
            goto L_0x0075
        L_0x006e:
            com.ss.ttvideoengine.b r0 = r4.f117681t     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r4.f117682u     // Catch:{ all -> 0x00e0 }
            r0.mo112125b(r1)     // Catch:{ all -> 0x00e0 }
        L_0x0075:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "<apiStr:"
            r0.<init>(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r4.f117665d     // Catch:{ all -> 0x00e0 }
            r0.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = ">"
            r0.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r5.f118007d     // Catch:{ all -> 0x00e0 }
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            r5.f118007d = r0     // Catch:{ all -> 0x00e0 }
            r4.mo112149b(r5)     // Catch:{ all -> 0x00e0 }
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            return
        L_0x00a2:
            int r0 = r4.f117670i     // Catch:{ all -> 0x00e0 }
            if (r0 > 0) goto L_0x00b3
            r4.m144283c(r5)     // Catch:{ all -> 0x00e0 }
            int r5 = r4.f117670i     // Catch:{ all -> 0x00e0 }
            int r5 = r5 + 1
            r4.f117670i = r5     // Catch:{ all -> 0x00e0 }
            r4.mo112148b()     // Catch:{ all -> 0x00e0 }
            goto L_0x00de
        L_0x00b3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = "<apiStr:"
            r0.<init>(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = r4.f117665d     // Catch:{ all -> 0x00e0 }
            r0.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r1 = ">"
            r0.append(r1)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r2 = r5.f118007d     // Catch:{ all -> 0x00e0 }
            r1.append(r2)     // Catch:{ all -> 0x00e0 }
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            r5.f118007d = r0     // Catch:{ all -> 0x00e0 }
            r4.mo112149b(r5)     // Catch:{ all -> 0x00e0 }
        L_0x00de:
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            return
        L_0x00e0:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e0 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1810c.C46050b.mo112144a(com.ss.ttvideoengine.i.c):void");
    }

    /* renamed from: a */
    private void m144279a(int i, String str) {
        this.f117669h.sendMessage(this.f117669h.obtainMessage(3, i, 0, str));
    }

    public C46050b(Context context, C46106j jVar) {
        C46106j jVar2 = jVar;
        this.f117683v = context;
        this.f117669h = new C46058b(this, C46122g.m144534c());
        this.f117681t = C46039b.m144243a();
        if (jVar2 == null) {
            this.f117674m = false;
            this.f117672k = new C46103i();
        } else {
            this.f117674m = true;
            this.f117672k = jVar2;
        }
        this.f117682u = "";
    }

    /* renamed from: a */
    private void m144281a(String str, JSONObject jSONObject) {
        Map b;
        HashMap hashMap = null;
        switch (this.f117673l) {
            case 0:
            case 1:
            case 2:
                if (!TextUtils.isEmpty(this.f117671j)) {
                    hashMap = new HashMap();
                    hashMap.put("Authorization", this.f117671j);
                }
                HashMap hashMap2 = hashMap;
                Method[] declaredMethods = this.f117672k.getClass().getDeclaredMethods();
                boolean z = false;
                if (declaredMethods != null && declaredMethods.length > 0) {
                    int length = declaredMethods.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            Method method = declaredMethods[i];
                            if (method == null || method.getName() == null || !method.getName().equals("startTask") || method.getParameterTypes().length != 5) {
                                i++;
                            } else {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    this.f117672k.mo112278a(str, hashMap2, new C46107a() {
                        /* renamed from: a */
                        public final void mo112153a(JSONObject jSONObject, C46117c cVar) {
                            if (jSONObject != null || cVar == null) {
                                C46050b.this.mo112146a(jSONObject, (C46045a) null);
                            } else {
                                C46050b.this.mo112144a(cVar);
                            }
                        }
                    });
                    break;
                } else {
                    this.f117672k.mo112279a(str, hashMap2, null, 0, new C46107a() {
                        /* renamed from: a */
                        public final void mo112153a(JSONObject jSONObject, C46117c cVar) {
                            if (jSONObject != null || cVar == null) {
                                C46050b.this.mo112146a(jSONObject, (C46045a) null);
                            } else {
                                C46050b.this.mo112144a(cVar);
                            }
                        }
                    });
                    return;
                }
            case 3:
                if (this.f117685x) {
                    b = m144282b((String) null);
                } else {
                    b = m144282b(jSONObject.toString());
                }
                Map map = b;
                if (map == null) {
                    mo112144a(new C46117c("kTTVideoErrorDomainFetchingInfo", -9969, -9970, "auth is empty"));
                    return;
                } else if (this.f117685x) {
                    this.f117672k.mo112279a(str, map, null, 0, new C46107a() {
                        /* renamed from: a */
                        public final void mo112153a(JSONObject jSONObject, C46117c cVar) {
                            if (jSONObject != null || cVar == null) {
                                C46050b.this.mo112146a(jSONObject, (C46045a) null);
                            } else {
                                C46050b.this.mo112144a(cVar);
                            }
                        }
                    });
                    return;
                } else {
                    this.f117672k.mo112279a(str, map, jSONObject, 1, new C46107a() {
                        /* renamed from: a */
                        public final void mo112153a(JSONObject jSONObject, C46117c cVar) {
                            if (jSONObject != null || cVar == null) {
                                C46050b.this.mo112146a(jSONObject, (C46045a) null);
                            } else {
                                C46050b.this.mo112144a(cVar);
                            }
                        }
                    });
                    return;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0142, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0165, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo112146a(org.json.JSONObject r8, com.p280ss.ttvideoengine.p1809b.C46044b.C46045a r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f117663b     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x0164
            if (r8 != 0) goto L_0x0009
            goto L_0x0164
        L_0x0009:
            com.ss.ttvideoengine.e.h r0 = new com.ss.ttvideoengine.e.h     // Catch:{ all -> 0x0166 }
            r0.<init>()     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "ResponseMetadata"
            boolean r1 = r8.has(r1)     // Catch:{ all -> 0x0166 }
            r2 = 10
            r3 = -9976(0xffffffffffffd908, float:NaN)
            r4 = 4
            if (r1 != 0) goto L_0x0075
            java.lang.String r1 = "Result"
            boolean r1 = r8.has(r1)     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0024
            goto L_0x0075
        L_0x0024:
            r0.mo112230a(r8)     // Catch:{ Throwable -> 0x0064 }
            java.lang.String r1 = "code"
            int r1 = r8.optInt(r1)     // Catch:{ all -> 0x0166 }
            java.lang.String r3 = "message"
            java.lang.String r3 = r8.optString(r3)     // Catch:{ all -> 0x0166 }
            com.ss.ttvideoengine.e.i r5 = r0.f117858d     // Catch:{ all -> 0x0166 }
            if (r5 == 0) goto L_0x0050
            int r5 = r0.mo112223a(r4)     // Catch:{ all -> 0x0166 }
            if (r5 == r2) goto L_0x0050
            int r2 = r0.mo112223a(r4)     // Catch:{ all -> 0x0166 }
            if (r2 == 0) goto L_0x0050
            int r2 = r7.f117664c     // Catch:{ all -> 0x0166 }
            if (r2 != 0) goto L_0x0050
            int r8 = r0.mo112223a(r4)     // Catch:{ all -> 0x0166 }
            r7.m144279a(r8, r3)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x0050:
            if (r1 == 0) goto L_0x0109
            com.ss.ttvideoengine.i.c r9 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "kTTVideoErrorDomainFetchingInfo"
            r2 = -9990(0xffffffffffffd8fa, float:NaN)
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0166 }
            r9.<init>(r0, r2, r1, r8)     // Catch:{ all -> 0x0166 }
            r7.mo112149b(r9)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x0064:
            r8 = move-exception
            com.ss.ttvideoengine.i.c r9 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "kTTVideoErrorDomainFetchingInfo"
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0166 }
            r9.<init>(r0, r3, r8)     // Catch:{ all -> 0x0166 }
            r7.mo112144a(r9)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x0075:
            java.lang.String r1 = "ResponseMetadata"
            org.json.JSONObject r1 = r8.optJSONObject(r1)     // Catch:{ all -> 0x0166 }
            if (r1 != 0) goto L_0x007f
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x007f:
            java.lang.String r5 = "Error"
            org.json.JSONObject r5 = r1.optJSONObject(r5)     // Catch:{ all -> 0x0166 }
            if (r5 == 0) goto L_0x00b9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0166 }
            r8.<init>()     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x0166 }
            r8.append(r9)     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = " RequestId:"
            r8.append(r9)     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = "RequestId"
            java.lang.String r9 = r1.optString(r9)     // Catch:{ all -> 0x0166 }
            r8.append(r9)     // Catch:{ all -> 0x0166 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = "CodeN"
            int r9 = r5.optInt(r9)     // Catch:{ all -> 0x0166 }
            com.ss.ttvideoengine.i.c r0 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "kTTVideoErrorDomainFetchingInfo"
            r2 = -9969(0xffffffffffffd90f, float:NaN)
            r0.<init>(r1, r2, r9, r8)     // Catch:{ all -> 0x0166 }
            r7.mo112144a(r0)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x00b9:
            java.lang.String r1 = "Result"
            org.json.JSONObject r1 = r8.optJSONObject(r1)     // Catch:{ all -> 0x0166 }
            r5 = -9997(0xffffffffffffd8f3, float:NaN)
            if (r1 != 0) goto L_0x00d1
            com.ss.ttvideoengine.i.c r8 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = "kTTVideoErrorDomainFetchingInfo"
            java.lang.String r0 = "fetched info Result is empty"
            r8.<init>(r9, r5, r0)     // Catch:{ all -> 0x0166 }
            r7.mo112144a(r8)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x00d1:
            java.lang.String r6 = "Data"
            org.json.JSONObject r1 = r1.optJSONObject(r6)     // Catch:{ Throwable -> 0x0151 }
            if (r1 != 0) goto L_0x00e7
            com.ss.ttvideoengine.i.c r8 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = "kTTVideoErrorDomainFetchingInfo"
            java.lang.String r0 = "fetched info Result is empty after decrypt"
            r8.<init>(r9, r5, r0)     // Catch:{ all -> 0x0166 }
            r7.mo112144a(r8)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x00e7:
            r0.mo112230a(r1)     // Catch:{ Throwable -> 0x0143 }
            com.ss.ttvideoengine.e.i r1 = r0.f117858d     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0109
            int r1 = r0.mo112223a(r4)     // Catch:{ all -> 0x0166 }
            if (r1 == r2) goto L_0x0109
            int r1 = r0.mo112223a(r4)     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0109
            int r1 = r7.f117664c     // Catch:{ all -> 0x0166 }
            if (r1 != 0) goto L_0x0109
            int r8 = r0.mo112223a(r4)     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = "ver2 server side error,hh"
            r7.m144279a(r8, r9)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x0109:
            java.util.HashMap<java.lang.String, com.ss.ttvideoengine.Resolution> r1 = r7.f117667f     // Catch:{ all -> 0x0166 }
            r0.mo112229a(r1)     // Catch:{ all -> 0x0166 }
            r7.m144280a(r0)     // Catch:{ all -> 0x0166 }
            boolean r1 = r7.f117684w     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0141
            if (r9 != 0) goto L_0x012c
            java.lang.String r9 = r7.f117668g     // Catch:{ all -> 0x0166 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0166 }
            com.p280ss.ttvideoengine.p1809b.C46044b.m144254a(r9, r8)     // Catch:{ all -> 0x0166 }
            com.ss.ttvideoengine.ad r8 = com.p280ss.ttvideoengine.C46036ad.m144236a()     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = r7.f117668g     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = r7.f117665d     // Catch:{ all -> 0x0166 }
            r8.mo112123a(r9, r1, r0)     // Catch:{ all -> 0x0166 }
            goto L_0x0141
        L_0x012c:
            com.ss.ttvideoengine.ad$a r8 = new com.ss.ttvideoengine.ad$a     // Catch:{ all -> 0x0166 }
            r8.<init>()     // Catch:{ all -> 0x0166 }
            r8.f117599a = r0     // Catch:{ all -> 0x0166 }
            long r0 = r9.f117628a     // Catch:{ all -> 0x0166 }
            r8.f117600b = r0     // Catch:{ all -> 0x0166 }
            com.ss.ttvideoengine.ad r9 = com.p280ss.ttvideoengine.C46036ad.m144236a()     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r7.f117668g     // Catch:{ all -> 0x0166 }
            r1 = 0
            r9.mo112122a(r0, r1, r8)     // Catch:{ all -> 0x0166 }
        L_0x0141:
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x0143:
            com.ss.ttvideoengine.i.c r8 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x0166 }
            java.lang.String r9 = "kTTVideoErrorDomainFetchingInfo"
            java.lang.String r0 = "fetched info Result is empty after decrypt"
            r8.<init>(r9, r3, r0)     // Catch:{ all -> 0x0166 }
            r7.mo112144a(r8)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x0151:
            r8 = move-exception
            com.ss.ttvideoengine.i.c r9 = new com.ss.ttvideoengine.i.c     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = "kTTVideoErrorDomainFetchingInfo"
            r1 = -9977(0xffffffffffffd907, float:NaN)
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0166 }
            r9.<init>(r0, r1, r8)     // Catch:{ all -> 0x0166 }
            r7.mo112144a(r9)     // Catch:{ all -> 0x0166 }
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x0164:
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            return
        L_0x0166:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0166 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1810c.C46050b.mo112146a(org.json.JSONObject, com.ss.ttvideoengine.b.b$a):void");
    }

    /* renamed from: a */
    public final void mo112145a(String str, String str2, int i) {
        this.f117665d = str;
        this.f117671j = str2;
        this.f117670i = 0;
        this.f117673l = i;
        if (this.f117673l == 3) {
            this.f117677p = C46115b.m144501a((Runnable) new Runnable() {
                public final void run() {
                    C46050b.this.mo112148b();
                }
            });
        } else {
            mo112148b();
        }
    }

    public C46050b(Context context, C46106j jVar, String str) {
        C46106j jVar2 = jVar;
        this.f117683v = context;
        this.f117669h = new C46058b(this, C46122g.m144534c());
        this.f117681t = C46039b.m144243a();
        if (jVar2 == null) {
            this.f117674m = false;
            this.f117672k = new C46103i();
        } else {
            this.f117674m = true;
            this.f117672k = jVar2;
        }
        this.f117682u = str;
    }
}
