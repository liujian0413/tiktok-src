package com.bytedance.ies.bullet.core.params;

import android.net.Uri;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.ies.bullet.core.params.UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$7 */
public final class C10455xd8df42bf extends Lambda implements C7563m<Uri, String, Float> {
    public C10455xd8df42bf() {
        super(2);
    }

    public final Float invoke(Uri uri, String str) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "key");
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return C7634n.m23702b(queryParameter);
        }
        return null;
    }
}
