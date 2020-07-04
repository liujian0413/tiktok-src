package com.p280ss.android.ugc.aweme.commercialize.splash;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.agilelogger.ALog;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.inflate.SplashBgInflate;
import com.p280ss.android.ugc.aweme.p931a.C21085a;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.l */
public final class C25067l {

    /* renamed from: a */
    private ViewGroup f66167a;

    /* renamed from: b */
    private View f66168b;

    /* renamed from: c */
    private Activity f66169c;

    /* renamed from: b */
    public final void mo65574b() {
        if (!(this.f66167a == null || this.f66168b == null)) {
            this.f66167a.removeView(this.f66168b);
        }
        ALog.m20862b("awesome_splash", "removeSplashLoadMask");
    }

    /* renamed from: a */
    public final void mo65573a() {
        this.f66167a = (ViewGroup) this.f66169c.getWindow().getDecorView();
        this.f66168b = new View(this.f66169c);
        this.f66168b.setBackground(((SplashBgInflate) C7121a.m22249b(SplashBgInflate.class)).getSplashBgDrawable(this.f66169c));
        if (this.f66167a instanceof FrameLayout) {
            LayoutParams layoutParams = new LayoutParams(-1, -1);
            if (C22911a.m75401a(this.f66169c) && !C25081m.m82600a(this.f66169c)) {
                layoutParams.topMargin = C21085a.m71116a(C6399b.m19921a());
            }
            this.f66167a.addView(this.f66168b, 0, layoutParams);
        } else {
            this.f66167a.addView(this.f66168b, 0, new ViewGroup.LayoutParams(-1, -1));
        }
        ALog.m20862b("awesome_splash", "addSplashLoadMask");
    }

    public C25067l(Activity activity) {
        this.f66169c = activity;
    }
}
