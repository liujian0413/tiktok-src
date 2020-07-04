package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.x */
final /* synthetic */ class C35468x implements OnClickListener {

    /* renamed from: a */
    private final ClipboardManager f92995a;

    /* renamed from: b */
    private final CharSequence f92996b;

    /* renamed from: c */
    private final PoiDetail f92997c;

    /* renamed from: d */
    private final String f92998d;

    /* renamed from: e */
    private final String f92999e;

    C35468x(ClipboardManager clipboardManager, CharSequence charSequence, PoiDetail poiDetail, String str, String str2) {
        this.f92995a = clipboardManager;
        this.f92996b = charSequence;
        this.f92997c = poiDetail;
        this.f92998d = str;
        this.f92999e = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C35462r.m114552a(this.f92995a, this.f92996b, this.f92997c, this.f92998d, this.f92999e, dialogInterface, i);
    }
}
