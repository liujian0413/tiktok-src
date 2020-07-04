package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.experiment.DDislikeStyleExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.TDislikeStyleExperiment;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.b */
public final class C28963b {

    /* renamed from: a */
    public static final C28963b f76312a = new C28963b();

    private C28963b() {
    }

    /* renamed from: a */
    public static final boolean m95198a() {
        if (C6399b.m19946v() || TDislikeStyleExperiment.isTShowOptionDialog() || DDislikeStyleExperiment.isDShowOptionDialog()) {
            return true;
        }
        return false;
    }
}
