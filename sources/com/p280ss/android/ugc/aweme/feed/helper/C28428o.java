package com.p280ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel;
import com.p280ss.android.ugc.aweme.video.C43222g;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.o */
public final class C28428o {
    /* renamed from: a */
    public static C43222g m93437a() {
        return m93439b(C6405d.m19984g());
    }

    /* renamed from: b */
    private static C43222g m93439b(Activity activity) {
        if (activity instanceof FragmentActivity) {
            return FeedSharePlayerViewModel.getPlayerManager((FragmentActivity) activity);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m93438a(Activity activity) {
        if (C6399b.m19944t() || m93439b(activity) == null) {
            return false;
        }
        return true;
    }
}
