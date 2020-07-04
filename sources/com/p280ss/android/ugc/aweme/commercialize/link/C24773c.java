package com.p280ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.c */
public final class C24773c {

    /* renamed from: a */
    public static final C24773c f65264a = new C24773c();

    /* renamed from: b */
    private static C24774a f65265b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.c$a */
    public interface C24774a {
        String getLinkData();

        void setLinkData(String str);
    }

    private C24773c() {
    }

    /* renamed from: a */
    public static C24774a m81298a() {
        return f65265b;
    }

    /* renamed from: b */
    public static final String m81302b() {
        C24774a aVar = f65265b;
        if (aVar != null) {
            String linkData = aVar.getLinkData();
            if (linkData != null) {
                return linkData;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static void m81299a(C24774a aVar) {
        f65265b = aVar;
    }

    /* renamed from: a */
    public static final void m81300a(String str) {
        C7573i.m23587b(str, "value");
        C24774a aVar = f65265b;
        if (aVar != null) {
            aVar.setLinkData(str);
        }
    }

    /* renamed from: b */
    public static final int m81301b(String str) {
        C7573i.m23587b(str, "linkData");
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optBoolean("link_exit", false)) {
                    return 1;
                }
                if (jSONObject.optBoolean("commerce_ad_link", false)) {
                    return 3;
                }
            } catch (JSONException unused) {
            }
        }
        return 2;
    }

    /* renamed from: c */
    public static final String m81303c(String str) {
        boolean z;
        C7573i.m23587b(str, "linkData");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                return new JSONObject(str).optString("commerce_ad_link_tags", null);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
