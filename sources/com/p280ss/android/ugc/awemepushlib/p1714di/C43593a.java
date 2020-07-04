package com.p280ss.android.ugc.awemepushlib.p1714di;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.message.C19836e;
import com.p280ss.android.pushmanager.C20072e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.awemepushlib.interaction.C43600b;
import com.p280ss.android.ugc.awemepushlib.manager.MessageShowHandler;
import com.p280ss.android.ugc.awemepushlib.p1712a.C43589b;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43592c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.di.a */
public final class C43593a implements C20072e {
    /* renamed from: e */
    public final C19836e mo53714e() {
        return C43589b.m138115b();
    }

    /* renamed from: b */
    public final Pair<String, String> mo53711b() {
        return new Pair<>("2882303761517509924", "5571750917924");
    }

    /* renamed from: c */
    public final Pair<String, String> mo53712c() {
        return new Pair<>("110437", "c5c279eeedb44a3dad07655240d72ded");
    }

    /* renamed from: d */
    public final Pair<String, String> mo53713d() {
        return new Pair<>("Cufg9mt6OIKNDk5DqYVEk7XX", "uJPS25PQ1uMkIe1b6aCVStzm");
    }

    /* renamed from: a */
    public final String mo53706a() {
        return ((IAccountUserService) ServiceManager.get().getService(IAccountUserService.class)).getSessionKey();
    }

    /* renamed from: a */
    public final void mo53710a(String str, JSONObject jSONObject) {
        C6907h.m21525a(str, jSONObject);
    }

    /* renamed from: a */
    public final String mo53707a(Context context, String str) {
        return C43600b.m138163a().filterUrl(context, str);
    }

    /* renamed from: a */
    private static void m138141a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C6379c.m19826a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo53708a(Context context, int i, String str, int i2, String str2) {
        MessageShowHandler.m138243a(context, str, i2, str2);
    }

    /* renamed from: a */
    public final void mo53709a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        Context context2 = context;
        String str5 = str2;
        long j3 = j;
        C6906g.m21514a(context, str, str2, str3, j, j2, jSONObject);
        if (!C30538p.m99745a()) {
            m138141a("log_red_badge", "show", C43592c.m138136a().mo105524a("count", String.valueOf(j)).mo105525b());
            if (TextUtils.equals(str2, "red_badge") && j3 > 0) {
                C6907h.onEvent(MobClick.obtain().setEventName("red_badge").setLabelName("show").setValue(String.valueOf(j)));
                C6887b.m21436b().mo16899a(context, "red_point_count", j3);
            }
        }
        try {
            if (TextUtils.equals(str2, "red_badge")) {
                String str6 = str3;
                String str7 = str;
                C43592c a = C43592c.m138136a().mo105524a("label", str3).mo105524a("category", str).mo105523a("value", Long.valueOf(j)).mo105523a("ext_value", Long.valueOf(j2));
                String str8 = "ext_json";
                if (jSONObject == null) {
                    str4 = "";
                } else {
                    str4 = jSONObject.toString();
                }
                C6893q.m21447a(str2, a.mo105524a(str8, str4).mo105525b());
            }
        } catch (Exception unused) {
        }
        if (TextUtils.equals(str2, "red_badge") && j3 > 0 && C30538p.m99745a()) {
            C6887b.m21436b().mo16899a(context, "red_point_count", j3);
        }
    }
}
