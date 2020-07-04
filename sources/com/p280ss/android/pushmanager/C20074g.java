package com.p280ss.android.pushmanager;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.pushmanager.g */
public final class C20074g {

    /* renamed from: a */
    public static final Set<Integer> f54271a;

    /* renamed from: b */
    public static final String f54272b = C20038a.m65995b("/service/2/app_notify/");

    /* renamed from: c */
    public static final String f54273c = C20038a.m65994a("/push/get_service_addrs/");

    /* renamed from: d */
    public static final String f54274d = C20038a.m65994a("/service/1/update_token/");

    /* renamed from: e */
    public static final String f54275e = C20038a.m65994a("/cloudpush/callback/meizu/");

    /* renamed from: f */
    public static final String f54276f = C20038a.m65994a("/cloudpush/callback/register_device/");

    /* renamed from: g */
    public static final String f54277g = C20038a.m65994a("/service/1/app_notice_status/");

    /* renamed from: h */
    public static final String f54278h = C20038a.m65994a("/cloudpush/update_sender/");

    /* renamed from: i */
    private static C20072e f54279i;

    /* renamed from: j */
    private static C20053c f54280j;

    /* renamed from: b */
    private static String m66107b(String str, String str2) {
        return C20075h.m66113a(str, str2);
    }

    /* renamed from: a */
    public static C20072e m66102a() {
        if (f54279i != null) {
            return f54279i;
        }
        throw new IllegalArgumentException("sMessageDepend is null !!!");
    }

    /* renamed from: b */
    public static C20053c m66106b() {
        if (f54280j != null) {
            return f54280j;
        }
        C20053c cVar = new C20053c();
        f54280j = cVar;
        return cVar;
    }

    /* renamed from: c */
    public static String m66108c() {
        if (f54280j == null || TextUtils.isEmpty(f54280j.mo53677c())) {
            return f54273c;
        }
        return m66107b(f54280j.mo53677c(), "/push/get_service_addrs/");
    }

    /* renamed from: d */
    public static String m66109d() {
        if (f54280j == null || TextUtils.isEmpty(f54280j.mo53677c())) {
            return f54274d;
        }
        return m66107b(f54280j.mo53677c(), "/service/1/update_token/");
    }

    /* renamed from: e */
    public static String m66110e() {
        if (f54280j == null || TextUtils.isEmpty(f54280j.mo53677c())) {
            return f54275e;
        }
        return m66107b(f54280j.mo53677c(), "/cloudpush/callback/meizu/");
    }

    /* renamed from: f */
    public static String m66111f() {
        if (f54280j == null || TextUtils.isEmpty(f54280j.mo53677c())) {
            return f54277g;
        }
        return m66107b(f54280j.mo53677c(), "/service/1/app_notice_status/");
    }

    /* renamed from: g */
    public static String m66112g() {
        if (f54280j == null || TextUtils.isEmpty(f54280j.mo53677c())) {
            return f54278h;
        }
        return m66107b(f54280j.mo53677c(), "/cloudpush/update_sender/");
    }

    static {
        HashSet hashSet = new HashSet();
        f54271a = hashSet;
        hashSet.add(Integer.valueOf(1));
        f54271a.add(Integer.valueOf(2));
        f54271a.add(Integer.valueOf(3));
        f54271a.add(Integer.valueOf(4));
    }

    /* renamed from: a */
    public static void m66104a(C20053c cVar) {
        f54280j = cVar;
    }

    /* renamed from: a */
    public static void m66105a(C20072e eVar) {
        f54279i = eVar;
    }

    /* renamed from: a */
    public static String m66103a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }
}
