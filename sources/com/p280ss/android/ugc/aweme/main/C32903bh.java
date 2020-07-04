package com.p280ss.android.ugc.aweme.main;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.main.experiment.LandingFollowTabCategoryExperiment;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.main.bh */
public final class C32903bh {

    /* renamed from: a */
    private static Boolean f85842a;

    /* renamed from: a */
    public static boolean m106495a() {
        int i;
        if (f85842a != null) {
            return f85842a.booleanValue();
        }
        boolean z = false;
        if (!C32904bi.m106500e()) {
            Boolean valueOf = Boolean.valueOf(false);
            f85842a = valueOf;
            return valueOf.booleanValue();
        }
        int a = C6384b.m19835a().mo15287a(LandingFollowTabCategoryExperiment.class, true, "landing_follow_tab_category", C6384b.m19835a().mo15295d().landing_follow_tab_category, 0);
        if (a != 0) {
            if (a == 1) {
                f85842a = Boolean.valueOf(C6887b.m21436b().mo16908b(C6399b.m19921a(), "is_next_cold_start_landing_follow_in_main_tab"));
            } else if (a == 2) {
                f85842a = Boolean.valueOf(false);
                Integer minFollowNumForLandingFollowTab = C30199h.m98861a().getMinFollowNumForLandingFollowTab();
                if (minFollowNumForLandingFollowTab == null) {
                    i = 100;
                } else {
                    i = minFollowNumForLandingFollowTab.intValue();
                }
                IAccountUserService userService = C6861a.m21332a().userService();
                if (userService != null) {
                    User curUser = userService.getCurUser();
                    if (curUser != null) {
                        if (curUser.getFollowingCount() > i) {
                            z = true;
                        }
                        f85842a = Boolean.valueOf(z);
                    }
                }
            }
            StringBuilder sb = new StringBuilder("shouldLandingFollowInMainTab->type:");
            sb.append(a);
            sb.append(",go:");
            sb.append(f85842a);
            C6921a.m21552a(4, "LandingFollowInMainTab", sb.toString());
            return f85842a.booleanValue();
        }
        f85842a = Boolean.valueOf(false);
        StringBuilder sb2 = new StringBuilder("shouldLandingFollowInMainTab->type:");
        sb2.append(a);
        sb2.append(",go:");
        sb2.append(f85842a);
        C6921a.m21552a(4, "LandingFollowInMainTab", sb2.toString());
        return f85842a.booleanValue();
    }
}
