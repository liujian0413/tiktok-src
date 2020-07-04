package com.p280ss.android.ugc.aweme.services;

import com.bytedance.sdk.account.p645a.C12723c;
import com.bytedance.sdk.account.p660d.C12798d;
import com.p280ss.android.ugc.aweme.C21650aj;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.DataService */
public final class DataService implements C21650aj {
    public final String getSessionKey() {
        C12723c a = C12798d.m37185a();
        C7573i.m23582a((Object) a, "BDAccountDelegate.instance()");
        String a2 = a.mo31168a();
        C7573i.m23582a((Object) a2, "BDAccountDelegate.instance().sessionKey");
        return a2;
    }
}
