package com.p280ss.android.ugc.aweme.p1685ug.poloris;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.polaris.depend.C12428i;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.legoImp.task.PolarisInitTask;
import com.p280ss.android.ugc.aweme.p1685ug.poloris.PolarisDependImpl.C42712a;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.ug.poloris.c */
public final class C42722c {

    /* renamed from: a */
    public static final C42722c f111020a = new C42722c();

    private C42722c() {
    }

    /* renamed from: a */
    public static final boolean m135621a(String str) {
        PolarisInitTask.ensuareInit();
        if (!PolarisInitTask.isPolarisInit()) {
            return false;
        }
        boolean a = C12428i.m36150a(str);
        if (!a) {
            if (str == null) {
                return false;
            }
            Uri parse = Uri.parse(str);
            C7573i.m23582a((Object) parse, "uri");
            if (TextUtils.equals(parse.getHost(), C22912d.f60641a)) {
                parse = Uri.parse(parse.getQueryParameter("url"));
            }
            C7573i.m23582a((Object) parse, "uri");
            if (parse.getScheme() != null) {
                String scheme = parse.getScheme();
                C7573i.m23582a((Object) scheme, "uri.scheme");
                if (C7634n.m23721b(scheme, WebKitApi.SCHEME_HTTP, false) && TextUtils.equals(parse.getQueryParameter("luckycat"), "1")) {
                    a = true;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static final boolean m135620a(Context context, String str, String str2) {
        boolean z;
        C7573i.m23587b(context, "ctx");
        C7573i.m23587b(str2, "from");
        boolean a = m135621a(str);
        if (a) {
            Uri parse = Uri.parse(str);
            C7573i.m23582a((Object) parse, "uri");
            if (TextUtils.equals(parse.getHost(), C22912d.f60641a)) {
                str = parse.getQueryParameter("url");
            }
            C42712a.m135605a().mo104322f();
            String str3 = "polaris_activity_crash";
            C6869c a2 = C6869c.m21381a().mo16887a("from", str2);
            String str4 = "businessNull";
            if (C12428i.m36155e() == null) {
                z = true;
            } else {
                z = false;
            }
            C6877n.m21447a(str3, a2.mo16882a(str4, Boolean.valueOf(z)).mo16888b());
            C12428i.m36143a(context, str, true);
        }
        return a;
    }
}
