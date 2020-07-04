package com.p280ss.android.ugc.aweme.setting;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.services.C23038h;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.setting.h */
public final class C37633h {

    /* renamed from: a */
    public static final C37633h f98104a = new C37633h();

    /* renamed from: b */
    private static boolean f98105b;

    /* renamed from: c */
    private static Keva f98106c;

    /* renamed from: d */
    private static JSONObject f98107d;

    private C37633h() {
    }

    /* renamed from: a */
    public static boolean m120442a() {
        return f98105b;
    }

    static {
        Keva repoFromSp = Keva.getRepoFromSp(AwemeApplication.m21341a(), "test_sp", 0);
        f98106c = repoFromSp;
        if (repoFromSp != null) {
            Keva keva = f98106c;
            if (keva == null) {
                C7573i.m23580a();
            }
            f98105b = keva.getBoolean("key_enable_boe", m120443a((Context) AwemeApplication.m21341a()));
        }
    }

    /* renamed from: a */
    public static void m120441a(boolean z) {
        Keva keva = f98106c;
        if (keva != null) {
            keva.storeBoolean("key_enable_boe", z);
        }
    }

    /* renamed from: a */
    private static boolean m120443a(Context context) {
        if (context == null || f98107d != null) {
            return false;
        }
        String a = C23038h.m75715a(context.getApplicationContext(), "ttnet_config.json");
        if (!TextUtils.isEmpty(a)) {
            try {
                JSONObject jSONObject = new JSONObject(a);
                f98107d = jSONObject;
                return jSONObject.optBoolean("boe_proxy_enabled", false);
            } catch (JSONException unused) {
            }
        }
        return false;
    }
}
