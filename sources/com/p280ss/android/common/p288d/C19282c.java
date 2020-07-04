package com.p280ss.android.common.p288d;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.common.applog.AppLog;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.d.c */
public final class C19282c {

    /* renamed from: a */
    private static C19283a f52181a;

    /* renamed from: com.ss.android.common.d.c$a */
    public interface C19283a {
    }

    /* renamed from: a */
    public static void m63182a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && context != null) {
            AppLog.onEvent(context, str, str2);
            if (f52181a != null) {
                TextUtils.isEmpty(str2);
            }
        }
    }

    /* renamed from: a */
    public static void m63183a(Context context, String str, String str2, long j, long j2) {
        m63185a(context, "umeng", str, str2, j, j2, null);
    }

    /* renamed from: a */
    public static void m63184a(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        m63185a(context, "umeng", str, str2, j, j2, jSONObject);
    }

    /* renamed from: a */
    public static void m63185a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str4 = "umeng";
            } else {
                str4 = str;
            }
            if (context != null) {
                AppLog.onEvent(context, str4, str2, str3, j, j2, jSONObject);
                if ("umeng".equals(str4) && f52181a != null && "umeng".equals(str4)) {
                    TextUtils.isEmpty(str3);
                }
            }
        }
    }
}
