package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a;

import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25210f;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.d */
public final class C25186d extends C25183a {
    /* renamed from: e */
    private static IMiniAppService m82856e() {
        C7167b b = C7167b.m22380b();
        C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
        return b.mo18647a();
    }

    /* renamed from: g */
    private final C33471b m82858g() {
        C33471b bVar = mo65816d().f66433d.f66458b;
        if (bVar != null) {
            return bVar;
        }
        Uri parse = Uri.parse(m82857f());
        C7573i.m23582a((Object) parse, "Uri.parse(url)");
        return C25210f.m82901a(parse);
    }

    /* renamed from: a */
    public final boolean mo65817a() {
        if (TextUtils.isEmpty(m82857f())) {
            return false;
        }
        return C33447f.m108191d(m82857f());
    }

    /* renamed from: b */
    public final boolean mo65818b() {
        IMiniAppService e = m82856e();
        if (e == null || !e.openMiniApp(mo65815c(), m82857f(), m82858g())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private final String m82857f() {
        if (!TextUtils.isEmpty(mo65816d().f66433d.f66457a)) {
            return mo65816d().f66433d.f66457a;
        }
        return mo65816d().f66432c.f66459a;
    }
}
