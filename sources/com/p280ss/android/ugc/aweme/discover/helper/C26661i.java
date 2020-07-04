package com.p280ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.transition.C0476c;
import android.support.transition.C0488d;
import android.support.transition.C0516o;
import android.support.transition.C0520q;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.C38457aq;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.i */
public final class C26661i extends C26649a {

    /* renamed from: d */
    private View f70287d;

    /* renamed from: e */
    private View f70288e;

    /* renamed from: f */
    private View f70289f;

    /* renamed from: g */
    private View f70290g;

    /* renamed from: h */
    private View f70291h;

    /* renamed from: i */
    private View f70292i;

    /* renamed from: j */
    private boolean f70293j;

    /* renamed from: k */
    private boolean f70294k = true;

    /* renamed from: l */
    private boolean f70295l;

    /* renamed from: m */
    private boolean f70296m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68346a(Animator animator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo68347a(ValueAnimator valueAnimator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo68350b(Animator animator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo68351b(ValueAnimator valueAnimator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo68352c(Animator animator) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo68353d(Animator animator) {
    }

    /* renamed from: a */
    public final void mo68345a() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f70292i.getLayoutParams();
        marginLayoutParams.leftMargin = (int) C9738o.m28708b(this.f70272a, 0.0f);
        this.f70292i.setLayoutParams(marginLayoutParams);
        m87592f(false);
    }

    /* renamed from: b */
    public final void mo68349b() {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f70292i.getLayoutParams();
        if ((!this.f70293j || this.f70294k) && (!this.f70295l || this.f70296m)) {
            marginLayoutParams.leftMargin = (int) C9738o.m28708b(this.f70272a, 16.0f);
        } else {
            marginLayoutParams.leftMargin = 0;
        }
        m87592f(true);
    }

    /* renamed from: b */
    public final C26661i mo68363b(boolean z) {
        this.f70293j = z;
        return this;
    }

    /* renamed from: c */
    public final C26661i mo68364c(boolean z) {
        this.f70294k = z;
        return this;
    }

    /* renamed from: d */
    public final C26661i mo68365d(boolean z) {
        this.f70295l = true;
        return this;
    }

    /* renamed from: e */
    public final C26661i mo68366e(boolean z) {
        this.f70296m = z;
        return this;
    }

    /* renamed from: f */
    private void m87592f(boolean z) {
        int i;
        int i2;
        int i3;
        this.f70274c = z ^ true ? 1 : 0;
        C0520q qVar = new C0520q();
        qVar.mo2151a(new C0488d().mo2131b(this.f70291h).mo2131b(this.f70288e).mo2131b(this.f70289f).mo2131b(this.f70290g));
        qVar.mo2151a(new C0476c().mo2128b((int) R.id.cu7));
        qVar.mo2116a((TimeInterpolator) new C38457aq(0.32f, 0.94f, 0.6f, 1.0f));
        qVar.mo2115a(200);
        C0516o.m2171a((ViewGroup) this.f70287d, qVar);
        View view = this.f70289f;
        int i4 = 0;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (!this.f70293j || this.f70294k) {
            View view2 = this.f70290g;
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view2.setVisibility(i2);
            if (this.f70294k) {
                View view3 = this.f70291h;
                if (!z) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                view3.setVisibility(i3);
            }
        }
        if (this.f70295l) {
            View view4 = this.f70288e;
            if (!z) {
                i4 = 8;
            }
            view4.setVisibility(i4);
        }
    }

    public C26661i(Context context, View view, View view2, View view3, View view4, View view5, View view6) {
        super(context);
        this.f70287d = view;
        this.f70288e = view2;
        this.f70290g = view3;
        this.f70291h = view4;
        this.f70289f = view5;
        this.f70292i = view6;
    }
}
