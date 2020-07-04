package com.bytedance.android.live.core.rxutils.autodispose;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.android.live.core.rxutils.C3296e;
import com.bytedance.android.live.core.rxutils.autodispose.p153a.C3241c;
import java.util.concurrent.Callable;
import p346io.reactivex.C47559ag;
import p346io.reactivex.C47843j;
import p346io.reactivex.C47868q;
import p346io.reactivex.C7318a;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7322c;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7490k;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.e */
public final class C3255e {
    /* renamed from: a */
    public static <T> C3274m<T> m12293a(C0043i iVar) {
        if (iVar == null) {
            return m12297a(C3263h.f9981a);
        }
        return m12297a((C3246ae) C3233a.m12259a(iVar, Event.ON_DESTROY));
    }

    /* renamed from: b */
    static final /* synthetic */ C7322c m12300b(C3246ae aeVar) throws Exception {
        try {
            return aeVar.mo10173c();
        } catch (OutsideScopeException e) {
            C7326g b = C3279r.m12344b();
            if (b == null) {
                return C7318a.m22917a((Throwable) e);
            }
            b.accept(e);
            return C7318a.m22916a();
        }
    }

    /* renamed from: c */
    static final /* synthetic */ C7322c m12301c(C3246ae aeVar) throws Exception {
        try {
            return aeVar.mo10173c();
        } catch (OutsideScopeException e) {
            C7326g b = C3279r.m12344b();
            if (b == null) {
                return C7318a.m22917a((Throwable) e);
            }
            b.accept(e);
            return C7318a.m22916a();
        }
    }

    /* renamed from: a */
    public static <T> C3274m<T> m12294a(Fragment fragment) {
        if (fragment == null) {
            return m12297a(C3262g.f9980a);
        }
        return m12297a((C3246ae) C3233a.m12259a((C0043i) fragment, Event.ON_DESTROY));
    }

    /* renamed from: a */
    public static <T> C3274m<T> m12295a(FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            return m12297a(C3261f.f9979a);
        }
        return m12297a((C3246ae) C3233a.m12259a((C0043i) fragmentActivity, Event.ON_DESTROY));
    }

    /* renamed from: a */
    public static <T> C3274m<T> m12296a(View view) {
        if (view == null) {
            return m12297a(C3264i.f9982a);
        }
        return m12297a(C3241c.m12272a(view));
    }

    /* renamed from: a */
    public static <T> C3274m<T> m12297a(C3246ae aeVar) {
        C3281t.m12346a(aeVar, "provider == null");
        return m12299a((C7322c) C7318a.m22918a((Callable<? extends C7322c>) new C3265j<Object>(aeVar)), null);
    }

    /* renamed from: a */
    private static <T> C3274m<T> m12299a(final C7322c cVar, final C3296e<T> eVar) {
        C3281t.m12346a(cVar, "scope == null");
        return new C3274m<T>() {
            /* access modifiers changed from: private */
            /* renamed from: b */
            public C3242aa<T> mo10191a(final C7329e<T> eVar) {
                if (eVar != null) {
                    eVar = eVar.mo19151a((C47843j<? super T, ? extends R>) eVar);
                }
                return new C3242aa<T>() {
                    /* renamed from: a */
                    public final C7321c mo10179a(C7326g<? super T> gVar) {
                        return new C3276o(eVar, cVar).mo19163d(gVar);
                    }
                };
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C3244ac<T> mo10192a(final C7490k<T> kVar) {
                if (eVar != null) {
                    kVar = kVar.mo19268a((C47868q<? super T, ? extends R>) eVar);
                }
                return new C3244ac<T>() {
                    /* renamed from: a */
                    public final C7321c mo10180a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2) {
                        return new C3277p(kVar, cVar).mo19261a(gVar, gVar2);
                    }
                };
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C3245ad<T> mo10193a(final C7492s<T> sVar) {
                if (eVar != null) {
                    sVar = sVar.mo19293a((C7497x<? super T, ? extends R>) eVar);
                }
                return new C3245ad<T>() {
                    /* renamed from: a */
                    public final C7321c mo10181a() {
                        return new C3278q(sVar, cVar).mo19333l();
                    }

                    /* renamed from: a */
                    public final C7321c mo10182a(C7326g<? super T> gVar) {
                        return new C3278q(sVar, cVar).mo19325f(gVar);
                    }

                    /* renamed from: a */
                    public final void mo10185a(C7498y<? super T> yVar) {
                        new C3278q(sVar, cVar).mo19189a(yVar);
                    }

                    /* renamed from: a */
                    public final C7321c mo10183a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2) {
                        return new C3278q(sVar, cVar).mo19280a(gVar, gVar2);
                    }

                    /* renamed from: a */
                    public final C7321c mo10184a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2, C7323a aVar) {
                        return new C3278q(sVar, cVar).mo19281a(gVar, gVar2, aVar);
                    }
                };
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public C3247af<T> mo10190a(final C7319aa<T> aaVar) {
                if (eVar != null) {
                    aaVar = aaVar.mo19124a((C47559ag<? super T, ? extends R>) eVar);
                }
                return new C3247af<T>() {
                    /* renamed from: a */
                    public final C7321c mo10186a(C7326g<? super T> gVar) {
                        return new C3280s(aaVar, cVar).mo19140d(gVar);
                    }

                    /* renamed from: a */
                    public final C7321c mo10187a(C7326g<? super T> gVar, C7326g<? super Throwable> gVar2) {
                        return new C3280s(aaVar, cVar).mo19129a(gVar, gVar2);
                    }
                };
            }
        };
    }

    /* renamed from: a */
    public static <T> C3274m<T> m12298a(C3246ae aeVar, C3296e<T> eVar) {
        C3281t.m12346a(aeVar, "provider == null");
        return m12299a((C7322c) C7318a.m22918a((Callable<? extends C7322c>) new C3266k<Object>(aeVar)), eVar);
    }
}
