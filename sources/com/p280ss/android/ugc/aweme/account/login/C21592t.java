package com.p280ss.android.ugc.aweme.account.login;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.t */
public class C21592t {

    /* renamed from: a */
    public static String f57969a = null;

    /* renamed from: b */
    public static String f57970b = null;

    /* renamed from: c */
    public static String f57971c = null;

    /* renamed from: d */
    private static final String f57972d = "t";

    /* renamed from: a */
    public static void m72350a(String str) {
        m72351a(str, "", null, 0, null);
    }

    /* renamed from: a */
    public static void m72351a(String str, String str2, String str3, int i, Map<String, String> map) {
        String str4;
        f57969a = str;
        f57970b = str2;
        if (i == 1) {
            str4 = str3;
        } else {
            str4 = "";
        }
        f57971c = str4;
        if (TextUtils.equals("qzone_sns", str3)) {
            f57971c = "qq";
        }
        C6907h.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName(str));
        C21102b a = new C21102b().mo56946a("enter_method", str).mo56946a("enter_from", str2).mo56944a("_perf_monitor", 1);
        String str5 = "platform";
        if (i != 1) {
            str3 = "";
        }
        C21102b a2 = a.mo56946a(str5, str3).mo56944a("login_last_time", i);
        if (map != null) {
            for (String str6 : map.keySet()) {
                if (!TextUtils.isEmpty(str6)) {
                    a2.mo56946a(str6, (String) map.get(str6));
                }
            }
        }
        C6907h.m21524a("login_notify", (Map) a2.f56672a);
    }
}
