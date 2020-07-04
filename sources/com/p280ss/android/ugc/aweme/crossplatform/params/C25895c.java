package com.p280ss.android.ugc.aweme.crossplatform.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.params.c */
public final class C25895c {
    /* renamed from: a */
    public static final void m85169a(C25884b bVar, Bundle bundle) {
        int i;
        C7573i.m23587b(bVar, "$this$putAdParams");
        C7573i.m23587b(bundle, "bundle");
        if (bVar.f68446a > 0) {
            bundle.putString("cid", String.valueOf(bVar.f68446a));
            bundle.putInt("ad_type", bVar.f68448c);
            String str = "log_extra";
            String str2 = bVar.f68454i;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            String str3 = "download_url";
            String str4 = bVar.f68450e;
            if (str4 == null) {
                str4 = "";
            }
            bundle.putString(str3, str4);
            String str5 = "code";
            if (bVar.f68446a == 0) {
                i = 0;
            } else {
                i = 1;
            }
            bundle.putInt(str5, i);
        }
    }
}
