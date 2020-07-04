package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.aac;
import com.google.android.gms.internal.ads.aad;
import com.google.android.gms.internal.ads.aah;
import com.google.android.gms.internal.ads.ahu;
import com.google.android.gms.internal.ads.aic;
import com.google.android.gms.internal.ads.akt;
import com.google.android.gms.internal.ads.all;
import com.google.android.gms.internal.ads.bwp;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.bu */
public final class C14816bu {

    /* renamed from: a */
    public final all f38328a;

    /* renamed from: b */
    public final ahu f38329b;

    /* renamed from: c */
    public final aah f38330c;

    /* renamed from: d */
    public final bwp f38331d;

    private C14816bu(all all, ahu ahu, aah aah, bwp bwp) {
        this.f38328a = all;
        this.f38329b = ahu;
        this.f38330c = aah;
        this.f38331d = bwp;
    }

    /* renamed from: a */
    public static C14816bu m43012a(Context context) {
        return new C14816bu(new akt(), new aic(), new aac(new aad()), new bwp(context));
    }
}
