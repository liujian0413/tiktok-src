package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.au */
public final class C25250au {
    /* renamed from: a */
    public static boolean m82996a(User user) {
        if (!C43122ff.m136783n(user) || C6399b.m19944t() || user.getTabSetting() == null || user.getTabSetting().getEnterpriseTab() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m82995a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null || !TextUtils.equals(aweme.getAuthorUid(), C21115b.m71197a().getCurUserId())) {
            return false;
        }
        if (C21115b.m71197a().getCurUser().getCommerceUserLevel() == 0 && aweme.getAuthor() != null && aweme.getAuthor().getCommerceUserLevel() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m82998b(User user) {
        if (!m82996a(user)) {
            return C23481i.m77089a().getString(R.string.b1h);
        }
        String title = user.getTabSetting().getEnterpriseTab().getTitle();
        if (title != null) {
            return title;
        }
        return "";
    }

    /* renamed from: c */
    public static String m82999c(User user) {
        if (m82996a(user)) {
            return user.getTabSetting().getEnterpriseTab().getTabLink();
        }
        return (String) SharePrefCache.inst().getMpTab().mo59877d();
    }

    /* renamed from: d */
    public static boolean m83000d(User user) {
        if (!C43122ff.m136783n(user) || C6399b.m19944t() || user.getTabSetting() == null || user.getTabSetting().getEnterpriseTab() == null || user.getTabSetting().getEnterpriseTab().getTabType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m82997a(boolean z, boolean z2, User user) {
        if (!((Boolean) C23060u.m75742a().mo60042L().mo59877d()).booleanValue() || !C43122ff.m136787r(user)) {
            return z2;
        }
        return z;
    }
}
