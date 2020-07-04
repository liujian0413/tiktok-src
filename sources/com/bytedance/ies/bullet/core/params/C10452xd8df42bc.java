package com.bytedance.ies.bullet.core.params;

import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$4 */
public final class C10452xd8df42bc extends Lambda implements C48006q<Builder, String, Integer, Builder> {
    public C10452xd8df42bc() {
        super(3);
    }

    public final Builder invoke(Builder builder, String str, Integer num) {
        C7573i.m23587b(builder, "builder");
        C7573i.m23587b(str, "key");
        String valueOf = String.valueOf(num.intValue());
        if (valueOf != null) {
            builder.appendQueryParameter(str, valueOf);
        }
        return builder;
    }
}
