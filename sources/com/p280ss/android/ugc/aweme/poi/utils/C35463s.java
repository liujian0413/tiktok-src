package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.poi.utils.ThirdMapNaviHelper.MapType;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.s */
final /* synthetic */ class C35463s implements OnClickListener {

    /* renamed from: a */
    private final Context f92972a;

    /* renamed from: b */
    private final List f92973b;

    /* renamed from: c */
    private final double[] f92974c;

    C35463s(Context context, List list, double[] dArr) {
        this.f92972a = context;
        this.f92973b = list;
        this.f92974c = dArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ThirdMapNaviHelper.m114446a(this.f92972a, (MapType) this.f92973b.get(i), this.f92974c[0], this.f92974c[1]);
    }
}
