package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.bubbleview.C10751a.C10752a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.l */
public final class C40823l {

    /* renamed from: c */
    private static C40823l f106155c;

    /* renamed from: a */
    public boolean f106156a;

    /* renamed from: b */
    public boolean f106157b;

    private C40823l() {
    }

    /* renamed from: a */
    public static C40823l m130437a() {
        if (f106155c == null) {
            f106155c = new C40823l();
        }
        return f106155c;
    }

    /* renamed from: a */
    static final /* synthetic */ void m130438a(Activity activity, View view) {
        new C10752a(activity).mo25738b((int) R.string.e1l).mo25731a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION).mo25736a(true).mo25737a().mo25717a(view, 48, 0.0f, -((int) C9738o.m28708b((Context) activity, 10.0f)));
        C35574k.m114859a().mo70091f().mo93341a(Property.BubbleFavoriteStickerShown, true);
    }

    /* renamed from: a */
    public final void mo101088a(View view, Activity activity) {
        if (!C35574k.m114859a().mo70091f().mo93342a(Property.BubbleFavoriteStickerShown) && this.f106156a && this.f106157b && view.getParent() != null) {
            view.post(new C40824m(activity, view));
        }
    }
}
