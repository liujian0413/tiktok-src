package com.p280ss.android.ugc.aweme.common;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.common.h */
public class C6907h {

    /* renamed from: a */
    private static ExecutorService f19579a;

    /* renamed from: a */
    public static void m21523a(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        C6908i.m21529a(str, str2, str3, str4, j, jSONObject);
    }

    /* renamed from: a */
    public static void m21524a(String str, Map map) {
        C6908i.m21530a(str, map);
    }

    /* renamed from: a */
    public static ExecutorService m21516a() {
        if (f19579a == null) {
            synchronized (C6907h.class) {
                if (f19579a == null) {
                    f19579a = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18994a("EventUpload").mo18996a());
                }
            }
        }
        return f19579a;
    }

    public static void onEventV3(String str) {
        try {
            C6759a.m20910a(str, new JSONObject());
        } catch (Exception unused) {
        }
    }

    public static void onEvent(MobClick mobClick) {
        if (!TextUtils.isEmpty(mobClick.getExtValueStr())) {
            m21523a(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), Long.parseLong(mobClick.getExtValueStr()), mobClick.getExtJson());
        } else {
            m21523a(mobClick.getCategory(), mobClick.getEventName(), mobClick.getLabelName(), mobClick.getValue(), mobClick.getExtValueLong(), mobClick.getExtJson());
        }
        mobClick.recycle();
    }

    /* renamed from: a */
    public static void m21522a(String str, Bundle bundle) {
        try {
            C6759a.m20909a(str, bundle);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m21527b(String str, Map<String, String> map) {
        try {
            C6906g.m21515a(str, map);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m21528b(String str, JSONObject jSONObject) {
        try {
            C6759a.m20910a(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m21525a(String str, JSONObject jSONObject) {
        try {
            C6759a.m20910a(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m21517a(Context context, String str, String str2, long j, long j2) {
        try {
            C6906g.m21512a(C6399b.m19921a(), str, str2, j, 0);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m21518a(Context context, String str, String str2, String str3, long j) {
        try {
            C6906g.m21512a(C6399b.m19921a(), str, str2, Long.parseLong(str3), j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m21520a(Context context, String str, String str2, String str3, String str4) {
        try {
            C6906g.m21512a(C6399b.m19921a(), str, str2, Long.parseLong(str3), Long.parseLong(str4));
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static void m21526b(String str, String str2, String str3, String str4, long j, JSONObject jSONObject) {
        try {
            C6906g.m21514a(C6399b.m19921a(), str, str2, str3, Long.parseLong(str4), j, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m21519a(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
        try {
            C6906g.m21513a(C6399b.m19921a(), str, str2, Long.parseLong(str3), j, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m21521a(Context context, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        try {
            C6906g.m21513a(C6399b.m19921a(), str, str2, Long.parseLong(str3), Long.parseLong(str4), jSONObject);
        } catch (Exception unused) {
        }
    }
}
