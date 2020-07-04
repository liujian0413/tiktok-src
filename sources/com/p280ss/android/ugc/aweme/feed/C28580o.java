package com.p280ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.deviceregister.p289a.C6778a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.feed.o */
public final class C28580o {

    /* renamed from: a */
    private static volatile Boolean f75251a;

    /* renamed from: b */
    private static C28581a f75252b;

    /* renamed from: c */
    private static boolean f75253c;

    /* renamed from: d */
    private static PAGE f75254d = PAGE.FEED;

    /* renamed from: e */
    private static long f75255e = -1;

    /* renamed from: f */
    private static long f75256f = -1;

    /* renamed from: com.ss.android.ugc.aweme.feed.o$a */
    public interface C28581a {
        /* renamed from: a */
        void mo71798a(PAGE page);
    }

    /* renamed from: c */
    public static boolean m93833c() {
        return f75253c;
    }

    /* renamed from: d */
    public static String m93834d() {
        return f75254d.name();
    }

    /* renamed from: g */
    public static long m93837g() {
        long j = f75255e;
        f75255e = 0;
        return j;
    }

    /* renamed from: i */
    public static long m93839i() {
        long j = f75256f;
        f75256f = 0;
        return j;
    }

    /* renamed from: a */
    public static Boolean m93828a() {
        if (f75251a == null) {
            m93840j();
        }
        return f75251a;
    }

    /* renamed from: f */
    public static void m93836f() {
        if (f75255e < 0) {
            f75255e = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: h */
    public static void m93838h() {
        if (f75256f < 0) {
            f75256f = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: e */
    public static String m93835e() {
        Activity g = C6405d.m19984g();
        if (g != null) {
            return g.getClass().getSimpleName();
        }
        return null;
    }

    /* renamed from: b */
    public static void m93832b() {
        if (C6399b.m19921a() != null) {
            C7285c.m22838a(C6399b.m19921a(), "prefs_feed_check", 0).edit().putBoolean("key_first_launch", true).apply();
        }
    }

    /* renamed from: j */
    private static boolean m93840j() {
        if (C6399b.m19921a() == null) {
            return false;
        }
        SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "prefs_feed_check", 0);
        boolean z = a.getBoolean("key_first_launch", true);
        if (f75251a == null) {
            f75251a = Boolean.valueOf(z);
        }
        if (f75251a.booleanValue()) {
            C6887b.m21436b().mo16902a(C6399b.m19921a(), "key_new_user", true);
        }
        a.edit().putBoolean("key_first_launch", false).apply();
        return f75251a.booleanValue();
    }

    /* renamed from: a */
    public static void m93831a(C28581a aVar) {
        if (aVar != null) {
            f75252b = aVar;
        }
    }

    /* renamed from: a */
    public static void m93829a(Context context) {
        if (context != null) {
            SharedPreferences a = C7285c.m22838a(context, C6778a.m20960a(), 0);
            if (a != null) {
                f75253c = TextUtils.isEmpty(a.getString("device_id", ""));
            }
        }
    }

    /* renamed from: a */
    public static void m93830a(PAGE page) {
        f75254d = page;
        if (f75252b != null) {
            f75252b.mo71798a(f75254d);
        }
    }
}
