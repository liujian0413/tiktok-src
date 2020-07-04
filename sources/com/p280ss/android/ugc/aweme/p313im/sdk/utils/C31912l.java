package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.l */
public final class C31912l {
    /* renamed from: a */
    public static boolean m103665a(SharePackage sharePackage) {
        if (sharePackage == null) {
            return false;
        }
        return TextUtils.equals(sharePackage.f20186l.getString("IS_FRIEND_PRIVATE"), "true");
    }
}
