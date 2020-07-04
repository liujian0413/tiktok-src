package com.bytedance.p263im.core.internal.utils;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.SystemClock;
import com.bytedance.p263im.core.p584a.C11198c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.bytedance.im.core.internal.utils.h */
public class C11430h {

    /* renamed from: a */
    private static volatile long f30941a;

    /* renamed from: b */
    private static C11430h f30942b;

    /* renamed from: c */
    private SharedPreferences f30943c;

    /* renamed from: b */
    public final long mo27474b() {
        return this.f30943c.getLong(m33687b("im_reset_time"), 0);
    }

    /* renamed from: c */
    public final int mo27477c() {
        return this.f30943c.getInt(m33687b("im_reset_count"), 0);
    }

    /* renamed from: e */
    public final String mo27482e() {
        return this.f30943c.getString(m33687b("im_snapshot"), "");
    }

    private C11430h() {
        f30941a = C11198c.m32777a().f30372b.mo27230a();
        Application application = C11198c.m32777a().f30371a;
        StringBuilder sb = new StringBuilder("imsdk_");
        sb.append(f30941a);
        this.f30943c = C7285c.m22838a(application, sb.toString(), 0);
    }

    /* renamed from: a */
    public static synchronized C11430h m33685a() {
        C11430h hVar;
        synchronized (C11430h.class) {
            long a = C11198c.m32777a().f30372b.mo27230a();
            if (f30942b == null || a != f30941a) {
                synchronized (C11430h.class) {
                    if (f30942b == null || a != f30941a) {
                        f30942b = new C11430h();
                    }
                }
            }
            hVar = f30942b;
        }
        return hVar;
    }

    /* renamed from: d */
    public final void mo27481d() {
        Editor edit = this.f30943c.edit();
        if (SystemClock.uptimeMillis() - mo27474b() > 3600000) {
            int[] iArr = C11198c.m32777a().mo27248b().f30416p;
            if (iArr == null) {
                iArr = C11198c.m32777a().mo27248b().f30415o;
            }
            for (int i : iArr) {
                edit.putLong(m33686a(i, "msg_by_user_cursor"), -1).putLong(m33686a(i, "msg_by_user_report_cursor"), -1).putBoolean(m33686a(i, "im_init"), false).putLong(m33686a(i, "im_init_page_cursor"), 0);
            }
            edit.putString("im_snapshot", "");
            edit.putLong(m33687b("im_reset_time"), SystemClock.uptimeMillis());
        }
        edit.putInt(m33687b("im_reset_count"), mo27477c() + 1).commit();
    }

    /* renamed from: a */
    public final long mo27470a(int i) {
        return this.f30943c.getLong(m33686a(i, "msg_by_user_cursor"), -1);
    }

    /* renamed from: d */
    public final long mo27480d(int i) {
        return this.f30943c.getLong(m33686a(i, "im_init_page_cursor"), 0);
    }

    /* renamed from: b */
    private static String m33687b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C11198c.m32777a().f30372b.mo27230a());
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public final long mo27475b(int i) {
        return this.f30943c.getLong(m33686a(i, "msg_by_user_report_cursor"), -1);
    }

    /* renamed from: c */
    public final boolean mo27479c(int i) {
        return this.f30943c.getBoolean(m33686a(i, "im_init"), false);
    }

    /* renamed from: a */
    public final void mo27473a(String str) {
        this.f30943c.edit().putString(m33687b("im_snapshot"), str).commit();
    }

    /* renamed from: a */
    public final void mo27471a(int i, long j) {
        this.f30943c.edit().putLong(m33686a(i, "msg_by_user_cursor"), j).commit();
    }

    /* renamed from: c */
    public final void mo27478c(int i, long j) {
        this.f30943c.edit().putLong(m33686a(i, "im_init_page_cursor"), j).commit();
    }

    /* renamed from: a */
    private static String m33686a(int i, String str) {
        if (i == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(C11198c.m32777a().f30372b.mo27230a());
            sb.append("_");
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C11198c.m32777a().f30372b.mo27230a());
        sb2.append("_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(i);
        return sb2.toString();
    }

    /* renamed from: b */
    public final void mo27476b(int i, long j) {
        this.f30943c.edit().putLong(m33686a(i, "msg_by_user_report_cursor"), j).commit();
    }

    /* renamed from: a */
    public final void mo27472a(int i, boolean z) {
        this.f30943c.edit().putBoolean(m33686a(i, "im_init"), true).commit();
    }
}
