package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.support.p022v4.content.C0692f;

/* renamed from: com.google.android.gms.internal.measurement.fd */
final class C16522fd implements C16519fa {

    /* renamed from: a */
    static C16522fd f46300a;

    /* renamed from: b */
    private final Context f46301b;

    /* renamed from: a */
    static C16522fd m53842a(Context context) {
        C16522fd fdVar;
        synchronized (C16522fd.class) {
            if (f46300a == null) {
                f46300a = C0692f.m2946a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C16522fd(context) : new C16522fd();
            }
            fdVar = f46300a;
        }
        return fdVar;
    }

    private C16522fd(Context context) {
        this.f46301b = context;
        this.f46301b.getContentResolver().registerContentObserver(C16511et.f46273a, true, new C16524ff(this, null));
    }

    private C16522fd() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String mo42707a(String str) {
        if (this.f46301b == null) {
            return null;
        }
        try {
            return (String) C16520fb.m53840a(new C16523fe(this, str));
        } catch (SecurityException unused) {
            String str2 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo42714b(String str) {
        return C16511et.m53816a(this.f46301b.getContentResolver(), str, (String) null);
    }
}
