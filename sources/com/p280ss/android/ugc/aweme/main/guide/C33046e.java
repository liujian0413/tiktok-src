package com.p280ss.android.ugc.aweme.main.guide;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.guide.C28398m;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.main.C32960dc;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.main.guide.e */
public final class C33046e {

    /* renamed from: a */
    public static boolean f86014a;

    /* renamed from: b */
    private boolean f86015b;

    /* renamed from: c */
    private boolean f86016c;

    /* renamed from: d */
    private View f86017d;

    /* renamed from: e */
    private AnimationImageView f86018e;

    /* renamed from: g */
    private static boolean m106726g() {
        return C28398m.f74839a;
    }

    /* renamed from: e */
    private static boolean m106724e() {
        return C32960dc.m106542j(true);
    }

    /* renamed from: f */
    private static void m106725f() {
        C32960dc.m106543k(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo84740b() {
        m106723d();
        C42961az.m136380a(new C33045d(false));
    }

    /* renamed from: d */
    private void m106723d() {
        if (this.f86018e != null) {
            this.f86018e.mo7085f();
        }
        C23487o.m77150b(this.f86017d, 8);
    }

    /* renamed from: a */
    public final boolean mo84739a() {
        if (m106724e() && this.f86015b && !m106726g()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m106722c() {
        if (this.f86017d != null) {
            this.f86018e = (AnimationImageView) this.f86017d.findViewById(R.id.b9t);
            try {
                if (C43127fh.m136806a(this.f86017d.getContext())) {
                    ((TextView) this.f86017d.findViewById(R.id.avl)).setText(R.string.bei);
                    this.f86018e.setScaleX(-1.0f);
                }
            } catch (Exception unused) {
            }
            if (this.f86018e != null && !f86014a) {
                this.f86018e.setRepeatCount(3);
                this.f86018e.setAnimation("right_pic.json");
                this.f86018e.setProgress(0.0f);
                this.f86018e.mo7078b();
                f86014a = true;
                m106725f();
            }
        }
    }

    /* renamed from: a */
    public final void mo84736a(ViewGroup viewGroup) {
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.dcq);
        if (viewStub != null) {
            viewStub.setOnInflateListener(new C33047f(this));
            if (!this.f86016c) {
                this.f86017d = viewStub.inflate();
                m106722c();
                C42961az.m136380a(new C33045d(true));
                this.f86017d.postDelayed(new C33048g(this), 5200);
            }
        }
    }

    /* renamed from: a */
    public final void mo84738a(Aweme aweme) {
        boolean z = true;
        if (aweme == null || aweme.getAuthor() == null || !(aweme.getAuthor().getFollowStatus() == 1 || aweme.getAuthor().getFollowStatus() == 2)) {
            z = false;
        }
        this.f86015b = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84737a(ViewStub viewStub, View view) {
        this.f86016c = true;
    }
}
