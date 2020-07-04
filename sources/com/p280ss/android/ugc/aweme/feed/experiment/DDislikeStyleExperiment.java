package com.p280ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.ugc.appcontext.C6399b;

@C6381a(mo15284a = "long_press_category")
/* renamed from: com.ss.android.ugc.aweme.feed.experiment.DDislikeStyleExperiment */
public final class DDislikeStyleExperiment {
    public static final DDislikeStyleExperiment INSTANCE = new DDislikeStyleExperiment();
    @C6382b
    public static final int NEW_STYLE_A = 1;
    @C6382b
    public static final int NEW_STYLE_B = 2;
    @C6382b
    public static final int NEW_STYLE_C = 3;
    @C6382b
    public static final int NEW_STYLE_D = 4;
    @C6382b(mo15285a = true)
    public static final int OLD = 0;

    private DDislikeStyleExperiment() {
    }

    public static final boolean enableDetailShowOptionDialog() {
        if (!C6399b.m19944t() && C6384b.m19835a().mo15287a(DDislikeStyleExperiment.class, true, "long_press_category", C6384b.m19835a().mo15295d().long_press_category, 0) == 4) {
            return true;
        }
        return false;
    }

    public static final boolean enableIMShare() {
        if (C6399b.m19944t()) {
            return false;
        }
        int a = C6384b.m19835a().mo15287a(DDislikeStyleExperiment.class, true, "long_press_category", C6384b.m19835a().mo15295d().long_press_category, 0);
        if (a == 2 || a == 3 || a == 4) {
            return true;
        }
        return false;
    }

    public static final boolean enableOptimizeLongPressTimeInterval() {
        if (C6399b.m19944t()) {
            return false;
        }
        int a = C6384b.m19835a().mo15287a(DDislikeStyleExperiment.class, true, "long_press_category", C6384b.m19835a().mo15295d().long_press_category, 0);
        if (a == 2 || a == 4) {
            return true;
        }
        return false;
    }

    public static final boolean isDShowOptionDialog() {
        if (C6399b.m19944t()) {
            return false;
        }
        int a = C6384b.m19835a().mo15287a(DDislikeStyleExperiment.class, true, "long_press_category", C6384b.m19835a().mo15295d().long_press_category, 0);
        if (a == 1 || a == 2 || a == 3 || a == 4) {
            return true;
        }
        return false;
    }
}
