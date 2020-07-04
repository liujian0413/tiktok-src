package com.p280ss.android.ugc.aweme.opensdk.share;

import android.content.Intent;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.opensdk.share.base.C34682a;

/* renamed from: com.ss.android.ugc.aweme.opensdk.share.c */
public final class C34683c {
    /* renamed from: a */
    public static C34682a m111980a(Intent intent) {
        String str;
        C34682a aVar;
        String stringExtra = intent.getStringExtra("_dyobject_identifier_");
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        if (stringExtra.contains("account")) {
            str = stringExtra.replace("com.bytedance.sdk.account.open.aweme.base", "com.ss.android.ugc.aweme.opensdk.share.base");
        } else {
            str = stringExtra.replace("com.bytedance.sdk.open.aweme.base", "com.ss.android.ugc.aweme.opensdk.share.base");
        }
        try {
            aVar = (C34682a) Class.forName(str).newInstance();
            try {
                aVar.unserialize(intent.getExtras());
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused2) {
            aVar = null;
        }
        return aVar;
    }
}
