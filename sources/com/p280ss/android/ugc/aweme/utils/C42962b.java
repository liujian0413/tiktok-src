package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.b */
public final class C42962b {

    /* renamed from: a */
    public static final C42962b f111525a = new C42962b();

    /* renamed from: b */
    private static final List<C43019cn> f111526b;

    private C42962b() {
    }

    static {
        List<C43019cn> arrayList = new ArrayList<>();
        f111526b = arrayList;
        arrayList.add(new C43019cn() {
            /* renamed from: a */
            public final boolean mo104673a(String str, Map<String, String> map) {
                CharSequence charSequence;
                C7573i.m23587b(str, "eventName");
                String str2 = null;
                if (map != null) {
                    charSequence = (String) map.get("shoot_way");
                } else {
                    charSequence = null;
                }
                if (map != null) {
                    str2 = (String) map.get("enter_from");
                }
                CharSequence charSequence2 = charSequence;
                if (TextUtils.equals(charSequence2, "im_story") || (TextUtils.equals(charSequence2, "story") && TextUtils.equals(str2, "from_chat"))) {
                    return true;
                }
                return false;
            }
        });
    }

    public final void onEvent(MobClick mobClick) {
        C7573i.m23587b(mobClick, "mobClick");
        Map a = m136386a(mobClick.getExtJson());
        String eventName = mobClick.getEventName();
        C7573i.m23582a((Object) eventName, "mobClick.eventName");
        if (m136387b(eventName, a)) {
            C6907h.onEvent(mobClick);
        }
    }

    /* renamed from: a */
    private static Map<String, String> m136386a(JSONObject jSONObject) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        if (jSONObject != null) {
            String optString = jSONObject.optString("shoot_way", "");
            C7573i.m23582a((Object) optString, "data.optString(IntentCon…ants.EXTRA_SHOOT_WAY, \"\")");
            linkedHashMap.put("shoot_way", optString);
            String optString2 = jSONObject.optString("enter_from", "");
            C7573i.m23582a((Object) optString2, "data.optString(IntentCon…nts.EXTRA_ENTER_FROM, \"\")");
            linkedHashMap.put("enter_from", optString2);
            String optString3 = jSONObject.optString("enter_method", "");
            C7573i.m23582a((Object) optString3, "data.optString(IntentCon…s.EXTRA_ENTER_METHOD, \"\")");
            linkedHashMap.put("enter_method", optString3);
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo104671a(String str, Map<String, String> map) {
        C7573i.m23587b(str, "eventName");
        if (m136387b(str, map)) {
            try {
                C6906g.m21515a(str, map);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static boolean m136387b(String str, Map<String, String> map) {
        Iterable<C43019cn> iterable = f111526b;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (C43019cn a : iterable) {
                if (a.mo104673a(str, map)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo104670a(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        String str3 = str;
        Context context2 = context;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "eventName");
        String str4 = str2;
        C7573i.m23587b(str2, "labelName");
        if (m136387b(str, m136386a(jSONObject))) {
            C6906g.m21514a(context, "umeng", str, str2, j, j2, jSONObject);
        }
    }
}
