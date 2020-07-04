package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.r */
final /* synthetic */ class C25376r implements OnClickListener {

    /* renamed from: a */
    private final Context f66784a;

    /* renamed from: b */
    private final Aweme f66785b;

    /* renamed from: c */
    private final String f66786c;

    C25376r(Context context, Aweme aweme, String str) {
        this.f66784a = context;
        this.f66785b = aweme;
        this.f66786c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C25371n.m83434a(this.f66784a, this.f66785b, this.f66786c, dialogInterface, i);
    }
}
