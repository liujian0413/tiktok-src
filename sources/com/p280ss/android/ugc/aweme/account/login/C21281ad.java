package com.p280ss.android.ugc.aweme.account.login;

import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.main.p1385g.C33034t;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.login.ad */
public final class C21281ad {
    /* renamed from: a */
    public static LoginType[] m71642a() {
        List<String> a = ((C33034t) C21671bd.m72521a(C33034t.class)).mo60001a();
        LoginType[] loginTypeArr = new LoginType[a.size()];
        int i = 0;
        for (String valueOf : a) {
            int i2 = i + 1;
            loginTypeArr[i] = LoginType.valueOf(valueOf);
            i = i2;
        }
        return loginTypeArr;
    }
}
