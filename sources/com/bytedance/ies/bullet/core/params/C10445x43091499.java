package com.bytedance.ies.bullet.core.params;

import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$12 */
public final class C10445x43091499 extends Lambda implements C48006q<Builder, String, String, Builder> {
    public C10445x43091499() {
        super(3);
    }

    public final Builder invoke(Builder builder, String str, String str2) {
        C7573i.m23587b(builder, "builder");
        C7573i.m23587b(str, "key");
        String str3 = str2;
        if (str3 != null) {
            builder.appendQueryParameter(str, str3);
        }
        return builder;
    }
}
