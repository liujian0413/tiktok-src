package com.p280ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.p260a.C6383c;
import com.bytedance.ies.ugc.appcontext.C6399b;

@C6381a(mo15284a = "t_dislike_style")
@C6383c
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.TDislikeStyleExperiment */
public final class TDislikeStyleExperiment {
    public static final TDislikeStyleExperiment INSTANCE = new TDislikeStyleExperiment();
    @C6382b
    public static final int NEW = 1;
    @C6382b(mo15285a = true)
    public static final int OLD = 0;

    private TDislikeStyleExperiment() {
    }

    public static final boolean isTShowOptionDialog() {
        if (!C6399b.m19947w() || C6384b.m19835a().mo15287a(TDislikeStyleExperiment.class, false, "t_dislike_style", C6384b.m19835a().mo15295d().t_dislike_style, 0) != 1) {
            return false;
        }
        return true;
    }
}
