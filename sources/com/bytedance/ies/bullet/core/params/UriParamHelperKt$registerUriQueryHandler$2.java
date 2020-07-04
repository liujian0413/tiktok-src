package com.bytedance.ies.bullet.core.params;

import android.net.Uri.Builder;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;

public final class UriParamHelperKt$registerUriQueryHandler$2 extends Lambda implements C48006q<Builder, String, T, Builder> {
    final /* synthetic */ C7562b $valueBuilder;

    public UriParamHelperKt$registerUriQueryHandler$2(C7562b bVar) {
        this.$valueBuilder = bVar;
        super(3);
    }

    public final Builder invoke(Builder builder, String str, T t) {
        C7573i.m23587b(builder, "builder");
        C7573i.m23587b(str, "key");
        String str2 = (String) this.$valueBuilder.invoke(t);
        if (str2 != null) {
            builder.appendQueryParameter(str, str2);
        }
        return builder;
    }
}
