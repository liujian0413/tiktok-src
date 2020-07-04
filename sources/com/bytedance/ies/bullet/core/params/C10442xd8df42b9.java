package com.bytedance.ies.bullet.core.params;

import android.net.Uri;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.params.UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$1 */
public final class C10442xd8df42b9 extends Lambda implements C7563m<Uri, String, Boolean> {
    public C10442xd8df42b9() {
        super(2);
    }

    public final Boolean invoke(Uri uri, String str) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "key");
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return Boolean.valueOf(C7573i.m23585a((Object) queryParameter, (Object) "1"));
        }
        return null;
    }
}
