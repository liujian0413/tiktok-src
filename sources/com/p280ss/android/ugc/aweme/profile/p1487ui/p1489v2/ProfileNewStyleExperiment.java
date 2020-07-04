package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36727al;

@C6381a(mo15284a = "mt_merge_profile_v2")
/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.ProfileNewStyleExperiment */
public final class ProfileNewStyleExperiment {
    private static final boolean COMMOM_M;
    private static final boolean COMMON_T;
    private static final boolean ENABLE_NEW_STYLE;
    public static final ProfileNewStyleExperiment INSTANCE;
    @C6382b
    public static final int M_NEW = 1;
    @C6382b(mo15285a = true)
    public static final int ORIGIN = 0;
    @C6382b
    public static final int T_NEW = 2;
    private static final boolean USE_M_NEW;
    private static final boolean USE_T_NEW;

    private ProfileNewStyleExperiment() {
    }

    public final boolean getCOMMOM_M() {
        return COMMOM_M;
    }

    public final boolean getCOMMON_T() {
        return COMMON_T;
    }

    public final boolean getENABLE_NEW_STYLE() {
        return ENABLE_NEW_STYLE;
    }

    public final boolean getUSE_M_NEW() {
        return USE_M_NEW;
    }

    public final boolean getUSE_T_NEW() {
        return USE_T_NEW;
    }

    private final int value() {
        ServiceManager serviceManager = ServiceManager.get();
        if (serviceManager != null) {
            IUserService iUserService = (IUserService) serviceManager.getService(IUserService.class);
            if (iUserService != null) {
                User currentUser = iUserService.getCurrentUser();
                if (currentUser != null && C36727al.m136783n(currentUser)) {
                    return 0;
                }
            }
        }
        return C6384b.m19835a().mo15287a(ProfileNewStyleExperiment.class, true, "mt_merge_profile_v2", C6384b.m19835a().mo15295d().mt_merge_profile_v2, 0);
    }

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ProfileNewStyleExperiment profileNewStyleExperiment = new ProfileNewStyleExperiment();
        INSTANCE = profileNewStyleExperiment;
        boolean z5 = false;
        if (profileNewStyleExperiment.value() != 0) {
            z = true;
        } else {
            z = false;
        }
        ENABLE_NEW_STYLE = z;
        if (profileNewStyleExperiment.value() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        USE_M_NEW = z2;
        if (profileNewStyleExperiment.value() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        USE_T_NEW = z3;
        if (profileNewStyleExperiment.value() == 1 || (profileNewStyleExperiment.value() == 0 && C6399b.m19946v())) {
            z4 = true;
        } else {
            z4 = false;
        }
        COMMOM_M = z4;
        if (profileNewStyleExperiment.value() == 2 || (profileNewStyleExperiment.value() == 0 && C6399b.m19947w())) {
            z5 = true;
        }
        COMMON_T = z5;
    }
}
