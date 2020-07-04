package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.bj */
final /* synthetic */ class C40498bj implements OnClickListener {

    /* renamed from: a */
    private final NewFaceStickerBean f105243a;

    /* renamed from: b */
    private final String f105244b;

    /* renamed from: c */
    private final Context f105245c;

    C40498bj(NewFaceStickerBean newFaceStickerBean, String str, Context context) {
        this.f105243a = newFaceStickerBean;
        this.f105244b = str;
        this.f105245c = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C40496bh.m129434a(this.f105243a, this.f105244b, this.f105245c, dialogInterface, i);
    }
}
