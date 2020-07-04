package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1554a;

import android.view.View;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39145b;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39165c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointModeChangeView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.c */
public final class C39129c extends C39108a {

    /* renamed from: b */
    private StickPointModeChangeView f101465b;

    /* renamed from: a */
    public final View mo97369a() {
        return this.f101465b;
    }

    /* renamed from: a */
    public final void mo97406a(View view) {
        this.f101465b = (StickPointModeChangeView) view;
    }

    /* renamed from: a */
    public final void mo97407a(C39165c cVar) {
        C7573i.m23587b(cVar, "listener");
        StickPointModeChangeView stickPointModeChangeView = this.f101465b;
        if (stickPointModeChangeView != null) {
            stickPointModeChangeView.setStickPointModeChangeListener(cVar);
        }
    }

    /* renamed from: b */
    public final void mo97371b(boolean z) {
        if (this.f101465b != null) {
            if (z) {
                C39145b.m124992a(this.f101465b, true);
                return;
            }
            StickPointModeChangeView stickPointModeChangeView = this.f101465b;
            if (stickPointModeChangeView != null) {
                stickPointModeChangeView.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo97370a(boolean z) {
        if (this.f101465b != null) {
            if (z) {
                C39145b.m124991a(this.f101465b);
                return;
            }
            StickPointModeChangeView stickPointModeChangeView = this.f101465b;
            if (stickPointModeChangeView != null) {
                stickPointModeChangeView.setVisibility(0);
            }
        }
    }
}
