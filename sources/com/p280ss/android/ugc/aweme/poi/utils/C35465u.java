package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.u */
final /* synthetic */ class C35465u implements OnClickListener {

    /* renamed from: a */
    private final boolean f92980a;

    /* renamed from: b */
    private final Context f92981b;

    /* renamed from: c */
    private final PoiDetail f92982c;

    /* renamed from: d */
    private final PoiSimpleBundle f92983d;

    /* renamed from: e */
    private final String[] f92984e;

    /* renamed from: f */
    private final String f92985f;

    /* renamed from: g */
    private final String f92986g;

    C35465u(boolean z, Context context, PoiDetail poiDetail, PoiSimpleBundle poiSimpleBundle, String[] strArr, String str, String str2) {
        this.f92980a = z;
        this.f92981b = context;
        this.f92982c = poiDetail;
        this.f92983d = poiSimpleBundle;
        this.f92984e = strArr;
        this.f92985f = str;
        this.f92986g = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C35462r.m114564a(this.f92980a, this.f92981b, this.f92982c, this.f92983d, this.f92984e, this.f92985f, this.f92986g, dialogInterface, i);
    }
}
