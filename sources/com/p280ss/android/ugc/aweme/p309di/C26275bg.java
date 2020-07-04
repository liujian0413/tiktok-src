package com.p280ss.android.ugc.aweme.p309di;

import android.app.Application;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.common.C25698k;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.DefaultIMService;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.p302a.C6843a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.di.bg */
public final class C26275bg {
    /* renamed from: a */
    private static void m86367a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("use_broker", z);
        } catch (JSONException unused) {
        }
        C6877n.m21447a("broker_i18n", jSONObject);
    }

    /* renamed from: a */
    public static IIMService m86366a(AwemeApplication awemeApplication) {
        IIMService iIMService = (IIMService) C6843a.m21276a(IIMService.class, null).mo16703a().mo16706c();
        if (iIMService == null) {
            iIMService = (IIMService) C25698k.m84445a("com.ss.android.ugc.aweme.im.sdk.providedservices.IMService", DefaultIMService.class);
            m86367a(false);
        } else {
            m86367a(true);
        }
        C30553b.m99782a((Application) awemeApplication, iIMService);
        return iIMService;
    }
}
