package com.p280ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "main_tab_strip_style")
/* renamed from: com.ss.android.ugc.aweme.main.experiment.MainTabStripStyleExperiment */
public final class MainTabStripStyleExperiment {
    @C6382b(mo15285a = true)
    public static final int DEFAULT = 0;
    public static final MainTabStripStyleExperiment INSTANCE = new MainTabStripStyleExperiment();
    @C6382b
    public static final int STYLE_A = 1;
    @C6382b
    public static final int STYLE_B = 2;

    private MainTabStripStyleExperiment() {
    }

    public final boolean isEnableNewStyle() {
        if (isShowStyleA() || isShowStyleB()) {
            return true;
        }
        return false;
    }

    public final boolean isShowStyleA() {
        if (C6384b.m19835a().mo15287a(MainTabStripStyleExperiment.class, true, "main_tab_strip_style", C6384b.m19835a().mo15295d().main_tab_strip_style, 0) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isShowStyleB() {
        if (C6384b.m19835a().mo15287a(MainTabStripStyleExperiment.class, true, "main_tab_strip_style", C6384b.m19835a().mo15295d().main_tab_strip_style, 0) == 2) {
            return true;
        }
        return false;
    }
}
