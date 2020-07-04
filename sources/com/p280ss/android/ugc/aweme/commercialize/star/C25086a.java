package com.p280ss.android.ugc.aweme.commercialize.star;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.a */
public final class C25086a {

    /* renamed from: a */
    public static final C25086a f66222a = new C25086a();

    /* renamed from: b */
    private static C25087a f66223b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.a$a */
    public interface C25087a {
        void setStarAtlasContent(String str);

        void setStarAtlasHashTag(String str);
    }

    private C25086a() {
    }

    /* renamed from: a */
    public static C25087a m82623a() {
        return f66223b;
    }

    /* renamed from: a */
    public static void m82624a(C25087a aVar) {
        f66223b = aVar;
    }

    /* renamed from: a */
    public static final void m82625a(String str) {
        C25087a aVar = f66223b;
        if (aVar != null) {
            aVar.setStarAtlasContent(str);
        }
    }

    /* renamed from: b */
    public static final void m82626b(String str) {
        C25087a aVar = f66223b;
        if (aVar != null) {
            aVar.setStarAtlasHashTag(str);
        }
    }

    /* renamed from: c */
    public static final String m82627c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString("brand_name", null);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
