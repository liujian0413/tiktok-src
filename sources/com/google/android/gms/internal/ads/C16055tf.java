package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14772ad;
import com.p280ss.android.ugc.aweme.commercialize.log.C24962g;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.tf */
public final class C16055tf implements Callable<abj> {

    /* renamed from: a */
    private static long f45010a = 10;

    /* renamed from: b */
    private final Context f45011b;

    /* renamed from: c */
    private final aea f45012c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C14772ad f45013d;

    /* renamed from: e */
    private final bdt f45014e;

    /* renamed from: f */
    private final C16075tz f45015f;

    /* renamed from: g */
    private final Object f45016g = new Object();

    /* renamed from: h */
    private final abk f45017h;

    /* renamed from: i */
    private final C15600ck f45018i;

    /* renamed from: j */
    private boolean f45019j;

    /* renamed from: k */
    private int f45020k;

    /* renamed from: l */
    private List<String> f45021l;

    /* renamed from: m */
    private JSONObject f45022m;

    /* renamed from: n */
    private String f45023n;

    /* renamed from: o */
    private String f45024o;

    public C16055tf(Context context, C14772ad adVar, aea aea, bdt bdt, abk abk, C15600ck ckVar) {
        this.f45011b = context;
        this.f45013d = adVar;
        this.f45012c = aea;
        this.f45017h = abk;
        this.f45014e = bdt;
        this.f45018i = ckVar;
        this.f45015f = adVar.mo37642G();
        this.f45019j = false;
        this.f45020k = -2;
        this.f45021l = null;
        this.f45023n = null;
        this.f45024o = null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r3.length() != 0) goto L_0x0042;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0176 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0178 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ea A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.abj call() {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
            com.google.android.gms.ads.internal.ad r2 = r15.f45013d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r11 = r2.f38156m     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r2 = r15.m52172b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r2 != 0) goto L_0x006c
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abk r3 = r15.f45017h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxi r3 = r3.f39888b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r3 = r3.f45625b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r2.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abk r4 = r15.f45017h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxi r4 = r4.f39888b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = r4.f45625b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            int r4 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 == 0) goto L_0x003e
            java.lang.String r4 = "ads"
            org.json.JSONArray r3 = r3.optJSONArray(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x0035
            org.json.JSONObject r3 = r3.optJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            if (r3 == 0) goto L_0x003e
            int r3 = r3.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 != 0) goto L_0x0042
        L_0x003e:
            r3 = 3
            r15.m52166a(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x0042:
            com.google.android.gms.internal.ads.tz r3 = r15.f45015f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.agj r2 = r3.mo42002a(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            long r3 = f45010a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.Object r2 = r2.get(r3, r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r3 = "success"
            boolean r3 = r2.optBoolean(r3, r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x006c
            java.lang.String r3 = "json"
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r3 = "ads"
            org.json.JSONArray r2 = r2.optJSONArray(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            org.json.JSONObject r2 = r2.getJSONObject(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r8 = r2
            goto L_0x006d
        L_0x006c:
            r8 = r1
        L_0x006d:
            if (r8 == 0) goto L_0x0076
            java.lang.String r2 = "enable_omid"
            boolean r2 = r8.optBoolean(r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x0077
        L_0x0076:
            r2 = 0
        L_0x0077:
            if (r2 != 0) goto L_0x007f
            com.google.android.gms.internal.ads.agi r3 = com.google.android.gms.internal.ads.afy.m45817a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x007d:
            r12 = r3
            goto L_0x00ad
        L_0x007f:
            java.lang.String r3 = "omid_settings"
            org.json.JSONObject r3 = r8.optJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 != 0) goto L_0x008c
            com.google.android.gms.internal.ads.agi r3 = com.google.android.gms.internal.ads.afy.m45817a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x007d
        L_0x008c:
            java.lang.String r4 = "omid_html"
            java.lang.String r3 = r3.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 == 0) goto L_0x009d
            com.google.android.gms.internal.ads.agi r3 = com.google.android.gms.internal.ads.afy.m45817a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x007d
        L_0x009d:
            com.google.android.gms.internal.ads.agi r4 = com.google.android.gms.internal.ads.afy.m45817a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.tg r5 = new com.google.android.gms.internal.ads.tg     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r5.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.util.concurrent.Executor r3 = com.google.android.gms.internal.ads.ago.f40189a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.agj r3 = com.google.android.gms.internal.ads.afy.m45819a(r4, r5, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x007d
        L_0x00ad:
            boolean r3 = r15.m52172b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 != 0) goto L_0x016b
            if (r8 != 0) goto L_0x00b7
            goto L_0x016b
        L_0x00b7:
            java.lang.String r3 = "template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = "instream"
            java.lang.String r5 = "type"
            java.lang.String r5 = r8.optString(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r4 = r4.equals(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abk r5 = r15.f45017h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r5 = r5.f39887a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzafl r5 = r5.f45595y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r5 == 0) goto L_0x00da
            com.google.android.gms.internal.ads.abk r5 = r15.f45017h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r5 = r5.f39887a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzafl r5 = r5.f45595y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r5 = r5.f45507b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x00db
        L_0x00da:
            r5 = 0
        L_0x00db:
            com.google.android.gms.internal.ads.abk r6 = r15.f45017h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r6 = r6.f39887a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzafl r6 = r6.f45595y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r6 == 0) goto L_0x00ec
            com.google.android.gms.internal.ads.abk r6 = r15.f45017h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r6 = r6.f39887a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzafl r6 = r6.f45595y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r6 = r6.f45509d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x00ed
        L_0x00ec:
            r6 = 0
        L_0x00ed:
            if (r4 == 0) goto L_0x00f6
            com.google.android.gms.internal.ads.te r3 = new com.google.android.gms.internal.ads.te     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016c
        L_0x00f6:
            java.lang.String r4 = "2"
            boolean r4 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 == 0) goto L_0x0108
            com.google.android.gms.internal.ads.ua r3 = new com.google.android.gms.internal.ads.ua     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abk r4 = r15.f45017h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r4 = r4.f39896j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>(r5, r6, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016c
        L_0x0108:
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 == 0) goto L_0x011a
            com.google.android.gms.internal.ads.ub r3 = new com.google.android.gms.internal.ads.ub     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abk r4 = r15.f45017h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            boolean r4 = r4.f39896j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>(r5, r6, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016c
        L_0x011a:
            java.lang.String r4 = "3"
            boolean r3 = r4.equals(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x0168
            java.lang.String r3 = "custom_template_id"
            java.lang.String r3 = r8.getString(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.agu r4 = new com.google.android.gms.internal.ads.agu     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r4.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            android.os.Handler r6 = com.google.android.gms.internal.ads.acl.f40003a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.ti r7 = new com.google.android.gms.internal.ads.ti     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r7.<init>(r15, r4, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r6.post(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            long r6 = f45010a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.Object r3 = r4.get(r6, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x0147
            com.google.android.gms.internal.ads.uc r3 = new com.google.android.gms.internal.ads.uc     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.<init>(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016c
        L_0x0147:
            java.lang.String r3 = "No handler for custom template: "
            java.lang.String r4 = "custom_template_id"
            java.lang.String r4 = r8.getString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            int r5 = r4.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r5 == 0) goto L_0x015e
            java.lang.String r3 = r3.concat(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x0164
        L_0x015e:
            java.lang.String r4 = new java.lang.String     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r4.<init>(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3 = r4
        L_0x0164:
            com.google.android.gms.internal.ads.acd.m45779c(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x016b
        L_0x0168:
            r15.m52166a(r0)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x016b:
            r3 = r1
        L_0x016c:
            boolean r4 = r15.m52172b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r4 != 0) goto L_0x01e5
            if (r3 == 0) goto L_0x01e5
            if (r8 != 0) goto L_0x0178
            goto L_0x01e5
        L_0x0178:
            java.lang.String r4 = "tracking_urls_and_actions"
            org.json.JSONObject r4 = r8.getJSONObject(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r5 = "impression_tracking_urls"
            org.json.JSONArray r5 = r4.optJSONArray(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r5 != 0) goto L_0x0188
            r6 = r1
            goto L_0x019e
        L_0x0188:
            int r6 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r7 = 0
        L_0x018f:
            int r9 = r5.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r7 >= r9) goto L_0x019e
            java.lang.String r9 = r5.getString(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r6[r7] = r9     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            int r7 = r7 + 1
            goto L_0x018f
        L_0x019e:
            if (r6 != 0) goto L_0x01a2
            r5 = r1
            goto L_0x01a6
        L_0x01a2:
            java.util.List r5 = java.util.Arrays.asList(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x01a6:
            r15.f45021l = r5     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r5 = "active_view"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r15.f45022m = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = "debug_signals"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r15.f45023n = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r4 = "omid_settings"
            java.lang.String r4 = r8.optString(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r15.f45024o = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.ds r13 = r3.mo41978a(r15, r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r13 != 0) goto L_0x01cc
            java.lang.String r3 = "Failed to retrieve ad assets."
            com.google.android.gms.internal.ads.acd.m45779c(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x01e5
        L_0x01cc:
            com.google.android.gms.internal.ads.du r14 = new com.google.android.gms.internal.ads.du     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            android.content.Context r4 = r15.f45011b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.ads.internal.ad r5 = r15.f45013d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.tz r6 = r15.f45015f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.bdt r7 = r15.f45014e     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.abk r3 = r15.f45017h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzaxe r3 = r3.f39887a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.zzbgz r10 = r3.f45581k     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3 = r14
            r9 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r13.mo41480a(r14)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            goto L_0x01e6
        L_0x01e5:
            r13 = r1
        L_0x01e6:
            boolean r3 = r13 instanceof com.google.android.gms.internal.ads.C15625di     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            if (r3 == 0) goto L_0x01f9
            r3 = r13
            com.google.android.gms.internal.ads.di r3 = (com.google.android.gms.internal.ads.C15625di) r3     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.tj r4 = new com.google.android.gms.internal.ads.tj     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r4.<init>(r15, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.tz r3 = r15.f45015f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            java.lang.String r5 = "/nativeAdCustomClick"
            r3.mo42004a(r5, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
        L_0x01f9:
            com.google.android.gms.internal.ads.abj r2 = r15.m52161a(r13, r2)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.ads.internal.ad r3 = r15.f45013d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            com.google.android.gms.internal.ads.ami r4 = m52169b(r12)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            r3.f38155l = r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x0214, TimeoutException -> 0x020d, Exception -> 0x0206 }
            return r2
        L_0x0206:
            r2 = move-exception
            java.lang.String r3 = "Error occured while doing native ads initialization."
            com.google.android.gms.internal.ads.acd.m45780c(r3, r2)
            goto L_0x021a
        L_0x020d:
            r2 = move-exception
            java.lang.String r3 = "Timeout when loading native ad."
            com.google.android.gms.internal.ads.acd.m45780c(r3, r2)
            goto L_0x021a
        L_0x0214:
            r2 = move-exception
            java.lang.String r3 = "Malformed native JSON response."
            com.google.android.gms.internal.ads.acd.m45780c(r3, r2)
        L_0x021a:
            boolean r2 = r15.f45019j
            if (r2 != 0) goto L_0x0221
            r15.m52166a(r0)
        L_0x0221:
            com.google.android.gms.internal.ads.abj r0 = r15.m52161a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16055tf.call():com.google.android.gms.internal.ads.abj");
    }

    /* renamed from: b */
    private static ami m52169b(agj<ami> agj) {
        try {
            return (ami) agj.get((long) ((Integer) bym.m50299d().mo41272a(C15585bw.f43821bO)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            afm.m45780c("", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            afm.m45780c("", e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52167a(C15682fk fkVar, String str) {
        try {
            C15693fv c = this.f45013d.mo37663c(fkVar.mo41482c());
            if (c != null) {
                c.mo41638a(fkVar, str);
            }
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            acd.m45780c(sb.toString(), e);
        }
    }

    /* renamed from: a */
    private final abj m52161a(C15636ds dsVar, boolean z) {
        int i;
        synchronized (this.f45016g) {
            i = (dsVar == null && this.f45020k == -2) ? 0 : this.f45020k;
        }
        abj abj = new abj(this.f45017h.f39887a.f45573c, null, this.f45017h.f39888b.f45626c, i, this.f45017h.f39888b.f45628e, this.f45021l, this.f45017h.f39888b.f45634k, this.f45017h.f39888b.f45633j, this.f45017h.f39887a.f45579i, false, null, null, null, null, null, 0, this.f45017h.f39890d, this.f45017h.f39888b.f45629f, this.f45017h.f39892f, this.f45017h.f39893g, this.f45017h.f39888b.f45637n, this.f45022m, i != -2 ? null : dsVar, null, null, null, this.f45017h.f39888b.f45600D, this.f45017h.f39888b.f45601E, null, this.f45017h.f39888b.f45604H, this.f45023n, this.f45017h.f39895i, this.f45017h.f39888b.f45611O, this.f45017h.f39896j, z, this.f45017h.f39888b.f45614R, this.f45017h.f39888b.f45615S, this.f45024o, this.f45017h.f39888b.f45618V, this.f45017h.f39888b.f45619W);
        return abj;
    }

    /* renamed from: a */
    public final agj<C15612cw> mo41981a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return afy.m45817a(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = m52170b(optJSONObject, "text_color");
        Integer b2 = m52170b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i = (this.f45017h.f39887a.f45595y == null || this.f45017h.f39887a.f45595y.f45506a < 2) ? 1 : this.f45017h.f39887a.f45595y.f45510e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<agj> arrayList = new ArrayList<>();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = mo41984a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(mo41983a(optJSONObject, "image", false, false));
        }
        agu agu = new agu();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (agj a : arrayList) {
            List list = arrayList;
            a.mo39308a(new C16062tm(atomicInteger, size, agu, arrayList), acj.f39998a);
            arrayList = list;
        }
        agu agu2 = agu;
        C16060tk tkVar = new C16060tk(this, optString, b2, b, optInt, optInt3, optInt2, i, optBoolean);
        return afy.m45820a((agj<A>) agu2, (C15477afu<A, B>) tkVar, (Executor) acj.f39998a);
    }

    /* renamed from: b */
    private static Integer m52170b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt(C24962g.f65833a), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final Future<C15620dd> mo41985a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m52162a(jSONObject2, optBoolean, z);
    }

    /* renamed from: a */
    public final agj<C15620dd> mo41983a(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m52162a(jSONObject2, z, z2);
    }

    /* renamed from: a */
    public final List<agj<C15620dd>> mo41984a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            mo41986a(0, false);
            return arrayList;
        }
        int length = z3 ? optJSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m52162a(jSONObject2, false, z2));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final agj<C15620dd> m52162a(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        String str;
        if (z) {
            str = jSONObject.getString("url");
        } else {
            str = jSONObject.optString("url");
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(str)) {
            mo41986a(0, z);
            return afy.m45817a(null);
        }
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z2) {
            C15620dd ddVar = new C15620dd(null, Uri.parse(str), optDouble, optInt, optInt2);
            return afy.m45817a(ddVar);
        }
        aea aea = this.f45012c;
        C16061tl tlVar = new C16061tl(this, z, optDouble, optBoolean, str, optInt, optInt2);
        return aea.mo39246a(str, (aeg<T>) tlVar);
    }

    /* renamed from: a */
    public final agj<ami> mo41982a(JSONObject jSONObject, String str) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return afy.m45817a(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            acd.m45783e("Required field 'vast_xml' is missing");
            return afy.m45817a(null);
        }
        C16065tp a = m52164a(this.f45011b, this.f45014e, this.f45017h, this.f45018i, this.f45013d);
        boolean equals = "instream".equals(jSONObject.optString("type"));
        agu agu = new agu();
        ago.f40189a.execute(new C16066tq(a, equals, optJSONObject, agu));
        return agu;
    }

    /* renamed from: a */
    public final agj<ami> mo41980a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return afy.m45817a(null);
        }
        C16065tp a = m52164a(this.f45011b, this.f45014e, this.f45017h, this.f45018i, this.f45013d);
        agu agu = new agu();
        Executor executor = ago.f40189a;
        C16067tr trVar = new C16067tr(a, true, agu, str, str2);
        executor.execute(trVar);
        return agu;
    }

    /* renamed from: b */
    private final boolean m52172b() {
        boolean z;
        synchronized (this.f45016g) {
            z = this.f45019j;
        }
        return z;
    }

    /* renamed from: a */
    private final void m52166a(int i) {
        synchronized (this.f45016g) {
            this.f45019j = true;
            this.f45020k = i;
        }
    }

    /* renamed from: a */
    public final void mo41986a(int i, boolean z) {
        if (z) {
            m52166a(i);
        }
    }

    /* renamed from: a */
    static ami m52163a(agj<ami> agj) {
        try {
            return (ami) agj.get((long) ((Integer) bym.m50299d().mo41272a(C15585bw.f43820bN)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            acd.m45780c("InterruptedException occurred while waiting for video to load", e);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException e2) {
            acd.m45780c("Exception occurred while waiting for video to load", e2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <V> List<V> m52171b(List<agj<V>> list) throws ExecutionException, InterruptedException {
        ArrayList arrayList = new ArrayList();
        for (agj agj : list) {
            Object obj = agj.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static C16065tp m52164a(Context context, bdt bdt, abk abk, C15600ck ckVar, C14772ad adVar) {
        C16065tp tpVar = new C16065tp(context, bdt, abk, ckVar, adVar);
        return tpVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ agj mo41979a(String str, Object obj) throws Exception {
        ami a = amo.m46434a(this.f45011b, anv.m46662a(), "native-omid", false, false, this.f45014e, this.f45017h.f39887a.f45581k, this.f45018i, null, this.f45013d.f38144i, this.f45017h.f39895i);
        agt a2 = agt.m45839a(a);
        a.mo39761w().mo39771a((anq) new C16057th(a2));
        a.loadData(str, "text/html", "UTF-8");
        return a2;
    }
}
