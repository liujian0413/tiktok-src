package com.p280ss.android.ugc.aweme.profile;

import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.f */
public final class C35779f {

    /* renamed from: a */
    public static final C35779f f93786a = new C35779f();

    private C35779f() {
    }

    /* renamed from: a */
    public static String m115540a(String str) {
        C7573i.m23587b(str, "key");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        sb.append(f.getCurUserId());
        return sb.toString();
    }
}
