package com.p280ss.android.ugc.aweme.profile.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import kotlin.jvm.internal.C7573i;

@C6381a(mo15284a = "profile_recommend_user_when_empty")
/* renamed from: com.ss.android.ugc.aweme.profile.experiment.ProfileRecommendUserWhenEmpty */
public final class ProfileRecommendUserWhenEmpty {
    @C6382b(mo15285a = true)
    private static final boolean DISABLE = false;
    @C6382b
    private static final boolean ENABLED = true;
    public static final ProfileRecommendUserWhenEmpty INSTANCE = new ProfileRecommendUserWhenEmpty();

    private ProfileRecommendUserWhenEmpty() {
    }

    public static final boolean isRecommendUserMode(User user) {
        return isRecommendUserMode$default(user, false, 2, null);
    }

    public static final boolean isEnabled() {
        if (!C6399b.m19945u() || !C6384b.m19835a().mo15292a(ProfileRecommendUserWhenEmpty.class, true, "profile_recommend_user_when_empty", C6384b.m19835a().mo15295d().profile_recommend_user_when_empty, false)) {
            return false;
        }
        return true;
    }

    public static final boolean isRecommendUserMode(User user, boolean z) {
        if (isEnabled() && user != null) {
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (f.isLogin()) {
                String uid = user.getUid();
                IAccountUserService f2 = C6861a.m21337f();
                C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                if (!(!C7573i.m23585a((Object) uid, (Object) f2.getCurUserId())) || user.getVerificationType() == 2 || user.getVerificationType() == 3 || C43122ff.m136783n(user) || (!C43122ff.m136769b(user, false) && ((z || user.getAwemeCount() != 0) && !user.isBlock && !user.isBlocked()))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean isRecommendUserMode$default(User user, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return isRecommendUserMode(user, z);
    }
}
