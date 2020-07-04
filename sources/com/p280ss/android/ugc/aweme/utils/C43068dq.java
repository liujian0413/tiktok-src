package com.p280ss.android.ugc.aweme.utils;

import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.dq */
public final class C43068dq {
    /* renamed from: a */
    public static void m136627a() {
        C1592h.m7855a(C43069dr.f111672a, (Executor) C7258h.m22732e());
    }

    /* renamed from: b */
    static final /* synthetic */ Object m136628b() throws Exception {
        int h = (int) C6399b.m19932h();
        String q = C6399b.m19941q();
        String j = C6399b.m19934j();
        C22903bl ag = C23060u.m75742a().mo60063ag();
        C22903bl ah = C23060u.m75742a().mo60064ah();
        C22903bl al = C23060u.m75742a().mo60068al();
        int intValue = ((Integer) ag.mo59877d()).intValue();
        if (C6399b.m19944t() && ((Integer) SharePrefCache.inst().getIsNewInstall().mo59877d()).intValue() == -1) {
            if (intValue == 0) {
                SharePrefCache.inst().getIsNewInstall().mo59871a(Integer.valueOf(1));
            } else {
                SharePrefCache.inst().getIsNewInstall().mo59871a(Integer.valueOf(0));
            }
        }
        if (C6399b.m19944t() && ((Integer) SharePrefCache.inst().getIsNewInstall().mo59877d()).intValue() == -1) {
            if (intValue == 0) {
                SharePrefCache.inst().getIsNewInstall().mo59871a(Integer.valueOf(1));
            } else {
                SharePrefCache.inst().getIsNewInstall().mo59871a(Integer.valueOf(0));
            }
        }
        if (intValue == 0) {
            ag.mo59871a(Integer.valueOf(h));
            ah.mo59871a(j);
            al.mo59871a(q);
        } else if (h > intValue) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("last_app_version", ah.mo59877d());
                jSONObject.put("last_channel_name", al.mo59877d());
            } catch (JSONException unused) {
            }
            C6907h.onEvent(new MobClick().setEventName("update_from").setLabelName("lite_update").setJsonObject(jSONObject));
            ag.mo59871a(Integer.valueOf(h));
            ah.mo59871a(j);
            al.mo59871a(q);
        }
        return null;
    }
}
