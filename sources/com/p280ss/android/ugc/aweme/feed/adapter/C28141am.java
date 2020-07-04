package com.p280ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.feed.event.C28311ag;
import com.p280ss.android.ugc.aweme.feed.event.C28312ah;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.am */
public final class C28141am {
    /* renamed from: a */
    public static void m92411a(C28311ag agVar, C28312ah ahVar, String str) {
        C42961az.m136380a(agVar);
        C42961az.m136380a(ahVar);
        if (((Integer) SharePrefCache.inst().getScrollToProfileGuideState().mo59877d()).intValue() != 0) {
            return;
        }
        if (!TextUtils.equals(str, "homepage_follow") || !C6903bc.m21482a().mo84632b()) {
            SharePrefCache.inst().getScrollToProfileGuideState().mo59871a(Integer.valueOf(1));
        }
    }
}
