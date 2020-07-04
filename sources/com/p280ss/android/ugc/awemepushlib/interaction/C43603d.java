package com.p280ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.statisticlogger.C10981a;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.awemepushlib.model.C43639a;
import com.p280ss.android.ugc.awemepushlib.model.PushMsg;
import com.p280ss.android.ugc.awemepushlib.p1713b.C43590a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.d */
public final class C43603d {
    /* renamed from: a */
    public static Map<String, String> m138173a() {
        return C10981a.m32175e();
    }

    /* renamed from: b */
    public static boolean m138182b() {
        if (C6319n.m19593a(C10981a.m32172c()) || C6319n.m19593a(C10981a.m32174d())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m138179a(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            String host = parse.getHost();
            List<String> pathSegments = parse.getPathSegments();
            Set queryParameterNames = parse.getQueryParameterNames();
            StringBuilder sb = new StringBuilder("//");
            sb.append(host);
            for (String str2 : pathSegments) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append("/");
                    try {
                        Long.parseLong(str2);
                        sb.append("xxx");
                    } catch (NumberFormatException unused) {
                        sb.append(str2);
                    }
                }
            }
            if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                sb.append("?");
                Iterator it = queryParameterNames.iterator();
                while (it.hasNext()) {
                    sb.append((String) it.next());
                    if (it.hasNext()) {
                        sb.append("&");
                    }
                }
            }
            try {
                C6893q.m21452b("deep_link_collect", "", new JSONObject().put(C22912d.f60642b, sb.toString()));
            } catch (JSONException unused2) {
            }
        }
    }

    /* renamed from: a */
    public static void m138181a(String str, JSONObject jSONObject) {
        C6893q.m21447a(str, jSONObject);
    }

    /* renamed from: a */
    public static void m138177a(PushMsg pushMsg, int i) {
        C6907h.m21525a("push_receive", new JSONObject(C43639a.m138285a(pushMsg, i, C43590a.m138122a())));
    }

    /* renamed from: a */
    public static void m138180a(String str, int i, JSONObject jSONObject) {
        C6893q.m21444a(str, i, jSONObject);
    }

    /* renamed from: a */
    public static void m138178a(PushMsg pushMsg, boolean z, int i) {
        String str;
        String str2;
        String str3;
        Map a = C43639a.m138285a(pushMsg, i, C43590a.m138122a());
        String str4 = "has_image";
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        a.put(str4, str);
        String str5 = "mediastyle";
        if (pushMsg.extra.style == 5) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        a.put(str5, str2);
        String str6 = "colorized";
        if (TextUtils.isEmpty(pushMsg.extra.bg_color)) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        a.put(str6, str3);
        C6907h.m21525a("push_show", new JSONObject(a));
    }

    /* renamed from: a */
    public static void m138174a(long j, String str, JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                return;
            }
        }
        if (z) {
            jSONObject.put("click_position", "notify");
        } else {
            jSONObject.put("click_position", "alert");
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("post_back", str);
        }
        jSONObject.put("rule_id", j);
        C6907h.m21525a("push_click", jSONObject);
    }

    /* renamed from: a */
    public static void m138175a(long j, boolean z, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
                return;
            }
        }
        if (z) {
            jSONObject.put("click_position", "notify");
        } else {
            jSONObject.put("click_position", "alert");
        }
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("post_back", str);
        }
        jSONObject.put("rule_id", j);
        C6907h.m21525a("push_click_v2", jSONObject);
    }

    /* renamed from: a */
    public static void m138176a(Context context, String str, long j, long j2, JSONObject... jSONObjectArr) {
        JSONObject[] jSONObjectArr2 = jSONObjectArr;
        if (jSONObjectArr2.length > 0) {
            C6906g.m21513a(context, "apn", str, j, j2, jSONObjectArr2[0]);
            return;
        }
        C6906g.m21512a(context, "apn", str, j, j2);
    }
}
