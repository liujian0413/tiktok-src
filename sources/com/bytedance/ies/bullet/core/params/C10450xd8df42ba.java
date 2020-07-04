package com.bytedance.ies.bullet.core.params;

import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$2 */
public final class C10450xd8df42ba extends Lambda implements C48006q<Builder, String, Boolean, Builder> {
    public C10450xd8df42ba() {
        super(3);
    }

    public final Builder invoke(Builder builder, String str, Boolean bool) {
        String str2;
        C7573i.m23587b(builder, "builder");
        C7573i.m23587b(str, "key");
        if (bool.booleanValue()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        builder.appendQueryParameter(str, str2);
        return builder;
    }
}
