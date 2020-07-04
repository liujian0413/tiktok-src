package com.p280ss.android.ugc.aweme.commerce;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f;
import com.p280ss.android.ugc.aweme.music.p1409c.C33786f.C33787a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commerce.b */
public final class C24425b {

    /* renamed from: a */
    public static final C24425b f64484a = new C24425b();

    private C24425b() {
    }

    /* renamed from: a */
    public static final void m80323a(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        C7573i.m23587b(context, "formAct");
    }

    /* renamed from: a */
    public static final void m80324a(String str, Map<String, String> map, Context context) {
        C7573i.m23587b(map, "options");
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                C7573i.m23580a();
            }
            C33787a a = C33786f.m108941a(str);
            for (Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str3)) {
                    a.mo86195a(str2, str3);
                }
            }
            C7195s.m22438a().mo18682a(a.mo86194a().toString());
        }
    }
}
