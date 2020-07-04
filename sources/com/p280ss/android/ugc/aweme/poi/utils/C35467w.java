package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.w */
final /* synthetic */ class C35467w implements OnLongClickListener {

    /* renamed from: a */
    private final Context f92989a;

    /* renamed from: b */
    private final int f92990b;

    /* renamed from: c */
    private final CharSequence f92991c;

    /* renamed from: d */
    private final PoiDetail f92992d;

    /* renamed from: e */
    private final String f92993e;

    /* renamed from: f */
    private final String f92994f;

    C35467w(Context context, int i, CharSequence charSequence, PoiDetail poiDetail, String str, String str2) {
        this.f92989a = context;
        this.f92990b = i;
        this.f92991c = charSequence;
        this.f92992d = poiDetail;
        this.f92993e = str;
        this.f92994f = str2;
    }

    public final boolean onLongClick(View view) {
        return C35462r.m114567a(this.f92989a, this.f92990b, this.f92991c, this.f92992d, this.f92993e, this.f92994f, view);
    }
}
