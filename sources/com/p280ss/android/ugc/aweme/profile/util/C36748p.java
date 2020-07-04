package com.p280ss.android.ugc.aweme.profile.util;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.util.p */
public final class C36748p {

    /* renamed from: a */
    public static final C36748p f96461a = new C36748p();

    private C36748p() {
    }

    /* renamed from: a */
    public static final boolean m118458a(Context context, User user, FollowStatus followStatus) {
        boolean z;
        C7573i.m23587b(user, "user");
        C7573i.m23587b(followStatus, "followStatus");
        if (!C6399b.m19944t() && !C43122ff.m136783n(user) && !followStatus.getIsEnterprise()) {
            if (context == null || C0683b.m2909b(context, "android.permission.READ_CONTACTS") == -1) {
                z = false;
            } else {
                z = true;
            }
            if (!z || followStatus.followStatus == 0 || followStatus.followStatus == 4 || followStatus.contactName == null) {
                return false;
            }
            return true;
        }
        return false;
    }
}
