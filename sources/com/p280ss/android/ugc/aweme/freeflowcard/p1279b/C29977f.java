package com.p280ss.android.ugc.aweme.freeflowcard.p1279b;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.utils.C6900g;
import com.p280ss.android.ugc.aweme.freeflowcard.C29968a;
import com.p280ss.android.ugc.aweme.freeflowcard.data.C29983a;
import com.p280ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.b.f */
public class C29977f implements C29975d {

    /* renamed from: a */
    public static volatile boolean f78787a = true;

    /* renamed from: b */
    private static volatile C29977f f78788b;

    /* renamed from: c */
    private boolean f78789c;

    protected C29977f() {
    }

    /* renamed from: b */
    public boolean mo76170b() {
        return C6900g.m21454b().mo16942c();
    }

    /* renamed from: a */
    public static C29977f m98290a() {
        if (f78788b == null) {
            synchronized (C29977f.class) {
                if (f78788b == null) {
                    f78788b = new C29977f();
                }
            }
        }
        return f78788b;
    }

    /* renamed from: c */
    public final void mo76173c() {
        f78787a = true;
        C1592h.m7853a((Callable<TResult>) new Callable<Boolean>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Boolean call() throws Exception {
                return Boolean.valueOf(C29977f.this.mo76174d());
            }
        }).mo6875a((C1591g<TResult, TContinuationResult>) new C1591g<Boolean, Void>() {
            public final /* synthetic */ Object then(C1592h hVar) throws Exception {
                return m98295a(hVar);
            }

            /* renamed from: a */
            private static Void m98295a(C1592h<Boolean> hVar) throws Exception {
                C29977f.f78787a = ((Boolean) hVar.mo6890e()).booleanValue();
                return null;
            }
        });
    }

    /* renamed from: d */
    public final boolean mo76174d() {
        long[] b = C29968a.m98265b();
        List<AppStartMode> a = C29983a.m98302a().mo76177a(b[0], b[1]);
        if (a == null || a.size() < 20) {
            return true;
        }
        int i = 0;
        for (AppStartMode appStartMode : a) {
            if (appStartMode.mode == 1) {
                i++;
            }
        }
        if ((((float) i) * 1.0f) / ((float) a.size()) < 0.06f) {
            long[] c = C29968a.m98266c();
            List a2 = C29983a.m98302a().mo76178a(c[0], c[1], 0);
            if (a2 != null && a2.size() == 1) {
                return false;
            }
            long[] a3 = C29968a.m98263a(25);
            List a4 = C29983a.m98302a().mo76178a(a3[0], a3[1], 0);
            if (a4 != null && a4.size() == 1) {
                return false;
            }
        }
        List<AppStartMode> a5 = C29983a.m98302a().mo76177a(C29968a.m98264a(1, 7)[0], C29968a.m98264a(1, 7)[1]);
        List<AppStartMode> a6 = C29983a.m98302a().mo76177a(C29968a.m98264a(19, 25)[0], C29968a.m98264a(19, 25)[1]);
        if (a5 != null && a5.size() > 0 && a6 != null && a6.size() > 0) {
            int i2 = 0;
            for (AppStartMode appStartMode2 : a5) {
                if (appStartMode2.mode == 1) {
                    i2++;
                }
            }
            int i3 = 0;
            for (AppStartMode appStartMode3 : a6) {
                if (appStartMode3.mode == 1) {
                    i3++;
                }
            }
            if (((((float) i2) * 1.0f) / ((float) a5.size())) - ((((float) i3) * 1.0f) / ((float) a6.size())) > 0.2f) {
                long[] a7 = C29968a.m98263a(25);
                List a8 = C29983a.m98302a().mo76178a(a7[0], a7[1], 0);
                if (a8 == null || a8.size() != 1) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo76168a(boolean z) {
        if (C7213d.m22500a().mo18803bo().enableWifiToast == 0) {
            return true;
        }
        C29983a.m98302a();
        if (C29983a.m98303c()) {
            return true;
        }
        if (f78787a) {
            return f78787a;
        }
        if (this.f78789c) {
            return true;
        }
        this.f78789c = true;
        return false;
    }
}
