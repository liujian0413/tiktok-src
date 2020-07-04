package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.IAccountService.C21080d;
import com.p280ss.android.ugc.aweme.IAccountService.C21083g;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.bean.C21150e;
import com.p280ss.android.ugc.aweme.profile.util.C36727al;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.s */
public final class C43523s implements C11093e {

    /* renamed from: a */
    private final C11087a f112685a;

    /* renamed from: b */
    private final Activity f112686b;

    /* renamed from: a */
    private void m137998a(C11087a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
        } catch (JSONException unused) {
        }
        m137999a(aVar, "loginCanceled", jSONObject);
    }

    /* renamed from: a */
    private static C21150e m137997a(String str) {
        for (C21150e eVar : C6861a.m21333b().getAllSupportedLoginPlatform()) {
            if (TextUtils.equals(str, eVar.f56819c)) {
                return eVar;
            }
        }
        return null;
    }

    public C43523s(C11087a aVar, Activity activity) {
        this.f112685a = aVar;
        this.f112686b = activity;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        iVar.f30173f = false;
        if (!C21115b.m71197a().isLogin()) {
            String optString = iVar.f30171d.optString("platform", "");
            if (!TextUtils.isEmpty(optString)) {
                C21150e a = m137997a(optString);
                if (a != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("setting_page", "feedback_faq_list_page");
                    C6861a.m21333b().loginByPlatform(new C21080d().mo56860a(this.f112686b).mo56864a("h5").mo56861a(bundle).mo56863a((C21083g) new C43524t(this, iVar)).mo56859a(), a);
                    return;
                }
            }
            C6861a.m21333b().showLoginAndRegisterView(new C21080d().mo56860a(this.f112686b).mo56864a("h5").mo56863a((C21083g) new C43525u(this, iVar)).mo56859a());
            return;
        }
        C36727al.m118403a(jSONObject);
    }

    /* renamed from: a */
    private static void m137999a(C11087a aVar, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException unused) {
        }
        if (aVar != null) {
            aVar.mo27034b("H5_nativeEvent", jSONObject2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo105430b(C11097i iVar, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    C36727al.m118403a(jSONObject);
                } catch (JSONException unused) {
                }
                this.f112685a.mo27030a(iVar.f30169b, jSONObject);
                return;
            }
            m137998a(this.f112685a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo105429a(C11097i iVar, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    C36727al.m118403a(jSONObject);
                } catch (JSONException unused) {
                }
                this.f112685a.mo27030a(iVar.f30169b, jSONObject);
                return;
            }
            m137998a(this.f112685a);
        }
    }
}
