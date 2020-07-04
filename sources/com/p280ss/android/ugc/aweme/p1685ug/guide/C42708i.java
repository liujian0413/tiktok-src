package com.p280ss.android.ugc.aweme.p1685ug.guide;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p280ss.android.ugc.aweme.feed.panel.C28633q;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import com.p280ss.android.ugc.aweme.main.C32960dc;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;
import com.p280ss.android.ugc.aweme.utils.C43034cx;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.i */
public final class C42708i implements C42697d {

    /* renamed from: c */
    public static final C42709a f110993c = new C42709a(null);

    /* renamed from: a */
    public boolean f110994a;

    /* renamed from: b */
    public final C28648x f110995b;

    /* renamed from: d */
    private final Handler f110996d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private final Runnable f110997e = new C42710b(this);

    /* renamed from: f */
    private final C38267a f110998f;

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.i$a */
    public static final class C42709a {
        private C42709a() {
        }

        public /* synthetic */ C42709a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.i$b */
    static final class C42710b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42708i f110999a;

        C42710b(C42708i iVar) {
            this.f110999a = iVar;
        }

        public final void run() {
            if (!this.f110999a.mo104320h()) {
                this.f110999a.f110994a = true;
            }
            if (this.f110999a.mo104319g() && this.f110999a.f110995b.mo73515bv() != null) {
                boolean z = !C43034cx.m136561a(this.f110999a.f110995b.mo73515bv(), false);
                if (this.f110999a.f110995b instanceof C28633q) {
                    VerticalViewPager at = ((C28633q) this.f110999a.f110995b).mo73370at();
                    C7573i.m23582a((Object) at, "panel.viewPager");
                    if (at.getCurrentItem() != 0) {
                        return;
                    }
                }
                if (z) {
                    this.f110999a.f110995b.mo71902ah();
                    C32960dc.m106546n(true);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo104304a() {
        this.f110996d.removeCallbacks(this.f110997e);
    }

    /* renamed from: b */
    public final void mo104306b() {
        mo104305a(m135572j());
    }

    /* renamed from: j */
    private static long m135572j() {
        if (C6399b.m19944t()) {
            return 3000;
        }
        return C42706h.f110992b.mo104317b();
    }

    /* renamed from: i */
    private static boolean m135571i() {
        boolean f = ((C32961dd) C23336d.m76560a(C6399b.m19921a(), C32961dd.class)).mo60470f(true);
        if (!C6399b.m19945u() || !f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo104307c() {
        if (mo104320h() && this.f110994a) {
            if (mo104319g()) {
                this.f110995b.mo71902ah();
                C32960dc.m106546n(true);
            }
            this.f110994a = false;
        }
    }

    /* renamed from: d */
    public final void mo104308d() {
        if (mo104319g() && C42706h.f110992b.mo104316a()) {
            this.f110995b.mo71902ah();
        }
    }

    /* renamed from: e */
    public final void mo104309e() {
        if (mo104319g() && C42706h.f110992b.mo104316a()) {
            this.f110995b.mo71902ah();
        }
    }

    /* renamed from: f */
    public final void mo104310f() {
        if (mo104319g() && C42706h.f110992b.mo104316a()) {
            this.f110995b.mo71902ah();
        }
    }

    /* renamed from: h */
    public final boolean mo104320h() {
        if (this.f110998f.mo95907f() || this.f110998f.mo95908g() || this.f110998f.mo95905e()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean mo104319g() {
        if (!this.f110998f.mo95909h() && !this.f110998f.mo95907f() && !this.f110998f.mo95908g() && !this.f110998f.mo95905e() && !C32960dc.m106534b(false) && m135571i() && C32960dc.m106535c(true)) {
            int al = this.f110995b.mo71906al() - 1;
            VerticalViewPager at = this.f110995b.mo73370at();
            C7573i.m23582a((Object) at, "panel.viewPager");
            if (al != at.getCurrentItem()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo104305a(long j) {
        if (C42706h.f110992b.mo104316a()) {
            boolean z = true;
            if (!C6399b.m19945u() ? C32960dc.m106531a(false) : C42706h.f110992b.mo104318c() && C32960dc.m106531a(false)) {
                z = false;
            }
            if (z) {
                this.f110996d.postDelayed(this.f110997e, j);
            }
        }
    }

    public C42708i(C28648x xVar, C38267a aVar) {
        C7573i.m23587b(xVar, "panel");
        C7573i.m23587b(aVar, "mDialogShowingManager");
        this.f110995b = xVar;
        this.f110998f = aVar;
    }
}
