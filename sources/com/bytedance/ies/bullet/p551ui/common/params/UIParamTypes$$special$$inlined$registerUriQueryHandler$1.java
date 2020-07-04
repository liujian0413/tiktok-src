package com.bytedance.ies.bullet.p551ui.common.params;

import android.graphics.Color;
import android.net.Uri;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.ies.bullet.ui.common.params.UIParamTypes$$special$$inlined$registerUriQueryHandler$1 */
public final class UIParamTypes$$special$$inlined$registerUriQueryHandler$1 extends Lambda implements C7563m<Uri, String, C10699c> {
    public UIParamTypes$$special$$inlined$registerUriQueryHandler$1() {
        super(2);
    }

    public final C10699c invoke(Uri uri, String str) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "key");
        String queryParameter = uri.getQueryParameter(str);
        C10699c cVar = null;
        if (queryParameter != null) {
            if (C7634n.m23776c((CharSequence) queryParameter, (CharSequence) "#", false)) {
                return new C10699c(Color.parseColor(queryParameter));
            }
            StringBuilder sb = new StringBuilder("#");
            sb.append(queryParameter);
            cVar = new C10699c(Color.parseColor(sb.toString()));
        }
        return cVar;
    }
}
