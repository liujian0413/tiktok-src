package com.bytedance.ies.bullet.core.params;

import android.net.Uri;
import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;

/* renamed from: com.bytedance.ies.bullet.core.params.UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$16 */
public final class C10449x4309149d extends Lambda implements C48006q<Builder, String, Uri, Builder> {
    public C10449x4309149d() {
        super(3);
    }

    public final Builder invoke(Builder builder, String str, Uri uri) {
        C7573i.m23587b(builder, "builder");
        C7573i.m23587b(str, "key");
        String valueOf = String.valueOf(uri);
        if (valueOf != null) {
            builder.appendQueryParameter(str, valueOf);
        }
        return builder;
    }
}
