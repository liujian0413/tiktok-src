package com.p280ss.android.ugc.aweme.account.login.p956b;

import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.ugc.aweme.account.log.C21253d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.l */
public class C21335l extends C12855p {
    public void onSuccess(C12710e<C12836s> eVar) {
        C21253d.m71539b();
    }

    public void onError(C12710e<C12836s> eVar, int i) {
        Integer num;
        String str;
        String str2 = null;
        if (eVar != null) {
            num = Integer.valueOf(eVar.f33702b);
        } else {
            num = null;
        }
        if (num == null) {
            str = "";
        } else {
            if (eVar == null) {
                C7573i.m23580a();
            }
            str = String.valueOf(eVar.f33702b);
        }
        if (eVar != null) {
            str2 = eVar.f33703c;
        }
        C21253d.m71537a(str, str2);
    }
}
