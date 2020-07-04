package com.p280ss.android.ugc.trill.p1762d;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.trill.d.a */
public class C44987a {

    /* renamed from: a */
    public static final String f115660a = "a";

    /* renamed from: b */
    private static String f115661b;

    /* renamed from: c */
    private static String f115662c;

    /* renamed from: d */
    private static boolean f115663d;

    /* renamed from: e */
    private static SharedPreferences f115664e = C7285c.m22838a(C6399b.m19921a(), "gaid_sp_name", 0);

    /* renamed from: a */
    public static void m141950a() {
        if (!m141957h()) {
            m141958i();
        }
    }

    /* renamed from: h */
    private static boolean m141957h() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m141951b() {
        if (f115661b == null) {
            if (m141957h()) {
                return f115664e.getString("key_gaid", "");
            }
            m141958i();
        }
        return f115661b;
    }

    /* renamed from: c */
    public static String m141952c() {
        if (f115662c == null) {
            if (m141957h()) {
                return f115664e.getString("key_android_id", "");
            }
            m141958i();
        }
        return f115662c;
    }

    /* renamed from: d */
    public static String m141953d() {
        if (f115661b != null) {
            return f115661b;
        }
        C1592h.m7853a(C44988b.f115665a);
        return f115664e.getString("key_gaid", "");
    }

    /* renamed from: e */
    public static String m141954e() {
        if (f115662c != null) {
            return f115662c;
        }
        C1592h.m7853a(C44989c.f115666a);
        return f115664e.getString("key_android_id", "");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m141958i() {
        if (!f115663d) {
            try {
                m141959j();
                AppLog.setGoogleAId(f115661b);
                f115663d = true;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: j */
    private static void m141959j() {
        Editor edit = f115664e.edit();
        try {
            C14734a a = C14733a.m42585a(C6399b.m19921a());
            if (a != null && !TextUtils.isEmpty(a.f38079a)) {
                edit.putString("key_gaid", a.f38079a);
                f115661b = a.f38079a;
            }
        } catch (Exception unused) {
        }
        String a2 = C44990d.m141960a(C6399b.m19921a().getContentResolver(), "android_id");
        if (!TextUtils.isEmpty(a2)) {
            edit.putString("key_android_id", a2);
            f115662c = a2;
        }
        edit.commit();
    }
}
