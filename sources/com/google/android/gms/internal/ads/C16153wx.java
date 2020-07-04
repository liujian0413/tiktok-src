package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.wx */
public final class C16153wx extends C16130wa {

    /* renamed from: a */
    private static final Object f45275a = new Object();

    /* renamed from: b */
    private static C16153wx f45276b;

    /* renamed from: c */
    private final Context f45277c;

    /* renamed from: d */
    private final C16152ww f45278d;

    /* renamed from: e */
    private final ScheduledExecutorService f45279e = C16154wy.m52342a();

    /* renamed from: a */
    public static C16153wx m52333a(Context context, C16152ww wwVar) {
        C16153wx wxVar;
        synchronized (f45275a) {
            if (f45276b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                C15585bw.m50188a(context);
                f45276b = new C16153wx(context, wwVar);
                if (context.getApplicationContext() != null) {
                    C14793ay.m42895a().mo39179c(context);
                }
                acb.m45435a(context);
            }
            wxVar = f45276b;
        }
        return wxVar;
    }

    /* renamed from: a */
    public final void mo42043a(zzaxx zzaxx, C16135wf wfVar) {
        acd.m45438a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final void mo42044b(zzaxx zzaxx, C16135wf wfVar) {
        acd.m45438a("Nonagon code path entered in octagon");
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    private static zzaxi m52334a(Context context, C16152ww wwVar, zzaxe zzaxe, ScheduledExecutorService scheduledExecutorService) {
        String str;
        char c;
        Context context2 = context;
        C16152ww wwVar2 = wwVar;
        zzaxe zzaxe2 = zzaxe;
        ScheduledExecutorService scheduledExecutorService2 = scheduledExecutorService;
        acd.m45777b("Starting ad request from service using: google.afma.request.getAdDictionary");
        C15600ck ckVar = new C15600ck(((Boolean) bym.m50299d().mo41272a(C15585bw.f43740N)).booleanValue(), "load_ad", zzaxe2.f45574d.f45798a);
        if (zzaxe2.f45564a > 10 && zzaxe2.f45538A != -1) {
            ckVar.mo41460a(ckVar.mo41455a(zzaxe2.f45538A), "cts");
        }
        C15598ci a = ckVar.mo41454a();
        agj a2 = afy.m45818a(wwVar2.f45271g.mo41964a(context2), ((Long) bym.m50299d().mo41272a(C15585bw.f43892cg)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future a3 = afy.m45817a(null);
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43879cT)).booleanValue()) {
            a3 = wwVar2.f45266b.mo39068a(zzaxe2.f45577g.packageName);
        }
        agj b = wwVar2.f45266b.mo39069b(zzaxe2.f45577g.packageName);
        agj a4 = wwVar2.f45272h.mo39071a(zzaxe2.f45578h, zzaxe2.f45577g);
        Future a5 = C14793ay.m42904j().mo42064a(context2);
        agj a6 = afy.m45817a(null);
        Bundle bundle = zzaxe2.f45573c.f45779c;
        boolean z = (bundle == null || bundle.getString("_ad") == null) ? false : true;
        if (zzaxe2.f45544G && !z) {
            a6 = wwVar2.f45269e.mo41773a(zzaxe2.f45576f);
        }
        C15598ci ciVar = a;
        agj a7 = afy.m45818a(a6, ((Long) bym.m50299d().mo41272a(C15585bw.f43830bX)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        Future a8 = afy.m45817a(null);
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43758aE)).booleanValue()) {
            a8 = afy.m45818a(wwVar2.f45272h.mo39070a(context2), ((Long) bym.m50299d().mo41272a(C15585bw.f43759aF)).longValue(), TimeUnit.MILLISECONDS, scheduledExecutorService2);
        }
        Bundle bundle2 = (zzaxe2.f45564a < 4 || zzaxe2.f45585o == null) ? null : zzaxe2.f45585o;
        if (acl.m45535a(context2, "android.permission.ACCESS_NETWORK_STATE") && ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
            acd.m45777b("Device is offline.");
        }
        if (zzaxe2.f45564a >= 7) {
            str = zzaxe2.f45592v;
        } else {
            str = UUID.randomUUID().toString();
        }
        if (zzaxe2.f45573c.f45779c != null) {
            String string = zzaxe2.f45573c.f45779c.getString("_ad");
            if (string != null) {
                return C16160xd.m52360a(context2, zzaxe2, string);
            }
        }
        List<String> a9 = wwVar2.f45267c.mo40773a(zzaxe2.f45593w);
        Object obj = str;
        C15600ck ckVar2 = ckVar;
        Bundle bundle3 = (Bundle) afy.m45823a((Future<T>) a2, null, ((Long) bym.m50299d().mo41272a(C15585bw.f43892cg)).longValue(), TimeUnit.MILLISECONDS);
        Location location = (Location) afy.m45822a((Future<T>) a7, null);
        C14734a aVar = (C14734a) afy.m45822a(a8, null);
        String str2 = (String) afy.m45822a((Future<T>) a4, null);
        String str3 = (String) afy.m45822a(a3, null);
        String str4 = (String) afy.m45822a((Future<T>) b, null);
        C16164xh xhVar = (C16164xh) afy.m45822a(a5, null);
        if (xhVar == null) {
            acd.m45783e("Error fetching device info. This is not recoverable.");
            return new zzaxi(0);
        }
        C16151wv wvVar = new C16151wv();
        wvVar.f45261i = zzaxe2;
        wvVar.f45262j = xhVar;
        wvVar.f45256d = location;
        wvVar.f45254b = bundle3;
        wvVar.f45259g = str2;
        wvVar.f45260h = aVar;
        if (a9 == null) {
            wvVar.f45255c.clear();
        }
        wvVar.f45255c = a9;
        wvVar.f45253a = bundle2;
        wvVar.f45257e = str3;
        wvVar.f45258f = str4;
        wvVar.f45263k = wwVar2.f45265a.mo41403a(context2);
        wvVar.f45264l = wwVar2.f45273i;
        JSONObject a10 = C16160xd.m52364a(context2, wvVar);
        if (a10 == null) {
            return new zzaxi(0);
        }
        if (zzaxe2.f45564a < 7) {
            try {
                a10.put("request_id", obj);
            } catch (JSONException unused) {
            }
        }
        C15598ci ciVar2 = ciVar;
        C15600ck ckVar3 = ckVar2;
        ckVar3.mo41460a(ciVar2, "arc");
        ScheduledExecutorService scheduledExecutorService3 = scheduledExecutorService;
        agj a11 = afy.m45818a(afy.m45819a(wwVar2.f45274j.mo42058a().mo41767b(a10), C16155wz.f45280a, (Executor) scheduledExecutorService3), 10, TimeUnit.SECONDS, scheduledExecutorService3);
        agj a12 = wwVar2.f45268d.mo42066a();
        if (a12 != null) {
            afw.m45813a(a12, "AdRequestServiceImpl.loadAd.flags");
        }
        zzaxi zzaxi = null;
        C16163xg xgVar = (C16163xg) afy.m45822a((Future<T>) a11, null);
        if (xgVar == null) {
            return new zzaxi(0);
        }
        if (xgVar.f45331f != -2) {
            return new zzaxi(xgVar.f45331f);
        }
        if (!TextUtils.isEmpty(xgVar.f45329d)) {
            zzaxi = C16160xd.m52360a(context2, zzaxe2, xgVar.f45329d);
        }
        if (zzaxi == null && !TextUtils.isEmpty(xgVar.f45330e)) {
            zzaxi = m52335a(zzaxe, context, zzaxe2.f45581k.f45677a, xgVar.f45330e, str3, str4, xgVar, ckVar3, wwVar);
        }
        if (zzaxi == null) {
            c = 0;
            zzaxi = new zzaxi(0);
        } else {
            c = 0;
        }
        String[] strArr = new String[1];
        strArr[c] = "tts";
        ckVar3.mo41460a(ciVar2, strArr);
        zzaxi.f45646w = ckVar3.mo41461b();
        zzaxi.f45617U = xgVar.f45333h;
        return zzaxi;
    }

    /* renamed from: a */
    private static void m52336a(String str, Map<String, List<String>> map, String str2, int i) {
        if (acd.m45776a(2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
            sb.append("Http Response: {\n  URL:\n    ");
            sb.append(str);
            sb.append("\n  Headers:");
            acd.m45438a(sb.toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 5);
                    sb2.append("    ");
                    sb2.append(str3);
                    sb2.append(":");
                    acd.m45438a(sb2.toString());
                    for (String valueOf : (List) map.get(str3)) {
                        String str4 = "      ";
                        String valueOf2 = String.valueOf(valueOf);
                        acd.m45438a(valueOf2.length() != 0 ? str4.concat(valueOf2) : new String(str4));
                    }
                }
            }
            acd.m45438a("  Body:");
            if (str2 != null) {
                int i2 = 0;
                while (i2 < Math.min(str2.length(), 100000)) {
                    int i3 = i2 + 1000;
                    acd.m45438a(str2.substring(i2, Math.min(str2.length(), i3)));
                    i2 = i3;
                }
            } else {
                acd.m45438a("    null");
            }
            StringBuilder sb3 = new StringBuilder(34);
            sb3.append("  Response Code:\n    ");
            sb3.append(i);
            sb3.append("\n}");
            acd.m45438a(sb3.toString());
        }
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.ads.xe.a(long, com.google.android.gms.internal.ads.xg):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        r0 = r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r6 = new java.io.InputStreamReader(com.google.android.gms.internal.ads.C16154wy.m52341a(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r10 = com.google.android.gms.internal.ads.acl.m45521a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        com.google.android.gms.common.util.C15329l.m44589a(r6);
        r3.mo39277a(r10);
        m52336a(r0, r12, r10, r9);
        r5.mo42061a(r0, r12, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        if (r2 == null) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f9, code lost:
        r2.mo41460a(r4, "ufe");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0104, code lost:
        r0 = r5.mo42060a(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r11.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010d, code lost:
        r16 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0110, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0111, code lost:
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        com.google.android.gms.common.util.C15329l.m44589a(r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0116, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f A[Catch:{ all -> 0x00b1, all -> 0x0193 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaxi m52335a(com.google.android.gms.internal.ads.zzaxe r18, android.content.Context r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.google.android.gms.internal.ads.C16163xg r24, com.google.android.gms.internal.ads.C15600ck r25, com.google.android.gms.internal.ads.C16152ww r26) {
        /*
            r0 = r18
            r1 = r24
            r2 = r25
            if (r2 == 0) goto L_0x000d
            com.google.android.gms.internal.ads.ci r4 = r25.mo41454a()
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            com.google.android.gms.internal.ads.xe r5 = new com.google.android.gms.internal.ads.xe     // Catch:{ IOException -> 0x0198 }
            java.lang.String r6 = r1.f45326a     // Catch:{ IOException -> 0x0198 }
            r5.<init>(r0, r6)     // Catch:{ IOException -> 0x0198 }
            java.lang.String r6 = "AdRequestServiceImpl: Sending request: "
            java.lang.String r7 = java.lang.String.valueOf(r21)     // Catch:{ IOException -> 0x0198 }
            int r8 = r7.length()     // Catch:{ IOException -> 0x0198 }
            if (r8 == 0) goto L_0x0027
            java.lang.String r6 = r6.concat(r7)     // Catch:{ IOException -> 0x0198 }
            r7 = r6
            goto L_0x002c
        L_0x0027:
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x0198 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x0198 }
        L_0x002c:
            com.google.android.gms.internal.ads.acd.m45777b(r7)     // Catch:{ IOException -> 0x0198 }
            java.net.URL r6 = new java.net.URL     // Catch:{ IOException -> 0x0198 }
            r7 = r21
            r6.<init>(r7)     // Catch:{ IOException -> 0x0198 }
            com.google.android.gms.common.util.e r7 = com.google.android.gms.ads.internal.C14793ay.m42901g()     // Catch:{ IOException -> 0x0198 }
            long r7 = r7.mo38685b()     // Catch:{ IOException -> 0x0198 }
            r9 = 0
            r10 = 0
        L_0x0040:
            java.net.URLConnection r11 = r6.openConnection()     // Catch:{ IOException -> 0x0198 }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ IOException -> 0x0198 }
            com.google.android.gms.internal.ads.acl r12 = com.google.android.gms.ads.internal.C14793ay.m42895a()     // Catch:{ all -> 0x0193 }
            r13 = r19
            r14 = r20
            r12.mo39173a(r13, r14, r9, r11)     // Catch:{ all -> 0x0193 }
            boolean r12 = r1.f45328c     // Catch:{ all -> 0x0193 }
            if (r12 == 0) goto L_0x0073
            boolean r12 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x0193 }
            if (r12 != 0) goto L_0x0063
            java.lang.String r12 = "x-afma-drt-cookie"
            r15 = r22
            com.google.android.gms.internal.ads.C16154wy.m52343a(r11, r12, r15)     // Catch:{ all -> 0x0193 }
            goto L_0x0065
        L_0x0063:
            r15 = r22
        L_0x0065:
            boolean r12 = android.text.TextUtils.isEmpty(r23)     // Catch:{ all -> 0x0193 }
            if (r12 != 0) goto L_0x0075
            java.lang.String r12 = "x-afma-drt-v2-cookie"
            r3 = r23
            com.google.android.gms.internal.ads.C16154wy.m52343a(r11, r12, r3)     // Catch:{ all -> 0x0193 }
            goto L_0x0077
        L_0x0073:
            r15 = r22
        L_0x0075:
            r3 = r23
        L_0x0077:
            java.lang.String r12 = r0.f45545H     // Catch:{ all -> 0x0193 }
            boolean r17 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0193 }
            if (r17 != 0) goto L_0x0089
            java.lang.String r17 = "Sending webview cookie in ad request header."
            com.google.android.gms.internal.ads.acd.m45777b(r17)     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = "Cookie"
            com.google.android.gms.internal.ads.C16154wy.m52343a(r11, r9, r12)     // Catch:{ all -> 0x0193 }
        L_0x0089:
            r9 = 1
            if (r1 == 0) goto L_0x00bc
            java.lang.String r12 = r1.f45327b     // Catch:{ all -> 0x0193 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0193 }
            if (r12 != 0) goto L_0x00bc
            r11.setDoOutput(r9)     // Catch:{ all -> 0x0193 }
            java.lang.String r12 = r1.f45327b     // Catch:{ all -> 0x0193 }
            byte[] r12 = r12.getBytes()     // Catch:{ all -> 0x0193 }
            int r9 = r12.length     // Catch:{ all -> 0x0193 }
            r11.setFixedLengthStreamingMode(r9)     // Catch:{ all -> 0x0193 }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00b5 }
            java.io.OutputStream r3 = r11.getOutputStream()     // Catch:{ all -> 0x00b5 }
            r9.<init>(r3)     // Catch:{ all -> 0x00b5 }
            r9.write(r12)     // Catch:{ all -> 0x00b1 }
            com.google.android.gms.common.util.C15329l.m44589a(r9)     // Catch:{ all -> 0x0193 }
            goto L_0x00bd
        L_0x00b1:
            r0 = move-exception
            r16 = r9
            goto L_0x00b8
        L_0x00b5:
            r0 = move-exception
            r16 = 0
        L_0x00b8:
            com.google.android.gms.common.util.C15329l.m44589a(r16)     // Catch:{ all -> 0x0193 }
            throw r0     // Catch:{ all -> 0x0193 }
        L_0x00bc:
            r12 = 0
        L_0x00bd:
            com.google.android.gms.internal.ads.afg r3 = new com.google.android.gms.internal.ads.afg     // Catch:{ all -> 0x0193 }
            java.lang.String r9 = r0.f45592v     // Catch:{ all -> 0x0193 }
            r3.<init>(r9)     // Catch:{ all -> 0x0193 }
            r3.mo39280a(r11, r12)     // Catch:{ all -> 0x0193 }
            int r9 = r11.getResponseCode()     // Catch:{ all -> 0x0193 }
            java.util.Map r12 = r11.getHeaderFields()     // Catch:{ all -> 0x0193 }
            r3.mo39279a(r11, r9)     // Catch:{ all -> 0x0193 }
            r0 = 200(0xc8, float:2.8E-43)
            r13 = 300(0x12c, float:4.2E-43)
            if (r9 < r0) goto L_0x0117
            if (r9 >= r13) goto L_0x0117
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0193 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0110 }
            java.io.InputStream r10 = com.google.android.gms.internal.ads.C16154wy.m52341a(r11)     // Catch:{ all -> 0x0110 }
            r6.<init>(r10)     // Catch:{ all -> 0x0110 }
            java.lang.String r10 = com.google.android.gms.internal.ads.acl.m45521a(r6)     // Catch:{ all -> 0x010c }
            com.google.android.gms.common.util.C15329l.m44589a(r6)     // Catch:{ all -> 0x0193 }
            r3.mo39277a(r10)     // Catch:{ all -> 0x0193 }
            m52336a(r0, r12, r10, r9)     // Catch:{ all -> 0x0193 }
            r5.mo42061a(r0, r12, r10)     // Catch:{ all -> 0x0193 }
            if (r2 == 0) goto L_0x0104
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0193 }
            java.lang.String r3 = "ufe"
            r6 = 0
            r0[r6] = r3     // Catch:{ all -> 0x0193 }
            r2.mo41460a(r4, r0)     // Catch:{ all -> 0x0193 }
        L_0x0104:
            com.google.android.gms.internal.ads.zzaxi r0 = r5.mo42060a(r7, r1)     // Catch:{ all -> 0x0193 }
            r11.disconnect()     // Catch:{ IOException -> 0x0198 }
            return r0
        L_0x010c:
            r0 = move-exception
            r16 = r6
            goto L_0x0113
        L_0x0110:
            r0 = move-exception
            r16 = 0
        L_0x0113:
            com.google.android.gms.common.util.C15329l.m44589a(r16)     // Catch:{ all -> 0x0193 }
            throw r0     // Catch:{ all -> 0x0193 }
        L_0x0117:
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0193 }
            r3 = 0
            m52336a(r0, r12, r3, r9)     // Catch:{ all -> 0x0193 }
            if (r9 < r13) goto L_0x0173
            r0 = 400(0x190, float:5.6E-43)
            if (r9 >= r0) goto L_0x0173
            java.lang.String r0 = "Location"
            java.lang.String r0 = r11.getHeaderField(r0)     // Catch:{ all -> 0x0193 }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0193 }
            if (r6 == 0) goto L_0x0140
            java.lang.String r0 = "No location header to follow redirect."
            com.google.android.gms.internal.ads.acd.m45783e(r0)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x0193 }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x0193 }
            r11.disconnect()     // Catch:{ IOException -> 0x0198 }
            return r0
        L_0x0140:
            java.net.URL r6 = new java.net.URL     // Catch:{ all -> 0x0193 }
            r6.<init>(r0)     // Catch:{ all -> 0x0193 }
            r0 = 1
            int r10 = r10 + r0
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r0 = com.google.android.gms.internal.ads.C15585bw.f43873cN     // Catch:{ all -> 0x0193 }
            com.google.android.gms.internal.ads.bt r9 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x0193 }
            java.lang.Object r0 = r9.mo41272a(r0)     // Catch:{ all -> 0x0193 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0193 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0193 }
            if (r10 <= r0) goto L_0x0168
            java.lang.String r0 = "Too many redirects."
            com.google.android.gms.internal.ads.acd.m45783e(r0)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x0193 }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x0193 }
            r11.disconnect()     // Catch:{ IOException -> 0x0198 }
            return r0
        L_0x0168:
            r5.mo42062a(r12)     // Catch:{ all -> 0x0193 }
            r11.disconnect()     // Catch:{ IOException -> 0x0198 }
            r0 = r18
            r9 = 0
            goto L_0x0040
        L_0x0173:
            r0 = 46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
            r1.<init>(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "Received error HTTP response code: "
            r1.append(r0)     // Catch:{ all -> 0x0193 }
            r1.append(r9)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0193 }
            com.google.android.gms.internal.ads.acd.m45783e(r0)     // Catch:{ all -> 0x0193 }
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ all -> 0x0193 }
            r1 = 0
            r0.<init>(r1)     // Catch:{ all -> 0x0193 }
            r11.disconnect()     // Catch:{ IOException -> 0x0198 }
            return r0
        L_0x0193:
            r0 = move-exception
            r11.disconnect()     // Catch:{ IOException -> 0x0198 }
            throw r0     // Catch:{ IOException -> 0x0198 }
        L_0x0198:
            r0 = move-exception
            java.lang.String r1 = "Error while connecting to ad server: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x01ae
            java.lang.String r0 = r1.concat(r0)
            goto L_0x01b3
        L_0x01ae:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x01b3:
            com.google.android.gms.internal.ads.acd.m45783e(r0)
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi
            r1 = 2
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16153wx.m52335a(com.google.android.gms.internal.ads.zzaxe, android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.xg, com.google.android.gms.internal.ads.ck, com.google.android.gms.internal.ads.ww):com.google.android.gms.internal.ads.zzaxi");
    }

    private C16153wx(Context context, C16152ww wwVar) {
        this.f45277c = context;
        this.f45278d = wwVar;
    }

    /* renamed from: a */
    public final zzaxi mo42041a(zzaxe zzaxe) {
        return m52334a(this.f45277c, this.f45278d, zzaxe, this.f45279e);
    }

    /* renamed from: a */
    public final void mo42042a(zzaxe zzaxe, C16132wc wcVar) {
        C14793ay.m42898d().mo39087a(this.f45277c, zzaxe.f45581k);
        agj a = acj.m45508a((Runnable) new C16157xa(this, zzaxe, wcVar));
        C14793ay.m42908n().mo39258a();
        C14793ay.m42908n().f40103a.postDelayed(new C16158xb(this, a), 60000);
    }
}
