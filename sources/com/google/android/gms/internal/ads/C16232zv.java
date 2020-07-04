package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15333p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.zv */
public final class C16232zv implements aag {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static List<Future<Void>> f45481a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private static ScheduledExecutorService f45482b = C16233zw.m52657a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final bbx f45483c;

    /* renamed from: d */
    private final LinkedHashMap<String, bce> f45484d;

    /* renamed from: e */
    private final List<String> f45485e = new ArrayList();

    /* renamed from: f */
    private final List<String> f45486f = new ArrayList();

    /* renamed from: g */
    private final Context f45487g;

    /* renamed from: h */
    private final aai f45488h;

    /* renamed from: i */
    private boolean f45489i;

    /* renamed from: j */
    private final zzbbq f45490j;

    /* renamed from: k */
    private final aaj f45491k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f45492l = new Object();

    /* renamed from: m */
    private HashSet<String> f45493m = new HashSet<>();

    /* renamed from: n */
    private boolean f45494n = false;

    /* renamed from: o */
    private boolean f45495o = false;

    /* renamed from: p */
    private boolean f45496p = false;

    public C16232zv(Context context, zzbgz zzbgz, zzbbq zzbbq, String str, aai aai) {
        C15267r.m44385a(zzbbq, (Object) "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f45487g = context;
        this.f45484d = new LinkedHashMap<>();
        this.f45488h = aai;
        this.f45490j = zzbbq;
        for (String lowerCase : this.f45490j.f45673e) {
            this.f45493m.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.f45493m.remove("cookie".toLowerCase(Locale.ENGLISH));
        bbx bbx = new bbx();
        bbx.f41391c = Integer.valueOf(8);
        bbx.f41392d = str;
        bbx.f41393e = str;
        bbx.f41394f = new bby();
        bbx.f41394f.f41409c = this.f45490j.f45669a;
        bcf bcf = new bcf();
        bcf.f41432c = zzbgz.f45677a;
        bcf.f41434e = Boolean.valueOf(C15176d.m44159a(this.f45487g).mo38464a());
        long apkVersion = (long) C15167c.getInstance().getApkVersion(this.f45487g);
        if (apkVersion > 0) {
            bcf.f41433d = Long.valueOf(apkVersion);
        }
        bbx.f41398j = bcf;
        this.f45483c = bbx;
        this.f45491k = new aaj(this.f45487g, this.f45490j.f45676h, this);
    }

    /* renamed from: a */
    public final zzbbq mo39027a() {
        return this.f45490j;
    }

    /* renamed from: a */
    public final void mo39029a(String str) {
        synchronized (this.f45492l) {
            this.f45483c.f41396h = str;
        }
    }

    /* renamed from: b */
    public final boolean mo39032b() {
        return C15333p.m44598e() && this.f45490j.f45671c && !this.f45495o;
    }

    /* renamed from: a */
    public final void mo39028a(View view) {
        if (this.f45490j.f45671c && !this.f45495o) {
            Bitmap b = acl.m45541b(view);
            if (b == null) {
                aaf.m45288a("Failed to capture the webview bitmap.");
                return;
            }
            this.f45495o = true;
            acl.m45531a((Runnable) new C16236zz(this, b));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39030a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f45492l
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x000d
            r2 = 1
            r6.f45496p = r2     // Catch:{ all -> 0x000a }
            goto L_0x000d
        L_0x000a:
            r7 = move-exception
            goto L_0x00ca
        L_0x000d:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.bce> r2 = r6.f45484d     // Catch:{ all -> 0x000a }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x0027
            if (r9 != r1) goto L_0x0025
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.bce> r8 = r6.f45484d     // Catch:{ all -> 0x000a }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.bce r7 = (com.google.android.gms.internal.ads.bce) r7     // Catch:{ all -> 0x000a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r7.f41426f = r8     // Catch:{ all -> 0x000a }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x0027:
            com.google.android.gms.internal.ads.bce r1 = new com.google.android.gms.internal.ads.bce     // Catch:{ all -> 0x000a }
            r1.<init>()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f41426f = r9     // Catch:{ all -> 0x000a }
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.bce> r9 = r6.f45484d     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x000a }
            r1.f41423c = r9     // Catch:{ all -> 0x000a }
            r1.f41424d = r7     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.bca r9 = new com.google.android.gms.internal.ads.bca     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            r1.f41425e = r9     // Catch:{ all -> 0x000a }
            java.util.HashSet<java.lang.String> r9 = r6.f45493m     // Catch:{ all -> 0x000a }
            int r9 = r9.size()     // Catch:{ all -> 0x000a }
            if (r9 <= 0) goto L_0x00c3
            if (r8 == 0) goto L_0x00c3
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x000a }
            r9.<init>()     // Catch:{ all -> 0x000a }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x000a }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x000a }
        L_0x005e:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x000a }
            if (r2 == 0) goto L_0x00b6
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x000a }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x000a }
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r3 == 0) goto L_0x0077
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0079
        L_0x0077:
            java.lang.String r3 = ""
        L_0x0079:
            java.lang.Object r4 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 == 0) goto L_0x0086
            java.lang.Object r2 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x0088
        L_0x0086:
            java.lang.String r2 = ""
        L_0x0088:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.util.HashSet<java.lang.String> r5 = r6.f45493m     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            boolean r4 = r5.contains(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            if (r4 != 0) goto L_0x0097
            goto L_0x005e
        L_0x0097:
            com.google.android.gms.internal.ads.bbz r4 = new com.google.android.gms.internal.ads.bbz     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f41411c = r3     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r4.f41412d = r2     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            r9.add(r4)     // Catch:{ UnsupportedEncodingException -> 0x00b0 }
            goto L_0x005e
        L_0x00b0:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            com.google.android.gms.internal.ads.aaf.m45288a(r2)     // Catch:{ all -> 0x000a }
            goto L_0x005e
        L_0x00b6:
            int r8 = r9.size()     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.bbz[] r8 = new com.google.android.gms.internal.ads.bbz[r8]     // Catch:{ all -> 0x000a }
            r9.toArray(r8)     // Catch:{ all -> 0x000a }
            com.google.android.gms.internal.ads.bca r9 = r1.f41425e     // Catch:{ all -> 0x000a }
            r9.f41414c = r8     // Catch:{ all -> 0x000a }
        L_0x00c3:
            java.util.LinkedHashMap<java.lang.String, com.google.android.gms.internal.ads.bce> r8 = r6.f45484d     // Catch:{ all -> 0x000a }
            r8.put(r7, r1)     // Catch:{ all -> 0x000a }
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            return
        L_0x00ca:
            monitor-exit(r0)     // Catch:{ all -> 0x000a }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16232zv.mo39030a(java.lang.String, java.util.Map, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42149b(String str) {
        synchronized (this.f45492l) {
            this.f45485e.add(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo42150c(String str) {
        synchronized (this.f45492l) {
            this.f45486f.add(str);
        }
    }

    /* renamed from: a */
    public final String[] mo39031a(String[] strArr) {
        return (String[]) this.f45491k.mo39035a(strArr).toArray(new String[0]);
    }

    /* renamed from: c */
    public final void mo39033c() {
        this.f45494n = true;
    }

    /* renamed from: d */
    private final bce m52643d(String str) {
        bce bce;
        synchronized (this.f45492l) {
            bce = (bce) this.f45484d.get(str);
        }
        return bce;
    }

    /* renamed from: d */
    public final void mo39034d() {
        synchronized (this.f45492l) {
            agj a = afy.m45819a(this.f45488h.mo39024a(this.f45487g, this.f45484d.keySet()), (aft<? super A, ? extends B>) new C16234zx<Object,Object>(this), ago.f40190b);
            agj a2 = afy.m45818a(a, 10, TimeUnit.SECONDS, f45482b);
            afy.m45824a(a, (afv<? super V>) new aaa<Object>(this, a2), ago.f40190b);
            f45481a.add(a2);
        }
    }

    /* renamed from: f */
    private final agj<Void> m52645f() {
        agj<Void> a;
        bce[] bceArr;
        if (!((this.f45489i && this.f45490j.f45675g) || (this.f45496p && this.f45490j.f45674f) || (!this.f45489i && this.f45490j.f45672d))) {
            return afy.m45817a(null);
        }
        synchronized (this.f45492l) {
            this.f45483c.f41395g = new bce[this.f45484d.size()];
            this.f45484d.values().toArray(this.f45483c.f41395g);
            this.f45483c.f41399k = (String[]) this.f45485e.toArray(new String[0]);
            this.f45483c.f41400l = (String[]) this.f45486f.toArray(new String[0]);
            if (aaf.m45289a()) {
                String str = this.f45483c.f41392d;
                String str2 = this.f45483c.f41396h;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (bce bce : this.f45483c.f41395g) {
                    sb2.append("    [");
                    sb2.append(bce.f41427g.length);
                    sb2.append("] ");
                    sb2.append(bce.f41424d);
                }
                aaf.m45288a(sb2.toString());
            }
            agj a2 = new aea(this.f45487g).mo39245a(1, this.f45490j.f45670b, null, bbl.m48381a((bbl) this.f45483c));
            if (aaf.m45289a()) {
                a2.mo39308a(new aab(this), acj.f39998a);
            }
            a = afy.m45820a(a2, C16235zy.f45498a, ago.f40190b);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ agj mo42148a(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.f45492l) {
                            int length = optJSONArray.length();
                            bce d = m52643d(str);
                            if (d == null) {
                                String str2 = "Cannot find the corresponding resource object for ";
                                String valueOf = String.valueOf(str);
                                aaf.m45288a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                            } else {
                                d.f41427g = new String[length];
                                boolean z = false;
                                for (int i = 0; i < length; i++) {
                                    d.f41427g[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                boolean z2 = this.f45489i;
                                if (length > 0) {
                                    z = true;
                                }
                                this.f45489i = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                String str3 = "Failed to get SafeBrowsing metadata";
                if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43893ch)).booleanValue()) {
                    acd.m45775a(str3, e);
                }
                return afy.m45816a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.f45489i) {
            synchronized (this.f45492l) {
                this.f45483c.f41391c = Integer.valueOf(9);
            }
        }
        return m52645f();
    }
}
