package com.p280ss.android.ugc.aweme.profile.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import kotlin.jvm.internal.C7573i;

@C6381a(mo15284a = "complete_profile_name_and_avatar_strategy")
/* renamed from: com.ss.android.ugc.aweme.profile.experiment.ProfileGuideTimeInterval */
public final class ProfileGuideTimeInterval {
    @C6382b
    private static final int FOURTEEN = 14;
    public static final ProfileGuideTimeInterval INSTANCE = new ProfileGuideTimeInterval();
    public static final int MAXIMUM_TIME = 5;
    @C6382b(mo15285a = true)
    private static final int NONE = 0;
    @C6382b
    private static final int SEVEN = 7;
    @C6382b
    private static final int THREE = 3;

    private ProfileGuideTimeInterval() {
    }

    public static final int getDays() {
        return C6384b.m19835a().mo15287a(ProfileGuideTimeInterval.class, true, "complete_profile_name_and_avatar_strategy", C6384b.m19835a().mo15295d().complete_profile_name_and_avatar_strategy, 0);
    }

    public static final boolean isEnabled() {
        if (TimeLockRuler.isTeenModeON()) {
            return false;
        }
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (f.isLogin() && C6384b.m19835a().mo15287a(ProfileGuideTimeInterval.class, true, "complete_profile_name_and_avatar_strategy", C6384b.m19835a().mo15295d().complete_profile_name_and_avatar_strategy, 0) != 0) {
            return true;
        }
        return false;
    }
}
