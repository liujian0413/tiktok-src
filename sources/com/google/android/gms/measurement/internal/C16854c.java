package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15267r;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.c */
public final class C16854c {

    /* renamed from: a */
    final String f47103a;

    /* renamed from: b */
    final String f47104b;

    /* renamed from: c */
    final long f47105c;

    /* renamed from: d */
    final long f47106d;

    /* renamed from: e */
    final zzad f47107e;

    /* renamed from: f */
    private final String f47108f;

    private C16854c(C16825ay ayVar, String str, String str2, String str3, long j, long j2, zzad zzad) {
        C15267r.m44386a(str2);
        C15267r.m44386a(str3);
        C15267r.m44384a(zzad);
        this.f47103a = str2;
        this.f47104b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f47108f = str;
        this.f47105c = j;
        this.f47106d = j2;
        if (this.f47106d != 0 && this.f47106d > this.f47105c) {
            ayVar.mo43585q().f47490d.mo44162a("Event created with reverse previous/current timestamps. appId, name", C16953r.m56340a(str2), C16953r.m56340a(str3));
        }
        this.f47107e = zzad;
    }

    C16854c(C16825ay ayVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzad zzad;
        C15267r.m44386a(str2);
        C15267r.m44386a(str3);
        this.f47103a = str2;
        this.f47104b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f47108f = str;
        this.f47105c = j;
        this.f47106d = j2;
        if (this.f47106d != 0 && this.f47106d > this.f47105c) {
            ayVar.mo43585q().f47490d.mo44161a("Event created with reverse previous/current timestamps. appId", C16953r.m56340a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzad = new zzad(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    ayVar.mo43585q().f47487a.mo44160a("Param name can't be null");
                    it.remove();
                } else {
                    ayVar.mo43662f();
                    Object a = C16922em.m55957a(str4, bundle2.get(str4));
                    if (a == null) {
                        ayVar.mo43585q().f47490d.mo44161a("Param value can't be null", ayVar.mo43663g().mo44154b(str4));
                        it.remove();
                    } else {
                        ayVar.mo43662f().mo43902a(bundle2, str4, a);
                    }
                }
            }
            zzad = new zzad(bundle2);
        }
        this.f47107e = zzad;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C16854c mo43721a(C16825ay ayVar, long j) {
        C16854c cVar = new C16854c(ayVar, this.f47108f, this.f47103a, this.f47104b, this.f47105c, j, this.f47107e);
        return cVar;
    }

    public final String toString() {
        String str = this.f47103a;
        String str2 = this.f47104b;
        String valueOf = String.valueOf(this.f47107e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
