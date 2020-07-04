package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a;

import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.f */
public final class C25210f {

    /* renamed from: a */
    public static final C25210f f66519a = new C25210f();

    private C25210f() {
    }

    /* renamed from: a */
    public static final C33471b m82901a(Uri uri) {
        String str;
        C7573i.m23587b(uri, "uri");
        CharSequence queryParameter = uri.getQueryParameter("schema_from");
        if (TextUtils.equals(queryParameter, "splash")) {
            str = "025001";
        } else if (TextUtils.equals(queryParameter, "qr_code")) {
            str = "021002";
        } else if (TextUtils.equals(queryParameter, "ad_link")) {
            str = "025003";
        } else {
            str = "";
        }
        String queryParameter2 = uri.getQueryParameter("position");
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        C33471b a = new C33472a().mo85791b("schema").mo85792c(str).mo85789a(queryParameter2).mo85794e(C22912d.f60642b).mo85790a();
        C7573i.m23582a((Object) a, "ExtraParams.Builder()\n  …\n                .build()");
        return a;
    }

    /* renamed from: a */
    public static final String m82902a(String str, String str2) {
        if (C33447f.m108191d(str)) {
            return C22912d.f60642b;
        }
        if (C33447f.m108191d(str2)) {
            return "mp_url";
        }
        return "";
    }
}
