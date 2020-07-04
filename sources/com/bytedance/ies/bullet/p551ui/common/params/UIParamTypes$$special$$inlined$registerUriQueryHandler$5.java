package com.bytedance.ies.bullet.p551ui.common.params;

import android.net.Uri;
import com.bytedance.ies.bullet.p551ui.common.params.NavBtnType.C10695a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.ies.bullet.ui.common.params.UIParamTypes$$special$$inlined$registerUriQueryHandler$5 */
public final class UIParamTypes$$special$$inlined$registerUriQueryHandler$5 extends Lambda implements C7563m<Uri, String, NavBtnType> {
    public UIParamTypes$$special$$inlined$registerUriQueryHandler$5() {
        super(2);
    }

    public final NavBtnType invoke(Uri uri, String str) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "key");
        String queryParameter = uri.getQueryParameter(str);
        NavBtnType navBtnType = null;
        if (queryParameter != null) {
            Integer d = C7634n.m23706d(queryParameter);
            if (d == null) {
                return null;
            }
            navBtnType = C10695a.m31248a(d.intValue());
        }
        return navBtnType;
    }
}
