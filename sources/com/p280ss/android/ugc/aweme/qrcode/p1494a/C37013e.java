package com.p280ss.android.ugc.aweme.qrcode.p1494a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37004a.C37005a;
import com.p280ss.android.ugc.aweme.router.C37286v;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.e */
public final class C37013e extends C37004a {
    public C37013e(C37005a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo59069a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Activity g = C6405d.m19984g();
        if (g == null) {
            return false;
        }
        IMiniAppService a = C7167b.m22380b().mo18647a();
        C33471b a2 = new C33472a().mo85791b("scan").mo85792c("021002").mo85790a();
        if (!C33447f.m108191d(str)) {
            return false;
        }
        a.openMiniApp((Context) g, str, a2);
        C6907h.m21524a("enter_microapp", (Map) C22984d.m75611a().mo59973a("enter_from", "scan").mo59973a("enter_method", "scan_cam").mo59973a("microapp_id", C37286v.m119759b(str, "app_id")).f60753a);
        return true;
    }
}
