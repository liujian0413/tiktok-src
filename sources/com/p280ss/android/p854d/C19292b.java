package com.p280ss.android.p854d;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.ss.android.d.b */
public final class C19292b {

    /* renamed from: b */
    private static Context f52194b;

    /* renamed from: c */
    private static C19294c<C19292b> f52195c = new C19294c<C19292b>() {
        /* renamed from: c */
        private static C19292b m63222c() {
            return new C19292b();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo29755a() {
            return m63222c();
        }
    };

    /* renamed from: a */
    public C19291a f52196a;

    /* renamed from: a */
    private static int m63214a() {
        try {
            return C7285c.m22838a(f52194b, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).getInt("json_data", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static C19292b m63215a(Context context) {
        f52194b = context.getApplicationContext();
        return (C19292b) f52195c.mo51193b();
    }

    /* renamed from: b */
    private boolean m63218b(Uri uri) {
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("needlaunchlog", false);
        int a = m63214a();
        if (!booleanQueryParameter || a <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m63216a(Map<String, String> map) {
        if (this.f52196a != null) {
            this.f52196a.onEvent(map);
        }
    }

    /* renamed from: a */
    public static void m63217a(boolean z) {
        try {
            Editor edit = C7285c.m22838a(f52194b, "KEY_NEED_UPLOAD_LAUNCHLOG", 0).edit();
            edit.putInt("json_data", 1);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private static Map<String, String> m63219c(Uri uri) throws UnsupportedEncodingException {
        String[] split;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQuery().split("&")) {
            int indexOf = str.indexOf("=");
            linkedHashMap.put(str.substring(0, indexOf), str.substring(indexOf + 1));
        }
        linkedHashMap.put("launchlog_protocol", uri.getScheme());
        linkedHashMap.put("launchlog_authority", uri.getAuthority());
        linkedHashMap.put("launchlog_path", uri.getPath());
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo51191a(Uri uri) {
        try {
            if (m63218b(uri)) {
                m63216a(m63219c(uri));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo51192a(String str) {
        try {
            mo51191a(Uri.parse(str));
        } catch (Exception unused) {
        }
    }
}
