package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.measurement.internal.r */
public final class C16953r extends C16849bv {

    /* renamed from: a */
    public final C16955t f47487a = new C16955t(this, 6, false, false);

    /* renamed from: b */
    public final C16955t f47488b = new C16955t(this, 6, true, false);

    /* renamed from: c */
    public final C16955t f47489c = new C16955t(this, 6, false, true);

    /* renamed from: d */
    public final C16955t f47490d = new C16955t(this, 5, false, false);

    /* renamed from: e */
    public final C16955t f47491e = new C16955t(this, 5, true, false);

    /* renamed from: f */
    public final C16955t f47492f = new C16955t(this, 5, false, true);

    /* renamed from: g */
    public final C16955t f47493g = new C16955t(this, 4, false, false);

    /* renamed from: h */
    public final C16955t f47494h = new C16955t(this, 3, false, false);

    /* renamed from: i */
    public final C16955t f47495i = new C16955t(this, 2, false, false);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public char f47496j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f47497k = -1;

    /* renamed from: l */
    private String f47498l;

    C16953r(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43602d() {
        return false;
    }

    /* renamed from: a */
    protected static Object m56340a(String str) {
        if (str == null) {
            return null;
        }
        return new C16956u(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo44157a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && mo44158a(i)) {
            m56342a(false, str, obj, obj2, obj3);
        }
        if (!z2 && i >= 5) {
            C15267r.m44384a(str);
            C16820at atVar = this.f47095q.f47010f;
            if (atVar != null && atVar.mo43717w()) {
                if (i < 0) {
                    i = 0;
                }
                C16954s sVar = new C16954s(this, i >= 9 ? 8 : i, str, obj, obj2, obj3);
                atVar.mo43645a((Runnable) sVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo44158a(int i) {
        return Log.isLoggable(m56345f(), i);
    }

    /* renamed from: f */
    private final String m56345f() {
        String str;
        synchronized (this) {
            if (this.f47498l == null) {
                if (this.f47095q.f47007c != null) {
                    this.f47498l = this.f47095q.f47007c;
                } else {
                    this.f47498l = C16930eu.m56087d();
                }
            }
            str = this.f47498l;
        }
        return str;
    }

    /* renamed from: a */
    static String m56342a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a = m56341a(z, obj);
        String a2 = m56341a(z, obj2);
        String a3 = m56341a(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m56341a(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = m56344b(AppMeasurement.class.getCanonicalName());
                String b2 = m56344b(C16825ay.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            String b3 = m56344b(className);
                            if (b3.equals(b) || b3.equals(b2)) {
                                sb2.append(": ");
                                sb2.append(stackTraceElement);
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C16956u) {
                return ((C16956u) obj).f47509a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: b */
    private static String m56344b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: P_ */
    public final String mo44156P_() {
        Pair<String, Long> a = mo43586r().f46916b.mo43616a();
        if (a == null || a == C16806af.f46915a) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
