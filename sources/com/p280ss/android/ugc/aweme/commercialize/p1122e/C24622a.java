package com.p280ss.android.ugc.aweme.commercialize.p1122e;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.main.story.live.p1388a.C33097c;
import com.p280ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e.a */
public final class C24622a extends C33097c {

    /* renamed from: h */
    private TextView f64935h;

    /* renamed from: i */
    private TextView f64936i;

    /* renamed from: a */
    public final void mo64470a() {
    }

    /* renamed from: b */
    public final void mo64474b() {
    }

    /* renamed from: c */
    public final void mo64476c() {
    }

    /* renamed from: a */
    public final void mo64473a(String str) {
        this.f64935h.setText(str);
    }

    /* renamed from: b */
    public final void mo64475b(String str) {
        this.f64936i.setText(str);
    }

    /* renamed from: a */
    public final void mo64472a(AbsLiveStoryItemView absLiveStoryItemView) {
        super.mo64472a(absLiveStoryItemView);
        if (absLiveStoryItemView instanceof C24625d) {
            View rootView = absLiveStoryItemView.getRootView();
            this.f64935h = (TextView) rootView.findViewById(R.id.b3x);
            this.f64936i = (TextView) rootView.findViewById(R.id.b3y);
        }
    }

    /* renamed from: a */
    public final void mo64471a(int i, int i2) {
        this.f86104a.mo73895a(i, i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke((int) C9738o.m28708b(this.f64935h.getContext(), 1.0f), -16777216);
        gradientDrawable.setCornerRadius(C9738o.m28708b(this.f64935h.getContext(), 3.0f));
        this.f64935h.setBackground(gradientDrawable);
    }
}
