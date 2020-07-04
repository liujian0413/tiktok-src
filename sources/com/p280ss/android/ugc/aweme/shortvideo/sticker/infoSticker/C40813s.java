package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.transition.C0476c;
import android.support.transition.C0516o;
import android.support.transition.C0520q;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.s */
public final class C40813s {

    /* renamed from: a */
    private View f106137a;

    /* renamed from: b */
    private TextView f106138b;

    /* renamed from: c */
    private int f106139c;

    /* renamed from: d */
    private int f106140d;

    /* renamed from: e */
    private boolean f106141e = true;

    /* renamed from: f */
    private FrameLayout f106142f;

    /* renamed from: g */
    private final int f106143g;

    /* renamed from: a */
    public final void mo101083a() {
        m130422a(false);
    }

    /* renamed from: b */
    public final void mo101084b() {
        m130422a(true);
    }

    /* renamed from: a */
    private void m130422a(boolean z) {
        int i;
        LayoutParams layoutParams = (LayoutParams) this.f106142f.getLayoutParams();
        if (this.f106141e) {
            this.f106139c = this.f106142f.getMeasuredWidth();
            this.f106138b.measure(0, 0);
            this.f106140d = this.f106138b.getMeasuredWidth();
            this.f106141e = false;
        }
        if (z) {
            i = this.f106139c - (this.f106140d + this.f106143g);
        } else {
            i = -1;
        }
        layoutParams.width = i;
        C0520q qVar = new C0520q();
        qVar.mo2151a(new C0476c().mo2131b((View) this.f106142f).mo2131b((View) this.f106138b));
        qVar.mo2116a((TimeInterpolator) new AccelerateInterpolator());
        qVar.mo2115a(300);
        C0516o.m2171a((ViewGroup) this.f106137a, qVar);
        this.f106142f.setLayoutParams(layoutParams);
    }

    public C40813s(Context context, View view, TextView textView) {
        this.f106137a = view;
        this.f106138b = textView;
        this.f106142f = (FrameLayout) this.f106137a.findViewById(R.id.cuz);
        this.f106143g = (int) C9738o.m28708b(context, 16.0f);
    }
}
