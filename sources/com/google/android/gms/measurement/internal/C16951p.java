package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C16951p extends C16849bv {

    /* renamed from: a */
    private static final AtomicReference<String[]> f47484a = new AtomicReference<>();

    /* renamed from: b */
    private static final AtomicReference<String[]> f47485b = new AtomicReference<>();

    /* renamed from: c */
    private static final AtomicReference<String[]> f47486c = new AtomicReference<>();

    C16951p(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43602d() {
        return false;
    }

    /* renamed from: f */
    private final boolean m56313f() {
        return this.f47095q.mo43665i() && this.f47095q.mo43585q().mo44158a(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo44153a(String str) {
        if (str == null) {
            return null;
        }
        if (!m56313f()) {
            return str;
        }
        return m56312a(str, C16851bx.f47098b, C16851bx.f47097a, f47484a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo44154b(String str) {
        if (str == null) {
            return null;
        }
        if (!m56313f()) {
            return str;
        }
        return m56312a(str, C16852by.f47100b, C16852by.f47099a, f47485b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo44155c(String str) {
        if (str == null) {
            return null;
        }
        if (!m56313f()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m56312a(str, C16853bz.f47102b, C16853bz.f47101a, f47486c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m56312a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C15267r.m44384a(strArr);
        C15267r.m44384a(strArr2);
        C15267r.m44384a(atomicReference);
        C15267r.m44394b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C16922em.m55972c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo44152a(zzag zzag) {
        if (zzag == null) {
            return null;
        }
        if (!m56313f()) {
            return zzag.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzag.f47520c);
        sb.append(",name=");
        sb.append(mo44153a(zzag.f47518a));
        sb.append(",params=");
        sb.append(m56311a(zzag.f47519b));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo44151a(C16854c cVar) {
        if (cVar == null) {
            return null;
        }
        if (!m56313f()) {
            return cVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(cVar.f47103a);
        sb.append("', name='");
        sb.append(mo44153a(cVar.f47104b));
        sb.append("', params=");
        sb.append(m56311a(cVar.f47107e));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private final String m56311a(zzad zzad) {
        if (zzad == null) {
            return null;
        }
        if (!m56313f()) {
            return zzad.toString();
        }
        return mo44150a(zzad.mo44169b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo44150a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m56313f()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(mo44154b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
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
