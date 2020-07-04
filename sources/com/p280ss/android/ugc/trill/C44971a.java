package com.p280ss.android.ugc.trill;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.p534b.C10295a;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.app.C22912d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.trill.a */
public final class C44971a {
    /* renamed from: a */
    private static boolean m141912a(int i, Context context, Intent intent) {
        if (i != 0) {
            return false;
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Intent m141910a(Context context, int i, long j, C19936f fVar) {
        Intent intent = null;
        if (i != 1) {
            switch (i) {
                case 3:
                    intent.addFlags(536870912);
                    intent.putExtra("from_notification", true);
                    break;
                case 4:
                    if (j > 0) {
                        intent.putExtra("from_notification", true);
                        break;
                    }
                    break;
            }
        } else {
            intent.addFlags(536870912);
            intent.putExtra("from_notification", true);
        }
        return intent;
    }

    /* renamed from: a */
    public static void m141911a(JSONObject jSONObject, Activity activity, C19936f fVar, int i, String str, int i2, String str2) {
        Intent intent;
        try {
            jSONObject.optInt("preload_article", 0);
            String optString = jSONObject.optString(C22912d.f60642b);
            if (C6319n.m19593a(optString)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("app_data");
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("t", 0);
                    int optInt2 = optJSONObject.optInt("p", 0);
                    long optLong = optJSONObject.optLong("uid", 0);
                    if (optInt == 1) {
                        m141910a(activity, optInt2, optLong, fVar);
                    }
                }
                intent = null;
            } else {
                Uri parse = Uri.parse(optString);
                String scheme = parse.getScheme();
                if (C22909c.f60637a.equals(scheme)) {
                    parse = Uri.parse(C22909c.f60640d.mo59882a(optString));
                }
                intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                if (C22909c.f60640d.mo59884b(scheme)) {
                    intent.putExtra(C22912d.f60643c, true);
                }
                intent.setData(parse);
            }
            String packageName = activity.getPackageName();
            if (intent == null) {
                intent = C6776h.m20941a((Context) activity, packageName);
            }
            if (intent != null) {
                intent.addFlags(268435456);
                intent.putExtra("from_notification", true);
                intent.putExtra("msg_from", 2);
                intent.putExtra("msg_id", i);
                intent.putExtra("message_from", str);
                if (!C6319n.m19593a((String) null)) {
                    intent.putExtra("message_extra", null);
                }
                if (!m141912a(i2, activity, intent) && !activity.isFinishing()) {
                    activity.startActivity(intent);
                }
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("can not get launch intent: ");
            sb.append(e);
            C10295a.m30492a(activity, sb.toString());
        }
    }
}
