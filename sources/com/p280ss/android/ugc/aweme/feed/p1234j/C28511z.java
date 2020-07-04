package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.experiment.CaptionEnableSeeMoreExperiment;

/* renamed from: com.ss.android.ugc.aweme.feed.j.z */
public final class C28511z {
    /* renamed from: a */
    public static int m93720a() {
        if (!C6399b.m19944t()) {
            return 55;
        }
        if (C6384b.m19835a().mo15287a(CaptionEnableSeeMoreExperiment.class, true, "caption_enable_see_more_mt", C6384b.m19835a().mo15295d().caption_enable_see_more_mt, 1) == 1) {
            return NormalGiftView.MASK_TRANSLATE_VALUE;
        }
        return 100;
    }

    /* renamed from: b */
    public static int m93721b() {
        if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(CaptionEnableSeeMoreExperiment.class, true, "caption_enable_see_more_mt", C6384b.m19835a().mo15295d().caption_enable_see_more_mt, 1) == 1) {
            return 4;
        }
        return 3;
    }
}
