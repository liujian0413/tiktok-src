package com.p280ss.android.ugc.aweme.p932aa;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.video.experiment.C43220a;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.aa.b */
public final class C21097b {

    /* renamed from: a */
    public static final C21097b f56667a = new C21097b();

    /* renamed from: b */
    private static final String f56668b = f56668b;

    /* renamed from: c */
    private static final String f56669c = f56669c;

    /* renamed from: d */
    private static final String f56670d = f56670d;

    private C21097b() {
    }

    /* renamed from: a */
    private static void m71142a(String str) {
        C7573i.m23587b(str, "msg");
        if (C43220a.m137072a()) {
            C6921a.m21552a(3, f56668b, str);
        }
    }

    /* renamed from: b */
    private static void m71146b(String str) {
        C7573i.m23587b(str, "msg");
        if (C43220a.m137072a()) {
            C6921a.m21552a(4, f56668b, str);
        }
    }

    /* renamed from: c */
    private static void m71148c(String str) {
        C7573i.m23587b(str, "msg");
        if (C43220a.m137072a()) {
            C6921a.m21552a(5, f56668b, str);
        }
    }

    /* renamed from: d */
    private static void m71150d(String str) {
        C7573i.m23587b(str, "msg");
        if (C43220a.m137072a()) {
            C6921a.m21552a(6, f56668b, str);
        }
    }

    /* renamed from: a */
    public static final void m71143a(String str, Map<String, String> map) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(map, "msg");
        if (C43220a.m137072a()) {
            String b = f56667a.m71145b(str, map);
            if (!TextUtils.isEmpty(b)) {
                m71142a(b);
            }
        }
    }

    /* renamed from: b */
    private String m71145b(String str, Map<String, String> map) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(map, "msgMap");
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return m71152e(str, jSONObject);
    }

    /* renamed from: c */
    public static final void m71149c(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(jSONObject, "msg");
        if (C43220a.m137072a()) {
            String e = m71152e(str, jSONObject);
            if (!TextUtils.isEmpty(e)) {
                m71148c(e);
            }
        }
    }

    /* renamed from: d */
    public static final void m71151d(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(jSONObject, "msg");
        if (C43220a.m137072a()) {
            String e = m71152e(str, jSONObject);
            if (!TextUtils.isEmpty(e)) {
                m71150d(e);
            }
        }
    }

    /* renamed from: e */
    private static String m71152e(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(jSONObject, "msg");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(f56669c, str);
        jSONObject2.put(f56670d, jSONObject);
        String jSONObject3 = jSONObject2.toString();
        C7573i.m23582a((Object) jSONObject3, "messageObj.toString()");
        return jSONObject3;
    }

    /* renamed from: a */
    public static final void m71144a(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(jSONObject, "msg");
        if (C43220a.m137072a()) {
            String e = m71152e(str, jSONObject);
            if (!TextUtils.isEmpty(e)) {
                m71142a(e);
            }
        }
    }

    /* renamed from: b */
    public static final void m71147b(String str, JSONObject jSONObject) {
        C7573i.m23587b(str, "eventName");
        C7573i.m23587b(jSONObject, "msg");
        if (C43220a.m137072a()) {
            String e = m71152e(str, jSONObject);
            if (!TextUtils.isEmpty(e)) {
                m71146b(e);
            }
        }
    }
}
