package com.p280ss.android.ugc.aweme.web.p1703a;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.web.a.b */
public final class C43434b extends C43433a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo105370a() {
        return "(.*)/ies_fonts/(.+).ttf$";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final InputStream mo105371b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m137835d(str.substring(str.lastIndexOf("/") + 1));
    }

    /* renamed from: d */
    private static InputStream m137835d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Context context = C43435c.m137838a().f112503b;
        Map<String, String> map = C43435c.m137838a().f112502a;
        if (map == null || map.size() == 0) {
            return null;
        }
        String str2 = (String) map.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return context.getAssets().open(str2);
        } catch (IOException unused) {
            return null;
        }
    }
}
