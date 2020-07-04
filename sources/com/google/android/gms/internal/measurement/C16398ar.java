package com.google.android.gms.internal.measurement;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15335r;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.ar */
public final class C16398ar {

    /* renamed from: a */
    private final C16697t f45886a;

    /* renamed from: b */
    private volatile Boolean f45887b;

    /* renamed from: c */
    private String f45888c;

    /* renamed from: d */
    private Set<Integer> f45889d;

    protected C16398ar(C16697t tVar) {
        C15267r.m44384a(tVar);
        this.f45886a = tVar;
    }

    /* renamed from: a */
    public final boolean mo42519a() {
        if (this.f45887b == null) {
            synchronized (this) {
                if (this.f45887b == null) {
                    ApplicationInfo applicationInfo = this.f45886a.f46639a.getApplicationInfo();
                    String a = C15335r.m44607a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f45887b = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if ((this.f45887b == null || !this.f45887b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        this.f45887b = Boolean.TRUE;
                    }
                    if (this.f45887b == null) {
                        this.f45887b = Boolean.TRUE;
                        this.f45886a.mo43216a().mo43202f("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f45887b.booleanValue();
    }

    /* renamed from: b */
    public static boolean m53430b() {
        return ((Boolean) C16406az.f45918a.f45945a).booleanValue();
    }

    /* renamed from: c */
    public static int m53431c() {
        return ((Integer) C16406az.f45935r.f45945a).intValue();
    }

    /* renamed from: d */
    public static long m53432d() {
        return ((Long) C16406az.f45923f.f45945a).longValue();
    }

    /* renamed from: e */
    public static long m53433e() {
        return ((Long) C16406az.f45924g.f45945a).longValue();
    }

    /* renamed from: f */
    public static int m53434f() {
        return ((Integer) C16406az.f45926i.f45945a).intValue();
    }

    /* renamed from: g */
    public static int m53435g() {
        return ((Integer) C16406az.f45927j.f45945a).intValue();
    }

    /* renamed from: h */
    public static String m53436h() {
        return (String) C16406az.f45929l.f45945a;
    }

    /* renamed from: i */
    public static String m53437i() {
        return (String) C16406az.f45928k.f45945a;
    }

    /* renamed from: j */
    public static String m53438j() {
        return (String) C16406az.f45930m.f45945a;
    }

    /* renamed from: k */
    public final Set<Integer> mo42520k() {
        String str = (String) C16406az.f45938u.f45945a;
        if (this.f45889d == null || this.f45888c == null || !this.f45888c.equals(str)) {
            String[] split = TextUtils.split(str, ",");
            HashSet hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException unused) {
                }
            }
            this.f45888c = str;
            this.f45889d = hashSet;
        }
        return this.f45889d;
    }

    /* renamed from: l */
    public static long m53439l() {
        return ((Long) C16406az.f45942y.f45945a).longValue();
    }
}
