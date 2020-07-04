package com.p280ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.p280ss.android.ugc.aweme.utils.C43122ff;

@C6381a(mo15284a = "mt_main_tab_swipe_switch")
/* renamed from: com.ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment */
public final class MainTabStripSwipeSwitchExperiment {
    public static final MainTabStripSwipeSwitchExperiment INSTANCE = new MainTabStripSwipeSwitchExperiment();
    @C6382b(mo15285a = true)
    public static final int ORIGIN = 0;
    @C6382b
    public static final int SWIPE_MODE = 1;

    private MainTabStripSwipeSwitchExperiment() {
    }

    public final boolean getEnableSwipeMode() {
        if (C6384b.m19835a().mo15287a(MainTabStripSwipeSwitchExperiment.class, true, "mt_main_tab_swipe_switch", C6384b.m19835a().mo15295d().mt_main_tab_swipe_switch, 0) != 1 || C33003b.m106651a() || C43122ff.m136767b()) {
            return false;
        }
        return true;
    }
}
