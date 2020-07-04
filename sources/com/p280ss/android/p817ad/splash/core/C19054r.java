package com.p280ss.android.p817ad.splash.core;

import android.content.Context;
import android.view.ViewGroup;
import com.p280ss.android.p817ad.splash.C19115e;
import com.p280ss.android.p817ad.splash.C19152n;
import com.p280ss.android.p817ad.splash.core.p827b.C18985b;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p829d.C19016a;
import com.p280ss.android.p817ad.splash.p824b.C18956b;
import com.p280ss.android.p817ad.splash.p825c.C18959b;
import com.p280ss.android.p817ad.splash.p825c.C18961d;
import com.p280ss.android.p817ad.splash.p836g.C19132j;

/* renamed from: com.ss.android.ad.splash.core.r */
final class C19054r implements C19152n {

    /* renamed from: a */
    private C19115e f51486a;

    /* renamed from: b */
    private C18986c f51487b;

    /* renamed from: c */
    private C18968b f51488c;

    /* renamed from: d */
    private C18961d f51489d;

    /* renamed from: e */
    private boolean f51490e;

    C19054r() {
    }

    /* renamed from: a */
    private C18959b m62333a() {
        if (this.f51489d == null) {
            this.f51489d = new C18961d();
        }
        return this.f51489d;
    }

    /* renamed from: a */
    public final C19152n mo50591a(C19115e eVar) {
        this.f51486a = eVar;
        return this;
    }

    /* renamed from: a */
    private void m62334a(C19001b bVar) {
        C19016a.m62077a(bVar);
        this.f51490e = true;
    }

    /* renamed from: a */
    public final ViewGroup mo50590a(Context context) {
        if (context != null) {
            "ContextImpl".equals(context.getClass().getSimpleName());
            if (!C19053q.m62298i().mo50589j()) {
                return null;
            }
            ViewGroup b = m62336b(context);
            if (b == null) {
                C19046l.m62236a().mo50541b();
            }
            if (!this.f51490e) {
                C19016a.m62076a();
            }
            return b;
        }
        throw new IllegalArgumentException("context is null");
    }

    /* renamed from: b */
    private ViewGroup m62336b(Context context) {
        ViewGroup viewGroup;
        if (this.f51486a != null) {
            C19048m a = C19048m.m62245a();
            C19001b b = a.mo50545b();
            if (b == null) {
                return null;
            }
            C19063v.m62414a().mo50650f();
            boolean z = true;
            if (b.mo50489l() && C19025f.m62094H() != null) {
                m62333a().mo50381a(this.f51486a);
                C19025f.m62094H().mo50383a(b, true);
                if (C19025f.m62132aa()) {
                    m62334a(b);
                }
                C19062u.m62368a().mo50615d().mo50628j();
                C19053q.m62298i().f51485a = true;
                return null;
            } else if (b.mo50490m()) {
                m62333a().mo50381a(this.f51486a);
                if (C19025f.m62132aa()) {
                    m62334a(b);
                }
                C19062u.m62368a().mo50615d().mo50628j();
                C19053q.m62298i().f51485a = true;
                return null;
            } else if (!b.mo50476a()) {
                return null;
            } else {
                if (C19025f.m62112Z()) {
                    C18986c cVar = new C18986c(context);
                    cVar.setSplashAdInteraction(new C19050o(cVar, this.f51486a));
                    if (!cVar.mo50449a(b)) {
                        C18956b.m61883a();
                        C18956b.m61884a(7);
                        return null;
                    }
                    this.f51487b = cVar;
                    C19015d.m62075a(this.f51487b);
                    viewGroup = cVar;
                } else {
                    C18968b bVar = new C18968b(context);
                    bVar.setSplashAdInteraction(new C19050o(bVar, this.f51486a));
                    if (!bVar.mo50407a(b)) {
                        C18956b.m61883a();
                        C18956b.m61884a(7);
                        return null;
                    }
                    this.f51488c = bVar;
                    C19015d.m62075a(this.f51488c);
                    viewGroup = bVar;
                }
                C19053q.m62298i().f51485a = true;
                C19062u.m62368a().mo50615d().mo50628j();
                m62334a(b);
                String B = b.mo50470B();
                if (!C19025f.m62110X() ? C19132j.m62736a(B) || C19132j.m62736a(a.f51474b) || !a.f51474b.equals(B) : a.f51475c != b.mo50375n()) {
                    z = false;
                }
                m62335a(b, z);
                return viewGroup;
            }
        } else {
            throw new IllegalStateException("SplashAdActionListener为空! 请在SplashAdNative中设置！");
        }
    }

    /* renamed from: a */
    private static void m62335a(C19001b bVar, boolean z) {
        if (z) {
            C18985b.m61973a();
            C18985b.m61974a(bVar);
        }
        C18956b.m61883a().mo50372d();
        C18956b.m61883a();
        C18956b.m61884a(0);
    }
}
