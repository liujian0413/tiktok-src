package com.p280ss.android.sdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.http.legacy.p296a.C19561a;
import com.p280ss.android.ugc.aweme.legacy.download.C32335d;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.activity.a */
public final class C20102a {

    /* renamed from: com.ss.android.sdk.activity.a$a */
    public interface C20105a {
        /* renamed from: a */
        void mo53832a(long j);
    }

    /* renamed from: a */
    public static long m66288a(Context context, String str, String str2, String str3, JSONObject jSONObject) {
        ArrayList arrayList;
        if (!C6319n.m19593a(str2)) {
            arrayList = new ArrayList();
            arrayList.add(new C19561a("User-Agent", str2));
        } else {
            arrayList = null;
        }
        return C32335d.m104898a(str, null, context, false, str3, arrayList, true, jSONObject);
    }

    /* renamed from: a */
    public static void m66291a(Context context, String str, String str2, String str3, JSONObject jSONObject, C20105a aVar) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            String[] strArr = {"android.permission.WRITE_EXTERNAL_STORAGE"};
            final Context context2 = context;
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final JSONObject jSONObject2 = jSONObject;
            final C20105a aVar2 = aVar;
            C201042 r0 = new C22480b() {
                /* renamed from: a */
                public final void mo53549a(String[] strArr, int[] iArr) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        long a = C20102a.m66288a(context2, str4, str5, str6, jSONObject2);
                        if (aVar2 != null) {
                            aVar2.mo53832a(a);
                        }
                    }
                }
            };
            C22477b.m74364a(activity, strArr, r0);
        }
    }

    /* renamed from: a */
    public static JSONObject m66290a(Context context, long j, String str, String str2, String str3, String str4) {
        if (context == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("label", "browser");
            jSONObject2.put("pageUrl", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("referer_url", str3);
            }
            if (!TextUtils.isEmpty(str3) && !str3.equals(str4)) {
                jSONObject2.put("init_url", str4);
            }
            jSONObject2.put("ad_id", j);
            if (!TextUtils.isEmpty(str)) {
                jSONObject2.put("log_extra", str);
            }
            if (j <= 0) {
                jSONObject2.put("in_white_list", 1);
            }
            jSONObject.put("ext_json", jSONObject2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C11029b m66289a(Context context, String str, String str2, String str3, JSONObject jSONObject, boolean z, C20105a aVar) {
        if (context == null || C6319n.m19593a(str)) {
            return null;
        }
        if (z) {
            m66291a(context, str, str2, str3, jSONObject, aVar);
            return null;
        }
        C11030a aVar2 = new C11030a(context);
        aVar2.mo26640a((CharSequence) str).mo26645b((int) R.string.b6m);
        aVar2.mo26646b((int) R.string.bxo, (OnClickListener) null);
        final Context context2 = context;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final JSONObject jSONObject2 = jSONObject;
        final C20105a aVar3 = aVar;
        C201031 r1 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C20102a.m66291a(context2, str4, str5, str6, jSONObject2, aVar3);
            }
        };
        aVar2.mo26635a((int) R.string.bxq, (OnClickListener) r1);
        return aVar2.mo26649b();
    }
}
