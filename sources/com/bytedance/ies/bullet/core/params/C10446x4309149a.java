package com.bytedance.ies.bullet.core.params;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.ies.bullet.core.params.UriParamHelperKt$registerUriHandlers$$inlined$registerUriQueryHandler$13 */
public final class C10446x4309149a extends Lambda implements C7563m<Uri, String, List<? extends String>> {
    public C10446x4309149a() {
        super(2);
    }

    public final List<? extends String> invoke(Uri uri, String str) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "key");
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null) {
            return null;
        }
        return C7634n.m23768b((CharSequence) queryParameter, new String[]{","}, false, 0);
    }
}
