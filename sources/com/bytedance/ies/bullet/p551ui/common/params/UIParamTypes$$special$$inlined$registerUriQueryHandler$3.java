package com.bytedance.ies.bullet.p551ui.common.params;

import android.net.Uri;
import com.bytedance.ies.bullet.p551ui.common.params.TopBarType.C10696a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.ies.bullet.ui.common.params.UIParamTypes$$special$$inlined$registerUriQueryHandler$3 */
public final class UIParamTypes$$special$$inlined$registerUriQueryHandler$3 extends Lambda implements C7563m<Uri, String, TopBarType> {
    public UIParamTypes$$special$$inlined$registerUriQueryHandler$3() {
        super(2);
    }

    public final TopBarType invoke(Uri uri, String str) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(str, "key");
        String queryParameter = uri.getQueryParameter(str);
        TopBarType topBarType = null;
        if (queryParameter != null) {
            Integer d = C7634n.m23706d(queryParameter);
            if (d == null) {
                return null;
            }
            topBarType = C10696a.m31249a(d.intValue());
        }
        return topBarType;
    }
}
