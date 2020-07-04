package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39567a.C39568a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40366c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.c */
public abstract class C39570c extends PopupWindow implements C39579j, C39580k, C39581l, C39582m, C39583n {

    /* renamed from: a */
    public static int f102771a;

    /* renamed from: b */
    protected Activity f102772b;

    /* renamed from: c */
    protected int f102773c;

    /* renamed from: d */
    protected int f102774d;

    /* renamed from: e */
    private C39583n f102775e = new C39576g(this);

    /* renamed from: f */
    private C39580k f102776f = new C39569b(this);

    /* renamed from: g */
    private C39579j f102777g = new C39567a(this);

    /* renamed from: h */
    private C39582m f102778h = new C39572e(this);

    public void dismiss() {
        C39571d.m126453a(this);
    }

    /* renamed from: n */
    public final C39583n mo98559n() {
        return this.f102775e;
    }

    /* renamed from: o */
    public final C39579j mo98560o() {
        return this.f102777g;
    }

    /* renamed from: p */
    public final Activity mo98561p() {
        return this.f102772b;
    }

    /* renamed from: q */
    public final C39580k mo98562q() {
        return this.f102776f;
    }

    /* renamed from: a */
    public final void mo98526a() {
        this.f102777g.mo98526a();
    }

    public final int bO_() {
        return this.f102776f.bO_();
    }

    public final int bP_() {
        return this.f102776f.bP_();
    }

    /* renamed from: c */
    public final int mo98536c() {
        return this.f102776f.mo98536c();
    }

    /* renamed from: d */
    public final int mo98538d() {
        return this.f102776f.mo98538d();
    }

    /* renamed from: g */
    public final int mo98544g() {
        return this.f102776f.mo98544g();
    }

    /* renamed from: h */
    public final void mo98553h() {
        this.f102778h.mo98553h();
    }

    /* renamed from: i */
    public final void mo98554i() {
        this.f102778h.mo98554i();
    }

    /* renamed from: m */
    public final void mo98558m() {
        this.f102775e.mo98558m();
    }

    /* renamed from: r */
    public final long mo98563r() {
        return this.f102778h.mo98563r();
    }

    /* renamed from: s */
    public final Runnable mo98564s() {
        return this.f102778h.mo98564s();
    }

    /* renamed from: b */
    public final FixBubbleLayout mo98529b() {
        return this.f102777g.mo98529b();
    }

    /* renamed from: f */
    public final boolean mo98543f() {
        return this.f102776f.mo98543f();
    }

    /* renamed from: j */
    public final int mo98555j() {
        return getContentView().getMeasuredHeight();
    }

    /* renamed from: k */
    public final int mo98556k() {
        return getContentView().getMeasuredWidth();
    }

    /* renamed from: e */
    public final boolean mo98541e() {
        return this.f102776f.mo98541e();
    }

    /* renamed from: l */
    public final void mo98557l() {
        if (this.f102773c == 0 || this.f102774d == 0) {
            getContentView().measure(MeasureSpec.makeMeasureSpec(C23482j.m77098b(getContentView().getContext()), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(C23482j.m77095a(getContentView().getContext()), Integer.MIN_VALUE));
            return;
        }
        getContentView().measure(MeasureSpec.makeMeasureSpec(this.f102773c, 1073741824), MeasureSpec.makeMeasureSpec(this.f102774d, 1073741824));
    }

    /* renamed from: g */
    public static void m126416g(int i) {
        FixBubbleLayout.f102739i = i;
    }

    /* renamed from: b */
    public final int mo98532b(int i) {
        return this.f102776f.mo98532b(i);
    }

    /* renamed from: e */
    public final void mo98540e(int i) {
        this.f102776f.mo98540e(i);
    }

    /* renamed from: f */
    public final void mo98542f(int i) {
        this.f102776f.mo98542f(i);
    }

    /* renamed from: a */
    public final void mo98530a(int i) {
        this.f102776f.mo98530a(i);
    }

    /* renamed from: c */
    public final void mo98537c(int i) {
        this.f102776f.mo98537c(i);
    }

    /* renamed from: d */
    public final void mo98539d(int i) {
        this.f102776f.mo98539d(i);
    }

    /* renamed from: e */
    public final void mo98552e(boolean z) {
        this.f102778h.mo98552e(z);
    }

    /* renamed from: a */
    public final void mo98545a(long j) {
        this.f102778h.mo98545a(j);
    }

    /* renamed from: b */
    public final void mo98548b(long j) {
        this.f102778h.mo98548b(j);
    }

    /* renamed from: c */
    public final void mo98549c(boolean z) {
        this.f102778h.mo98549c(z);
    }

    /* renamed from: d */
    public final void mo98550d(boolean z) {
        this.f102775e.mo98550d(z);
    }

    /* renamed from: a */
    public final void mo98527a(View view) {
        this.f102777g.mo98527a(view);
    }

    /* renamed from: b */
    public final void mo98533b(boolean z) {
        this.f102776f.mo98533b(z);
    }

    /* renamed from: a */
    public final void mo98528a(C39568a aVar) {
        this.f102777g.mo98528a(aVar);
    }

    /* renamed from: a */
    public final void mo98546a(C40366c cVar) {
        this.f102778h.mo98546a(cVar);
    }

    /* renamed from: a */
    public final void mo98531a(boolean z) {
        this.f102776f.mo98531a(z);
    }

    public C39570c(Activity activity, boolean z) {
        super(activity);
        this.f102772b = activity;
        f102771a = (int) C39575f.m126467a(this.f102772b, 3.0f);
        setWidth(-2);
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        setInputMethodMode(1);
        setSoftInputMode(16);
        if (z) {
            mo98526a();
        }
    }

    /* renamed from: a */
    public final void mo98547a(boolean z, int i) {
        this.f102778h.mo98547a(z, i);
    }

    public void showAtLocation(View view, int i, int i2, int i3) {
        try {
            super.showAtLocation(view, i, i2, i3);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }
}
