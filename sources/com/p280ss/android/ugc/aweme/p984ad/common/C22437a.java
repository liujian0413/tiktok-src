package com.p280ss.android.ugc.aweme.p984ad.common;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Process;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.p984ad.p989e.C22457e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ad.common.a */
public class C22437a {

    /* renamed from: a */
    private static final String f59836a = "a";

    /* renamed from: b */
    private static C22437a f59837b;

    /* renamed from: c */
    private static ContentResolver f59838c;

    /* renamed from: d */
    private static HashMap<String, String> f59839d;

    /* renamed from: e */
    private String f59840e;

    /* renamed from: f */
    private SharedPreferences f59841f;

    /* renamed from: g */
    private String f59842g;

    /* renamed from: h */
    private String f59843h;

    /* renamed from: d */
    private String m74292d() {
        if (this.f59843h == null) {
            this.f59843h = "content://com.ss.android.ugc.aweme.ad_impl.helpers.sharedPref.MainSharedPrefProvider/";
        }
        return this.f59843h;
    }

    /* renamed from: a */
    public static synchronized C22437a m74284a() {
        C22437a aVar;
        synchronized (C22437a.class) {
            if (f59837b == null) {
                f59837b = new C22437a();
            }
            aVar = f59837b;
        }
        return aVar;
    }

    private C22437a() {
        HashMap<String, String> hashMap = new HashMap<>();
        f59839d = hashMap;
        hashMap.put("com.ss.android.ugc.aweme.ad_impl", "main_settings");
        f59839d.put("com.ss.android.ugc.aweme.ad_impl:remote", "remote_settings");
        f59839d.put("com.ss.android.ugc.aweme.ad_impl:nice_service", "service_settings");
        f59838c = C6399b.m19921a().getContentResolver();
    }

    /* renamed from: b */
    private static String m74288b() {
        ActivityManager activityManager = (ActivityManager) C6399b.m19921a().getSystemService("activity");
        if (activityManager != null) {
            List runningAppProcesses = activityManager.getRunningAppProcesses();
            int myPid = Process.myPid();
            if (runningAppProcesses != null) {
                for (int i = 0; i < runningAppProcesses.size(); i++) {
                    if (((RunningAppProcessInfo) runningAppProcesses.get(i)).pid == myPid) {
                        return ((RunningAppProcessInfo) runningAppProcesses.get(i)).processName;
                    }
                }
            }
        }
        return "com.ss.android.ugc.aweme.ad_impl";
    }

    /* renamed from: c */
    private synchronized SharedPreferences m74290c() {
        if (this.f59842g == null || this.f59842g.length() == 0) {
            if (this.f59840e == null || this.f59840e.length() == 0) {
                this.f59840e = m74288b();
            }
            if (f59839d.containsKey(this.f59840e)) {
                this.f59842g = (String) f59839d.get(this.f59840e);
            } else {
                this.f59842g = "main_settings";
            }
        }
        return C7285c.m22838a(C6399b.m19921a(), this.f59842g, 0);
    }

    /* renamed from: a */
    private static String m74285a(Uri uri) {
        return f59838c.getType(uri);
    }

    /* renamed from: b */
    private String m74289b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m74292d());
        sb.append(str);
        return m74285a(Uri.parse(sb.toString()));
    }

    /* renamed from: a */
    private static boolean m74287a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (String equals : C22438b.f59844a) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m74286a(Uri uri, ContentValues contentValues) {
        f59838c.insert(uri, contentValues);
    }

    /* renamed from: c */
    private void m74291c(String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(m74292d());
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        ContentValues contentValues = new ContentValues();
        contentValues.put(str, String.valueOf(i));
        m74286a(parse, contentValues);
    }

    /* renamed from: a */
    public final int mo59001a(String str, int i) {
        int i2;
        if (m74287a(str)) {
            String b = m74289b(str);
            if (b == null) {
                return -1;
            }
            try {
                i2 = Integer.parseInt(b);
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            return i2;
        }
        this.f59841f = m74290c();
        return this.f59841f.getInt(str, -1);
    }

    /* renamed from: b */
    public final void mo59002b(String str, int i) {
        if (m74287a(str)) {
            m74291c(str, i);
            return;
        }
        this.f59841f = m74290c();
        C22457e.m74329a(this.f59841f, str, i);
    }
}
