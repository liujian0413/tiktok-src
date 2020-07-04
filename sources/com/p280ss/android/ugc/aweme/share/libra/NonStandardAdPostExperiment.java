package com.p280ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "non_standard_ad_publish_toast_style")
/* renamed from: com.ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment */
public final class NonStandardAdPostExperiment {
    @C6382b(mo15285a = true)
    private static final int DISABLE = 0;
    @C6382b
    private static final int ENABLE = 2;
    public static final NonStandardAdPostExperiment INSTANCE = new NonStandardAdPostExperiment();
    @C6382b
    private static final int SHOW_ONLY = 1;

    private NonStandardAdPostExperiment() {
    }

    public final int getDISABLE() {
        return DISABLE;
    }

    public final int getENABLE() {
        return ENABLE;
    }

    public final int getSHOW_ONLY() {
        return SHOW_ONLY;
    }

    public final boolean disable() {
        if (C6384b.m19835a().mo15287a(NonStandardAdPostExperiment.class, true, "non_standard_ad_publish_toast_style", C6384b.m19835a().mo15295d().non_standard_ad_publish_toast_style, 0) == DISABLE) {
            return true;
        }
        return false;
    }

    public final boolean enable() {
        if (C6384b.m19835a().mo15287a(NonStandardAdPostExperiment.class, true, "non_standard_ad_publish_toast_style", C6384b.m19835a().mo15295d().non_standard_ad_publish_toast_style, 0) == ENABLE) {
            return true;
        }
        return false;
    }

    public final boolean notDisable() {
        if (C6384b.m19835a().mo15287a(NonStandardAdPostExperiment.class, true, "non_standard_ad_publish_toast_style", C6384b.m19835a().mo15295d().non_standard_ad_publish_toast_style, 0) > DISABLE) {
            return true;
        }
        return false;
    }
}
