package com.bytedance.ies.bullet.core.params;

import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$10 */
public final class C10443x43091497 extends Lambda implements C48006q<Builder, String, Double, Builder> {
    public C10443x43091497() {
        super(3);
    }

    public final Builder invoke(Builder builder, String str, Double d) {
        C7573i.m23587b(builder, "builder");
        C7573i.m23587b(str, "key");
        String valueOf = String.valueOf(d.doubleValue());
        if (valueOf != null) {
            builder.appendQueryParameter(str, valueOf);
        }
        return builder;
    }
}
