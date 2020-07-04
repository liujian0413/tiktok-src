package com.p280ss.android.ugc.aweme.share;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.p */
public final class C38248p {

    /* renamed from: a */
    public static final C38248p f99401a = new C38248p();

    private C38248p() {
    }

    /* renamed from: a */
    public static final boolean m122190a(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        User curUser = f.getCurUser();
        if (C6399b.m19944t()) {
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl canCreateInsights = inst.getCanCreateInsights();
            C7573i.m23582a((Object) canCreateInsights, "SharePrefCache.inst().canCreateInsights");
            Object d = canCreateInsights.mo59877d();
            C7573i.m23582a(d, "SharePrefCache.inst().canCreateInsights.cache");
            if (((Boolean) d).booleanValue() && curUser != null && curUser.getIsCreater() && C43122ff.m136763a(aweme.getAuthorUid())) {
                return true;
            }
        }
        return false;
    }
}
