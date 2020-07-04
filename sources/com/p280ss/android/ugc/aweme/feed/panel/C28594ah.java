package com.p280ss.android.ugc.aweme.feed.panel;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.BaseVerticalViewPager;
import com.p280ss.android.ugc.aweme.detail.p1160d.C26056a;
import com.p280ss.android.ugc.aweme.feed.guide.C6915f;
import com.p280ss.android.ugc.aweme.main.C32960dc;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.ah */
public final class C28594ah implements Runnable {

    /* renamed from: a */
    static final String f75283a = "ah";

    /* renamed from: e */
    public static boolean f75284e;

    /* renamed from: b */
    final BaseVerticalViewPager f75285b;

    /* renamed from: c */
    final Handler f75286c;

    /* renamed from: d */
    final AccelerateDecelerateInterpolator f75287d = new AccelerateDecelerateInterpolator();

    /* renamed from: f */
    public boolean f75288f = false;

    /* renamed from: g */
    public float f75289g = 0.35f;

    /* renamed from: h */
    private ViewStub f75290h;

    /* renamed from: i */
    private View f75291i;

    /* renamed from: j */
    private int f75292j;

    /* renamed from: k */
    private float f75293k;

    /* renamed from: l */
    private int f75294l;

    /* renamed from: m */
    private long f75295m;

    /* renamed from: n */
    private C38267a f75296n;

    /* renamed from: o */
    private long f75297o = -1;

    /* renamed from: p */
    private Runnable f75298p = new Runnable() {
        public final void run() {
            if (!C6915f.m21543b() && C28594ah.m93896b()) {
                C28594ah.this.f75288f = true;
                C28594ah.this.f75286c.post(C28594ah.this);
            }
        }
    };

    /* renamed from: q */
    private Runnable f75299q = new Runnable() {
        public final void run() {
            if (C26056a.m85583a(true)) {
                C26056a.m85584b(false);
                C28594ah.this.f75288f = true;
                C28594ah.this.f75286c.post(C28594ah.this);
            }
        }
    };

    /* renamed from: r */
    private Runnable f75300r = new Runnable() {
        public final void run() {
            C28594ah.this.f75286c.post(C28594ah.this);
        }
    };

    /* renamed from: b */
    public static boolean m93896b() {
        return C32960dc.m106535c(true);
    }

    /* renamed from: g */
    private void m93899g() {
        this.f75286c.post(this);
    }

    /* renamed from: a */
    public final void mo73313a() {
        this.f75297o = System.currentTimeMillis();
        this.f75286c.postDelayed(this.f75299q, 500);
    }

    /* renamed from: e */
    private void m93897e() {
        this.f75295m = SystemClock.uptimeMillis();
        this.f75294l = m93898f();
        this.f75285b.mo66758c();
        this.f75296n.mo95906f(true);
        this.f75286c.post(this);
    }

    /* renamed from: f */
    private int m93898f() {
        return (int) (((float) C9738o.m28709b(this.f75285b.getContext())) * this.f75289g);
    }

    /* renamed from: i */
    private void m93901i() {
        this.f75293k = 0.0f;
        this.f75294l = 0;
        this.f75295m = 0;
        if (this.f75291i != null) {
            this.f75291i.setAlpha(0.0f);
        }
    }

    /* renamed from: d */
    public final boolean mo73317d() {
        if (this.f75285b.mo66757b() || this.f75288f) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m93900h() {
        if (this.f75285b.mo66757b()) {
            this.f75285b.mo66762d();
        }
        if (this.f75292j <= 0) {
            m93901i();
            this.f75292j++;
            this.f75286c.postDelayed(this, 2000);
            return;
        }
        if (this.f75288f) {
            C32960dc.m106536d(false);
            this.f75296n.mo95906f(false);
            this.f75288f = false;
        }
    }

    /* renamed from: c */
    public final void mo73316c() {
        this.f75286c.removeCallbacksAndMessages(null);
        m93901i();
        if (this.f75285b.mo66757b()) {
            try {
                this.f75285b.mo66762d();
                if (this.f75288f) {
                    C32960dc.m106536d(false);
                    this.f75288f = false;
                }
            } catch (Exception unused) {
            }
        }
        if (this.f75291i != null) {
            this.f75291i.setVisibility(8);
        }
        this.f75292j = 0;
    }

    public final void run() {
        if (this.f75285b.getChildCount() > 0) {
            if (this.f75295m == 0) {
                if (this.f75291i == null) {
                    this.f75291i = this.f75290h.inflate();
                }
                m93897e();
                if (C6399b.m19944t()) {
                    C6907h.m21524a("new_user_guide_show", (Map) C22984d.m75611a().mo59973a("guide_type", "slide").f60753a);
                    C6907h.m21524a("swipe_up_guide_show", (Map) C22984d.m75611a().mo59973a("type", "1").f60753a);
                }
                this.f75291i.setVisibility(0);
            } else {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f75295m;
                if (uptimeMillis < 800) {
                    m93895a(this.f75295m, this.f75294l);
                } else if (uptimeMillis < 1300) {
                    m93899g();
                } else {
                    this.f75291i.setVisibility(8);
                    m93900h();
                }
            }
            long uptimeMillis2 = SystemClock.uptimeMillis() - this.f75295m;
            if (uptimeMillis2 <= 300) {
                this.f75291i.setAlpha((((float) uptimeMillis2) * 1.0f) / 300.0f);
                return;
            }
            if (uptimeMillis2 >= 1000 && uptimeMillis2 <= 1300) {
                this.f75291i.setAlpha((((float) (1300 - uptimeMillis2)) * 1.0f) / 300.0f);
            }
        }
    }

    /* renamed from: a */
    public final void mo73314a(float f) {
        if (this.f75291i != null) {
            this.f75291i.setTranslationY(f);
        }
    }

    /* renamed from: a */
    public final void mo73315a(long j) {
        this.f75286c.postDelayed(this.f75298p, 500);
    }

    /* renamed from: a */
    private void m93895a(long j, int i) {
        if (this.f75285b.mo66757b()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            float f = this.f75293k;
            float interpolation = this.f75287d.getInterpolation((((float) (uptimeMillis - j)) * 1.0f) / 800.0f) * ((float) i);
            this.f75293k = interpolation;
            this.f75285b.mo66752a(f - interpolation);
        }
        this.f75286c.post(this);
    }

    public C28594ah(BaseVerticalViewPager baseVerticalViewPager, ViewStub viewStub) {
        this.f75285b = baseVerticalViewPager;
        this.f75286c = new Handler(Looper.getMainLooper());
        this.f75290h = viewStub;
        this.f75296n = C38267a.m122239a(this.f75285b.getContext());
    }
}
