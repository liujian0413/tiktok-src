package com.p280ss.android.ugc.aweme.feed.p1238ui;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.g */
public final class C28897g {
    /* renamed from: a */
    public static boolean m95082a(Aweme aweme) {
        if (aweme == null || aweme.getShareInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m95083b(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null || !aweme.getStatus().isReviewed() || !aweme.getStatus().isSelfSee()) {
            return false;
        }
        return true;
    }
}
