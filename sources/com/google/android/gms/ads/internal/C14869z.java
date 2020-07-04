package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15782jc;
import com.google.android.gms.internal.ads.C15915oa;
import com.google.android.gms.internal.ads.C15916ob;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C15935ou;
import com.google.android.gms.internal.ads.C16180xx;
import com.google.android.gms.internal.ads.C16183y;
import com.google.android.gms.internal.ads.C16218zh;
import com.google.android.gms.internal.ads.C16219zi;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.adj;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzbgz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.z */
public final class C14869z extends C16183y {

    /* renamed from: b */
    private static final Object f38491b = new Object();

    /* renamed from: c */
    private static C14869z f38492c;

    /* renamed from: a */
    private final Context f38493a;

    /* renamed from: d */
    private boolean f38494d;

    /* renamed from: e */
    private zzbgz f38495e;

    /* renamed from: a */
    public static C14869z m43186a(Context context, zzbgz zzbgz) {
        C14869z zVar;
        synchronized (f38491b) {
            if (f38492c == null) {
                f38492c = new C14869z(context.getApplicationContext(), zzbgz);
            }
            zVar = f38492c;
        }
        return zVar;
    }

    /* renamed from: a */
    public final void mo37856a(C15782jc jcVar) throws RemoteException {
    }

    /* renamed from: a */
    public final void mo37857a(C15931oq oqVar) throws RemoteException {
    }

    /* renamed from: b */
    public final void mo37863b(String str) {
    }

    private C14869z(Context context, zzbgz zzbgz) {
        this.f38493a = context;
        this.f38495e = zzbgz;
    }

    /* renamed from: a */
    public final void mo37853a() {
        synchronized (f38491b) {
            if (this.f38494d) {
                acd.m45783e("Mobile ads is initialized already.");
                return;
            }
            this.f38494d = true;
            C15585bw.m50188a(this.f38493a);
            C14793ay.m42898d().mo39087a(this.f38493a, this.f38495e);
            C14793ay.m42900f().mo41397a(this.f38493a);
        }
    }

    /* renamed from: a */
    public final void mo37859a(String str) {
        C15585bw.m50188a(this.f38493a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43831bY)).booleanValue()) {
                C14793ay.m42902h().mo37770a(this.f38493a, this.f38495e, str, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo37860a(String str, C15345b bVar) {
        if (!TextUtils.isEmpty(str)) {
            C15585bw.m50188a(this.f38493a);
            boolean booleanValue = ((Boolean) bym.m50299d().mo41272a(C15585bw.f43831bY)).booleanValue() | ((Boolean) bym.m50299d().mo41272a(C15585bw.f43804ay)).booleanValue();
            C14770ab abVar = null;
            if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43804ay)).booleanValue()) {
                booleanValue = true;
                abVar = new C14770ab(this, (Runnable) C15349d.m44669a(bVar));
            }
            if (booleanValue) {
                C14793ay.m42902h().mo37770a(this.f38493a, this.f38495e, str, abVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo37854a(float f) {
        C14793ay.m42899e().mo39210a(f);
    }

    /* renamed from: b */
    public final float mo37862b() {
        return C14793ay.m42899e().mo39209a();
    }

    /* renamed from: a */
    public final void mo37861a(boolean z) {
        C14793ay.m42899e().mo39211a(z);
    }

    /* renamed from: c */
    public final boolean mo37864c() {
        return C14793ay.m42899e().mo39212b();
    }

    /* renamed from: d */
    public final String mo37865d() {
        return this.f38495e.f45677a;
    }

    /* renamed from: a */
    public final void mo37855a(C15345b bVar, String str) {
        if (bVar == null) {
            acd.m45779c("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) C15349d.m44669a(bVar);
        if (context == null) {
            acd.m45779c("Context is null. Failed to open debug menu.");
            return;
        }
        adj adj = new adj(context);
        adj.f40030b = str;
        adj.f40031c = this.f38495e.f45677a;
        adj.mo39213a();
    }

    /* renamed from: e */
    public final List<zzaki> mo37866e() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo37858a(Runnable runnable) {
        Context context = this.f38493a;
        C15267r.m44393b("Adapters must be initialized on the main thread.");
        Map<String, C15916ob> map = C14793ay.m42898d().mo39100j().mo39157i().f39914b;
        if (map != null && !map.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    acd.m45780c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            C16180xx F = C16180xx.m52425F();
            if (F != null) {
                Collection<C15916ob> values = map.values();
                HashMap hashMap = new HashMap();
                C15345b a = C15349d.m44668a(context);
                for (C15916ob obVar : values) {
                    for (C15915oa oaVar : obVar.f44738a) {
                        String str = oaVar.f44725k;
                        for (String str2 : oaVar.f44717c) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                for (Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        C16218zh c = F.mo37663c(str3);
                        if (c != null) {
                            C15935ou ouVar = c.f45478a;
                            if (!ouVar.mo41835g()) {
                                if (ouVar.mo41841m()) {
                                    ouVar.mo41818a(a, (C16219zi) c.f45479b, (List) entry.getValue());
                                    String str4 = "Initialized rewarded video mediation adapter ";
                                    String valueOf = String.valueOf(str3);
                                    acd.m45777b(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        acd.m45780c(sb.toString(), th2);
                    }
                }
            }
        }
    }
}
