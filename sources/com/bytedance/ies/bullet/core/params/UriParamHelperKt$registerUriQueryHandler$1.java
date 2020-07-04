package com.bytedance.ies.bullet.core.params;

import android.net.Uri;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class UriParamHelperKt$registerUriQueryHandler$1 extends Lambda implements C7563m<Uri, String, T> {
    final /* synthetic */ C7562b $valueParser;

    public UriParamHelperKt$registerUriQueryHandler$1(C7562b bVar) {
        this.$valueParser = bVar;
        super(2);
    }

    public final T invoke(Uri uri, String str) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "key");
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return this.$valueParser.invoke(queryParameter);
        }
        return null;
    }
}
