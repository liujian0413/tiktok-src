package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1554a;

import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39145b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointSingleVideoEditView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e */
public final class C39137e extends C39108a {

    /* renamed from: b */
    private StickPointSingleVideoEditView f101483b;

    /* renamed from: a */
    public final View mo97369a() {
        return this.f101483b;
    }

    /* renamed from: a */
    public final void mo97418a(View view) {
        this.f101483b = (StickPointSingleVideoEditView) view;
    }

    /* renamed from: a */
    public final void mo97370a(boolean z) {
        if (this.f101483b != null) {
            if (z) {
                super.mo97370a(true);
            } else {
                C39145b.m124991a(this.f101483b);
            }
        }
    }

    /* renamed from: b */
    public final void mo97371b(boolean z) {
        if (this.f101483b != null) {
            if (z) {
                super.mo97371b(true);
            } else {
                C39145b.m124992a(this.f101483b, true);
            }
        }
    }
}
