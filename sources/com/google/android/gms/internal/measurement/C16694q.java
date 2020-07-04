package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.C14933l;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;

/* renamed from: com.google.android.gms.internal.measurement.q */
public class C16694q {

    /* renamed from: a */
    public final C16697t f46634a;

    protected C16694q(C16697t tVar) {
        C15267r.m44384a(tVar);
        this.f46634a = tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C15322e mo43203g() {
        return this.f46634a.f46641c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final Context mo43204h() {
        return this.f46634a.f46639a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C16416bi mo43205i() {
        return this.f46634a.mo43216a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C16398ar mo43206j() {
        return this.f46634a.f46642d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C14933l mo43207k() {
        return this.f46634a.mo43217b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C16689l mo43208l() {
        return this.f46634a.mo43218c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C16403aw mo43209m() {
        return this.f46634a.mo43219d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C16433bz mo43210n() {
        return this.f46634a.mo43221f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C16421bn mo43211o() {
        return this.f46634a.mo43222g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final C16391ak mo43212p() {
        return this.f46634a.mo43225j();
    }

    /* renamed from: b */
    public final void mo43190b(String str) {
        mo42537a(2, str, null, null, null);
    }

    /* renamed from: a */
    public final void mo43187a(String str, Object obj) {
        mo42537a(2, str, obj, null, null);
    }

    /* renamed from: a */
    public final void mo43188a(String str, Object obj, Object obj2) {
        mo42537a(2, str, obj, obj2, null);
    }

    /* renamed from: c */
    public final void mo43194c(String str) {
        mo42537a(3, str, null, null, null);
    }

    /* renamed from: b */
    public final void mo43191b(String str, Object obj) {
        mo42537a(3, str, obj, null, null);
    }

    /* renamed from: b */
    public final void mo43192b(String str, Object obj, Object obj2) {
        mo42537a(3, str, obj, obj2, null);
    }

    /* renamed from: a */
    public final void mo43189a(String str, Object obj, Object obj2, Object obj3) {
        mo42537a(3, str, obj, obj2, obj3);
    }

    /* renamed from: d */
    public final void mo43197d(String str) {
        mo42537a(4, str, null, null, null);
    }

    /* renamed from: c */
    public final void mo43195c(String str, Object obj) {
        mo42537a(4, str, obj, null, null);
    }

    /* renamed from: e */
    public final void mo43200e(String str) {
        mo42537a(5, str, null, null, null);
    }

    /* renamed from: d */
    public final void mo43198d(String str, Object obj) {
        mo42537a(5, str, obj, null, null);
    }

    /* renamed from: c */
    public final void mo43196c(String str, Object obj, Object obj2) {
        mo42537a(5, str, obj, obj2, null);
    }

    /* renamed from: b */
    public final void mo43193b(String str, Object obj, Object obj2, Object obj3) {
        mo42537a(5, str, obj, obj2, obj3);
    }

    /* renamed from: f */
    public final void mo43202f(String str) {
        mo42537a(6, str, null, null, null);
    }

    /* renamed from: e */
    public final void mo43201e(String str, Object obj) {
        mo42537a(6, str, obj, null, null);
    }

    /* renamed from: d */
    public final void mo43199d(String str, Object obj, Object obj2) {
        mo42537a(6, str, obj, obj2, null);
    }

    /* renamed from: q */
    public static boolean m54833q() {
        return Log.isLoggable((String) C16406az.f45919b.f45945a, 2);
    }

    /* renamed from: a */
    private final void mo42537a(int i, String str, Object obj, Object obj2, Object obj3) {
        C16416bi biVar = this.f46634a != null ? this.f46634a.f46643e : null;
        if (biVar != null) {
            if (Log.isLoggable((String) C16406az.f45919b.f45945a, i)) {
                C16416bi.m54832c(str, obj, obj2, obj3);
            }
            if (i >= 5) {
                biVar.mo42537a(i, str, obj, obj2, obj3);
            }
            return;
        }
        if (Log.isLoggable((String) C16406az.f45919b.f45945a, i)) {
            m54832c(str, obj, obj2, obj3);
        }
    }

    /* renamed from: c */
    protected static String m54832c(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a = m54830a(obj);
        String a2 = m54830a(obj2);
        String a3 = m54830a(obj3);
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
    private static String m54830a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? "true" : "false";
        }
        if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        }
        return obj.toString();
    }
}
