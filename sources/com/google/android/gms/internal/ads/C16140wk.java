package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.wk */
public final class C16140wk extends abz {

    /* renamed from: a */
    private static final long f45232a = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: b */
    private static final Object f45233b = new Object();

    /* renamed from: c */
    private static boolean f45234c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C15863mc f45235d = null;

    /* renamed from: e */
    private static C15743hr f45236e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static C15754ib f45237f = null;

    /* renamed from: g */
    private static C15742hq<Object> f45238g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C16099ux f45239h;

    /* renamed from: i */
    private final C16123vu f45240i;

    /* renamed from: j */
    private final Object f45241j = new Object();

    /* renamed from: k */
    private final Context f45242k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C15879ms f45243l;

    /* renamed from: m */
    private bwp f45244m;

    public C16140wk(Context context, C16123vu vuVar, C16099ux uxVar, bwp bwp) {
        super(true);
        this.f45239h = uxVar;
        this.f45242k = context;
        this.f45240i = vuVar;
        this.f45244m = bwp;
        synchronized (f45233b) {
            if (!f45234c) {
                f45237f = new C15754ib();
                f45236e = new C15743hr(context.getApplicationContext(), vuVar.f45212j);
                f45238g = new C16149wt();
                C15863mc mcVar = new C15863mc(this.f45242k.getApplicationContext(), this.f45240i.f45212j, (String) bym.m50299d().mo41272a(C15585bw.f43806b), new C16148ws(), new C16147wr());
                f45235d = mcVar;
                f45234c = true;
            }
        }
    }

    /* renamed from: a */
    protected static void m52319a(C15851lr lrVar) {
        lrVar.mo41741a("/loadAd", f45237f);
        lrVar.mo41741a("/fetchHttpRequest", f45236e);
        lrVar.mo41741a("/invalidRequest", f45238g);
    }

    /* renamed from: b */
    protected static void m52321b(C15851lr lrVar) {
        lrVar.mo41742b("/loadAd", f45237f);
        lrVar.mo41742b("/fetchHttpRequest", f45236e);
        lrVar.mo41742b("/invalidRequest", f45238g);
    }

    /* renamed from: a */
    public final void mo37835a() {
        acd.m45777b("SdkLessAdLoaderBackgroundTask started.");
        String e = C14793ay.m42913s().mo39050e(this.f45242k);
        zzaxe zzaxe = new zzaxe(this.f45240i, -1, C14793ay.m42913s().mo39046c(this.f45242k), C14793ay.m42913s().mo39048d(this.f45242k), e, C14793ay.m42913s().mo39052f(this.f45242k));
        zzaxi a = m52317a(zzaxe);
        if ((a.f45627d == -2 || a.f45627d == 3) && !TextUtils.isEmpty(e)) {
            C14793ay.m42913s().mo39053f(this.f45242k, e);
        }
        long b = C14793ay.m42901g().mo38685b();
        abk abk = new abk(zzaxe, a, null, null, a.f45627d, b, a.f45636m, null, this.f45244m);
        afb.f40136a.post(new C16142wm(this, abk));
    }

    /* renamed from: a */
    private final zzaxi m52317a(zzaxe zzaxe) {
        String a = acl.m45518a();
        JSONObject a2 = m52318a(zzaxe, a);
        if (a2 == null) {
            return new zzaxi(0);
        }
        long b = C14793ay.m42901g().mo38685b();
        Future a3 = f45237f.mo41649a(a);
        afb.f40136a.post(new C16143wn(this, a2, a));
        try {
            JSONObject jSONObject = (JSONObject) a3.get(f45232a - (C14793ay.m42901g().mo38685b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzaxi(-1);
            }
            zzaxi a4 = C16160xd.m52360a(this.f45242k, zzaxe, jSONObject.toString());
            return (a4.f45627d == -3 || !TextUtils.isEmpty(a4.f45625b)) ? a4 : new zzaxi(3);
        } catch (InterruptedException | CancellationException unused) {
            return new zzaxi(-1);
        } catch (TimeoutException unused2) {
            return new zzaxi(2);
        } catch (ExecutionException unused3) {
            return new zzaxi(0);
        }
    }

    /* renamed from: a */
    private final JSONObject m52318a(zzaxe zzaxe, String str) {
        C16164xh xhVar;
        C14734a aVar;
        Bundle bundle = zzaxe.f45573c.f45779c.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            xhVar = (C16164xh) C14793ay.m42904j().mo42064a(this.f45242k).get();
        } catch (Exception e) {
            acd.m45780c("Error grabbing device info: ", e);
            xhVar = null;
        }
        Context context = this.f45242k;
        C16151wv wvVar = new C16151wv();
        wvVar.f45261i = zzaxe;
        wvVar.f45262j = xhVar;
        JSONObject a = C16160xd.m52364a(context, wvVar);
        if (a == null) {
            return null;
        }
        try {
            aVar = C14733a.m42585a(this.f45242k);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            acd.m45780c("Cannot get advertising id info", e2);
            aVar = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", a);
        hashMap.put("data", bundle);
        if (aVar != null) {
            hashMap.put("adid", aVar.f38079a);
            hashMap.put("lat", Integer.valueOf(aVar.f38080b ? 1 : 0));
        }
        try {
            return C14793ay.m42895a().mo39170a((Map<String, ?>) hashMap);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
        synchronized (this.f45241j) {
            afb.f40136a.post(new C16146wq(this));
        }
    }
}
