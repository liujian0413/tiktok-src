package com.p280ss.android.ugc.aweme.web;

import android.text.TextUtils;
import com.bytedance.ies.geckoclient.C10887i;
import com.bytedance.ies.geckoclient.model.C10903d;
import com.bytedance.ies.geckoclient.model.C10909j;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24736b;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25917d;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.d */
public final class C43441d implements C10887i {
    /* renamed from: a */
    public final void mo26236a(C10903d dVar, boolean z) {
        C24736b.f65176b.mo64730a(dVar, z);
    }

    /* renamed from: a */
    private static JSONObject m137863a(int i, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        if (i != -1) {
            try {
                jSONObject.put("gecko_id", String.valueOf(i));
            } catch (JSONException unused) {
            }
        }
        if (exc != null) {
            jSONObject.put("errorDesc", exc.toString());
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final void mo26239b(int i, C10903d dVar) {
        C6877n.m21444a("aweme_service_gecko_activate_rate", 0, m137863a(i, (Exception) null));
        if (TextUtils.equals(dVar.f29508c, "rn_base_android")) {
            C25917d.m85216b();
        }
    }

    /* renamed from: a */
    public final void mo26234a(int i, C10903d dVar) {
        C6877n.m21444a("aweme_service_gecko_download_rate", 0, m137863a(i, (Exception) null));
        C24736b.f65176b.mo64728a(i, dVar);
    }

    /* renamed from: a */
    public final void mo26237a(List<C10903d> list, Exception exc) {
        C6877n.m21444a("aweme_service_gecko_check_update_rate", 1, m137863a(-1, exc));
        C24736b.f65176b.mo64732a(list, false);
    }

    /* renamed from: a */
    public final void mo26238a(List<C10903d> list, List<C10909j> list2) {
        C6877n.m21444a("aweme_service_gecko_check_update_rate", 0, m137863a(-1, (Exception) null));
        C24736b.f65176b.mo64732a(list, true);
    }

    /* renamed from: a */
    public final void mo26235a(int i, C10903d dVar, Exception exc) {
        C6877n.m21444a("aweme_service_gecko_download_rate", 1, m137863a(i, exc));
        C24736b.f65176b.mo64729a(i, dVar, exc);
    }

    /* renamed from: b */
    public final void mo26240b(int i, C10903d dVar, Exception exc) {
        C6877n.m21444a("aweme_service_gecko_activate_rate", 1, m137863a(i, exc));
    }
}
