package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.feed.C28205ai;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.fe.method.o */
public final class C27998o {
    /* renamed from: a */
    public static final boolean m91598a(Activity activity, SharePackage sharePackage, String str) {
        C7573i.m23587b(sharePackage, "sharePackage");
        if (activity == null) {
            return false;
        }
        sharePackage.f20186l.putString("url_for_im_share", str);
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            C32656f.m105742a(activity, "", "click_shareim_button");
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("share_package", sharePackage);
        C30553b.m99810g().enterChooseContact(activity, bundle, null);
        C28205ai.m92704a("chat_merge");
        return true;
    }
}
