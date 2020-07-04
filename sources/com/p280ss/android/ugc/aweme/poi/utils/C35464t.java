package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.t */
final /* synthetic */ class C35464t implements OnClickListener {

    /* renamed from: a */
    private final Context f92975a;

    /* renamed from: b */
    private final String[] f92976b;

    /* renamed from: c */
    private final String f92977c;

    /* renamed from: d */
    private final String f92978d;

    /* renamed from: e */
    private final PoiSimpleBundle f92979e;

    C35464t(Context context, String[] strArr, String str, String str2, PoiSimpleBundle poiSimpleBundle) {
        this.f92975a = context;
        this.f92976b = strArr;
        this.f92977c = str;
        this.f92978d = str2;
        this.f92979e = poiSimpleBundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C35462r.m114569b(this.f92975a, this.f92976b[i], this.f92977c, this.f92978d, this.f92979e);
    }
}
