package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.p742b.C14733a.C14734a;

@C6505uv
public final class abg implements abi {
    /* renamed from: a */
    public final agj<String> mo39071a(String str, PackageInfo packageInfo) {
        return afy.m45817a(str);
    }

    /* renamed from: a */
    public final agj<C14734a> mo39070a(Context context) {
        agu agu = new agu();
        if (afb.m45737c(context)) {
            acj.m45508a((Runnable) new abh(this, context, agu));
        }
        return agu;
    }
}
