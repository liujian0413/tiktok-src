package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.p749d.C15176d;
import com.google.android.gms.common.util.C15333p;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

@C6505uv
public final class abp {

    /* renamed from: a */
    public bte f39921a;

    /* renamed from: b */
    public final aby f39922b = new aby(bym.m50300e(), this.f39925e);

    /* renamed from: c */
    public Context f39923c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f39924d = new Object();

    /* renamed from: e */
    private final acg f39925e = new acg();

    /* renamed from: f */
    private boolean f39926f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public zzbgz f39927g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C15588bz f39928h = null;

    /* renamed from: i */
    private Boolean f39929i = null;

    /* renamed from: j */
    private final AtomicInteger f39930j = new AtomicInteger(0);

    /* renamed from: k */
    private final C15468abs f39931k = new C15468abs(null);

    /* renamed from: l */
    private final Object f39932l = new Object();

    /* renamed from: m */
    private agj<ArrayList<String>> f39933m;

    /* renamed from: a */
    public final C15588bz mo39086a() {
        C15588bz bzVar;
        synchronized (this.f39924d) {
            bzVar = this.f39928h;
        }
        return bzVar;
    }

    /* renamed from: a */
    public final void mo39088a(Boolean bool) {
        synchronized (this.f39924d) {
            this.f39929i = bool;
        }
    }

    /* renamed from: b */
    public final Boolean mo39091b() {
        Boolean bool;
        synchronized (this.f39924d) {
            bool = this.f39929i;
        }
        return bool;
    }

    /* renamed from: a */
    public final void mo39090a(boolean z) {
        this.f39931k.mo39104a(z);
    }

    /* renamed from: c */
    public final boolean mo39093c() {
        return this.f39931k.mo39105a();
    }

    /* renamed from: d */
    public final boolean mo39094d() {
        return this.f39931k.mo39106b();
    }

    /* renamed from: e */
    public final void mo39095e() {
        this.f39931k.mo39107c();
    }

    /* renamed from: a */
    public final void mo39087a(Context context, zzbgz zzbgz) {
        synchronized (this.f39924d) {
            if (!this.f39926f) {
                this.f39923c = context.getApplicationContext();
                this.f39927g = zzbgz;
                C14793ay.m42897c().mo41362a((buw) this.f39922b);
                C15588bz bzVar = null;
                this.f39925e.mo39165a(this.f39923c, (String) null, true);
                C16092up.m52251a(this.f39923c, this.f39927g);
                this.f39921a = new bte(context.getApplicationContext(), this.f39927g);
                if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43740N)).booleanValue()) {
                    acd.m45438a("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    bzVar = new C15588bz();
                }
                this.f39928h = bzVar;
                if (this.f39928h != null) {
                    afw.m45813a((agj) new abr(this).mo39128c(), "AppState.registerCsiReporter");
                }
                this.f39926f = true;
                mo39101k();
            }
        }
        C14793ay.m42895a().mo39176b(context, zzbgz.f45677a);
    }

    /* renamed from: f */
    public final Resources mo39096f() {
        if (this.f39927g.f45680d) {
            return this.f39923c.getResources();
        }
        try {
            afn.m45785a(this.f39923c).getResources();
            return null;
        } catch (zzbgx e) {
            acd.m45780c("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo39089a(Throwable th, String str) {
        C16092up.m52251a(this.f39923c, this.f39927g).mo42016a(th, str);
    }

    /* renamed from: b */
    public final void mo39092b(Throwable th, String str) {
        C16092up.m52251a(this.f39923c, this.f39927g).mo42017a(th, str, ((Float) bym.m50299d().mo41272a(C15585bw.f44019i)).floatValue());
    }

    /* renamed from: g */
    public final void mo39097g() {
        this.f39930j.incrementAndGet();
    }

    /* renamed from: h */
    public final void mo39098h() {
        this.f39930j.decrementAndGet();
    }

    /* renamed from: i */
    public final int mo39099i() {
        return this.f39930j.get();
    }

    /* renamed from: j */
    public final acf mo39100j() {
        acg acg;
        synchronized (this.f39924d) {
            acg = this.f39925e;
        }
        return acg;
    }

    /* renamed from: k */
    public final agj<ArrayList<String>> mo39101k() {
        if (C15333p.m44595b() && this.f39923c != null) {
            if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43856bx)).booleanValue()) {
                synchronized (this.f39932l) {
                    if (this.f39933m != null) {
                        agj<ArrayList<String>> agj = this.f39933m;
                        return agj;
                    }
                    agj<ArrayList<String>> a = acj.m45509a((Callable<T>) new abq<T>(this));
                    this.f39933m = a;
                    return a;
                }
            }
        }
        return afy.m45817a(new ArrayList());
    }

    /* renamed from: a */
    private static ArrayList<String> m45381a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b = C15176d.m44159a(context).mo38467b(context.getApplicationInfo().packageName, 4096);
            if (b.requestedPermissions == null || b.requestedPermissionsFlags == null) {
                return arrayList;
            }
            for (int i = 0; i < b.requestedPermissions.length; i++) {
                if ((b.requestedPermissionsFlags[i] & 2) != 0) {
                    arrayList.add(b.requestedPermissions[i]);
                }
            }
            return arrayList;
        } catch (NameNotFoundException unused) {
            return arrayList;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final /* synthetic */ ArrayList mo39102l() throws Exception {
        return m45381a(C16178xv.m52403a(this.f39923c));
    }
}
